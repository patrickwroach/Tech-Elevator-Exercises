package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
/*
 * getPlaneNumber
 * getBookedFirstClassSeats
 * getTotalFirstClassSeats
 * getBookedCoachSeats
 * getAvailableCoachSeats
 * getTotalCoachSeats
 * Reserve
 * 
 */

    private Airplane plane;

    @Before
    public void setup() {
        plane = new Airplane(20, 20);
    }

    @Test
    public void get_plane_number() {
        //arrange
        //act
        //assert
        Assert.assertEquals("String should be null", null, plane.getPlaneNumber());
    }

    @Test
    public void reserve_10_first_class_seats() {
        //arrange
        //act
        plane.reserve(true, 10);
        //assert
        Assert.assertEquals("Should have 10 available first class seats", 10, plane.getAvailableFirstClassSeats());
    }

    @Test
    public void reserve_too_many_first_class_seats() {
        //arrange
        //act
        plane.reserve(true, 30);
        //assert
        Assert.assertFalse("Should be unable to reserve more tickets than number of seats", plane.reserve(true, 30));
    }

    @Test
    public void reserve_too_many_coach_seats() {
        //arrange
        //act
        //assert
        Assert.assertFalse("Should be unable to reserve more tickets than number of seats", plane.reserve(false, 30));
    }

    @Test
    public void get_booked_first_class_seats() {
        //arrange
        //act
        plane.reserve(true, 10);
        //assert
        Assert.assertEquals("Should have 10 booked first class seats", 10, plane.getBookedFirstClassSeats());
    }

    @Test
    public void get_total_first_class_seats() {
        //arrange
        //act
        //assert
        Assert.assertEquals("Should have 20 available first class seats", 20, plane.getTotalFirstClassSeats());
    }

    @Test
    public void reserve_10_coach_seats() {
        //arrange
        //act
        plane.reserve(false, 10);
        //assert
        Assert.assertEquals("Should have 10 available coach seats", 10, plane.getAvailableCoachSeats());
    }

    @Test
    public void get_booked_coach_seats() {
        //arrange
        //act
        plane.reserve(false, 10);
        //assert
        Assert.assertEquals("Should have 10 booked coach seats", 10, plane.getBookedCoachSeats());
    }

    @Test
    public void get_total_coach_seats() {
        //arrange
        //act
        //assert
        Assert.assertEquals("Should have 20 available coach seats", 20, plane.getTotalCoachSeats());
    }

}
