package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SPUTwoDayBusinessTest {

    private SPUTwoDayBusiness deliveryMethod;

    @Before
    public void setUp(){
        deliveryMethod = new SPUTwoDayBusiness();
    }

    @Test
    public void getName() {
        Assert.assertEquals("SPU (2-day business)", deliveryMethod.getName());
    }

    @Test
    public void calculateRate() {

        Assert.assertTrue("Should be 15.9375", deliveryMethod.calculateRate(340, 15) == 15.9375);
    }
}