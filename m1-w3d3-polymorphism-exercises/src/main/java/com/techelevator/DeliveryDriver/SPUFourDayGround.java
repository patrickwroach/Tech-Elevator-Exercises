package com.techelevator.DeliveryDriver;

public class SPUFourDayGround implements DeliveryDriver {

	public String name = "SPU (4-day ground)";
	
	
	public String getName() {
		return name;
	}
	
	
	@Override
	public double calculateRate(int distance, double weight) {

		double rate = (((weight/16) * 5) * distance / 1000);
				   
		return rate;
	}
	


}
