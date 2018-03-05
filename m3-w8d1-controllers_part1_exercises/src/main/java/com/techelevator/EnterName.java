package com.techelevator;

public class EnterName {

	private String firstName;
	private String middleInitial;
	private String lastName;

	public EnterName(String firstName, String middleInitial, String lastName) {
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
	}

	public String getGreeting() {
		return "Hello, " + firstName + " " + middleInitial + "" + lastName;
	}
}
