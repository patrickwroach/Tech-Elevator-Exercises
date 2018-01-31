package com.techelevator;

import java.math.BigDecimal;

public interface DeliveryDriver {
	String getName();
	double calculateRate(int distance, double weight);
	String toString();


}
