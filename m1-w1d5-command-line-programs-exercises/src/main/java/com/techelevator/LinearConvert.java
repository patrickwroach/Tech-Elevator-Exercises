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
		System.out.print("Please enter the length: ");
		String input = in.nextLine();
		int measurement = Integer.parseInt(input);
		System.out.print("Is the measurement in (m)eters, or (f)eet?");
		String feetOrMeters = in.nextLine().toLowerCase();
		switch (feetOrMeters) {
			case "m": System.out.println(measurement+ "m is " + (int) (measurement * 3.2808399) + "f.");
			break;
			case "f": System.out.println(measurement+ "f is " + (int) (measurement * .3048) + "m.");
			break;
			default: System.out.println("Please enter a valid measurement next time.");
				
		}
		
		
	}

}
