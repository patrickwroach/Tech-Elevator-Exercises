package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {


    public static void main(String[] args) throws FileNotFoundException {
        //test_quiz.txt
        File inputFile = (getInputFileFromUser());
        ArrayList<Questions> questionsList = new ArrayList<>();


//		makeQuestions(inputFile);


//	}
//	private static void makeQuestions (File inputFile) throws FileNotFoundException {

        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] questionBuilder = line.split("[|]");
                String[] eraseTheAnswer = line.split("[|*]");
                Questions questions = new Questions();

                questions.setQuestion(questionBuilder[0]);

                for (int i = 1; i < questionBuilder.length; i++) {
                    if (questionBuilder[i].contains("*"))
                        questions.setCorrectAnswer(i);
                }

                for (int i = 1; i < eraseTheAnswer.length; i++) {
                    if (!eraseTheAnswer[i].equals(""))
                    questions.setChoices(eraseTheAnswer[i]);
                }

                questionsList.add(questions);

            }
        }

        AskQuestion(questionsList);


    }

    private static void AskQuestion(ArrayList<Questions> questionsList) {
        Scanner in = new Scanner(System.in);
        int userAnswer = 0;
        int score = 0;


        for (Questions questions : questionsList) {
            while (userAnswer < 1 || userAnswer > questions.choices.size()) {
                System.out.println();
                System.out.println(questions.getQuestion());

                questions.getChoices();
                String input = in.nextLine();
                userAnswer = Integer.parseInt(input);


                if (userAnswer < 1 || userAnswer > questions.choices.size())
                    System.out.println("Invalid Answer.");
            }
                if (userAnswer == questions.correctAnswer) {
                    System.out.println("Correct!");
                    score++;
                    userAnswer = 0;
                } else {
                    System.out.println("Sorry, incorrect.");
                    userAnswer = 0;
                }
            }
        System.out.println("You got " + score + " correct out of " + questionsList.size() + " questions.");
        }



    private static File getInputFileFromUser() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter path to input file: ");
//		String path = userInput.nextLine();
        String path = "test_quiz.txt";

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
