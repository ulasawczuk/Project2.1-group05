package org.example.rummikub.setup;

import java.util.ArrayList;

public class Board {

    //Arraylist containing runs and rows present on the board, converted from 2D
    private ArrayList<ArrayList<Tile>> seriesInGame;

    //2D arraylist grid representing the runs and rows
    private ArrayList<ArrayList<Tile>> currentGameBoard;

    //Constructor for the board
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


    //returns the current board as strings
    public ArrayList<ArrayList<String>> getList(){
        ArrayList<ArrayList<String>> listToString = new ArrayList<>();
        for(int i = 0; i<seriesInGame.size();i++){
            listToString.add(new ArrayList<String>());
            for(int j = 0;j < seriesInGame.get(i).size();j++){
                listToString.get(i).add(seriesInGame.get(i).get(j).toString());
            }
        }
        return listToString;
    }


}
