package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {


    private Car carWithTrailer;
    private Car carNoTrailer;

    @Before
    public void setup() {
        carWithTrailer = new Car(true);
        carNoTrailer = new Car(false);
    }

    @Test
    public void getName() {

        Assert.assertEquals("Car", carWithTrailer.getName());
        Assert.assertEquals("Car (with Trailer)", carNoTrailer.getName());

    }

    @Test
    public void calculateToll() {

        Assert.assertTrue("Should be 2.00", carWithTrailer.calculateToll(100) == 3.00);
        Assert.assertTrue("Should be 2.00", carNoTrailer.calculateToll(100) == 2.00);
    }
}