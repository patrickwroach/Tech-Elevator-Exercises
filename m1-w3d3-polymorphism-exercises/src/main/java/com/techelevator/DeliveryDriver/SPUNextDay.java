package com.techelevator.DeliveryDriver;



	public class SPUNextDay implements DeliveryDriver {

		public String name = "SPU (next-day)";
		
		
		public String getName() {
			return name;
		}
		
		
		@Override
		public double calculateRate(int distance, double weight) {

			double rate = ((((weight / 16) * 75) * distance) /1000);
					   
			return rate;
		}

	}
