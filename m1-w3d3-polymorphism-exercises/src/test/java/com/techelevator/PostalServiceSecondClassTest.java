package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class PostalServiceSecondClassTest {

    private PostalServiceSecondClass deliveryMethod;


    @Before
    public void setup() {
        deliveryMethod = new PostalServiceSecondClass();
    }


    @Test
    public void getName() {

        Assert.assertEquals("Postal Service (2nd Class)", deliveryMethod.getName());
    }

    @Test
    public void calculateRate() {

        Assert.assertTrue("Should be 1.90", deliveryMethod.calculateRate(340, 2) == 1.19);
        Assert.assertTrue("Should be 1.36", deliveryMethod.calculateRate(340, 8) == 1.36);
        Assert.assertTrue("Should be 1.59", deliveryMethod.calculateRate(340, 15) == 1.598);
        Assert.assertTrue("Should be 6.63", deliveryMethod.calculateRate(340, 48) == 6.63);
        Assert.assertTrue("Should be 15.30", deliveryMethod.calculateRate(340, 128) == 15.30);
        Assert.assertTrue("Should be 17.00", deliveryMethod.calculateRate(340, 500) == 17.00);


    }

}