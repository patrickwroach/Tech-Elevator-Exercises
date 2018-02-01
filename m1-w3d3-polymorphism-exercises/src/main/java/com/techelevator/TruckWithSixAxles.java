package com.techelevator;

public class TruckWithSixAxles implements Vehicle{

    @Override
    public String getName() {
        return "Truck with Six Axles";
    }

    @Override
    public double calculateToll(int distance) {
        double rate = 0.00;

        rate = (distance * 45) / 1000;

        return rate;
    }
}