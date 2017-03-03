package ija.ija2016.homework1.cardpack;

public class CardStack {
    private int size;
    private int top;
    private Card[] cardArray;

    public CardStack(int size){
        this.size = size;
        this.cardArray = new Card[size];
        this.top = -1;
    }

    public void put(Card card){
        cardArray[++top] = card;
    }
    public Card pop(){
        return cardArray[top--];
    }
    public boolean isEmpty() {
        return (top == -1);
    }

    public CardStack takeFrom(Card card){

        CardStack newCardStack = new CardStack(size);

        int found_idx = -1;

        // compare cards from stack with given card
        for(int i=0; i<this.size; i++ ){
            if(card.equals(cardArray[i])){
                found_idx = i;
            }
        }
        if (found_idx == -1){
            return null;
        }

        while(found_idx<=this.top){
            newCardStack.put(this.pop());
        }

        return newCardStack;
    }

    public int size(){
        return this.top+1;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof CardStack){

            CardStack stackis = (CardStack) o;
            for (int i =0; i < this.size() ; i++){
                if(stackis.size() == this.size()){
                    if (stackis.cardArray[i].color() == ((CardStack) o).cardArray[i].color()) {
                        if (stackis.cardArray[i].value() == ((CardStack) o).cardArray[i].value()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
