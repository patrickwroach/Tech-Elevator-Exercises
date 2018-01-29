package com.techelevator;

//## Airplane
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | planeNumber | string | X | | The six-character plane number.  |
//        | bookedFirstClassSeats | int | X |  | The number of already booked first class seats |
//        | availableFirstClassSeats *(derived)* | int | X | | The number of available first class seats. |
//        | totalFirstClassSeats | int | X | | The total number of first class seats. |
//        | bookedCoachSeats | int | X |  | The number of already booked first class seats |
//        | availableCoachSeats *(derived)* | int | X | | The number of available first class seats. |
//        | totalCoachSeats | int | X |  | The total number of first class seats. |
//
//        **Notes**
//        - `availableFirstClassSeats` is a derived attribute calculated by subtracting `bookedFirstClassSeats` from `totalFirstClassSeats`
//        - `availableCoachSeats` is a derived attribute calculated by subtracting `bookedCoachSeats` from `totalCoachSeats`
//
//
//        ### Constructors
//
//        The `Airplane` class has a single constructor. It accepts three arguments.
//
//        Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats)
//
//        - `planeNumber` is the six-character plane number
//        - `totalFirstClassSeats` is the initial number of total first class seats.
//        - `totalCoachSeats` is the initial number of total coach seats.
//
//
//        ### Methods
//
//        bool reserveSeats(bool forFirstClass, int totalNumberOfSeats)
//
//
//        **Notes**
//        - `reserveSeats()` is a method
//        - if firstClass is true, reserve the value for `totalNumberOfSeats` for first class
//    - if firstClass is false, reserve the value for `totalNumberOfSeats` for coach
//            - return `true` if the reservation can be made, `false` if it cannot

public class Airplane {

    String planeNumber;
    private int bookedFirstClassSeats;
    private int totalFirstClassSeats;
    private int bookedCoachSeats;
    private int totalCoachSeats;


    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {

        if (forFirstClass && totalNumberOfSeats < getAvailableFirstClassSeats()) {
            bookedFirstClassSeats += totalNumberOfSeats;
            return true;
        } else if (!forFirstClass && totalNumberOfSeats < getAvailableCoachSeats()) {
            bookedCoachSeats += totalNumberOfSeats;
            return true;
        }
        return false;
    }
}
