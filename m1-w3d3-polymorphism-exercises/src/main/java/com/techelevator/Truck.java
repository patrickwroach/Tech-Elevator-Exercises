package com.techelevator;


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

        if (axles == 4) rate = calculateTollFourAxles(distance);
        if (axles == 6) rate = calculateTollSixAxles(distance);
        if (axles == 8) rate = calculateTollEightAxles(distance);

        return rate;

    }


    public double calculateTollFourAxles(int distance) {
        double rate = 0.00;

        rate = (double) (distance * 4) / 100;

        return rate;
    }


    public double calculateTollSixAxles(int distance) {
        double rate = 0.00;

        rate = (double) (distance * 45) / 1000;

        return rate;
    }


    public double calculateTollEightAxles(int distance) {
        double rate = 0.00;

        rate = (double) (distance * 48) / 1000;

        return rate;
    }

}