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

//    @RequestMapping("/fizzBuzzRevisitedResult", method= RequestMethod.GET)
//    /* If you need a reference to the HttpServletRequest object in the
//     * handler method, just add a method parameter of type
//     * javax.servlet.http.HttpServletRequest */
//    public String fizzBuzzOutput(HttpServletRequest request) {

//        String divisor1 = request.getParameter("divisor1");
//        String divisor2  = request.getParameter("divisor2");
//        String alternativeFizz = request.getParameter("alternativeFizz");
//        String alternativeBuzz = request.getParameter("alternativeBuzz");
//        String number1 = request.getParameter("number1");
//        String number2 = request.getParameter("number2");
//        String number3 = request.getParameter("number3");
//        String number4 = request.getParameter("number4");
//        String number5 = request.getParameter("number5");
//
//        FizzBuzz fizzBuzz = new FizzBuzz(divisor1, divisor2, alternativeFizz, alternativeBuzz, number1, number2, number3, number4, number5 );
//        request.setAttribute("fizzBuzz", fizzBuzz);

        /* Controller methods can return a variety of types of values,
         * but we will be using `String`.  The value of the returned
         * String is the *logical view name* to render.  The default
         * implementation is to map the logical view name directly to
         * a file, however we configured a different View Resolver
         * that maps logical view names to JSP files under WEB-INF/jsp
         * See springmvc-servlet.xml for details. */
//        return "fizzBuzzRevisitedResult";
//    }
//

    @RequestMapping(path="/fizzBuzzRevisitedResult", method=RequestMethod.GET)
    public String generateResults(FizzBuzz fizzBuzz, ModelMap model){
        model.addAttribute("fizzBuzz", fizzBuzz);
        model.addAttribute("method", "GET");
        return "fizzBuzzRevisitedResult";
    }
}
