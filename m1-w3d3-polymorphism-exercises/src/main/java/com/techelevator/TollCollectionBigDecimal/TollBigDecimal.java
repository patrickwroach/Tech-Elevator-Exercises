package com.techelevator.TollCollectionBigDecimal;

import com.techelevator.TollCollection.Car;
import com.techelevator.TollCollection.Tank;
import com.techelevator.TollCollection.Truck;
import com.techelevator.TollCollection.Vehicle;

import java.math.BigDecimal;
import java.util.Random;

public class TollBigDecimal {

    public static void main(String[] args) {
        int totalDistance = 0;
        BigDecimal totalRevenue = new BigDecimal(0);
        Random rand = new Random();
        VehicleBigDecimal[] vehiclesLit = new VehicleBigDecimal[]{new CarBigDecimal(true), new CarBigDecimal(false), new TruckBigDecimal(4), new TruckBigDecimal (6), new TruckBigDecimal (8), new TankBigDecimal()};


        System.out.println("");
        System.out.println(String.format("%-20s %-15s %6s", "Vehicle", "Travel Distance", "Toll"));
        System.out.println("------------------------------------------------");
        for (VehicleBigDecimal vehicles : vehiclesLit) {
            int distance = rand.nextInt((240 - 10) + 1) + 10;
            String output = String.format("%-20s %-17d $%7.2f", vehicles.getName(), distance, vehicles.calculateToll(distance));
            totalDistance += distance;
//            totalRevenue.add(vehicles.getRate());

            System.out.println(output);
        }
        System.out.println("------------------------------------------------");

        System.out.println(String.format("%-20s %-3d %-1s %-5.2f", "Total Distance: ", totalDistance, "Total Revenue: $", totalRevenue));


    }
}
