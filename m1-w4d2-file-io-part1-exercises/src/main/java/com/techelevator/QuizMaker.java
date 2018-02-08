package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class QuizMaker {
    static int correctAnswers = 0;
    static ArrayList<Questions> questionsList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = (getInputFileFromUser());

        makeQuestions(inputFile);
        AskQuestion(questionsList);
        printScore(correctAnswers);

    }

    private static void makeQuestions(File inputFile) throws FileNotFoundException {

        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] questionBuilder = line.split("[|]");
                Questions questions = new Questions();

                questions.setQuestion(questionBuilder[0]);

                for (int i = 1; i < questionBuilder.length; i++) {
                    if (questionBuilder[i].contains("*")) {
                        questions.setCorrectAnswer(i);
                        questions.setChoices(questionBuilder[i].substring(0, questionBuilder[i].length()-1));
                    }
                    else {
                        questions.setChoices(questionBuilder[i]);
                    }

                }

                questionsList.add(questions);
            }
        }
    }


    private static void AskQuestion(ArrayList<Questions> questionsList) {
        Scanner in = new Scanner(System.in);
        int userAnswer = 0;
        String response;

        for (Questions questions : questionsList) {

            while (userAnswer < 1 || userAnswer > questions.choices.size()) {
                System.out.println();
                System.out.println(questions.getQuestion());

                questions.getChoices();
                userAnswer = Integer.parseInt(in.nextLine());


                if (userAnswer < 1 || userAnswer > questions.choices.size()) {
                    System.out.println("Your Answer : " + userAnswer);
                    System.out.println("Invalid Answer.");
                }
            }
            if (userAnswer == questions.getCorrectAnswer()) {
                response = "Correct!";
                correctAnswers++;
            } else {
                response = "Sorry, the correct answer was " + questions.choices.get(questions.getCorrectAnswer() - 1) + ".";
            }
            System.out.println("Your Answer : " + userAnswer);
            System.out.println(response);
            userAnswer = 0;
        }
    }

    private static void printScore(int correctAnswers) {
        int score = (correctAnswers * 100 / questionsList.size() * 100) / 100;
        String response = "";

        if (score >= 90) response = "A, Great Job!";
        else if (score >= 80) response = "B, Good Job!";
        else if (score >= 70) response = "C, OK.";
        else if (score >= 60) response = "D, Oh boy...";
        else if (score >= 50) response = "F, Don't quit your day job.";


        System.out.println();
        System.out.println("You got " + correctAnswers + " correct out of " + questionsList.size() + " questions.");
        System.out.println(score + "% " + response);

        System.out.println();
    }


    private static File getInputFileFromUser() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter path to input file: ");
		String path = userInput.nextLine();
//        String path = "test_quiz.txt";

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
