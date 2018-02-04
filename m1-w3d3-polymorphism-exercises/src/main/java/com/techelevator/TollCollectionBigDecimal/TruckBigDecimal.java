package com.techelevator.TollCollectionBigDecimal;

import java.math.BigDecimal;

//|--------|-----------|
//        | Axles  | Per Mile  |
//        |--------|-----------|
//        |   4    |   0.040   |
//        |   6    |   0.045   |
//        |   8+   |   0.048   |
//        |--------|-----------|
//
//        toll = rate per mile * distance


public class TruckBigDecimal implements VehicleBigDecimal {
    public int axles;
    public String name;
    public BigDecimal rate;

    public TruckBigDecimal(int axles) {
        this.axles = axles;
    }

    @Override
    public BigDecimal getRate() {
        return rate;
    }

    @Override
    public String getName() {
        String name;

        name = "Truck (" + axles + " Axles)";

        return name;
    }

    public BigDecimal calculateToll(int distance) {
        BigDecimal rate = (new BigDecimal(0));

        if (axles == 4) rate = new BigDecimal(0.040);
        if (axles == 6) rate = new BigDecimal(0.045);
        if (axles == 8) rate = new BigDecimal(0.048);

        rate = rate.multiply(new BigDecimal(distance));

        return rate;

    }

}
