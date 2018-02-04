package com.techelevator.TollCollectionBigDecimal;

import java.math.BigDecimal;

public class CarBigDecimal implements VehicleBigDecimal {

    public String name;
    boolean hasTrailer;
    BigDecimal rate;

    public CarBigDecimal(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public BigDecimal getRate() {
        return this.rate;
    }

    @Override
    public String getName() {
        String name = "";
        if (hasTrailer) this.name = "Car";
        if (!hasTrailer) this.name = "Car (with Trailer)";

        return this.name;
    }

    @Override
    public BigDecimal calculateToll(int distance) {
        BigDecimal rate = new BigDecimal(0);

        BigDecimal distanceRate = new BigDecimal(0.020);
        BigDecimal distanceBG = new BigDecimal(distance);


        if (!hasTrailer) this.rate = distanceBG.multiply(distanceRate);
        if (hasTrailer) this.rate = distanceBG.multiply(distanceRate).add(new BigDecimal(1));


        return this.rate;
    }


}
