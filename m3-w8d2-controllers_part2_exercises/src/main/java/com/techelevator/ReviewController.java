package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;



@Controller
public class ReviewController {

    @Autowired
    ReviewDao reviewDao;

    @RequestMapping(path="/allReviews", method=RequestMethod.GET)
    public String showAllReviews(ModelMap modelHolder) {
        List<Review> reviews= reviewDao.getAllReviews();
        modelHolder.put("allReviews", reviews);


        return "allReviews";
    }
    @RequestMapping(path="/newReview", method=RequestMethod.GET)
    public String newReviewInput(ModelMap modelHolder) {
        if(!modelHolder.containsAttribute("review")){
            modelHolder.put("review", new Review());
        }

        return "newReview";
    }


    @RequestMapping(path="/newReview", method=RequestMethod.POST)
    public String newReviewInputSubmission(Review newReview)  {

        newReview.setDateSubmitted(LocalDateTime.now());
        reviewDao.save(newReview);
        return "redirect:/allReviews";
    }


}