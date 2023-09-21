package org.example.rummikub.setup;

import java.util.ArrayList;
import java.util.Random;

public class GameSetup {

    private ArrayList<Tile> tiles;
    private ArrayList<Player> players = new ArrayList<>();


    public static void main(String[] args) {
        GameSetup game = new GameSetup();
        game.generateTiles();
        for (int i = 0; i < 4; i++) {
            game.players.add(new Player(game.generateHand()));
        }
        for (Player player : game.players) {
            player.sortByColour(player.hand);
            System.out.println(player.getHand());
        }


        Board board = new Board();
        BoardOverhead overHead = new BoardOverhead(board,game.players);


    }

    private ArrayList<Tile> generateHand(){
        Random rand = new Random();
        int size = tiles.size();
        ArrayList<Tile> hand = new ArrayList<>();

        for (int i = 0; i <  14; i++) {
            int index = rand.nextInt(size - i);
             hand.add(tiles.get(index));
             tiles.remove(index);
        }
        return hand;
    }

    private void generateTiles () {
        tiles = new ArrayList<>();
        for (Colour c: Colour.values()){
            for (Value v : Value.values()) {
                   tiles.add(new Tile(c,v));
            }

            for (Value v : Value.values()) {
                   tiles.add(new Tile(c,v));
            }
        }

        System.out.println(tiles.size());

        // Delete 6 Jokers
        for (int i = 0; i < 6; i ++) {
            tiles.remove(13 * (i + 1));
        }
        System.out.println(tiles.size());
        System.out.println(tiles.get(13));
    }
}
