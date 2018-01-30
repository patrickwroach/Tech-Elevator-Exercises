package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * String getPhoneNumber()
 * String getCarrier()
 * String getOperatingSystem()
 * void setOperatingSystem(String operatingSystem)
 * int getBatteryCharge()
 * boolean isOnCall()
 * public boolean Call(String phoneNumberToCall, int numberOfMinutesToTalk)
 * public void AnswerPhone()
 * public void HangUp()
 * public void RechargeBattery()
 */


public class SmartPhoneTest {

	private SmartPhone cell;

	@Before
	public void setup() {
		cell = new SmartPhone("555-555-5555", "ATT");
	}
	
	@Test
	public void get_phone_number() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("Phone Number should be 555-555-5555", "555-555-5555", cell.getPhoneNumber());
	
	}
	
	@Test
	public void get_carrier() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("Carrier should be ATT", "ATT", cell.getCarrier());
		
	}
	
	@Test
	public void get_os() {
		//Arrange
		//Act
		cell.setOperatingSystem("iOS");
		//Assert
		Assert.assertEquals("Operating System should be set to iOS", "iOS", cell.getOperatingSystem());
		
	}
	
	@Test
	public void get_battery_charge() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("Battery should be 100%", 100, cell.getBatteryCharge());
		
	}
	
	@Test
	public void is_onCall() {
		//Arrange
		//Act
		//Assert
		Assert.assertFalse("Phone should not be on call", cell.isOnCall());
		
	}
	
	@Test
	public void answer_phone_with_power() {
		//Arrange
		//Act
		cell.answerPhone();
		//Assert
		Assert.assertTrue("Phone should have zero battery", cell.isOnCall());
		
	}
	
	@Test
	public void hang_up_phone_when_phone_is_on() {
		//Arrange
		//Act
		cell.answerPhone();
		cell.hangUp();
		//Assert
		Assert.assertFalse("Phone should be off", cell.isOnCall());
		
	}
	@Test
	public void hang_up_phone_when_off() {
		//Arrange
		//Act
		cell.hangUp();
		//Assert
		Assert.assertFalse("Phone should be off", cell.isOnCall());
		
	}
	
//	@Test
//	public void answer_phone_without_juice() {
//		//Arrange
//		//Act
//		cell.call("555-555-5556", 100);
//		cell.answerPhone();
//		//Assert
//		Assert.assertFalse("Phone should have zero battery", cell.isOnCall());
//		
//	}
	
	@Test
	public void recharge_battery() {
		//Arrange
		//Act
		cell.rechargeBattery();
		//Assert
		Assert.assertEquals("Phone should have 100% battery", 100, cell.getBatteryCharge());
		
	}	
	
	@Test
	public void make_call_with_not_enough_power() {
		//Arrange
		//Act
		//Assert
		Assert.assertFalse("Phone does not have enough power to make that call", cell.call("555-555-5556", 125));
		
	}	
	
	@Test
	public void make_call_with_enough_power() {
		//Arrange
		//Act
		cell.call("555-555-5556",40);
		//Assert
		Assert.assertTrue("Phone should have enough power to make the call", cell.call("555-555-5556", 60));
		
	}	
	
	
}
