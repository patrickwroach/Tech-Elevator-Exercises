package com.techelevator.TollCollectionTests;

import com.techelevator.TollCollection.Tank;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TankTest {


    private Tank tank;

    @Before
    public void setup() {
        tank = new Tank();
    }

    @Test
    public void getName() {

        Assert.assertEquals("Tank", tank.getName());


    }

    @Test
    public void calculateToll() {

        Assert.assertTrue("Should be 0.00", tank.calculateToll(100) == 0.00);

    }
}