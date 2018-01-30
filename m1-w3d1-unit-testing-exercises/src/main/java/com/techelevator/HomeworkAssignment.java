package com.techelevator;

public class HomeworkAssignment {

    private int totalMarks;
    private int possibleMarks;
    private String submitterName;

    /**
     * Homework assignment requires possible marks
     *
     * @param possibleMarks
     */
    public HomeworkAssignment(int possibleMarks) {
        this.possibleMarks = possibleMarks;
    }

    /**
     * Total number of marks received
     *
     * @return
     */
    public int getTotalMarks() {
        return totalMarks;
    }

    /**
     * Total number of marks received
     *
     * @param totalMarks
     */
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    /**
     * Possible number of marks to get right on the homework assignment.
     *
     * @return
     */
    public int getPossibleMarks() {
        return possibleMarks;
    }

    /**
     * Name of the person who submitted the homework assignment
     *
     * @return
     */
    public String getSubmitterName() {
        return submitterName;
    }

    /**
     * Name of the person who submitted the homework assignment
     *
     * @param submitterName
     */
    public void setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
    }

    /**
     * Letter grade for the assignment. (90-100 A, 80-89 B, 70-79 C, 60-69 D, otherwise F)
     *
     * @return
     */
    public String getLetterGrade() {
        int calculatedGrade = ((totalMarks * 100) / possibleMarks);
        String letterGrade;

        if (calculatedGrade >= 90) letterGrade = "A";
        else if (calculatedGrade >= 80) letterGrade = "B";
        else if (calculatedGrade >= 70) letterGrade = "C";
        else if (calculatedGrade >= 60) letterGrade = "D";
        else letterGrade = "F";

        return letterGrade;
    }

}
