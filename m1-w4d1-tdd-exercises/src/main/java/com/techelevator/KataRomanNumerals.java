package com.techelevator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class KataRomanNumerals {

    public String convertToRomanNumeral(int num) {
        String output = "";

        String[] numerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] decimals = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        for (int i = decimals.length - 1; i >= 0; i--) {  //Outer loop checks to get the amount of times we'll add a particular array to the output.
           int matches = num / decimals[i];  //Goes down the decimal array checking how many times 1000...1 can go into the number.  1984 / 1000 = 1... 984/900 = 1...84/500 = 0 and so on.

            while (matches > 0){  //If we get a match we go ahead and add that particular number matches amount of times IE: 1 goes into 4 4 times, so I + I + I + I will be added to output
                output += numerals[i];
                matches--;  //decrement down to 0
            }

            num %= decimals[i]; //Chop off the first digit of the number I.E 1984 % 1000 = 984 and so on.
        }
        return output;


    }


    public int convertToDecimal(String romanNumeral) {
        //Recursive method starts at the front and either takes off the first or first two characters depending on which form it is, then just continues to lop off the front until we get to an empty String.
        if (romanNumeral.isEmpty()) return 0;
        if (romanNumeral.startsWith("M")) return 1000 + convertToDecimal(romanNumeral.substring(1));
        if (romanNumeral.startsWith("CM")) return 900 + convertToDecimal(romanNumeral.substring(2));
        if (romanNumeral.startsWith("D")) return 500 + convertToDecimal(romanNumeral.substring(1));
        if (romanNumeral.startsWith("CD")) return 400 + convertToDecimal(romanNumeral.substring(2));
        if (romanNumeral.startsWith("C")) return 100 + convertToDecimal(romanNumeral.substring(1));
        if (romanNumeral.startsWith("XC")) return 90 + convertToDecimal(romanNumeral.substring(2));
        if (romanNumeral.startsWith("L")) return 50 + convertToDecimal(romanNumeral.substring(1));
        if (romanNumeral.startsWith("XL")) return 40 + convertToDecimal(romanNumeral.substring(2));
        if (romanNumeral.startsWith("X")) return 10 + convertToDecimal(romanNumeral.substring(1));
        if (romanNumeral.startsWith("IX")) return 9 + convertToDecimal(romanNumeral.substring(2));
        if (romanNumeral.startsWith("V")) return 5 + convertToDecimal(romanNumeral.substring(1));
        if (romanNumeral.startsWith("IV")) return 4 + convertToDecimal(romanNumeral.substring(2));
        if (romanNumeral.startsWith("I")) return 1 + convertToDecimal(romanNumeral.substring(1));
        else return 0;
    }
}


