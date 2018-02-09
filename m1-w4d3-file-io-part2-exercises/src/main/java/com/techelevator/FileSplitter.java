package com.techelevator;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSplitter {
public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	File inputFile = new File("input.txt");
	File outputFile = new File("input1.txt");

	InputFileChecker inputFileChecker = new InputFileChecker();
	OutputFileCreator outputFileCreator = new OutputFileCreator();

	for (int i = 1; i < 3; i++) {
//		outputFileCreator.buildDummyFile("input.txt");
		outputFileCreator.buildDummyFile("input" + i + ".txt");
	}

	String inputLineTest = InputFileChecker.readLineFromInputFile(inputFile);

	outputFileCreator.setLineFromInputFile(inputLineTest);

	outputFileCreator.writeLineToOutputFile("test", outputFile);
//	int linePerFile;
//
//
//	System.out.println("How many lines per file?");
//	linePerFile = Integer.parseInt(in.nextLine());
//
//	buildSequentialFiles();

	}


//	static private void buildSequentialFiles() throws IOException {
//		int dummyLength = 3;
//		String fileName = "input";
//		File[] fileList = new File[dummyLength];
//
//	 for (int i = 0; i < dummyLength; i++) {
//
//		 File newFile = new File(fileName + i + ".txt");
//	 }
//
//		for (int i = 0; i < fileList.length; i++) {
//			File file = fileList[i];
//
//		}
//
//	}
	}

