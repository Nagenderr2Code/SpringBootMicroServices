package com.code.microservice.currencyconverterservice.model;

import java.math.BigDecimal;

public class CurrencyConverted {

    private String from;
    private String to;
    private BigDecimal amountToConvert;
    private BigDecimal conversionMultiple;
    private BigDecimal convertedValue;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getAmountToConvert() {
        return amountToConvert;
    }

    public void setAmountToConvert(BigDecimal amountToConvert) {
        this.amountToConvert = amountToConvert;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(BigDecimal convertedValue) {
        this.convertedValue = convertedValue;
    }
}
