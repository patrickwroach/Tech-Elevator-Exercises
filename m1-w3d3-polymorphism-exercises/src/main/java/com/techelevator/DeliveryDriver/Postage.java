package com.techelevator.DeliveryDriver;

import java.util.Scanner;

public class Postage {

    public static void main(String[] args) {
        String unit = "";
        int distance = 0;
        int weight = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Please enter the weight of the package: ");
            weight = (Integer.parseInt(in.nextLine()));

        }
        while (weight <= 0);

        do {
            System.out.print("(P)ounds or (O)unces? "); //pound or ounces only
            unit = in.nextLine().toLowerCase();
        }
        while (!unit.equals("p") && !unit.equals("o"));

        if (unit.equals("p")) weight = convertPoundsToOunces(weight); //all classes are done in ounces

        do {
            System.out.print("What distance will it be traveling to? ");
            distance = (Integer.parseInt(in.nextLine()));
        }
        while (distance <= 0);

        DeliveryDriver[] rates = new DeliveryDriver[]{new PostalServiceFirstClass(), new PostalServiceSecondClass(),
                new PostalServiceThirdClass(), new FedEx(), new SPUFourDayGround(), new SPUTwoDayBusiness(), new SPUNextDay()};

        System.out.println("");
        System.out.println("");
        System.out.println(String.format("%-30s %8s", "Delivery Method", "cost"));
        System.out.println("-----------------------------------------");

        for (DeliveryDriver companies : rates) {
            String output = String.format("%-30s $%7.2f", companies.getName(), companies.calculateRate(distance, weight));

            System.out.println(output);
        }
        System.out.println("-----------------------------------------");

    }

    public static int convertPoundsToOunces(int pounds) {
        int ounces = 0;

        ounces = (pounds * 16);

        return ounces;
    }
}
