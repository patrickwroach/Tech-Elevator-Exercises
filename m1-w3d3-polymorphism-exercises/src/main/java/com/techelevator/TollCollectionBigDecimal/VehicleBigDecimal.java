package com.techelevator.TollCollectionBigDecimal;

import java.math.BigDecimal;

public interface VehicleBigDecimal {
    String getName();
    BigDecimal getRate();
    BigDecimal calculateToll(int distance);
}
