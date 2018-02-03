package com.techelevator.TollCollection;
import java.util.Random;

public class Toll {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{new Car(true), new Car(false), new Truck(4), new Truck (6), new Truck (8), new Tank()};


        int totalDistance = 0;
        double totalRevenue = 0;

        int[]randomValueArray = new int[vehicles.length];

        for (int i = 0; i < randomValueArray.length; i ++){
            Random rand = new Random();
            int randomValue = rand.nextInt((240 - 10) + 1) + 10; // (max - min) + 1 + min
            randomValueArray[i] = randomValue;
        }


        System.out.println("");
        System.out.println(String.format("%-20s %-15s %6s", "Vehicle", "Travel Distance", "Toll"));
        System.out.println("----------------------------------------------");
        for (int i = 0; i < vehicles.length; i ++ ) {
            String output = String.format("%-20s %-15d $%6.2f", vehicles[i].getName(), randomValueArray[i], vehicles[i].calculateToll(randomValueArray[i]));
            totalDistance += randomValueArray[i];
            totalRevenue += vehicles[i].calculateToll(randomValueArray[i]);

            System.out.println(output);
        }
        System.out.println("----------------------------------------------");

        System.out.println(String.format("%-10s %-10d", "Total Distance Traveled: ", totalDistance));
        System.out.println(String.format("%-10s $%-10.2f", "Total Revenue: ", totalRevenue));

    }
}
