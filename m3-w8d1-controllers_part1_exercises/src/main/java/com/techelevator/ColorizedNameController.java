package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //spring controller
public class ColorizedNameController {

    @RequestMapping(path="/colorizedName", method=RequestMethod.GET)

    public String showForm() {

        return "colorizedNameForm";
    }

    @RequestMapping(path="/colorizedNameResult", method=RequestMethod.GET)
    public String generateResults(@ModelAttribute ColorizedName colorizedParameters, ModelMap modelHolder){
        modelHolder.put("colorizedName", colorizedParameters);
        return "colorizedNameResult";
    }
}
