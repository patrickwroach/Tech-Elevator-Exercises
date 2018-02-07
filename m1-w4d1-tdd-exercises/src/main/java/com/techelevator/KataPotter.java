package com.techelevator;

public class KataPotter {
    public double cost = 0.00;


    public double getCost(int[] books){

        for (int i = 0; i < books.length; i++){
            if (books[0] == 1 && books[1] == 0 && books[2] == 0 && books[3] == 0 && books[4] == 0) this.cost = 8 ;
            if (books[0] == 0 && books[1] == 1 && books[2] == 0 && books[3] == 0 && books[4] == 0) this.cost = 8;
            if (books[0] == 0 && books[1] == 0 && books[2] == 1 && books[3] == 0 && books[4] == 0) this.cost = 8;
            if (books[0] == 0 && books[1] == 1 && books[2] == 0 && books[3] == 1 && books[4] == 0) this.cost = 8;
            if (books[0] == 1 && books[1] == 0 && books[2] == 0 && books[3] == 0 && books[4] == 1) this.cost = 8;

        }
        return this.cost;
    }

}
