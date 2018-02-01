package com.techelevator;

public class PostalServiceThirdClass implements DeliveryDriver {

public String name = "Postal Service (3rd Class)";
	
	
	public String getName() {
		return name;
	}
	
	@Override
	public double calculateRate(int distance, double weight) {
		double perMileRate = 0;
		
//		if (weight <= 2) perMileRate = .0020;
//		else if (weight <= 8) perMileRate = .0022;
//		else if (weight <= 15) perMileRate = .0024;
//		else if (weight <= 48) perMileRate = .0150;
//		else if (weight <= 128) perMileRate = .0160;
//		else perMileRate = .0170;
		
		if (weight <= 2) perMileRate = 20;
		else if (weight <= 8) perMileRate = 22;
		else if (weight <= 15) perMileRate = 24;
		else if (weight <= 48) perMileRate = 150;
		else if (weight <= 128) perMileRate = 160;
		else perMileRate = 170;
		
		double rate = (perMileRate * distance) /10000;
		
		
		return rate;
	}
	
}
