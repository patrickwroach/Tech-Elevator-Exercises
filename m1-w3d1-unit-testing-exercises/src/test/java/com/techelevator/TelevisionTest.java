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
	tv.TurnOn();
	//assert
	Assert.assertTrue("TV is Off", tv.IsOn());
	
	
}
@Test
public void turn_tv_off() {
	//Arrange
	tv.TurnOn();
	//Act
	tv.TurnOff();
	//Assert
	Assert.assertFalse("TV is not off", tv.IsOn());
}

@Test
public void raise_volume_to_1() {
	//Arrange
	tv.TurnOn();
	//Act
	tv.RaiseVolume();
	Assert.assertEquals("Volume is not 3", 3, tv.getCurrentVolume());
	
}

@Test
public void lower_volume_to_1() {
	//Arrange
	tv.TurnOn();
	tv.RaiseVolume();
	tv.RaiseVolume(); //Raise to two
	//Act
	tv.LowerVolume(); //Lower to one
	Assert.assertEquals("Volume is not 3", 3, tv.getCurrentVolume());
	
}

@Test 
public void change_channel_to_10() {
	//Arrange
	tv.TurnOn();
	//Act
	tv.ChangeChannel(10);
	Assert.assertEquals("Channel is not 10", 10, tv.getSelectedChannel());
}

@Test 
public void change_channel_to_19() {
	//Arrange
	tv.TurnOn();
	//Act
	tv.ChangeChannel(19);
	Assert.assertEquals("Channel should not go out of range 3-18", 3, tv.getSelectedChannel());
}

@Test 
public void change_channel_to_1() {
	//Arrange
	tv.TurnOn();
	//Act
	tv.ChangeChannel(1);
	Assert.assertEquals("Channel should not go out of range 3-18", 3, tv.getSelectedChannel());
}

@Test
public void try_to_change_channel_when_tv_is_off() {
	//Arrange
	//Act
	tv.ChangeChannel(11);
	Assert.assertEquals("Channel change when it should not have", 3, tv.getSelectedChannel());
}


}
