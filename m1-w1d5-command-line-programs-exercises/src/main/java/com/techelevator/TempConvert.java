package com.techelevator;

import java.util.*;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

    public static void main(String[] args) {
        int convertedTemp = 0;
        char convertedMeasurement = 'C';
        String celciusOrFarenheit = "A";
        int temperature = 0;
        Scanner in = new Scanner(System.in);

        while (celciusOrFarenheit != "C" || celciusOrFarenheit != "F") {
        System.out.print("Please enter the temperature: ");


            String input = in.nextLine();                                               //Get input from the user, convert to
            temperature = Integer.parseInt(input);                                      //int from string and ask C/F with
            System.out.print("Is the temperature in (C)elcius, or (F)arenheit?");       //to Upper Case to save me some lines of
            celciusOrFarenheit = in.nextLine().toUpperCase();                           //code and headaches.
        }

        switch (celciusOrFarenheit) {
            case "C":
                convertedTemp = (int) (temperature * 1.8 + 32);
                convertedMeasurement = 'F';
                break;
            case "F":
                convertedTemp = (int) ((temperature - 32) / 1.8);
                convertedMeasurement = 'C';
                break;
            default:
                System.out.println("Please enter a valid temperature next time.");
                System.exit(0);

        }
        System.out.println(temperature + "" + celciusOrFarenheit + " is " + convertedTemp + convertedMeasurement + ".");

    }
}
