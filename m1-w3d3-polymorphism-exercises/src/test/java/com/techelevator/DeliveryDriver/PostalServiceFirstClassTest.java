package com.techelevator.DeliveryDriver;

import com.techelevator.DeliveryDriver.PostalServiceFirstClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;


public class PostalServiceFirstClassTest {

    private PostalServiceFirstClass deliveryMethod;

    @Before
    public void setup() {
        deliveryMethod = new PostalServiceFirstClass();
    }


    @Test
    public void getName() {

        Assert.assertEquals("Postal Service (1st Class)", deliveryMethod.getName());
    }

    @Test
    public void calculateRate() {

        Assert.assertTrue("Should be 11.90", deliveryMethod.calculateRate(340, 2) == 11.90);
        Assert.assertTrue("Should be 13.60", deliveryMethod.calculateRate(340, 8) == 13.60);
        Assert.assertTrue("Should be 15.98", deliveryMethod.calculateRate(340, 15) == 15.98);
        Assert.assertTrue("Should be 66.30", deliveryMethod.calculateRate(340, 48) == 66.30);
        Assert.assertTrue("Should be 15.98", deliveryMethod.calculateRate(340, 128) == 153.00);
        Assert.assertTrue("Should be 15.98", deliveryMethod.calculateRate(340, 500) == 170.00);


    }


}
