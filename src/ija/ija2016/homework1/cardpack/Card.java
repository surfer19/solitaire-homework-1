package ija.ija2016.homework1.cardpack;

import java.sql.Struct;

public class Card {

    private int value;
    private Color c;

    public Card.Color color() {
        return this.c;
    }

    public int value(){
        return this.value;
    }

    @Override
    public String toString() {

        String result_string = "";
        result_string += enumToString();
        result_string += "(";
        result_string += color();
        result_string += ")";
        //System.out.print("result string = " + result_string + "\n");

        return result_string;
    }

    public String enumToString() {
        switch (this.value){
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            case 1:
                return "A";
            default:
                return String.valueOf(this.value);
        }
    }

    public enum Color {

        CLUBS("C"),
        HEARTS("H"),
        DIAMONDS("D"),
        SPADES("S");

        private String value;

        private Color(String value){
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
/*    public Card.Color color(Card.Color c){
        return c;
    }*/

    public Card(Card.Color c, int value){
        this.value = value;
        this.c = c;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Card){
            Card object = (Card) o;
            if(object.value == this.value && object.c == this.c){
                return true;
            }
        }
        return false;
    }

    /*public int value(value){

        return value;
    }*/
}