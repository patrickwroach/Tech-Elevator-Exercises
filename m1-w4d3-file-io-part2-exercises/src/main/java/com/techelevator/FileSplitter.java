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
//		outputFileCreator.buildDummyFile("input" + i + ".txt");
	}


	//WHILE SCANNER HAS NEXT
	//LOOP NUMBER OF FILES TO BUILD TIMES
	//FOR INT < SPLIT EVERY USER INPUTTED AMOUNT OF LINES
	//GET LINE
	//PRINT LINE TO NEW FILE

	String inputLineTest = InputFileChecker.readLineFromInputFile(inputFile);

	for (int i = 0; i < 100; i++) {
		inputLineTest = InputFileChecker.readLineFromInputFile(inputFile);
		outputFileCreator.setLineFromInputFile(inputLineTest);
		System.out.println(inputLineTest);
//		outputFileCreator.writeLineToOutputFile(inputLineTest, outputFile);
	}

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

