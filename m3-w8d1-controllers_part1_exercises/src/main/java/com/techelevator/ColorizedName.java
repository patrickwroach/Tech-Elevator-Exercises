package com.techelevator;

public class ColorizedName {


    private String firstName;
    private String lastName;
    private boolean isRed;
    private boolean isBlue;
    private boolean isGreen;


    public ColorizedName(String firstName, String lastName, boolean isRed, boolean isBlue, boolean isGreen) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isRed = isRed;
        this.isBlue = isBlue;
        this.isGreen = isGreen;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isRed() {
        return isRed;
    }

    public void setRed(boolean red) {
        isRed = red;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean blue) {
        isBlue = blue;
    }

    public boolean isGreen() {
        return isGreen;
    }

    public void setGreen(boolean green) {
        isGreen = green;
    }
}
