package com.techelevator;

//## Fruit Tree
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | typeOfFruit | string | X | | The type of fruit on the tree. |
//        | piecesOfFruitLeft | int | X | | The number of remaining fruit pieces on the tree. |
//
//        ### Methods
//
//public bool pickFruit(int numberOfPiecesToRemove)
//
//        **Notes**
//        - `pickFruit()` is a method
//        - returns `true` if more fruit was picked or `false` if no fruit was left to be picked.
//        - When picking fruit, update the number of remaining pieces by how many were removed
//
//        ### Constructor
//
//        The `FruitTree` class has a single constructor. It accepts two arguments `typeOfFruit` and `startingPiecesOfFruit`.
//
//        `public FruitTree(string typeOfFruit, int startingPiecesOfFruit)`

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int piecesOfFruitLeft) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public boolean pickFruit(int numberOfPiecesToRemove) {
        boolean isFruitPicked;

        if (numberOfPiecesToRemove > piecesOfFruitLeft)
            isFruitPicked = false;
        else {
            isFruitPicked = true;
            piecesOfFruitLeft -= numberOfPiecesToRemove;
        }

        return isFruitPicked;
    }
}
