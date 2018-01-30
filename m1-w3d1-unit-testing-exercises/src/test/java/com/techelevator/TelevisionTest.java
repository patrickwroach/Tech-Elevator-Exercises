package com.techelevator;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;

public class TelevisionTest {

	/*
	 * Check If On
	Check if Off
	turn on
	turn off
	raise volume
	lower volume
	change channel
	check the volume
	get current channel
	get current volume
	
	 */
	
private Television tv;

@Before
public void setup() {
	tv = new Television();
}
@Test
public void turn_tv_on() {
	//arrange
	//act
	tv.turnOn();
	//assert
	Assert.assertTrue("TV is Off", tv.isOn());
	
	
}
@Test
public void turn_tv_off() {
	//Arrange
	tv.turnOn();
	//Act
	tv.turnOff();
	//Assert
	Assert.assertFalse("TV is not off", tv.isOn());
}

@Test
public void raise_volume_to_3() {
	//Arrange
	tv.turnOn();
	//Act
	tv.raiseVolume();
	Assert.assertEquals("Volume is not 3", 3, tv.getCurrentVolume());
	
}

@Test
public void raise_volume_past_10() {
	//Arrange
	tv.turnOn(); //2
	tv.raiseVolume(); //3
	tv.raiseVolume(); //4
	tv.raiseVolume(); //5
	tv.raiseVolume(); //6
	tv.raiseVolume(); //7
	tv.raiseVolume(); //8
	tv.raiseVolume(); //9
	tv.raiseVolume(); //10
	
	//Act
	tv.raiseVolume(); //It doesn't go to 11
	Assert.assertEquals("Volume cannot go to 11", 10, tv.getCurrentVolume());
	
}

@Test
public void raise_volume_when_tv_off() {
	//Arrange
	tv.turnOff();
	//Act
	tv.raiseVolume();
	Assert.assertEquals("Volume cannot change when TV is off", 0, tv.getCurrentVolume());
	
}

@Test
public void lower_volume_to_1() {
	//Arrange
	tv.turnOn();
	//Act
	tv.lowerVolume(); //Lower to one
	Assert.assertEquals("Volume is not 3", 1, tv.getCurrentVolume());
	
}

@Test
public void lower_volume_below_0_tv_on() {
	//Arrange
	tv.turnOn();
	tv.lowerVolume(); //Lower to one
	tv.lowerVolume(); //Lower to zero
	//Act
	tv.lowerVolume(); //Attempt to lower below 0
	Assert.assertEquals("Volume cannot go below 0", 0, tv.getCurrentVolume());
	
}

@Test
public void lower_volume_tv_off() {
	//Arrange
	tv.turnOff();
	//Act
	tv.lowerVolume(); //Attempt to lower to 1
	Assert.assertEquals("Volume cannot go below 1", 0, tv.getCurrentVolume());
	
}

@Test
public void lower_volume_tv_off_to_negative_1() {
	//Arrange
	tv.turnOff();
	//Act
	tv.lowerVolume(); //Attempt to lower to 0
	tv.lowerVolume(); 
	tv.lowerVolume(); 
	Assert.assertEquals("Volume cannot go below 1", 0, tv.getCurrentVolume());
	
}



@Test 
public void change_channel_to_10() {
	//Arrange
	tv.turnOn();
	//Act
	tv.changeChannel(10);
	Assert.assertEquals("Channel is not 10", 10, tv.getSelectedChannel());
}

@Test 
public void change_channel_to_19() {
	//Arrange
	tv.turnOn();
	//Act
	tv.changeChannel(19);
	Assert.assertEquals("Channel should not go out of range 3-18", 3, tv.getSelectedChannel());
}

@Test 
public void change_channel_to_1() {
	//Arrange
	tv.turnOn();
	//Act
	tv.changeChannel(1);
	Assert.assertEquals("Channel should not go out of range 3-18", 3, tv.getSelectedChannel());
}

@Test
public void try_to_change_channel_when_tv_is_off() {
	//Arrange
	//Act
	tv.changeChannel(11);
	Assert.assertEquals("Channel change when it should not have", 3, tv.getSelectedChannel());
}


}
