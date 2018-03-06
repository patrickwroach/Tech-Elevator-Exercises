package com.techelevator;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
public class LastTwoController {

    @RequestMapping("/lastTwo")
    public String lastTwoForm() {

        return "lastTwo";
    }


    @RequestMapping(path="/lastTwoResult", method=RequestMethod.GET)
    public String generateResults(LastTwo lastTwo, ModelMap model, String[] wordArray){
        model.addAttribute("lastTwo", lastTwo);
        model.addAttribute("method", "GET");

        List<String> words = Arrays.asList(wordArray);

        lastTwo.setWords(words);
        lastTwo.setReversedWords(lastTwo.reverse(words));
        return "lastTwoResult";
    }
}
