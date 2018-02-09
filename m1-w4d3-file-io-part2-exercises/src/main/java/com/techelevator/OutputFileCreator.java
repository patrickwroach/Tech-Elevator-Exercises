package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputFileCreator {
    private String lineFromInputFile;
    String inputFileAddress;


    public void setLineFromInputFile(String lineFromInputFile) {
        this.lineFromInputFile = lineFromInputFile;
    }

    public void writeLineToOutputFile(String inputLine, File inputFileAddress) throws FileNotFoundException{
        try(PrintWriter writer = new PrintWriter(inputFileAddress)){
            writer.println(inputLine);
        }
    }

    public void buildFile(String pathname) throws IOException {
        File f = new File("input.txt");

        try (PrintWriter writer = new PrintWriter(f)) {

            for (int i = 1; i <= 300; i++) {

                writer.println(i);

            }
        }
        System.out.println("FizzBuzz written.");
    }

    public void buildDummyFile(String pathname) throws IOException {
        File f = new File(pathname);

        try (PrintWriter writer = new PrintWriter(f)) {

            for (int i = 1; i <= 300; i++) {

                writer.println(i);

            }
        }
        System.out.println("FizzBuzz written.");
    }
}
