package com.techelevator;


	public class SPUTwoDayBusiness implements DeliveryDriver {

		public String name = "SPU (2-day business)";
		
		
		public String getName() {
			return name;
		}
		
		
		@Override
		public double calculateRate(int distance, double weight) {
			// TODO Auto-generated method stub
//			double rate = (weight * 0.050) * distance;

			double rate = (((weight/ 16) * 5) * distance) / 100;
					   
			return rate;
		}

	}

