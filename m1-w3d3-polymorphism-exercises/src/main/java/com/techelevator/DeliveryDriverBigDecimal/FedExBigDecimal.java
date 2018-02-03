package com.techelevator.DeliveryDriverBigDecimal;

import com.techelevator.DeliveryDriverBigDecimal.DeliveryDriverBigDecimal;

import java.math.BigDecimal;

public class FedExBigDecimal implements DeliveryDriverBigDecimal {

    public String name = "FedEx";


    public String getName() {
        return name;
    }

    public BigDecimal calculateRate(int distance, int weight) {

        BigDecimal rate = new BigDecimal(20.00);

        if (distance > 500) rate.add(new BigDecimal(5.00));
        if (weight > 48) rate.add(new BigDecimal(3.00));


        return rate;
    }


}