package com.techelevator;

public class Car implements Vehicle{

    @Override
    public String getName() {
        return "Car";
    }

    @Override
    public double calculateToll(int distance) {
        double rate = 0.00;

        rate = (distance * 2) / 100;

        return rate;
    }
}