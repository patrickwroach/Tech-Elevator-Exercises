package com.techelevator.DeliveryDriver;

import com.techelevator.DeliveryDriver.PostalServiceThirdClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class PostalServiceThirdClassTest {

    private PostalServiceThirdClass deliveryMethod;


    @Before
    public void setup() {
        deliveryMethod = new PostalServiceThirdClass();
    }


    @Test
    public void getName() {

        Assert.assertEquals("Postal Service (3rd Class)", deliveryMethod.getName());
    }

    @Test
    public void calculateRate() {

        Assert.assertTrue("Should be .68", deliveryMethod.calculateRate(340, 2) == .68);
        Assert.assertTrue("Should be .748", deliveryMethod.calculateRate(340, 8) == .748);
        Assert.assertTrue("Should be .816", deliveryMethod.calculateRate(340, 15) == .816);
        Assert.assertTrue("Should be 5.10", deliveryMethod.calculateRate(340, 48) == 5.10);
        Assert.assertTrue("Should be 5.44", deliveryMethod.calculateRate(340, 128) == 5.44);
        Assert.assertTrue("Should be 5.78", deliveryMethod.calculateRate(340, 500) == 5.78);


    }

}