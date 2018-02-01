package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Postage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the weight of the package? ");
		int weight = (Integer.parseInt(in.nextLine()));
		System.out.print("(P)ounds or (O)unces? ");
		String unit = in.nextLine().toLowerCase();
		if (unit.equals("p")) weight = convertPoundsToOunces(weight);
		System.out.print("What distance will it be traveling to? ");
		int distance = (Integer.parseInt(in.nextLine()));
		

		
		DeliveryDriver[] rates = new DeliveryDriver[] { new PostalServiceFirstClass(), new PostalServiceSecondClass(), new PostalServiceThirdClass(), new FedEx(), new SPUFourDayGround(), new SPUTwoDayBusiness(), new SPUNextDay()};

		System.out.println("");
		System.out.println("");
		System.out.println(String.format("%-30s %20s", "Delivery Method", "$ cost"));
		System.out.println("---------------------------------------------------------");
		for (DeliveryDriver companies : rates) {
			String output = String.format("%-30s $%20.2f", companies.getName(), companies.calculateRate(distance, weight));
			
			System.out.println(output);
		}
		System.out.println("---------------------------------------------------------");
	
	}

	public static int convertPoundsToOunces (int pounds) {
		int ounces = 0;
		
		ounces = (pounds * 16) ;
		
		return ounces;
	}
}
