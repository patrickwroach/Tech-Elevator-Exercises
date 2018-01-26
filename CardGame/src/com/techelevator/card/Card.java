package com.techelevator.card;

public class Card {

    private int  face;
    private int suit;


    public static String[] Suits = new String[]{
            "DIAMONDS",
            "HEARTS",
            "SPADES",
            "CLUBS"
    };

    public static String[] Faces = new String[] {
            "ACE",
            "TWO",
            "THREE",
            "FOUR",
            "FIVE",
            "SIX",
            "SEVEN",
            "EIGHT",
            "NINE",
            "TEN",
            "JACK",
            "QUEEN",
            "KING"
    };

    public Card(int face, int suit) {
        this.face = face;
        this.suit = suit;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getValue() {
        if (this.face == 0) {
            return 14;
        }
        return this.face;
    }

    public static String getSuiteName(int suit){
        return Suits[suit];
    }

    public static String getFaceName(int face){
        return Faces[face];

    }

    @Override
    public String toString() {
        return Faces[this.face] + " of " + Suits[this.suit];
    }
    @Override
    public boolean equals(Object obj) {
        Card c = (Card) obj;
        return (this.face == getFace() && this.suit == c.getSuit());

    }

}
