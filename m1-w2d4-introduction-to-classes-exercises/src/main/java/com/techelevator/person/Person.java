package com.techelevator.person;

public class Person {

	private String firstName;
    private String lastName;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
       return lastName + ", " + firstName;
    }

    public boolean isAdult() {
        return (age >= 18);
    }

}

//## Person
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | firstName | String | X | X | The first name of the person.  |
//        | lastName | String | X | X | The last name of the person. |
//        | age | int | X | X | The age of the person. |
//
//        ### Methods
//
//public String getFullName()
//public boolean isAdult()
//
//        **Notes**
//        - `getFullName()` returns the `lastName` + ", " + `firstName`.
//        - `isAdult()` returns `true` if the person is 18 or older.
//
//        ### Constructors
//
//        The `Person` class uses the default constructor.
