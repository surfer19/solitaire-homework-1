package ija.ija2016.homework1.cardpack;

public class CardDeck {

    private int size;
    private int top;
    private Card[] deck;
    private static final int MAX_CARDS = 13;

    // constructor
    public CardDeck(int size){
        this.size = size;
        this.deck = new Card[size];
        this.top = -1;
    }

    private void put(Card card){
        this.top++;
        deck[this.top] = card;
    }
    public Card pop(){
        return deck[top--];
    }

    public static CardDeck createStandardDeck(){
        CardDeck newCardDeck = new CardDeck(52);

        for (Card.Color color : Card.Color.values()){
            int i = 1;
            while (i <= MAX_CARDS){
                newCardDeck.put(new Card(color,i));
                i++;
            }
        }
        return newCardDeck;
    }
    public int size(){
        return this.top+1;
    }
}
