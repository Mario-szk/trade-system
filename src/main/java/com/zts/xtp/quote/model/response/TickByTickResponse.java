// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.quote.model.response;

import com.zts.xtp.common.enums.ExchangeType;
import com.zts.xtp.common.enums.TickByTickType;

/**
 * @author roger on 2018/5/22
 */
public class TickByTickResponse {
    /**
     * 交易所代码
     */
    private ExchangeType exchangeType;
    /**
     * 合约代码 char[16]
     */
    private String ticker;
    /**
     * 预留
     */
    private long seq;
    /**
     * 委托时间 or 成交时间，格式为 yyyyMMddHHmmssSSS
     */
    private long dataTime;
    /**
     * 委托 or 成交
     */
    private TickByTickType type;
    /**
     * 逐笔委托
     */
    private TickByTickEntrustResponse entrust;
    /**
     * 逐笔成交
     */
    private TickByTickTradeResponse trade;

    public void setExchangeType(int exchangeType) {
        this.exchangeType = ExchangeType.forType(exchangeType);
    }

    public void setTickByTickType(int tickByTickType) {
        this.type = TickByTickType.forType(tickByTickType);
    }


    @SuppressWarnings("all")
    public static class TickByTickResponseBuilder {
        @SuppressWarnings("all")
        private ExchangeType exchangeType;
        @SuppressWarnings("all")
        private String ticker;
        @SuppressWarnings("all")
        private long seq;
        @SuppressWarnings("all")
        private long dataTime;
        @SuppressWarnings("all")
        private TickByTickType type;
        @SuppressWarnings("all")
        private TickByTickEntrustResponse entrust;
        @SuppressWarnings("all")
        private TickByTickTradeResponse trade;

        @SuppressWarnings("all")
        TickByTickResponseBuilder() {
        }

        @SuppressWarnings("all")
        public TickByTickResponseBuilder exchangeType(final ExchangeType exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickResponseBuilder ticker(final String ticker) {
            this.ticker = ticker;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickResponseBuilder seq(final long seq) {
            this.seq = seq;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickResponseBuilder dataTime(final long dataTime) {
            this.dataTime = dataTime;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickResponseBuilder type(final TickByTickType type) {
            this.type = type;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickResponseBuilder entrust(final TickByTickEntrustResponse entrust) {
            this.entrust = entrust;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickResponseBuilder trade(final TickByTickTradeResponse trade) {
            this.trade = trade;
            return this;
        }

        @SuppressWarnings("all")
        public TickByTickResponse build() {
            return new TickByTickResponse(exchangeType, ticker, seq, dataTime, type, entrust, trade);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "TickByTickResponse.TickByTickResponseBuilder(exchangeType=" + this.exchangeType + ", ticker=" + this.ticker + ", seq=" + this.seq + ", dataTime=" + this.dataTime + ", type=" + this.type + ", entrust=" + this.entrust + ", trade=" + this.trade + ")";
        }
    }

    @SuppressWarnings("all")
    public static TickByTickResponseBuilder builder() {
        return new TickByTickResponseBuilder();
    }

    /**
     * 交易所代码
     */
    @SuppressWarnings("all")
    public ExchangeType getExchangeType() {
        return this.exchangeType;
    }

    /**
     * 合约代码 char[16]
     */
    @SuppressWarnings("all")
    public String getTicker() {
        return this.ticker;
    }

    /**
     * 预留
     */
    @SuppressWarnings("all")
    public long getSeq() {
        return this.seq;
    }

    /**
     * 委托时间 or 成交时间，格式为 yyyyMMddHHmmssSSS
     */
    @SuppressWarnings("all")
    public long getDataTime() {
        return this.dataTime;
    }

    /**
     * 委托 or 成交
     */
    @SuppressWarnings("all")
    public TickByTickType getType() {
        return this.type;
    }

    /**
     * 逐笔委托
     */
    @SuppressWarnings("all")
    public TickByTickEntrustResponse getEntrust() {
        return this.entrust;
    }

    /**
     * 逐笔成交
     */
    @SuppressWarnings("all")
    public TickByTickTradeResponse getTrade() {
        return this.trade;
    }

    /**
     * 合约代码 char[16]
     */
    @SuppressWarnings("all")
    public void setTicker(final String ticker) {
        this.ticker = ticker;
    }

    /**
     * 预留
     */
    @SuppressWarnings("all")
    public void setSeq(final long seq) {
        this.seq = seq;
    }

    /**
     * 委托时间 or 成交时间，格式为 yyyyMMddHHmmssSSS
     */
    @SuppressWarnings("all")
    public void setDataTime(final long dataTime) {
        this.dataTime = dataTime;
    }

    /**
     * 委托 or 成交
     */
    @SuppressWarnings("all")
    public void setType(final TickByTickType type) {
        this.type = type;
    }

    /**
     * 逐笔委托
     */
    @SuppressWarnings("all")
    public void setEntrust(final TickByTickEntrustResponse entrust) {
        this.entrust = entrust;
    }

    /**
     * 逐笔成交
     */
    @SuppressWarnings("all")
    public void setTrade(final TickByTickTradeResponse trade) {
        this.trade = trade;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "TickByTickResponse(exchangeType=" + this.getExchangeType() + ", ticker=" + this.getTicker() + ", seq=" + this.getSeq() + ", dataTime=" + this.getDataTime() + ", type=" + this.getType() + ", entrust=" + this.getEntrust() + ", trade=" + this.getTrade() + ")";
    }

    @SuppressWarnings("all")
    public TickByTickResponse() {
    }

    @SuppressWarnings("all")
    public TickByTickResponse(final ExchangeType exchangeType, final String ticker, final long seq, final long dataTime, final TickByTickType type, final TickByTickEntrustResponse entrust, final TickByTickTradeResponse trade) {
        this.exchangeType = exchangeType;
        this.ticker = ticker;
        this.seq = seq;
        this.dataTime = dataTime;
        this.type = type;
        this.entrust = entrust;
        this.trade = trade;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TickByTickResponse)) return false;
        final TickByTickResponse other = (TickByTickResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$exchangeType = this.getExchangeType();
        final Object other$exchangeType = other.getExchangeType();
        if (this$exchangeType == null ? other$exchangeType != null : !this$exchangeType.equals(other$exchangeType)) return false;
        final Object this$ticker = this.getTicker();
        final Object other$ticker = other.getTicker();
        if (this$ticker == null ? other$ticker != null : !this$ticker.equals(other$ticker)) return false;
        if (this.getSeq() != other.getSeq()) return false;
        if (this.getDataTime() != other.getDataTime()) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof TickByTickResponse;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $exchangeType = this.getExchangeType();
        result = result * PRIME + ($exchangeType == null ? 43 : $exchangeType.hashCode());
        final Object $ticker = this.getTicker();
        result = result * PRIME + ($ticker == null ? 43 : $ticker.hashCode());
        final long $seq = this.getSeq();
        result = result * PRIME + (int) ($seq >>> 32 ^ $seq);
        final long $dataTime = this.getDataTime();
        result = result * PRIME + (int) ($dataTime >>> 32 ^ $dataTime);
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }
}