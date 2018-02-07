package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {

    KataPotter hp;

    @Before
    public void setup() {
        hp = new KataPotter();
    }

    @Test
    public void no_discounts() {
//        int[] books = new int[]{1,0,0,0,0};

        Assert.assertEquals(8, hp.getCost(new int[]{1,0,0,0,0}), 0.0);
        Assert.assertEquals(8, hp.getCost(new int[]{0,1,0,0,0}), 0.0);
        Assert.assertEquals(8, hp.getCost(new int[]{0,0,1,0,0}), 0.0);
        Assert.assertEquals(8, hp.getCost(new int[]{0,0,0,1,0}), 0.0);
        Assert.assertEquals(8, hp.getCost(new int[]{0,0,0,0,1}), 0.0);
    }

}
