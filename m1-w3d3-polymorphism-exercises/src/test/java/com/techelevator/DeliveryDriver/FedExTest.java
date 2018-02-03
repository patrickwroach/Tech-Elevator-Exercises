package com.techelevator.DeliveryDriver;

import com.techelevator.DeliveryDriver.FedEx;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FedExTest {

    private FedEx deliveryMethod;

    @Before
    public void setUp(){
        deliveryMethod = new FedEx();
    }

    @Test
    public void getName() {
        Assert.assertEquals("FedEx", deliveryMethod.getName());
    }

    @Test
    public void calculateRate() {

        Assert.assertTrue("Should be 20.00", deliveryMethod.calculateRate(340, 2) == 20.00);
        Assert.assertTrue("Should be 25.00", deliveryMethod.calculateRate(501, 2) == 25.00);
        Assert.assertTrue("Should be 23.00", deliveryMethod.calculateRate(340, 49) == 23.00);
        Assert.assertTrue("Should be 20.00", deliveryMethod.calculateRate(501, 49) == 28.00);

    }
}