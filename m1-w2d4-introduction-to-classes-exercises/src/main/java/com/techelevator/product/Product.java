package com.techelevator.product;

//
//## Product
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | name | String | X | X | The name of the product.  |
//        | price | double | X | X | The price of the product. |
//        | weightInOunces | double | X | X | The weight (in ounces) of the product. |
//
//        ### Methods
//
//        **Notes**
//        - There are no additional methods beyond the basic getters and setters.
//
//        ### Constructors
//
//        The `Product` uses the default constructor.

public class Product {

	private String name;
    private double price;
    private double weightInOunces;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeightInOunces() {
        return weightInOunces;
    }

    public void setWeightInOunces(double weightInOunces) {
        this.weightInOunces = weightInOunces;
    }


}
