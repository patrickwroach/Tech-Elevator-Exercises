package com.techelevator;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class BabyLottoController {

    @RequestMapping("/babyLotto")
    public String babyLottoForm() {

        return "babyLotto";
    }


    @RequestMapping(path="/babyLottoResult", method=RequestMethod.GET)
    public String generateResults(BabyLotto babyLotto, ModelMap model){
        model.addAttribute("babyLotto", babyLotto);
        model.addAttribute("method", "GET");

        return "babyLottoResult";
    }
}
