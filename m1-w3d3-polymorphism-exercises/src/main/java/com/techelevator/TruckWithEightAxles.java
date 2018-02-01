package com.techelevator;

public class TruckWithEightAxles implements Vehicle{

    @Override
    public String getName() {
        return "Truck with Eight Axles";
    }

    @Override
    public double calculateToll(int distance) {
        double rate = 0.00;

        rate = (double) (distance * 48) / 1000;

        return rate;
    }
}