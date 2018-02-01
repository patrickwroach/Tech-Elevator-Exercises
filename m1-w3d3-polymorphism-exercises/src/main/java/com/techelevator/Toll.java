package com.techelevator;
import java.util.Random;

public class Toll {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{new Car(), new CarWithTrailer(), new TruckWithFourAxles(), new TruckWithSixAxles(), new TruckWithEightAxles(), new Tank()};


        int totalDistance = 0;
        double totalRevenue = 0;

        int[]randomValueArray = new int[vehicles.length];

        for (int i = 0; i < randomValueArray.length; i ++){
            Random rand = new Random();
            int randomValue = rand.nextInt((240 - 10) + 1) + 10;
            randomValueArray[i] = randomValue;
        }

        for (int i = 0; i < vehicles.length; i ++ ) {
            String output = String.format("%s %d $%.2f", vehicles[i].getName(), randomValueArray[i], vehicles[i].calculateToll(randomValueArray[i]));
            totalDistance += randomValueArray[i];
            totalRevenue += vehicles[i].calculateToll(randomValueArray[i]);

            System.out.println(output);
        }
        System.out.println("Total Distance Traveled: " + totalDistance);
        System.out.println("Total Revenue: " + totalRevenue);
    }
}
