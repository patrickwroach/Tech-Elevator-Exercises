package com.techelevator.DeliveryDriverBigDecimal;

import com.techelevator.DeliveryDriverBigDecimal.DeliveryDriverBigDecimal;

import java.math.BigDecimal;

public class FedExBigDecimal implements DeliveryDriverBigDecimal {

    public String name = "FedEx";
    private BigDecimal rate = new BigDecimal(0);


    public String getName() {
        return name;
    }

    public BigDecimal getRate() {
        return this.rate;
    }

    public BigDecimal calculateRate(int distance, int weight) {
//        BigDecimal rate = new BigDecimal(0);

        if (distance > 500 && weight > 48)  this.rate = new BigDecimal(28.00);
        else if (distance > 500) this.rate = (new BigDecimal(25.00));
        else if (weight > 48) this.rate = (new BigDecimal(23.00));
        else {
            this.rate = new BigDecimal(20.00);
        }

        return this.rate;
    }


}