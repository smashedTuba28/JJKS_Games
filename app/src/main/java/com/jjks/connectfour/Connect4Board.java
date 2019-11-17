package com.jjks.connectfour;

public class Connect4Board {
    //fields
    private int grid[][];
    private final int ROWS = 6;
    private final int COLUMNS = 7;

    public Connect4Board(){
        grid = new int[ROWS][COLUMNS];
        makeEmpty();

    }

    public void makeEmpty(){
        //initialize data empty grid
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                grid[i][j] = 0;
            }
        }
    }

    public void placePiece(int player, int column){

        for(int i = ROWS-1; i >= 0; i--){
            if(grid[i][column] == 0){
                grid[i][column] = player;
                break;
            }
        }
    }

    public boolean isColumnNotFull(int column){
        return grid[ROWS-1][column] == 0;
    }




}
