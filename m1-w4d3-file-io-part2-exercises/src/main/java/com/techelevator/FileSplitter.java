package com.techelevator;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSplitter {
	public static void main(String[] args) throws IOException {
		int linesToSplit = 100;
		int totalLinesFromFile = 0;
		int totalFileToBuild = 0;



		Scanner in = new Scanner(System.in);
		File inputFile = new File("input.txt");
		File outputFile = new File("input1.txt");

		String fileName = "input.txt";



		OutputFileCreator outputFileCreator = new OutputFileCreator(fileName, 100);
		outputFileCreator.buildDummyFile(fileName);
		outputFileCreator.buildFiles();

		System.out.println("Number of File to Build:" + outputFileCreator.getNumberOfFilesToBuild());
		System.out.println("Lines to Split:" + outputFileCreator.getLinesToSplit());
		System.out.println("Lines for Last File: " + getNumberOfLinesForLastFile());

		outputFileCreator.buildDummyFile(fileName);
//
//		totalLinesFromFile = inputFileChecker.getTotalLineCountFromInputFile(inputFile);
//		int lastLoopCount = inputFileChecker.getNumberOfLoopsForLastFile(totalLinesFromFile, 100);
//		System.out.println("Total Lines: " + totalLinesFromFile);
//		totalFileToBuild = inputFileChecker.getNumberOfFilesToBuild(totalLinesFromFile, 100);
//		System.out.println("Total Files to Build: " + totalFileToBuild);
//		System.out.println("Last Loop Count" + lastLoopCount);
//
//
//		inputFileChecker.readLineFromInputFile(inputFile, totalFileToBuild, linesToSplit, lastLoopCount);

	}
}

