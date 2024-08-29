package com.itranswarp.exchange.assets;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

/**
 * 资产
 */
public class Asset {
    /**
     * 可用金额
     */
    BigDecimal available;
    /**
     * 可用数量
     */
   // BigDecimal availableNum;
    /**
     * 冻结金额
     */
    BigDecimal frozen;

    /**
     * 冻结数量
     */
   // BigDecimal frozenNum;

    public Asset() {
       this(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO);
    }

    public Asset(BigDecimal available,BigDecimal availableNum, BigDecimal frozen,BigDecimal frozenNum) {
        this.available = available;
        this.frozen = frozen;
      //  this.availableNum=availableNum;
       // this.frozenNum=frozenNum;
    }

    public BigDecimal getAvailable() {
        return available;
    }

    public BigDecimal getFrozen() {
        return frozen;
    }



    @JsonIgnore
    public BigDecimal getTotal() {
        return available.add(frozen);
    }


    @Override
    public String toString() {
        return String.format("[available=%04.2f, frozen=%02.2f]", available, frozen);
    }
}
