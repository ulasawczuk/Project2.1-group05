package org.example.rummikub.setup;

import java.util.ArrayList;

public class BoardOverhead {
    Board board;
    ArrayList<Player> players;

     public BoardOverhead(Board board, ArrayList<Player> players){
         this.board = board;
         this.players = players;
     }

     public void addPLayer(Player player){
         players.add(player);
     }

     public void removePlayer(Player player){
         if(players.contains(player)) players.remove(player);
     }

}
