package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputFileChecker {
    private int totalLinesFromInputFile;
    private int numberOfFilesToBuild;
    private int linesPerOutputFile;
    private int numberOfLoopsForLastFile;




    public int getTotalLineCountFromInputFile(File inputFile) throws IOException {

        try(Scanner fileScanner = new Scanner(inputFile)) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                totalLinesFromInputFile++;
            }
        }
    return totalLinesFromInputFile;
    }


    public int getNumberOfLoopsForLastFile(int totalLinesFromInputFile, int linesPerOutputFile) {
        numberOfLoopsForLastFile = totalLinesFromInputFile % linesPerOutputFile;

        return numberOfLoopsForLastFile;
    }

    public int getNumberOfFilesToBuild(int linesPerOutputFile) {

        numberOfFilesToBuild = totalLinesFromInputFile / linesPerOutputFile;
        totalLinesFromInputFile %= linesPerOutputFile;
        if (totalLinesFromInputFile > 0)
            numberOfFilesToBuild++;

        return numberOfFilesToBuild;
    }
}

