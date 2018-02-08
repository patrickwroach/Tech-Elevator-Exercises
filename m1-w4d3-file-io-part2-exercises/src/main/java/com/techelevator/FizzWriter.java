package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FizzWriter {
	//FizzBuzz.txt


	public static void main(String[] args) throws IOException {
		File f = new File("FizzBuzz.txt");

		try (PrintWriter writer = new PrintWriter(f)) {

			for (int i = 1; i <= 300; i++) {
				String output = "";

				if (i % 3 == 0) output += "Fizz";
				if (i % 5 == 0) output += "Buzz";

				writer.println((!output.isEmpty()) ? output : output.valueOf(i));

			}
		}
		System.out.println("FizzBuzz written.");
	}
	}
