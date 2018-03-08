package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@SessionAttributes({"favoriteColor", "favoriteSeason", "favoriteFood"})
public class FavoriteThingsController {



    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String showPage1() {

        return "page1";
    }

    @RequestMapping(path = "/page1", method = RequestMethod.POST)
    public String handlePage1Form(
            @RequestParam String favoriteColor, ModelMap model) {


        model.addAttribute("favoriteColor", favoriteColor);
        return "redirect:/page2";


    }

    @RequestMapping(path = "/page2", method = RequestMethod.GET)
    public String showPage2() {
        return "page2";
    }

    @RequestMapping(path = "/page2", method = RequestMethod.POST)
    public String handlePage2Form(
            @RequestParam String favoriteFood, ModelMap model) {


        model.addAttribute("favoriteFood", favoriteFood);
        return "redirect:/page3";
    }

    @RequestMapping(path = "/page3", method = RequestMethod.GET)
    public String showPage3() {
        return "page3";
    }

    @RequestMapping(path = "/page3", method = RequestMethod.POST)
    public String handlePage3Form(
            @RequestParam String favoriteSeason, ModelMap model) {


        model.addAttribute("favoriteSeason", favoriteSeason);
        return "redirect:/summary";
    }

    @RequestMapping(path = "/summary", method = RequestMethod.GET)
    public String showSummary(ModelMap model) {

        model.addAttribute("favoriteColor", model.get("favoriteColor"));
        model.addAttribute("favoriteSeason", model.get("favoriteSeason"));
        model.addAttribute("favoriteFood", model.get("favoriteFood"));

        return "summary";
    }

//    @RequestMapping(path = "/summary", method = RequestMethod.POST)
//    public String handleSummary(
//            @RequestParam String favoriteSeason, ModelMap model) {
//
//
//        model.addAttribute("favoriteSeason", favoriteSeason);
//        return "redirect:/summary";
//    }


}
