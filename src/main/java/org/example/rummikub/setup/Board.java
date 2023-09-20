package org.example.rummikub.setup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Board {

    //Arraylist containing runs and rows present on the board, converted from 2D
    private ArrayList<ArrayList<Tile>> seriesInGame;

    //2D arraylist grid representing the runs and rows
    private ArrayList<ArrayList<Tile>> currentGameBoard;

    public Board(ArrayList<ArrayList<Tile>> listOfTiles){
        currentGameBoard = listOfTiles;
    }

    //Method that converts from 2d array used in GUI to an arraylist of series
    public void convert(ArrayList<ArrayList<Tile>> currentGameBoard){
        seriesInGame = new ArrayList<ArrayList<Tile>>();
        int amountOfSeries = -1;
        for(int i = 0; i<currentGameBoard.size(); i++){
            for(int j = 0; j<currentGameBoard.get(i).size(); j++ ) {
                if (currentGameBoard.get(i).get(j) == null) continue;
                if (j == 0 || currentGameBoard.get(i).get(j - 1) == null) {
                    amountOfSeries++;
                    seriesInGame.add(new ArrayList<Tile>());
                }
                seriesInGame.get(amountOfSeries).add(currentGameBoard.get(i).get(j));
            }
        }
    }


}
