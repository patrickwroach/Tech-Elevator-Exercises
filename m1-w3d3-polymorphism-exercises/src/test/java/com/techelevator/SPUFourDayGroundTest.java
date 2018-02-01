
package com.techelevator;

        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;


public class SPUFourDayGroundTest {

    private SPUFourDayGround deliveryMethod;

    @Before
    public void setUp(){
        deliveryMethod = new SPUFourDayGround();
    }

    @Test
    public void getName() {
        Assert.assertEquals("SPU (4-day ground)", deliveryMethod.getName());
    }

    @Test
    public void calculateRate() {

        Assert.assertTrue("Should be 1.59375", deliveryMethod.calculateRate(340, 15) == 1.59375);
    }
}