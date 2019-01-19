package com.code.microservice.limitservice.model;

public class LimitsBean {


    private int maxLimit;
    private int minLimit;

    public LimitsBean(int maxLimit, int minLimit) {
        this.maxLimit = maxLimit;
        this.minLimit = minLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public int getMinLimit() {
        return minLimit;
    }
}
