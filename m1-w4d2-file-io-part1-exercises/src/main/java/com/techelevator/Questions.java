package com.techelevator;
import java.util.ArrayList;
import java.util.List;

public class Questions {
    List<String> choices = new ArrayList<>();
    String question;
    int correctAnswer;


    public Questions() {
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    public void getChoices() {
        int i = 0;
        for (String choice : choices) {
            System.out.println( ++i + ")" + choice);
        }
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setChoices(String choice) {
       choices.add(choice);
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
