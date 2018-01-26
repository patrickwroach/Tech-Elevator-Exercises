package com.techelevator.company;

//| Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | name | string | X | X | The company name. |
//        | numberOfEmployees | int | X | X | The number of employees at the company. |
//        | revenue | double | X | X | The annual revenue of the company. |
//        | expenses | double | X | X | The annual expenses of the company. |
//
//        ### Methods
//
//public String getCompanySize()
//public double getProfit()
//
//        **Notes**
//        - `getCompanySize()` returns "small" if 50 or less employees, "medium" if between 51 and 250 employees, "large" if greater than 250 employees.
//        - `getProfit()` returns the result of revenue - expenses.

public class Company {

    private String name;
    private int numberOfEmployees;
    private double revenue;
    private double expenses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public String getCompanySize() {
        if (this.numberOfEmployees <= 50) return "small";
        if (this.numberOfEmployees <= 250) return "medium";
        return "large";
    }

    public double getProfit() {
        return this.revenue - this.expenses;
    }
}