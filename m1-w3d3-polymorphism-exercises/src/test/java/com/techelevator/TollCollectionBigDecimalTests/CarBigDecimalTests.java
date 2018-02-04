package com.techelevator.TollCollectionBigDecimalTests;

import com.techelevator.TollCollectionBigDecimal.CarBigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CarBigDecimalTests {

    private CarBigDecimal carWithTrailer;
    private CarBigDecimal carNoTrailer;

    @Before
    public void setup() {
        carWithTrailer = new CarBigDecimal(true);
        carNoTrailer = new CarBigDecimal(false);
    }

    @Test
    public void getName() {

        Assert.assertEquals("Car", carWithTrailer.getName());
        Assert.assertEquals("Car (with Trailer)", carNoTrailer.getName());

    }

    @Test
    public void calculateToll() {
        carWithTrailer.calculateToll(100);

        Assert.assertEquals("Should be 3.00", new BigDecimal(3.00), (carWithTrailer.getRate()));
//        Assert.assertTrue("Should be 2.00", carNoTrailer.calculateToll(100) == 2.00);
    }
}