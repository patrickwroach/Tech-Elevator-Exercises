package com.techelevator.dog;

//# Dog
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | sleeping | boolean | X | | `TRUE` if the dog is asleep. `FALSE` if not.   |
//
//        **Notes**
//        - All new dogs are awake by default.
//
//        ### Methods
//
//public String makeSound()
//public void sleep()
//public void wakeUp()
//
//        **Notes**
//        - `makeSound()` returns `"Zzzzz..."` if the dog is asleep. Returns `"Woof!"` if the dog is awake.
//        - `sleep()` sets `sleeping` to `true`.
//        - `wakeUp()` sets `sleeping` to `false`.
//
//        ### Constructor
//
//        The `Dog` class uses the default constructor.

public class Dog {

    private boolean sleeping;

    public boolean isSleeping() {
        return sleeping;
    }

    public String makeSound() {
        if (this.sleeping) return "Zzzzz...";
        return "Woof!";
    }

    public void sleep() {
        this.sleeping = true;

    }

    public void wakeUp() {
        this.sleeping = false;
    }
}

