package org.example.rummikub.setup;

public class Testi {
    public static void main(String[] args) {
        Tile ti = new Tile(Colour.BLACK, Value.EIGHT);
        System.out.println(ti.getColour());
        System.out.println(ti.getValue());
    }
    
    
}
