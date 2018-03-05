package com.techelevator;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OrderedNameController {

    @RequestMapping("/enterName")
    public String enterNameForm() {

        return "enterName";
    }

    @RequestMapping("/enterName")
    /* If you need a reference to the HttpServletRequest object in the
     * handler method, just add a method parameter of type
     * javax.servlet.http.HttpServletRequest */
    public String displayOrderedName(HttpServletRequest request) {

        String firstName = request.getParameter("firstName");
        String middleInitial = request.getParameter("middleInitial");
        String lastName = request.getParameter("lastName");
        String nameOrder = request.getParameter("nameOrder");

        EnterName enterName = new EnterName(firstName, middleInitial, lastName);
        request.setAttribute("enterName", enterName.getGreeting());

        /* Controller methods can return a variety of types of values,
         * but we will be using `String`.  The value of the returned
         * String is the *logical view name* to render.  The default
         * implementation is to map the logical view name directly to
         * a file, however we configured a different View Resolver
         * that maps logical view names to JSP files under WEB-INF/jsp
         * See springmvc-servlet.xml for details. */
        return "enterName";
    }
}
