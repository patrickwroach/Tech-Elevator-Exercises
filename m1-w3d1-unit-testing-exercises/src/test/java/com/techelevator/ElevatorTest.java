package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
/*
 * int getShaftNumber()
 * int getCurrentLevel()
 * int getNumberOfLevels()
 * boolean isDoorOpen()
 * boolean isMoving()
 * boolean openDoor();
 * GoUp(int desiredFloor)
 * boolean GoDown(int desiredFloor)
 * 
 * 
 */
	
	private Elevator elevator;

	@Before
	public void setup() {
		elevator = new Elevator(1, 13);
	}
	
	@Test
	public void get_shaft_number() {
		//arrange
		//act
		//assert
		Assert.assertEquals("Shaft Level should be 1", 1, elevator.getShaftNumber());
		
		
	}
	
	@Test
	public void get_current_level() {
		//arrange
		//act
		//assert
		Assert.assertEquals("Current Level should be 1", 1, elevator.getCurrentLevel());
	}
	
	@Test
	public void get_number_of_levels() {
		//arrange
		//act
		//assert
		Assert.assertEquals("Number of levels should be 13", 13, elevator.getNumberOfLevels());
	}
	
	@Test
	public void is_door_open() {
		//arrange
		//act
		//assert
		Assert.assertTrue("Door should be open", elevator.isDoorOpen());
	}
	@Test
	public void close_door_closes_door() {
		//arrange
		//act
		elevator.closeDoor();
		//assert
		Assert.assertFalse("Door should be closed", elevator.isDoorOpen());
	}
	
	@Test
	public void go_to_12_floor_while_door_is_closed() {
		//arrange
		//act
		elevator.closeDoor();
		//assert
		Assert.assertTrue("Elevator should go to 12th floor", elevator.goUp(12));
	}
	
	@Test
	public void go_to_12_floor_while_door_is_open() {
		//arrange
		//act
		//assert
		Assert.assertFalse("Elevator should not be able to move while the door is open", elevator.goUp(12));
	}
	
	@Test
	public void go_to_14_floor_while_door_is_closed()  {
		//arrange
		//act
		elevator.closeDoor();
		//assert
		Assert.assertFalse("Elevator can not go higher than the number of floors", elevator.goUp(14));
	}
	
	@Test
	public void go_to_floor_1_when_on_floor_1()  {
		//arrange
		//act
		elevator.closeDoor();
		//assert
		Assert.assertFalse("Elevator can not move while door is open", elevator.goUp(1));
	}
	
	@Test
	public void go_to_5_from_12_floor_while_door_is_closed() {
		//arrange
		//act
		elevator.closeDoor();
		elevator.goUp(12);
		//assert
		Assert.assertTrue("Elevator should go to 5th floor", elevator.goDown(5));
	}
	
	@Test
	public void go_to_5_from_12_floor_while_door_is_open() {
		//arrange
		//act
		elevator.closeDoor();
		elevator.goUp(12);
		elevator.openDoor();
		//assert
		Assert.assertFalse("Elevator should not be able to move while the door is open", elevator.goDown(5));
	}
	
	@Test
	public void go_to_0_floor_while_door_is_closed()  {
		//arrange
		//act
		elevator.closeDoor();
		elevator.goUp(12);
		//assert
		Assert.assertFalse("Elevator can not go to 0th floor", elevator.goDown(0));
	}
	
	@Test
	public void go_down_to_same_floor_while_door_is_closed()  {
		//arrange
		//act
		elevator.closeDoor();
		elevator.goUp(12);
		//assert
		Assert.assertFalse("Elevator can not go to 0th floor", elevator.goDown(12));
	}
	
	@Test
	public void go_down_to_higher_level_floor_while_door_is_closed()  {
		//arrange
		//act
		elevator.closeDoor();
		elevator.goUp(5);
		//assert
		Assert.assertFalse("Elevator can not go to 0th floor", elevator.goDown(12));
	}
	
	@Test
	public void open_door() {
		//arrange
				//act
				elevator.closeDoor();
				elevator.openDoor();
				//assert
				Assert.assertTrue("Elevator doors should open", elevator.isDoorOpen());
	}
	@Test
	public void is_the_elevator_moving() {
		//arrange
		//act
		//assert
		Assert.assertFalse("Elevator should be moving", elevator.isMoving());
	}
	
}
