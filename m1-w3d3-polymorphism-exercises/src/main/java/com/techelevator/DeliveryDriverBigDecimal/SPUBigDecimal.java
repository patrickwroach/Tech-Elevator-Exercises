package com.techelevator.DeliveryDriverBigDecimal;

import java.math.BigDecimal;

public class SPUBigDecimal implements DeliveryDriverBigDecimal {

    private String name;
    private int type;
    private BigDecimal rate;

    public SPUBigDecimal(int type) {
        this.type = type;
    }

    public String getName() {
        if (type == 0) name = "SPU: Next Day";
        if (type == 1) name = "SPU: 2-day Business";
        if (type == 2) name = "SPU: 4-day Ground";

        return name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public BigDecimal calculateRate(int distance, int weight) {
        BigDecimal spuMultiplier = new BigDecimal(0);

        if (type == 0) spuMultiplier = new BigDecimal(.075);
        if (type == 1) spuMultiplier = new BigDecimal(.050);
        if (type == 2) spuMultiplier = new BigDecimal(0.0050);

        rate = calculateSPURate(spuMultiplier, distance, weight);

        return this.rate;
    }


    public BigDecimal calculateSPURate(BigDecimal spuMultiplier, int distance, int weight) {
        BigDecimal rate = (spuMultiplier);
        BigDecimal ounces = new BigDecimal(weight);
        BigDecimal ounceToPounds = ounces.divide(new BigDecimal(16));

        this.rate = rate.multiply(ounceToPounds);
        this.rate = rate.multiply(new BigDecimal(distance));

        return this.rate;
    }

}
