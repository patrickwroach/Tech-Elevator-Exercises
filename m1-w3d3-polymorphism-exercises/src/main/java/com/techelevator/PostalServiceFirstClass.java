package com.techelevator;



public class PostalServiceFirstClass implements DeliveryDriver {
	
	public String name = "Postal Service (1st Class)";
	
	
	public String getName() {
		return name;
	}

	

	@Override
	public double calculateRate(int distance, double weight) {
		double perMileRate = 0;
		
		
//		if (weight <= 2) perMileRate = .035;
//		else if (weight <= 8) perMileRate = .040;
//		else if (weight <= 15) perMileRate = .047;
//		else if (weight <= 48) perMileRate = .195;
//		else if (weight <= 128) perMileRate = .450;
//		else perMileRate = .5;
		
		if (weight <= 2) perMileRate = 35;
		else if (weight <= 8) perMileRate = 40;
		else if (weight <= 15) perMileRate = 47;
		else if (weight <= 48) perMileRate = 195;
		else if (weight <= 128) perMileRate = 450;
		else perMileRate = 500;
		
		double rate = (perMileRate * distance) / 1000;
	
		
		return rate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
