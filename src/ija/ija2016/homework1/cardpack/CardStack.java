package ija.ija2016.homework1.cardpack;

/*
 * Created by majko on 28.2.17.
 */

import java.util.Arrays;

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
    /*public void put(CardStack stack){

    }*/
    public CardStack takeFrom(Card card){

        CardStack newCardStack = new CardStack(size);

        int found_idx = -1;

        // push cards from old stack to new stack

        // compare cards from stack with given card
        for(int i=0; i<this.size; i++ ){
            if(card.equals(cardArray[i])){
                System.out.println("found value = " + card.value());
                found_idx = i;
            }
        }
        if (found_idx == -1){
            return null;
        }
        System.out.println(found_idx);

        while(found_idx<=this.top){
        //while(!isEmpty()){
            newCardStack.put(this.pop());
            //System.out.println("actual size of stack = " + size());
            System.out.println("new stack size = " + newCardStack.size());
        }

        System.out.println("card array na konci = " + size);

        // go to index of found card
        // push card to new stack
        // pop card
        // do it until is something in

        return newCardStack;
    }

    public int size(){
        //System.out.print("size " + this.top + "\n");
        return this.top+1;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof CardStack){

            CardStack stackis = (CardStack) o;
            for (int i =0; i < this.size() ; i++){
                if(stackis.size() == this.size()){
                    if (stackis.cardArray[i].color() == ((CardStack) o).cardArray[i].color()) {
                        System.out.println("su zhodne1");
                    }
                    if (stackis.cardArray[i].value() == ((CardStack) o).cardArray[i].value()) {
                        System.out.println("su zhodne");
                        return true;
                    }
                }
                else {
                    System.out.println("niesu zhodne");
                }
            }
        }
        return false;
    }
}
