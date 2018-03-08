package com.techelevator;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class FavoriteThings {

    private String favoriteSeason;

    private String favoriteColor;

    private String favoriteFood;


    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteSeason() {
        return favoriteSeason;
    }

    public void setFavoriteSeason(String favoriteSeason) {
        this.favoriteSeason = favoriteSeason;
    }
}
