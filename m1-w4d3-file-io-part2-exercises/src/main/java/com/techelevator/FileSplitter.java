package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSplitter {
	public static void main(String[] args) throws IOException {

		String fileName = args[0];
		int linesToSplit = Integer.parseInt(args[1]);
		File inputFile = new File(fileName);





		OutputFileCreator outputFileCreator = new OutputFileCreator();
		outputFileCreator.buildDummyFile(fileName); 
		System.out.println("Dummy file written and populated at " + new File(fileName).getAbsolutePath());
		outputFileCreator.parseUserInputForOutputFile(fileName);

		System.out.println("");
		System.out.println("Lines from input file: " + outputFileCreator.getTotalLineCountFromInputFile(new File(fileName)));
		System.out.println("Lines per output file: " + linesToSplit);
		System.out.println("Total output files to build: " + outputFileCreator.getNumberOfFilesToBuild(linesToSplit));
		System.out.println("Lines for last line of input file: " + outputFileCreator.getNumberOfLinesForLastFile(outputFileCreator.getTotalLineCountFromInputFile(new File(fileName)),linesToSplit));
		System.out.println("");
		outputFileCreator.buildFiles(inputFile, linesToSplit);


	}
}

