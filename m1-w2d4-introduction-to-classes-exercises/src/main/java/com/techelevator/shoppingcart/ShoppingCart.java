package com.techelevator.shoppingcart;

//
//## ShoppingCart
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | totalNumberOfItems | int | X | X | The number of items in the shopping cart.  |
//        | totalAmountOwed | double | X | X | The total amount owed. |
//
//        **Notes**
//        - All shopping carts have total 0 items and 0.0 amount owed by default.
//
//        ### Methods
//
//public double getAveragePricePerItem()
//public void addItems(int numberOfItems, double pricePerItem)
//public void empty()
//
//        **Notes**
//        - `getAveragePricePerItem()` returns the result of `totalAmountOwed / totalNumberOfItems`.
//        - `addItems(int numberOfItems, double pricePerItem)` updates `totalNumberOfItems` and increases `totalAmountOwed` by `(pricePerItem * numberOfItems)`
//        - `empty()` resets `totalNumberOfItems` to 0 and `totalAmountOwed` to 0.0.
//
//        ### Constructor
//
//        The `ShoppingCart` class uses the default constructor.


public class ShoppingCart {
    private int totalNumberOfItems;
    private double totalAmountOwed;

    public int getTotalNumberOfItems() {
        return totalNumberOfItems;
    }

    public void setTotalNumberOfItems(int totalNumberOfItems) {
        this.totalNumberOfItems = totalNumberOfItems;
    }

    public double getTotalAmountOwed() {
        return totalAmountOwed;
    }

    public void setTotalAmountOwed(double totalAmountOwed) {
        this.totalAmountOwed = totalAmountOwed;
    }

    public double getAveragePricePerItem() {
        if (totalAmountOwed == 0.0) return 0.0;
        return totalAmountOwed / totalNumberOfItems;
    }

    public void addItems(int numberOfItems, double pricePerItem) {
        this.setTotalNumberOfItems(this.totalNumberOfItems + numberOfItems);
        this.setTotalAmountOwed(this.totalAmountOwed += (pricePerItem * numberOfItems));

    }

    public void empty() {
        this.setTotalAmountOwed(0.0);
        this.setTotalNumberOfItems(0);
    }

}

