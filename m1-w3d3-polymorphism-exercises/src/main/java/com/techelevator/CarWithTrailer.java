package com.techelevator;

public class CarWithTrailer implements Vehicle{

    @Override
    public String getName() {
        return "Car With Trailer";
    }

    @Override
    public double calculateToll(int distance) {
        double rate = 0.00;

        rate = (distance * 2)/ 100;
        rate +=1;

        return rate;
    }
}