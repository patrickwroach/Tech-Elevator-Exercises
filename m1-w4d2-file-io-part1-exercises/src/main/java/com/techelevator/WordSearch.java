package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

    private static String wordToSearch = "";
    private static boolean retainCase = true;

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = getInputFileFromUser();

        getWordFromUser();
        wordSearch(inputFile);

    }

    private static void getWordFromUser() {
        Scanner in = new Scanner(System.in);
        String caseChoice = "R";

        System.out.print("Enter String To Search: ");
        wordToSearch = in.nextLine();
        System.out.println("Searching for: " + wordToSearch);

        do {
            System.out.print("(I)gnore or (R)etain Case? ");
            caseChoice = in.nextLine().toUpperCase();
        } while (!caseChoice.equals("I") && !caseChoice.equals("R"));

        if (caseChoice.equals("I")) retainCase = false;

    }

    private static void wordSearch(File inputFile) throws FileNotFoundException {
        int lineCount = 0;
        int wordCount = 0;

        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextLine() && !fileScanner.nextLine().trim().isEmpty()) {
                String line = (retainCase) ? fileScanner.nextLine() : fileScanner.nextLine().toLowerCase(); //Retains Case of stream or converts to lower case for comparision.
                wordToSearch = (retainCase) ? wordToSearch : wordToSearch.toLowerCase();  //Retains Case of search term or converts to lower case for comparision.
                lineCount++;

                if (line.contains(wordToSearch)) {
                    System.out.println(lineCount + ")" + " " + line);
                    wordCount++;
                }
            }
        }

        System.out.println();
        System.out.println((wordCount > 0) ? "Word Count: " + wordCount : "String not found.");

    }

    private static File getInputFileFromUser() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter path to input file: ");
        String path = userInput.nextLine();

        File inputFile = new File(path);
        if (inputFile.exists() == false) { // checks for the existence of a file
            System.out.println(path + " does not exist");
            System.exit(1); // Ends the program
        } else if (inputFile.isFile() == false) {
            System.out.println(path + " is not a file");
            System.exit(1); // Ends the program
        }
        return inputFile;
    }


}
