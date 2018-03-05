package com.techelevator;

public class EnterName {

	private String firstName;
	private String middleInitial;
	private String lastName;
	private String nameOrder;

	public EnterName(String firstName, String middleInitial, String lastName, String nameOrder) {
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.nameOrder = nameOrder;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGreeting() {
		return "Hello, " + firstName + " " + middleInitial + "" + lastName;
	}

	public String getNameOrder() {
		int num = Integer.parseInt(nameOrder);
		String a = "";
		switch(num)
		{
			case 1: a = firstName + " " + middleInitial + " " + lastName;
				break;
			case 2: a = firstName + " " + lastName;
				break;
			case 3: a = lastName + ", " + firstName + " "+ middleInitial;
				break;
			case 4: a = lastName + ", " + firstName;
				break;
			default: a = "invalid";
		}
		return a;
	}
}
