package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {


    public static List<Integer> factorOf(int n) {
        List<Integer> primes = new ArrayList<>();
        int divisor = 2;  //2 is the first prime we want to start factoring out of a number
        while (n > 1){  //We dont care about 1

            while (n % divisor ==0){ //While we can pull the divisor out of the number
                primes.add(divisor); // Add that divisor
                n /= divisor; //Divide number
            }
            divisor++; //Now check for next prime number
        }

        return primes;
    }
}
