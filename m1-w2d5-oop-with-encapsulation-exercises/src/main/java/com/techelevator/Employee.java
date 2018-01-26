package com.techelevator;

//## Employee
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | employeeId | int | X | | The employee id.  |
//        | firstName | string | X |  | The employee's first name. |
//        | lastName | string | X | X | The employee's last name. |
//        | fullName *(derived)* | string | X | | The employee's full name. |
//        | department | string | X | X | The employee's department. |
//        | annualSalary | double | X | | The employee's annual salary. |
//
//        **Notes**
//        - `fullName` is a derived attribute that returns `lastName, firstName`.
//
//
//        ### Methods
//
//public void raiseSalary(double percent)
//
//        **Notes**
//        - `raiseSalary(double percent)` increases the current annual salary by the percentage provided
//
//        ### Constructor
//
//        The `Employee` class has a single constructor. It accepts four arguments.
//
//        `public Employee(int employeeId, String firstName, String lastName, double salary)`

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String department;
    private double annualSalary;

    public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public String getDepartment() {
        return department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void raiseSalary(double percent) {
        annualSalary+= (annualSalary * (percent/100));
    }
}
