package com.techelevator;

public class TruckWithFourAxles implements Vehicle{

    @Override
    public String getName() {
        return "Truck with Four Axles";
    }

    @Override
    public double calculateToll(int distance) {
        double rate = 0.00;

        rate = (distance * 4) / 100;

        return rate;
    }
}
