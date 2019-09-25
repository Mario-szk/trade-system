package ai.techfin.tradesystem.service;

import ai.techfin.tradesystem.config.KafkaTopicConfiguration;
import ai.techfin.tradesystem.domain.ModelOrderList;
import ai.techfin.tradesystem.domain.Placement;
import ai.techfin.tradesystem.domain.PlacementList;
import ai.techfin.tradesystem.domain.Stock;
import ai.techfin.tradesystem.domain.enums.PriceType;
import ai.techfin.tradesystem.repository.PlacementListRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Set;

@Service
public class TradeService {

    private final PlacementListRepository placementListRepository;

    private final BrokerService xtpService;

    private final PriceService priceService;

    public TradeService(PlacementListRepository placementListRepository,
                        @Qualifier("xtpService") BrokerService xtpService,
                        PriceService priceService) {
        this.placementListRepository = placementListRepository;
        this.xtpService = xtpService;
        this.priceService = priceService;
    }

    @KafkaListener(topics = KafkaTopicConfiguration.NEW_TRADE_COMMAND)
    public void trade(Long placementId) {
        PlacementList placementList = placementListRepository.getOne(placementId);
        ModelOrderList modelOrderList = placementList.getModelOrderList();
        Set<Placement> placements = placementList.getPlacements();
        String brokerUser = modelOrderList.getProductAccount().getName();
        BrokerService brokerService = null;

        switch (modelOrderList.getProductAccount().getBrokerType()) {
            case INTERNAL_SIM:
            case CTP:
            case XTP:
                brokerService = xtpService;
                break;
        }
        boolean succeed;
        for (Placement placement : placements) {
            int abs = placement.getMoney().compareTo(BigDecimal.ZERO);
            BigDecimal latestPrice = priceService.getPrice();
            Stock stock = placement.getStock();
            BigInteger quantity = placement.getMoney().divide(latestPrice, RoundingMode.FLOOR).toBigInteger();
            if (abs < 0) {
                do {
                    succeed = brokerService.sell(brokerUser, stock, quantity, latestPrice, PriceType.LIMITED);
                } while (!succeed);
            } else if (abs > 0) {
                do {
                    succeed = brokerService.buy(brokerUser, stock, quantity, latestPrice, PriceType.LIMITED);
                } while (!succeed);
            }
        }
    }

}