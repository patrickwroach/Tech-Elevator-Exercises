package com.techelevator.DeliveryDriverBigDecimal;

import java.text.NumberFormat;

public class PostageBigDecimal {
    public static void main(String[] args) {
        int distance = 500;
        int weight = 25;


        DeliveryDriverBigDecimal[] rates = new DeliveryDriverBigDecimal[]{new PostalServiceBigDecimal(0), new PostalServiceBigDecimal(1), new PostalServiceBigDecimal(2),
                new FedExBigDecimal(), new SPUBigDecimal(0), new SPUBigDecimal(1), new SPUBigDecimal(2)};



        for (DeliveryDriverBigDecimal companies : rates){
            System.out.println(companies.getName());
            System.out.println(NumberFormat.getCurrencyInstance().format(companies.calculateRate(distance, weight)));
        }

    }
}

