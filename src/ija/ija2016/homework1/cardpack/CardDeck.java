package ija.ija2016.homework1.cardpack;

/**
 * Created by majko on 1.3.17.
 */

public class CardDeck {

    private int size;
    private int top;
    private Card[] deck;
    private static final int MAX_CARDS = 13;

    // constructor
    public CardDeck(int size){
        this.size = size;
        this.deck = deck;
        this.top = -1;
    }

    private void put(Card card){
        deck[++top] = card;
    }
    public Card pop(){
        return deck[top--];
    }

    public static CardDeck createStandardDeck(){
        CardDeck newCardDeck = new CardDeck(52);
        for (Card.Color color : Card.Color.values()){
            int i = 1;
            while (i <= MAX_CARDS){
                i++;
                newCardDeck.put(new Card(color,i));
            }
        }
        return newCardDeck;
    }
    public int size(){
        return this.top+1;
    }
}
