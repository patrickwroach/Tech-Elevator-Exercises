package com.techelevator;
import java.util.Random;

public class Toll {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{new Car(true), new Car(false), new Truck(4), new Truck (6), new Truck (8), new Tank()};


        int totalDistance = 0;
        double totalRevenue = 0;
        Random rand = new Random();





        System.out.println("");
        System.out.println(String.format("%-20s %-15s %6s", "Vehicle", "Travel Distance", "Toll"));
        System.out.println("----------------------------------------------");
        for (int i = 0; i < vehicles.length; i ++ ) {
            int distance = rand.nextInt((240 - 10) + 1) + 10;
            String output = String.format("%-20s %-15d $%6.2f", vehicles[i].getName(), distance, vehicles[i].calculateToll(distance));
            totalDistance += distance;
            totalRevenue += vehicles[i].calculateToll(distance);

            System.out.println(output);
        }
        System.out.println("----------------------------------------------");

        System.out.println(String.format("%-10s %-10d", "Total Distance Traveled: ", totalDistance));
        System.out.println(String.format("%-10s $%-10.2f", "Total Revenue: ", totalRevenue));

    }
}
