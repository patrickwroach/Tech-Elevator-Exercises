package com.techelevator.DeliveryDriverBigDecimal;

import com.techelevator.DeliveryDriver.*;

import java.text.NumberFormat;
import java.util.Scanner;


public class PostageBigDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String unit = "";
        int distance = 0;
        int weight = 0;

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

        outputPrint(distance, weight);




    }


    public static int convertPoundsToOunces(int pounds) {
        int ounces = 0;

        ounces = (pounds * 16);

        return ounces;
    }

    public static void outputPrint(int distance, int weight){
        DeliveryDriverBigDecimal[] rates = new DeliveryDriverBigDecimal[]{new PostalServiceBigDecimal(0), new PostalServiceBigDecimal(1), new PostalServiceBigDecimal(2),
                new FedExBigDecimal(), new SPUBigDecimal(0), new SPUBigDecimal(1), new SPUBigDecimal(2)};

        System.out.println("");
        System.out.println("");
        System.out.println(String.format("%-30s %8s", "Delivery Method", "cost"));
        System.out.println("-----------------------------------------");

        for (DeliveryDriverBigDecimal companies : rates) {
            String output = String.format("%-30s $%7s", companies.getName(), NumberFormat.getCurrencyInstance().format(companies.calculateRate(distance, weight)));

            System.out.println(output);
        }

        System.out.println("-----------------------------------------");
    }
}




