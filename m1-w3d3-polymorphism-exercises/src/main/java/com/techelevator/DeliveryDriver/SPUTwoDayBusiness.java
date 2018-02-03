package com.techelevator.DeliveryDriver;


	public class SPUTwoDayBusiness implements DeliveryDriver {

		public String name = "SPU (2-day business)";
		
		
		public String getName() {
			return name;
		}
		
		
		@Override
		public double calculateRate(int distance, double weight) {

			double rate = (((weight/ 16) * 5) * distance) / 100;
					   
			return rate;
		}

	}

