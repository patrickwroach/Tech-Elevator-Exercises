package com.techelevator;

import java.util.Scanner;
/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int convertedMeasurement = 0;
        String convertedScale = "";
        String feetOrMeters = "";
        int measurement = 0;

        do {
            System.out.print("Please enter the length: ");                      //Get input from user, parse to an int
            String input = in.nextLine();                                       //and convert to lowercase to save me
            measurement = Integer.parseInt(input);                              //code and headaches.
            System.out.print("Is the measurement in (m)eters, or (f)eet?");
            feetOrMeters = in.nextLine().toLowerCase();


            switch (feetOrMeters) {
                case "m":
                    convertedMeasurement = (int) (measurement * 3.2808399);
                    convertedScale = "f.";
                    break;
                case "f":
                    convertedMeasurement = (int) (measurement * .3048);
                    convertedScale = "m.";
                    break;
                default:
                    System.out.println("Please enter a valid measurement next time.");

            }
        } while (!feetOrMeters.equals("f") && !feetOrMeters.equals("m"));       //Run the loop until I get f or m.
        System.out.println(measurement + "" + feetOrMeters + " is " + convertedMeasurement + convertedScale);

    }

}
