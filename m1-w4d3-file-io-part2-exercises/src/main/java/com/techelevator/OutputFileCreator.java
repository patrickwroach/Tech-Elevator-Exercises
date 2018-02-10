package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputFileCreator {
    private int totalLinesFromInputFile;
    private int numberOfLinesForLastFile;
    private int numberOfFilesToBuild;
    private String outputFileName;

    public OutputFileCreator() {

    }

    public int getTotalLineCountFromInputFile(File inputFile) throws IOException {
        totalLinesFromInputFile = 0;
        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
                totalLinesFromInputFile++;
            }
        }
        return totalLinesFromInputFile;
    }


    public int getNumberOfLinesForLastFile(int totalLinesFromInputFile, int linesPerOutputFile) {
        numberOfLinesForLastFile = totalLinesFromInputFile % linesPerOutputFile;

        return numberOfLinesForLastFile;
    }


    public int getNumberOfFilesToBuild(int linesPerOutputFile) {

        numberOfFilesToBuild = totalLinesFromInputFile / linesPerOutputFile;
        totalLinesFromInputFile %= linesPerOutputFile;
        if (totalLinesFromInputFile > 0)
            numberOfFilesToBuild++;

        return numberOfFilesToBuild;
    }

    public void buildFiles(File inputFile, int linesToSplit) throws FileNotFoundException {
        String line;

        try (Scanner fileScanner = new Scanner(inputFile)) {
            int i = 0;
            for (; i < numberOfFilesToBuild; i++) {
                try (PrintWriter writer = new PrintWriter(outputFileName + "-" + (i + 1) + ".txt")) {
                    for (int j = 0; j < linesToSplit; j++) {
                        if (!fileScanner.hasNextLine()) break;
                        else {
                            line = fileScanner.nextLine();
                            writer.println(line);
                        }

                    }
                    System.out.println("Writing file: " + outputFileName + "-" + (i + 1) + ".txt");
                }
            }
        }
    }


    public void buildDummyFile(String inputFile, int lines) throws IOException {

        try (PrintWriter writer = new PrintWriter(inputFile)) {
            for (int i = 1; i <= lines; i++) {
                writer.println(i);
            }
        }
    }

    public String parseUserInputForOutputFile(String filename) {
        String[] fileNameSplitter = filename.split(".txt");

        outputFileName = filename.substring(0, filename.length() - 4);
        return outputFileName;


    }
}
