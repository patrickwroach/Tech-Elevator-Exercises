package com.techelevator.DeliveryDriver;

import com.techelevator.DeliveryDriver.SPUNextDay;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SPUNextDayTest {

    private SPUNextDay deliveryMethod;

    @Before
    public void setUp(){
        deliveryMethod = new SPUNextDay();
    }

    @Test
    public void getName() {
        Assert.assertEquals("SPU (next-day)", deliveryMethod.getName());
    }

    @Test
    public void calculateRate() {

        Assert.assertTrue("Should be 23.90625", deliveryMethod.calculateRate(340, 15) == 23.90625);
    }
}