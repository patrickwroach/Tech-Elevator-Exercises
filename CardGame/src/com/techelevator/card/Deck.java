package com.techelevator.card;
import java.util.*;
public class Deck {

    private Stack<Card> cardDeck = new Stack<Card>();

    public Card dealCard(){

        if (cardDeck.isEmpty())
            resetDeck();

        return cardDeck.pop();
    }

    public int getRemainingCardCount() {
        return cardDeck.size();
    }

    public Deck() {
        resetDeck();;
    }

    public void resetDeck(){
            buildDeck();
    }

    private void buildDeck() {
        List<Card> deck = new ArrayList<Card>();
        for (int suit = 0; suit < Card.Suits.length; suit++){
            for (int face = 0; face < Card.Faces.length; face++){
                deck.add(new Card(suit, face));
            }
        }
        Collections.shuffle(deck);
        for (Card card: deck) {
            cardDeck.push(card);
        }
    }

}
