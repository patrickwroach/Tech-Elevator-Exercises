package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputFileChecker {
    private int totalLinesFromInputFile;
    private int linesPerOutputFile;
    private int numberOfFilesToBuild;


    public int getTotalLinesFromInputFile(File inputFile) throws IOException {

        try(Scanner fileScanner = new Scanner(inputFile)) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                totalLinesFromInputFile++;
            }
        }
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

