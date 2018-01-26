package com.techelevator.calculator;
//## *Difficult Exercises*
//        ## Calculator
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | currentValue | int | X |  | The current calculated value. |
//
//        **Notes**
//        - All calculators have 0 as currentValue by default.
//
//        ### Methods
//
//public int add(int addend)
//public int multiply(int multiplier)
//public int subtract(int subtrahend)
//public int power(int exponent)
//public void reset()
//
//        **Notes**
//        - `add(int addend)` returns the new `currentValue` after performing the addition.
//        - `multiply(int multiplier)` returns the new `currentValue` after performing the multiplication.
//        - `subtract(int subtrahend)` returns the new `currentValue` after performing the subtraction.
//        - `power(int exponent)` returns the new `currentValue` after raising the `currentValue` by the exponent.
//        - `void reset()` resets the `currentValue` to 0.
//
//        ### Constructor
//
//        The `Calculator` class uses the default constructor.

public class Calculator {

    private int currentValue;

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int add(int addend) {
        currentValue += addend;
        return currentValue;
    }

    public int multiply(int multiplier) {
        currentValue *= multiplier;
        return currentValue;
    }

    public int subtract(int subtrahend) {
        currentValue -= subtrahend;
        return currentValue;
    }

    public int power(int exponent) {

        for (int i = 0; i < exponent - 1; i++) {
            currentValue *= currentValue;
        }

        return currentValue;
    }

    public void reset() {

        currentValue = 0;

    }

}
