package com.techelevator.TollCollection;


public class Truck implements Vehicle {
    public int axles;

    public Truck(int axles) {
        this.axles = axles;
    }

    @Override
    public String getName() {
        String name;

        name = "Truck (" + axles + " Axles)";

        return name;
    }

    public double calculateToll(int distance) {
        double rate = 0.00;

        if (axles == 4) rate = (double) (distance * 4) / 100;;
        if (axles == 6) rate = (double) (distance * 45) / 1000;
        if (axles == 8) rate = (double) (distance * 48) / 1000;

        return rate;

    }
}