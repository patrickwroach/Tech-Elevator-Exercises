package com.techelevator;

import org.junit.*;

public class KataRomanNumeralsTest {


    KataRomanNumerals numerals;

    @Before
    public void setup() {
        numerals = new KataRomanNumerals();
    }


    @Test
    public void return_I_IV(){
        Assert.assertEquals("", numerals.convertToRomanNumeral(0));
        Assert.assertEquals("I", numerals.convertToRomanNumeral(1));
        Assert.assertEquals("II", numerals.convertToRomanNumeral(2));
        Assert.assertEquals("III", numerals.convertToRomanNumeral(3));
        Assert.assertEquals("IV", numerals.convertToRomanNumeral(4));
    }

    @Test
    public void return_V_IX(){
        Assert.assertEquals("V", numerals.convertToRomanNumeral(5));
        Assert.assertEquals("IX", numerals.convertToRomanNumeral(9));
    }

    @Test
    public void return_X_XIX(){
        Assert.assertEquals("X", numerals.convertToRomanNumeral(10));
        Assert.assertEquals("XIV", numerals.convertToRomanNumeral(14));
        Assert.assertEquals("XV", numerals.convertToRomanNumeral(15));
        Assert.assertEquals("XIX", numerals.convertToRomanNumeral(19));
    }

    @Test
    public void return_XL_XC(){
        Assert.assertEquals("XL", numerals.convertToRomanNumeral(40));
        Assert.assertEquals("XLIX", numerals.convertToRomanNumeral(49));
        Assert.assertEquals("L", numerals.convertToRomanNumeral(50));
        Assert.assertEquals("LXXIV", numerals.convertToRomanNumeral(74));
        Assert.assertEquals("XC", numerals.convertToRomanNumeral(90));
    }

    @Test
    public void return_C_CD(){
        Assert.assertEquals("C", numerals.convertToRomanNumeral(100));
        Assert.assertEquals("CCL", numerals.convertToRomanNumeral(250));
        Assert.assertEquals("CD", numerals.convertToRomanNumeral(400));
    }

    @Test
    public void return_D_M(){
        Assert.assertEquals("D", numerals.convertToRomanNumeral(500));
        Assert.assertEquals("DCCL", numerals.convertToRomanNumeral(750));
        Assert.assertEquals("CM", numerals.convertToRomanNumeral(900));
    }

    @Test
    public void return_modern_dates(){
        Assert.assertEquals("MCMLXXXIV", numerals.convertToRomanNumeral(1984));
        Assert.assertEquals("MMXVIII", numerals.convertToRomanNumeral(2018));
        Assert.assertEquals("MCMXLII", numerals.convertToRomanNumeral(1942));
    }






    @Test
    public void return_0(){
        Assert.assertEquals(0, numerals.convertToDecimal(""));
    }

    @Test
    public void returns_1_to_3() {
        Assert.assertEquals(1, numerals.convertToDecimal("I"));
        Assert.assertEquals(2, numerals.convertToDecimal("II"));
        Assert.assertEquals(3, numerals.convertToDecimal("III"));
    }

    @Test
    public void count_4() {
        Assert.assertEquals(4, numerals.convertToDecimal("IV"));
    }

    @Test
    public void count_by_5s() {
        Assert.assertEquals(5, numerals.convertToDecimal("V"));
        Assert.assertEquals(15, numerals.convertToDecimal("XV"));

    }

    @Test
    public void count_by_10s() {
        Assert.assertEquals(10, numerals.convertToDecimal("X"));
        Assert.assertEquals(60, numerals.convertToDecimal("LX"));
        Assert.assertEquals(30, numerals.convertToDecimal("XXX"));
    }

    @Test
    public void count_9() {
        Assert.assertEquals(9, numerals.convertToDecimal("IX"));
        Assert.assertEquals(19, numerals.convertToDecimal("XIX"));
        Assert.assertEquals(29, numerals.convertToDecimal("XXIX"));
    }

    @Test
    public void count_in_the_50s() {
        Assert.assertEquals(50, numerals.convertToDecimal("L"));
        Assert.assertEquals(54, numerals.convertToDecimal("LIV"));
        Assert.assertEquals(59, numerals.convertToDecimal("LIX"));
    }

    @Test
    public void count_in_the_100s() {
        Assert.assertEquals(100, numerals.convertToDecimal("C"));
        Assert.assertEquals(109, numerals.convertToDecimal("CIX"));
    }

    @Test
    public void count_in_the_100s_to_500s() {
        Assert.assertEquals(100, numerals.convertToDecimal("C"));
        Assert.assertEquals(290, numerals.convertToDecimal("CCXC"));
        Assert.assertEquals(454, numerals.convertToDecimal("CDLIV"));
    }

    @Test
    public void count_in_the_500s_to_1000s() {
        Assert.assertEquals(500, numerals.convertToDecimal("D"));
        Assert.assertEquals(693, numerals.convertToDecimal("DCXCIII"));
        Assert.assertEquals(769, numerals.convertToDecimal("DCCLXIX"));
    }

    @Test
    public void count_in_the_1000s_to_3000s() {
        Assert.assertEquals(2971, numerals.convertToDecimal("MMCMLXXI"));
        Assert.assertEquals(1984, numerals.convertToDecimal("MCMLXXXIV"));
        Assert.assertEquals(2018, numerals.convertToDecimal("MMXVIII"));
    }


}
