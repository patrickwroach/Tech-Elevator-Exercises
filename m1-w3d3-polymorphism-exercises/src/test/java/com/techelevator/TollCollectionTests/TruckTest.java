package com.techelevator.TollCollectionTests;

import com.techelevator.TollCollection.Truck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TruckTest {


    private Truck fourAxleTruck;
    private Truck sixAxleTruck;
    private Truck eightAxleTruck;

    @Before
    public void setup() {
        fourAxleTruck = new Truck(4);
        sixAxleTruck = new Truck(6);
        eightAxleTruck = new Truck ( 8);
    }

    @Test
    public void getName() {

        Assert.assertEquals("Truck (4 Axles)", fourAxleTruck.getName());
        Assert.assertEquals("Truck (6 Axles)", sixAxleTruck.getName());
        Assert.assertEquals("Truck (8 Axles)", eightAxleTruck.getName());

    }

    @Test
    public void calculateToll() {

        Assert.assertTrue("Should be 4.00", fourAxleTruck.calculateToll(100) == 4.00);
        Assert.assertTrue("Should be 4.50", sixAxleTruck.calculateToll(100) == 4.50);
        Assert.assertTrue("Should be 4.80", eightAxleTruck.calculateToll(100) == 4.80);
    }
}