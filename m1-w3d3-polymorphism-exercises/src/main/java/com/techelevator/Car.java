package com.techelevator;

public class Car implements Vehicle{

    boolean hasTrailer;

    public Car(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String getName() {
        String name = "";
        if (hasTrailer) name = "Car";
        if (!hasTrailer) name = "Car (with Trailer)";

        return name;
    }

    @Override
    public double calculateToll(int distance) {
        double rate = 0.00;

        rate = (double) (distance * 2) / 100;
        if (hasTrailer) rate++;
        return rate;
    }


    }
