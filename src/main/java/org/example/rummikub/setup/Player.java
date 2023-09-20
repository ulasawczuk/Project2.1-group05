package org.example.rummikub.setup;

import java.util.ArrayList;

public class Player {
    ArrayList<Tile> hand;

    public Player (ArrayList<Tile> hand) {
        this.hand = hand;
    }

    public void addTile(Tile tile){ hand.add(tile); }

    public void removeTile(Tile tile){ if(hand.contains(tile)) {hand.remove(tile); }; }

    public ArrayList<String> getHand(){
        ArrayList<String> stringHand = new ArrayList<>();
        for(Tile tile: hand){
            stringHand.add(tile.toString());
        }
        return stringHand;
    }
    

    //TODO sorting method for players hand (both ways runs and rows)
}
