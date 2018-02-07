package com.techelevator;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;

public class KataPrimeFactorsTest {

    KataPrimeFactors pf;

@Before
public void setUp() {
    KataPrimeFactors pf = new KataPrimeFactors();

}

    @Test
    public void factor_of_1_is_empty() {
        List<Integer>primes = pf.factorOf(1);
        Assert.assertTrue(primes.isEmpty());

    }
@Test
public void factor_of_2_is_2() {
    //setup
    List<Integer>primes = pf.factorOf(2);
    Integer[] primeCheck = primes.toArray(new Integer[primes.size()]);

    Assert.assertEquals(primeCheck, new Integer[]{2});

}

    @Test
    public void factor_of_3_is_3() {
        //setup
        List<Integer>primes = pf.factorOf(3);
        Integer[] primeCheck = primes.toArray(new Integer[primes.size()]);

        Assert.assertEquals(primeCheck, new Integer[]{3});

    }

    @Test
    public void factor_of_4_is_2_and_2() {
        //setup
        List<Integer>primes = pf.factorOf(4);
        Integer[] primeCheck = primes.toArray(new Integer[primes.size()]);

        Assert.assertEquals(primeCheck, new Integer[]{2, 2});

    }
    @Test
    public void factor_of_5_is_5() {
        //setup
        List<Integer>primes = pf.factorOf(5);
        Integer[] primeCheck = primes.toArray(new Integer[primes.size()]);

        Assert.assertEquals(primeCheck, new Integer[]{5});
    }
    @Test
    public void factor_of_6_is_2_and_3() {
        //setup
        List<Integer>primes = pf.factorOf(6);
        Integer[] primeCheck = primes.toArray(new Integer[primes.size()]);

        Assert.assertEquals(primeCheck, new Integer[]{2,3});
    }

    @Test
    public void factor_of_8_is_2_2_2() {
        //setup
        List<Integer>primes = pf.factorOf(8);
        Integer[] primeCheck = primes.toArray(new Integer[primes.size()]);

        Assert.assertEquals(primeCheck, new Integer[]{2,2,2});

    }

    @Test
    public void factor_of_9_is_3_3() {
        //setup
        List<Integer>primes = pf.factorOf(9);
        Integer[] primeCheck = primes.toArray(new Integer[primes.size()]);

        Assert.assertEquals(primeCheck, new Integer[]{3,3});

    }

    @Test
    public void factor_of_36_is_2_2_3_3() {
        //setup
        List<Integer>primes = pf.factorOf(36);
        Integer[] primeCheck = primes.toArray(new Integer[primes.size()]);

        Assert.assertEquals(primeCheck, new Integer[]{2,2,3,3});

    }

    @Test
    public void factor_of_49_is_7_7() {
        //setup
        List<Integer>primes = pf.factorOf(49);
        Integer[] primeCheck = primes.toArray(new Integer[primes.size()]);

        Assert.assertEquals(primeCheck, new Integer[]{7,7});

    }

    @Test
    public void factor_of_144_is_2_2_2_2_3_3() {
        //setup
        List<Integer>primes = pf.factorOf(144);
        Integer[] primeCheck = primes.toArray(new Integer[primes.size()]);

        Assert.assertEquals(primeCheck, new Integer[]{2,2,2,2,3,3});

    }


}
