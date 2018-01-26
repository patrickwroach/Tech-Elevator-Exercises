package com.techelevator;

//## Homework Assignment
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | totalMarks | int | X | X | The total number of correct marks received on the assignment. |
//        | possibleMarks | int | X | | The number of possible marks on the assignment. |
//        | submitterName | string | X | X | The submitter's name for the assignment. |
//        | letterGrade *(derived)* | string | X | | The letter grade for the assignment. |
//
//
//        **Notes**
//        - `letterGrade` is a derived attribute that is calculated using totalMarks and possibleMarks.
//        - For 90% or greater return "A"
//        - 80-89% return "B"
//        - 70-79% return "C"
//        - 60-69% return "D"
//        - otherwise return "F"
//
//        ### Constructor
//
//        The `HomeworkAssignment` class has a single constructor. It accepts a single argument `possibleMarks`.
//
//        `public HomeworkAssignment(int possibleMarks)`

public class HomeworkAssignment {
    private int totalMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    public HomeworkAssignment(int possibleMarks) {
        this.possibleMarks = possibleMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }


    public String getSubmitterName() {
        return submitterName;
    }

    public void setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
    }

    public String getLetterGrade() {
        int calculatedGrade = ((this.totalMarks * 100)/this.possibleMarks);

        if (calculatedGrade >= 90) letterGrade = "A";
        else if (calculatedGrade >= 80) letterGrade = "B";
        else if (calculatedGrade >= 70) letterGrade = "C";
        else if (calculatedGrade >= 60) letterGrade = "D";
        else letterGrade = "F";

        return letterGrade;
    }

}
