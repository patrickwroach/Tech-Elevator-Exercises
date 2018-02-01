package com.techelevator;



	public class SPUNextDay implements DeliveryDriver {

		public String name = "SPU (next-day)";
		
		
		public String getName() {
			return name;
		}
		
		
		@Override
		public double calculateRate(int distance, double weight) {
			// TODO Auto-generated method stub
//			double rate = (weight * 0.075) * distance;

			double rate = ((((weight / 16) * 75) * distance) /1000);
					   
			return rate;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name;
		}

	}
