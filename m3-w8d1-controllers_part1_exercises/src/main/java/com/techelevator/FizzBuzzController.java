package com.techelevator;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FizzBuzzController {

    @RequestMapping("/fizzBuzzForm")
    public String fizzBuzzForm() {

        return "fizzBuzzForm";
    }


    @RequestMapping(path="/fizzBuzzRevisitedResult", method=RequestMethod.GET)
    public String generateResults(FizzBuzz fizzBuzz, ModelMap model){
        model.addAttribute("fizzBuzz", fizzBuzz);
        model.addAttribute("method", "GET");
        return "fizzBuzzRevisitedResult";
    }
}
