// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.trade.model.response;

import com.zts.xtp.common.enums.AccountType;

public class AssetResponse {
    /**
     * 总资产(=可用资金 + 证券资产（目前为0）+ 预扣的资金)
     */
    private double totalAsset;
    /**
     * 可用资金
     */
    private double buyingPower;
    /**
     * 证券资产
     */
    private double securityAsset;
    /**
     * 累计买入成交证券占用资金
     */
    private double fundBuyAmount;
    /**
     * 累计买入成交交易费用
     */
    private double fundBuyFee;
    /**
     * 累计卖出成交证券所得资金
     */
    private double fundSellAmount;
    /**
     * 累计卖出成交交易费用
     */
    private double fundSellFee;
    /**
     * XTP系统预扣的资金（包括购买卖股票时预扣的交易资金+预扣手续费）
     */
    private double withholdingAmount;
    /**
     * 账户类型
     */
    private AccountType accountType;
    /**
     * 冻结的保证金
     */
    private double frozenMargin;
    /**
     * 行权冻结资金
     */
    private double frozenExecCash;
    /**
     * 行权费用
     */
    private double frozenExecFee;
    /**
     * 垫付资金
     */
    private double payLater;
    /**
     * 预垫付资金
     */
    private double preadvaPay;
    /**
     * 昨日余额
     */
    private double origBanlance;
    /**
     * 当前余额
     */
    private double banlance;
    /**
     * 当天出入金
     */
    private double depositWithdraw;
    /**
     * 当日交易资金轧差
     */
    private double tradeNetting;
    /**
     * 资金资产
     */
    private double captialAsset;
    /**
     * 强锁资金
     */
    private double forceFreezeAmount;
    /**
     * 可取资金
     */
    private double preferredAmount;
    /**
     * 保留字段
     */
    private long unknown;
    /**
     * 此消息响应函数对应的请求ID
     */
    private int requestId;
    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    private boolean lastResp;

    public void setAccountType(int type) {
        accountType = AccountType.values()[type];
    }


    @SuppressWarnings("all")
    public static class AssetResponseBuilder {
        @SuppressWarnings("all")
        private double totalAsset;
        @SuppressWarnings("all")
        private double buyingPower;
        @SuppressWarnings("all")
        private double securityAsset;
        @SuppressWarnings("all")
        private double fundBuyAmount;
        @SuppressWarnings("all")
        private double fundBuyFee;
        @SuppressWarnings("all")
        private double fundSellAmount;
        @SuppressWarnings("all")
        private double fundSellFee;
        @SuppressWarnings("all")
        private double withholdingAmount;
        @SuppressWarnings("all")
        private AccountType accountType;
        @SuppressWarnings("all")
        private double frozenMargin;
        @SuppressWarnings("all")
        private double frozenExecCash;
        @SuppressWarnings("all")
        private double frozenExecFee;
        @SuppressWarnings("all")
        private double payLater;
        @SuppressWarnings("all")
        private double preadvaPay;
        @SuppressWarnings("all")
        private double origBanlance;
        @SuppressWarnings("all")
        private double banlance;
        @SuppressWarnings("all")
        private double depositWithdraw;
        @SuppressWarnings("all")
        private double tradeNetting;
        @SuppressWarnings("all")
        private double captialAsset;
        @SuppressWarnings("all")
        private double forceFreezeAmount;
        @SuppressWarnings("all")
        private double preferredAmount;
        @SuppressWarnings("all")
        private long unknown;
        @SuppressWarnings("all")
        private int requestId;
        @SuppressWarnings("all")
        private boolean lastResp;

