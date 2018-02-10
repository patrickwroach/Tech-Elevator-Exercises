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
    private int linesToSplit;
    private String inputFile;
    private String outputFileName;

    public OutputFileCreator(String inputFile, int linesToSplit) throws IOException {
        this.linesToSplit = linesToSplit;
        this.inputFile = inputFile;
        this.outputFileName = parseUserInputForOutputFile(inputFile);
        this.totalLinesFromInputFile = totalLineCountFromInputFile(inputFile);
        this.numberOfLinesForLastFile = totalLinesFromInputFile % linesToSplit;
    }

    public int getTotalLinesFromInputFile() {
        return totalLinesFromInputFile;
    }

    public int getNumberOfLinesForLastFile() {
        return numberOfLinesForLastFile;
    }

    public int getLinesToSplit() {
        return linesToSplit;
    }

    public String getInputFile() {
        return inputFile;
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    public int totalLineCountFromInputFile(String inputFile) throws IOException {

        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                totalLinesFromInputFile++;
            }
        }
        return totalLinesFromInputFile;
    }


    public int getNumberOfFilesToBuild() {

        numberOfFilesToBuild = totalLinesFromInputFile / linesToSplit;
        totalLinesFromInputFile %= linesToSplit;
        if (totalLinesFromInputFile > 0)
            numberOfFilesToBuild++;

        return numberOfFilesToBuild;
    }

    public void buildFiles() throws FileNotFoundException {
        String line;

        try (Scanner fileScanner = new Scanner(inputFile)) {
            int i = 0;
            for (; i < numberOfFilesToBuild - 1; i++) {
                try (PrintWriter writer = new PrintWriter(outputFileName + "-" + (i + 1) + ".txt")) {
                    for (int j = 0; j < linesToSplit; j++) {

                        line = fileScanner.nextLine();
                        writer.println(line);

                    }
                }
            }
            try (PrintWriter writer = new PrintWriter(outputFileName + "-" + (i+1) + ".txt")) {
                for (int j = 0; j < numberOfLinesForLastFile; j++) {

                    line = fileScanner.nextLine();
                    writer.println(line);

                }
            }
        }
    }


    public void buildDummyFile(String inputFile) throws IOException {

        try (PrintWriter writer = new PrintWriter(inputFile)) {
            for (int i = 1; i <= 345; i++) {
                writer.println(i);
            }
        }
        System.out.println("FizzBuzz written.");
    }

    public String parseUserInputForOutputFile(String filename) {
        String[] fileNameSplitter = filename.split(".txt");

        outputFileName = filename.substring(0, filename.length() - 4);
        return outputFileName;


    }
}
