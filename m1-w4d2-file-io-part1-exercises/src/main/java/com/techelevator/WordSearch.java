package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("alices_adventures_in_wonderland.txt");

		System.out.print("Enter Word(s) To Search: ");
		Scanner in = new Scanner(System.in);
		String wordToSearch = in.nextLine();
		System.out.println(wordToSearch);
		System.out.print("(R)etain Case or (I)gnore Case ");
		char choice = in.nextLine().charAt(0);
		if (choice == 'r') searchRetainsCase(inputFile, wordToSearch);
		if (choice == 'i') searchIgnoreCase(inputFile, wordToSearch);


	}
	static public void searchIgnoreCase(File inputFile, String wordToSearch) throws FileNotFoundException {
		int lineCount = 0;

		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				lineCount++;
				if (line.toLowerCase().contains(wordToSearch.toLowerCase())) {
					System.out.println(lineCount + ")" + " " + line);
				}
			}
		}
	}

	static public void searchRetainsCase(File inputFile, String wordToSearch) throws FileNotFoundException {
		int lineCount = 0;

		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				lineCount++;
				if (line.contains(wordToSearch)) {
					System.out.println(lineCount + ")" + " " + line);
				}
			}
		}
	}
}
