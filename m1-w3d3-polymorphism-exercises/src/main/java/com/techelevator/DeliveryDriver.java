package com.techelevator;



public interface DeliveryDriver {
	String getName();
	double calculateRate(int distance, double weight);
	String toString();


}
