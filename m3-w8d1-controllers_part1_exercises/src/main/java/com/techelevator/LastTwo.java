package com.techelevator;

import java.util.LinkedList;
import java.util.List;

public class LastTwo {

    private List<String> words = new LinkedList();
    private List<String> reversedWords = new LinkedList();



    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {

        this.words = words;
    }

    public List<String> getReversedWords() {
        return reversedWords;
    }

    public void setReversedWords(List<String> reversedWords) {
        this.reversedWords = reversedWords;
    }

    public List<String> reverse(List<String> words){
        List<String> reversedWords = new LinkedList<>();
        for (String word : words) {
            reversedWords.add(reverseLastTwo(word));
        }
        return reversedWords;
    }

    public String reverseLastTwo(String word) {
        if (word.length() > 2) {
            return word.substring(0, word.length() - 2)
                    + word.charAt(word.length() - 1)
                    + word.charAt(word.length() - 2);
        } else {
            return word;
        }
    }
    
}
