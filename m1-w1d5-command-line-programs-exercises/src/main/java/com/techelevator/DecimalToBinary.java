package com.techelevator;

import java.util.*;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");

		String input = in.nextLine();
		String[] numbers = input.split(" ");                            //Create a string array of numbers delineated at the " ".
		for (int i = 0; i < numbers.length; i++) {
			int decimalValue = Integer.parseInt(numbers[i]);                //Convert strings to ints.
//			String binaryValue = Integer.toBinaryString(decimalValue);		//Found a built in function for Integer to convert to decimals.  Brian said this was fine.
			String binaryValue = toBinary(decimalValue);					//Buuuut if it wasn't fine, here's a function I wrote to do it.
			System.out.println(decimalValue + " in binary is " + binaryValue);
		}
	}


	public static String toBinary(int decimal) {
		String binaryOutput = "";
		while (decimal > 0) {								//Continue loop until we get to 0, chopping off as we go.
			binaryOutput = (decimal % 2) + binaryOutput;   //modulo 2 will either get us a 1 or 0.  Add to result to the front of the String
			decimal = decimal / 2;							//now change the number to what modulo 2 got us to
		}
		return binaryOutput;
	}
}
