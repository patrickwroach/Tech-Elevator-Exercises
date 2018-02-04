package com.techelevator.TollCollectionBigDecimal;

import java.math.BigDecimal;

public class TankBigDecimal  implements VehicleBigDecimal{
    public String name;
    public BigDecimal rate;

    public BigDecimal getRate() {
        return this.rate;
    }
    @Override
    public String getName() {
        return "Tank";
    }

    @Override
    public BigDecimal calculateToll(int distance) {

        return new BigDecimal(0);
    }
}
