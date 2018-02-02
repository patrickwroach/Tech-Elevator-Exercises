package com.techelevator;
import java.util.Random;

public class Toll {

    public static void main(String[] args) {
        int totalDistance = 0;
        double totalRevenue = 0;
        Random rand = new Random();
        Vehicle[] vehiclesLit = new Vehicle[]{new Car(true), new Car(false), new Truck(4), new Truck (6), new Truck (8), new Tank()};


        System.out.println("");
        System.out.println(String.format("%-20s %-15s %6s", "Vehicle", "Travel Distance", "Toll"));
        System.out.println("------------------------------------------------");
        for (Vehicle vehicles : vehiclesLit) {
            int distance = rand.nextInt((240 - 10) + 1) + 10;
            String output = String.format("%-20s %-17d $%7.2f", vehicles.getName(), distance, vehicles.calculateToll(distance));
            totalDistance += distance;
            totalRevenue += vehicles.calculateToll(distance);

            System.out.println(output);
        }
        System.out.println("------------------------------------------------");

        System.out.println(String.format("%-20s %-3d %-1s %-5.2f", "Total Distance: ", totalDistance, "Total Revenue: $", totalRevenue));


    }
}
