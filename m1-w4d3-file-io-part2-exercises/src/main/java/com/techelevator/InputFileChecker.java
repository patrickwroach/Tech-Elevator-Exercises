package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputFileChecker {
    private int totalLinesFromInputFile;
    private int linesPerOutputFile;
    private int numberOfFilesToBuild;
    private String lineToGoToOutputFile;

    public String getLineToGoToOutputFile() {
        return lineToGoToOutputFile;
    }

    public void readLineFromInputFile(File inputFile, int filesToBuild, int linesToSplit, int linesToSplitOnEnd) throws FileNotFoundException {
        String line = "";
        try (Scanner fileScanner = new Scanner(inputFile)) {

            for (int i = 0; i < filesToBuild - 1; i++) {
                try (PrintWriter writer = new PrintWriter("input" + (i + 1) + ".txt")) {
                    for (int j = 0; j < linesToSplit; j++) {

                        line = fileScanner.nextLine();
                        writer.println(line);

                    }
                }
            }
                    try (PrintWriter writer = new PrintWriter("input" + (4) + ".txt")) {
                        for (int j = 0; j < linesToSplitOnEnd; j++) {

                            line = fileScanner.nextLine();
                            writer.println(line);

                        }
                    }
                }
            }




    public int getTotalLineCountFromInputFile(File inputFile) throws IOException {

        try(Scanner fileScanner = new Scanner(inputFile)) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                totalLinesFromInputFile++;
            }
        }
    return totalLinesFromInputFile;
    }


    public int getNumberOfLastLoop(int totalLinesFromInputFile, int linesPerOutputFile) {
              totalLinesFromInputFile %= linesPerOutputFile;



        return totalLinesFromInputFile;
    }

    public int getNumberOfFilesToBuild(int totalLinesFromInputFile, int linesPerOutputFile) {
        int numberOfFilesToBuild = 0;

        numberOfFilesToBuild = totalLinesFromInputFile / linesPerOutputFile;
        totalLinesFromInputFile %= linesPerOutputFile;
        if (totalLinesFromInputFile > 0)
            numberOfFilesToBuild++;


        return numberOfFilesToBuild;
    }
}

