package com.techelevator.DeliveryDriverBigDecimal;

import java.math.BigDecimal;

public interface DeliveryDriverBigDecimal {
        String getName();
        BigDecimal getRate();
        BigDecimal calculateRate(int distance, int weight);

    }

