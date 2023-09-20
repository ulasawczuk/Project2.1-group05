package org.example.rummikub.setup;

public class Tile {
    private Colour colour;
    private Value value;

    public Tile(Colour colour, Value value){
        this.colour = colour;
        this.value = value;
    }

    public Colour getColour(){
        return colour;
    }

    public Value getValue(){
        return value;
    }

    public String toString(){
        return getValue().getValue() + " " + getColour().toString();
    }

}
