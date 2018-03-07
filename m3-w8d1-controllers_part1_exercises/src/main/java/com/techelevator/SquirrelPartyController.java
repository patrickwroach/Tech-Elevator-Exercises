package com.techelevator;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SquirrelPartyController {

    @RequestMapping("/squirrelParty")
    public String squirrelPartyForm() {

        return "squirrelParty";
    }


    @RequestMapping(path="/squirrelPartyResult", method=RequestMethod.GET)
    public String generateResults(SquirrelParty squirrelParty, ModelMap model, int squirrelNumber, boolean weekend){
        model.addAttribute("squirrelParty", squirrelParty);
        model.addAttribute("method", "GET");

       if ( (weekend)&& (squirrelNumber >= 40)) {
           squirrelParty.setSuccess(true);
       }

        if ( (!weekend)&& (squirrelNumber >= 40 && squirrelNumber <= 60) ) {
            squirrelParty.setSuccess(true);
        }

        return "squirrelPartyResult";
    }
}
