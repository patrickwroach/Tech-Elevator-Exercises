package com.techelevator;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ColorizedNameController {

    @RequestMapping("/colorizedNameForm")
    public String enterNameForm() {

        return "colorizedNameForm";
    }

    @RequestMapping("/ColorizedNameResult")
    /* If you need a reference to the HttpServletRequest object in the
     * handler method, just add a method parameter of type
     * javax.servlet.http.HttpServletRequest */
    public String orderedNameOutput(HttpServletRequest request) {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Color color = new Color(firstName, lastName, request.getParameterValues("selected-color");
        boolean isRed = request.getParameter(isRed);
        boolean isBlue = request.getParameter(isBlue);
        boolean isGreen = request.getParameter(isGreen);
        ColorizedName colorizedName = new ColorizedName(firstName, lastName, isRed, isBlue, isGreen);
        request.setAttribute("colorizedName", colorizedName);

        /* Controller methods can return a variety of types of values,
         * but we will be using `String`.  The value of the returned
         * String is the *logical view name* to render.  The default
         * implementation is to map the logical view name directly to
         * a file, however we configured a different View Resolver
         * that maps logical view names to JSP files under WEB-INF/jsp
         * See springmvc-servlet.xml for details. */
        return "colorizedName";
    }
}
