package com.techelevator;

public class SPUFourDayGround implements DeliveryDriver {

	public String name = "SPU (4-day ground)";
	
	
	public String getName() {
		return name;
	}
	
	
	@Override
	public double calculateRate(int distance, double weight) {
		// TODO Auto-generated method stub
		
		double rate = (weight * 0.0050) * distance;
				   
		return rate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