        @SuppressWarnings("all")
        AssetResponseBuilder() {
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder totalAsset(final double totalAsset) {
            this.totalAsset = totalAsset;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder buyingPower(final double buyingPower) {
            this.buyingPower = buyingPower;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder securityAsset(final double securityAsset) {
            this.securityAsset = securityAsset;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder fundBuyAmount(final double fundBuyAmount) {
            this.fundBuyAmount = fundBuyAmount;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder fundBuyFee(final double fundBuyFee) {
            this.fundBuyFee = fundBuyFee;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder fundSellAmount(final double fundSellAmount) {
            this.fundSellAmount = fundSellAmount;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder fundSellFee(final double fundSellFee) {
            this.fundSellFee = fundSellFee;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder withholdingAmount(final double withholdingAmount) {
            this.withholdingAmount = withholdingAmount;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder accountType(final AccountType accountType) {
            this.accountType = accountType;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder frozenMargin(final double frozenMargin) {
            this.frozenMargin = frozenMargin;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder frozenExecCash(final double frozenExecCash) {
            this.frozenExecCash = frozenExecCash;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder frozenExecFee(final double frozenExecFee) {
            this.frozenExecFee = frozenExecFee;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder payLater(final double payLater) {
            this.payLater = payLater;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder preadvaPay(final double preadvaPay) {
            this.preadvaPay = preadvaPay;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder origBanlance(final double origBanlance) {
            this.origBanlance = origBanlance;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder banlance(final double banlance) {
            this.banlance = banlance;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder depositWithdraw(final double depositWithdraw) {
            this.depositWithdraw = depositWithdraw;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder tradeNetting(final double tradeNetting) {
            this.tradeNetting = tradeNetting;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder captialAsset(final double captialAsset) {
            this.captialAsset = captialAsset;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder forceFreezeAmount(final double forceFreezeAmount) {
            this.forceFreezeAmount = forceFreezeAmount;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder preferredAmount(final double preferredAmount) {
            this.preferredAmount = preferredAmount;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder unknown(final long unknown) {
            this.unknown = unknown;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder requestId(final int requestId) {
            this.requestId = requestId;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponseBuilder lastResp(final boolean lastResp) {
            this.lastResp = lastResp;
            return this;
        }

        @SuppressWarnings("all")
        public AssetResponse build() {
            return new AssetResponse(totalAsset, buyingPower, securityAsset, fundBuyAmount, fundBuyFee, fundSellAmount, fundSellFee, withholdingAmount, accountType, frozenMargin, frozenExecCash, frozenExecFee, payLater, preadvaPay, origBanlance, banlance, depositWithdraw, tradeNetting, captialAsset, forceFreezeAmount, preferredAmount, unknown, requestId, lastResp);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "AssetResponse.AssetResponseBuilder(totalAsset=" + this.totalAsset + ", buyingPower=" + this.buyingPower + ", securityAsset=" + this.securityAsset + ", fundBuyAmount=" + this.fundBuyAmount + ", fundBuyFee=" + this.fundBuyFee + ", fundSellAmount=" + this.fundSellAmount + ", fundSellFee=" + this.fundSellFee + ", withholdingAmount=" + this.withholdingAmount + ", accountType=" + this.accountType + ", frozenMargin=" + this.frozenMargin + ", frozenExecCash=" + this.frozenExecCash + ", frozenExecFee=" + this.frozenExecFee + ", payLater=" + this.payLater + ", preadvaPay=" + this.preadvaPay + ", origBanlance=" + this.origBanlance + ", banlance=" + this.banlance + ", depositWithdraw=" + this.depositWithdraw + ", tradeNetting=" + this.tradeNetting + ", captialAsset=" + this.captialAsset + ", forceFreezeAmount=" + this.forceFreezeAmount + ", preferredAmount=" + this.preferredAmount + ", unknown=" + this.unknown + ", requestId=" + this.requestId + ", lastResp=" + this.lastResp + ")";
        }
    }

    @SuppressWarnings("all")
    public static AssetResponseBuilder builder() {
        return new AssetResponseBuilder();
    }

    /**
     * 总资产(=可用资金 + 证券资产（目前为0）+ 预扣的资金)
     */
    @SuppressWarnings("all")
    public double getTotalAsset() {
        return this.totalAsset;
    }

    /**
     * 可用资金
     */
    @SuppressWarnings("all")
    public double getBuyingPower() {
        return this.buyingPower;
    }

    /**
     * 证券资产
     */
    @SuppressWarnings("all")
    public double getSecurityAsset() {
        return this.securityAsset;
    }

    /**
     * 累计买入成交证券占用资金
     */
    @SuppressWarnings("all")
    public double getFundBuyAmount() {
        return this.fundBuyAmount;
    }

    /**
     * 累计买入成交交易费用
     */
    @SuppressWarnings("all")
    public double getFundBuyFee() {
        return this.fundBuyFee;
    }

    /**
     * 累计卖出成交证券所得资金
     */
    @SuppressWarnings("all")
    public double getFundSellAmount() {
        return this.fundSellAmount;
    }

    /**
     * 累计卖出成交交易费用
     */
    @SuppressWarnings("all")
    public double getFundSellFee() {
        return this.fundSellFee;
    }

    /**
     * XTP系统预扣的资金（包括购买卖股票时预扣的交易资金+预扣手续费）
     */
    @SuppressWarnings("all")
    public double getWithholdingAmount() {
        return this.withholdingAmount;
    }

    /**
     * 账户类型
     */
    @SuppressWarnings("all")
    public AccountType getAccountType() {
        return this.accountType;
    }

    /**
     * 冻结的保证金
     */
    @SuppressWarnings("all")
    public double getFrozenMargin() {
        return this.frozenMargin;
    }

    /**
     * 行权冻结资金
     */
    @SuppressWarnings("all")
    public double getFrozenExecCash() {
        return this.frozenExecCash;
    }

    /**
     * 行权费用
     */
    @SuppressWarnings("all")
    public double getFrozenExecFee() {
        return this.frozenExecFee;
    }

    /**
     * 垫付资金
     */
    @SuppressWarnings("all")
    public double getPayLater() {
        return this.payLater;
    }

    /**
     * 预垫付资金
     */
    @SuppressWarnings("all")
    public double getPreadvaPay() {
        return this.preadvaPay;
    }

    /**
     * 昨日余额
     */
    @SuppressWarnings("all")
    public double getOrigBanlance() {
        return this.origBanlance;
    }

    /**
     * 当前余额
     */
    @SuppressWarnings("all")
    public double getBanlance() {
        return this.banlance;
    }

    /**
     * 当天出入金
     */
    @SuppressWarnings("all")
    public double getDepositWithdraw() {
        return this.depositWithdraw;
    }

    /**
     * 当日交易资金轧差
     */
    @SuppressWarnings("all")
    public double getTradeNetting() {
        return this.tradeNetting;
    }

    /**
     * 资金资产
     */
    @SuppressWarnings("all")
    public double getCaptialAsset() {
        return this.captialAsset;
    }

    /**
     * 强锁资金
     */
    @SuppressWarnings("all")
    public double getForceFreezeAmount() {
        return this.forceFreezeAmount;
    }

    /**
     * 可取资金
     */
    @SuppressWarnings("all")
    public double getPreferredAmount() {
        return this.preferredAmount;
    }

    /**
     * 保留字段
     */
    @SuppressWarnings("all")
    public long getUnknown() {
        return this.unknown;
    }

    /**
     * 此消息响应函数对应的请求ID
     */
    @SuppressWarnings("all")
    public int getRequestId() {
        return this.requestId;
    }

    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    @SuppressWarnings("all")
    public boolean isLastResp() {
        return this.lastResp;
    }

    /**
     * 总资产(=可用资金 + 证券资产（目前为0）+ 预扣的资金)
     */
    @SuppressWarnings("all")
    public void setTotalAsset(final double totalAsset) {
        this.totalAsset = totalAsset;
    }

    /**
     * 可用资金
     */
    @SuppressWarnings("all")
    public void setBuyingPower(final double buyingPower) {
        this.buyingPower = buyingPower;
    }

    /**
     * 证券资产
     */
    @SuppressWarnings("all")
    public void setSecurityAsset(final double securityAsset) {
        this.securityAsset = securityAsset;
    }

    /**
     * 累计买入成交证券占用资金
     */
    @SuppressWarnings("all")
    public void setFundBuyAmount(final double fundBuyAmount) {
        this.fundBuyAmount = fundBuyAmount;
    }

    /**
     * 累计买入成交交易费用
     */
    @SuppressWarnings("all")
    public void setFundBuyFee(final double fundBuyFee) {
        this.fundBuyFee = fundBuyFee;
    }

    /**
     * 累计卖出成交证券所得资金
     */
    @SuppressWarnings("all")
    public void setFundSellAmount(final double fundSellAmount) {
        this.fundSellAmount = fundSellAmount;
    }

    /**
     * 累计卖出成交交易费用
     */
    @SuppressWarnings("all")
    public void setFundSellFee(final double fundSellFee) {
        this.fundSellFee = fundSellFee;
    }

    /**
     * XTP系统预扣的资金（包括购买卖股票时预扣的交易资金+预扣手续费）
     */
    @SuppressWarnings("all")
    public void setWithholdingAmount(final double withholdingAmount) {
        this.withholdingAmount = withholdingAmount;
    }

    /**
     * 冻结的保证金
     */
    @SuppressWarnings("all")
    public void setFrozenMargin(final double frozenMargin) {
        this.frozenMargin = frozenMargin;
    }

    /**
     * 行权冻结资金
     */
    @SuppressWarnings("all")
    public void setFrozenExecCash(final double frozenExecCash) {
        this.frozenExecCash = frozenExecCash;
    }

    /**
     * 行权费用
     */
    @SuppressWarnings("all")
    public void setFrozenExecFee(final double frozenExecFee) {
        this.frozenExecFee = frozenExecFee;
    }

    /**
     * 垫付资金
     */
    @SuppressWarnings("all")
    public void setPayLater(final double payLater) {
        this.payLater = payLater;
    }

    /**
     * 预垫付资金
     */
    @SuppressWarnings("all")
    public void setPreadvaPay(final double preadvaPay) {
        this.preadvaPay = preadvaPay;
    }

    /**
     * 昨日余额
     */
    @SuppressWarnings("all")
    public void setOrigBanlance(final double origBanlance) {
        this.origBanlance = origBanlance;
    }

    /**
     * 当前余额
     */
    @SuppressWarnings("all")
    public void setBanlance(final double banlance) {
        this.banlance = banlance;
    }

    /**
     * 当天出入金
     */
    @SuppressWarnings("all")
    public void setDepositWithdraw(final double depositWithdraw) {
        this.depositWithdraw = depositWithdraw;
    }

    /**
     * 当日交易资金轧差
     */
    @SuppressWarnings("all")
    public void setTradeNetting(final double tradeNetting) {
        this.tradeNetting = tradeNetting;
    }

    /**
     * 资金资产
     */
    @SuppressWarnings("all")
    public void setCaptialAsset(final double captialAsset) {
        this.captialAsset = captialAsset;
    }

    /**
     * 强锁资金
     */
    @SuppressWarnings("all")
    public void setForceFreezeAmount(final double forceFreezeAmount) {
        this.forceFreezeAmount = forceFreezeAmount;
    }

    /**
     * 可取资金
     */
    @SuppressWarnings("all")
    public void setPreferredAmount(final double preferredAmount) {
        this.preferredAmount = preferredAmount;
    }

    /**
     * 保留字段
     */
    @SuppressWarnings("all")
    public void setUnknown(final long unknown) {
        this.unknown = unknown;
    }

    /**
     * 此消息响应函数对应的请求ID
     */
    @SuppressWarnings("all")
    public void setRequestId(final int requestId) {
        this.requestId = requestId;
    }

    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    @SuppressWarnings("all")
    public void setLastResp(final boolean lastResp) {
        this.lastResp = lastResp;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AssetResponse)) return false;
        final AssetResponse other = (AssetResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getTotalAsset(), other.getTotalAsset()) != 0) return false;
        if (Double.compare(this.getBuyingPower(), other.getBuyingPower()) != 0) return false;
        if (Double.compare(this.getSecurityAsset(), other.getSecurityAsset()) != 0) return false;
        if (Double.compare(this.getFundBuyAmount(), other.getFundBuyAmount()) != 0) return false;
        if (Double.compare(this.getFundBuyFee(), other.getFundBuyFee()) != 0) return false;
        if (Double.compare(this.getFundSellAmount(), other.getFundSellAmount()) != 0) return false;
        if (Double.compare(this.getFundSellFee(), other.getFundSellFee()) != 0) return false;
        if (Double.compare(this.getWithholdingAmount(), other.getWithholdingAmount()) != 0) return false;
        final Object this$accountType = this.getAccountType();
        final Object other$accountType = other.getAccountType();
        if (this$accountType == null ? other$accountType != null : !this$accountType.equals(other$accountType)) return false;
        if (Double.compare(this.getFrozenMargin(), other.getFrozenMargin()) != 0) return false;
        if (Double.compare(this.getFrozenExecCash(), other.getFrozenExecCash()) != 0) return false;
        if (Double.compare(this.getFrozenExecFee(), other.getFrozenExecFee()) != 0) return false;
        if (Double.compare(this.getPayLater(), other.getPayLater()) != 0) return false;
        if (Double.compare(this.getPreadvaPay(), other.getPreadvaPay()) != 0) return false;
        if (Double.compare(this.getOrigBanlance(), other.getOrigBanlance()) != 0) return false;
        if (Double.compare(this.getBanlance(), other.getBanlance()) != 0) return false;
        if (Double.compare(this.getDepositWithdraw(), other.getDepositWithdraw()) != 0) return false;
        if (Double.compare(this.getTradeNetting(), other.getTradeNetting()) != 0) return false;
        if (Double.compare(this.getCaptialAsset(), other.getCaptialAsset()) != 0) return false;
        if (Double.compare(this.getForceFreezeAmount(), other.getForceFreezeAmount()) != 0) return false;
        if (Double.compare(this.getPreferredAmount(), other.getPreferredAmount()) != 0) return false;
        if (this.getUnknown() != other.getUnknown()) return false;
        if (this.getRequestId() != other.getRequestId()) return false;
        if (this.isLastResp() != other.isLastResp()) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof AssetResponse;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $totalAsset = Double.doubleToLongBits(this.getTotalAsset());
        result = result * PRIME + (int) ($totalAsset >>> 32 ^ $totalAsset);
        final long $buyingPower = Double.doubleToLongBits(this.getBuyingPower());
        result = result * PRIME + (int) ($buyingPower >>> 32 ^ $buyingPower);
        final long $securityAsset = Double.doubleToLongBits(this.getSecurityAsset());
        result = result * PRIME + (int) ($securityAsset >>> 32 ^ $securityAsset);
        final long $fundBuyAmount = Double.doubleToLongBits(this.getFundBuyAmount());
        result = result * PRIME + (int) ($fundBuyAmount >>> 32 ^ $fundBuyAmount);
        final long $fundBuyFee = Double.doubleToLongBits(this.getFundBuyFee());
        result = result * PRIME + (int) ($fundBuyFee >>> 32 ^ $fundBuyFee);
        final long $fundSellAmount = Double.doubleToLongBits(this.getFundSellAmount());
        result = result * PRIME + (int) ($fundSellAmount >>> 32 ^ $fundSellAmount);
        final long $fundSellFee = Double.doubleToLongBits(this.getFundSellFee());
        result = result * PRIME + (int) ($fundSellFee >>> 32 ^ $fundSellFee);
        final long $withholdingAmount = Double.doubleToLongBits(this.getWithholdingAmount());
        result = result * PRIME + (int) ($withholdingAmount >>> 32 ^ $withholdingAmount);
        final Object $accountType = this.getAccountType();
        result = result * PRIME + ($accountType == null ? 43 : $accountType.hashCode());
        final long $frozenMargin = Double.doubleToLongBits(this.getFrozenMargin());
        result = result * PRIME + (int) ($frozenMargin >>> 32 ^ $frozenMargin);
        final long $frozenExecCash = Double.doubleToLongBits(this.getFrozenExecCash());
        result = result * PRIME + (int) ($frozenExecCash >>> 32 ^ $frozenExecCash);
        final long $frozenExecFee = Double.doubleToLongBits(this.getFrozenExecFee());
        result = result * PRIME + (int) ($frozenExecFee >>> 32 ^ $frozenExecFee);
        final long $payLater = Double.doubleToLongBits(this.getPayLater());
        result = result * PRIME + (int) ($payLater >>> 32 ^ $payLater);
        final long $preadvaPay = Double.doubleToLongBits(this.getPreadvaPay());
        result = result * PRIME + (int) ($preadvaPay >>> 32 ^ $preadvaPay);
        final long $origBanlance = Double.doubleToLongBits(this.getOrigBanlance());
        result = result * PRIME + (int) ($origBanlance >>> 32 ^ $origBanlance);
        final long $banlance = Double.doubleToLongBits(this.getBanlance());
        result = result * PRIME + (int) ($banlance >>> 32 ^ $banlance);
        final long $depositWithdraw = Double.doubleToLongBits(this.getDepositWithdraw());
        result = result * PRIME + (int) ($depositWithdraw >>> 32 ^ $depositWithdraw);
        final long $tradeNetting = Double.doubleToLongBits(this.getTradeNetting());
        result = result * PRIME + (int) ($tradeNetting >>> 32 ^ $tradeNetting);
        final long $captialAsset = Double.doubleToLongBits(this.getCaptialAsset());
        result = result * PRIME + (int) ($captialAsset >>> 32 ^ $captialAsset);
        final long $forceFreezeAmount = Double.doubleToLongBits(this.getForceFreezeAmount());
        result = result * PRIME + (int) ($forceFreezeAmount >>> 32 ^ $forceFreezeAmount);
        final long $preferredAmount = Double.doubleToLongBits(this.getPreferredAmount());
        result = result * PRIME + (int) ($preferredAmount >>> 32 ^ $preferredAmount);
        final long $unknown = this.getUnknown();
        result = result * PRIME + (int) ($unknown >>> 32 ^ $unknown);
        result = result * PRIME + this.getRequestId();
        result = result * PRIME + (this.isLastResp() ? 79 : 97);
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "AssetResponse(totalAsset=" + this.getTotalAsset() + ", buyingPower=" + this.getBuyingPower() + ", securityAsset=" + this.getSecurityAsset() + ", fundBuyAmount=" + this.getFundBuyAmount() + ", fundBuyFee=" + this.getFundBuyFee() + ", fundSellAmount=" + this.getFundSellAmount() + ", fundSellFee=" + this.getFundSellFee() + ", withholdingAmount=" + this.getWithholdingAmount() + ", accountType=" + this.getAccountType() + ", frozenMargin=" + this.getFrozenMargin() + ", frozenExecCash=" + this.getFrozenExecCash() + ", frozenExecFee=" + this.getFrozenExecFee() + ", payLater=" + this.getPayLater() + ", preadvaPay=" + this.getPreadvaPay() + ", origBanlance=" + this.getOrigBanlance() + ", banlance=" + this.getBanlance() + ", depositWithdraw=" + this.getDepositWithdraw() + ", tradeNetting=" + this.getTradeNetting() + ", captialAsset=" + this.getCaptialAsset() + ", forceFreezeAmount=" + this.getForceFreezeAmount() + ", preferredAmount=" + this.getPreferredAmount() + ", unknown=" + this.getUnknown() + ", requestId=" + this.getRequestId() + ", lastResp=" + this.isLastResp() + ")";
    }

    @SuppressWarnings("all")
    public AssetResponse() {
    }

    @SuppressWarnings("all")
    public AssetResponse(final double totalAsset, final double buyingPower, final double securityAsset, final double fundBuyAmount, final double fundBuyFee, final double fundSellAmount, final double fundSellFee, final double withholdingAmount, final AccountType accountType, final double frozenMargin, final double frozenExecCash, final double frozenExecFee, final double payLater, final double preadvaPay, final double origBanlance, final double banlance, final double depositWithdraw, final double tradeNetting, final double captialAsset, final double forceFreezeAmount, final double preferredAmount, final long unknown, final int requestId, final boolean lastResp) {
        this.totalAsset = totalAsset;
        this.buyingPower = buyingPower;
        this.securityAsset = securityAsset;
        this.fundBuyAmount = fundBuyAmount;
        this.fundBuyFee = fundBuyFee;
        this.fundSellAmount = fundSellAmount;
        this.fundSellFee = fundSellFee;
        this.withholdingAmount = withholdingAmount;
        this.accountType = accountType;
        this.frozenMargin = frozenMargin;
        this.frozenExecCash = frozenExecCash;
        this.frozenExecFee = frozenExecFee;
        this.payLater = payLater;
        this.preadvaPay = preadvaPay;
        this.origBanlance = origBanlance;
        this.banlance = banlance;
        this.depositWithdraw = depositWithdraw;
        this.tradeNetting = tradeNetting;
        this.captialAsset = captialAsset;
        this.forceFreezeAmount = forceFreezeAmount;
        this.preferredAmount = preferredAmount;
        this.unknown = unknown;
        this.requestId = requestId;
        this.lastResp = lastResp;
    }
}
