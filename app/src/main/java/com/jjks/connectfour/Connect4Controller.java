package com.jjks.connectfour;

import com.jjks.connectfour.*;

public class Connect4Controller {
    private int player;
    private boolean win;
    private Connect4Board board;

    public Connect4Controller() {
        board = new Connect4Board();
        win = false;
        player = 1;
    }

    private void changePlayer(){
        player = (player == 1) ? 2 : 1;
    }

    public void makeMove(int column){
        //check if valid move
        if (validMove(column)){
            board.placePiece(player, column);
            changePlayer();
            checkWin();
        }
    }

    private boolean validMove(int column) {
        return board.isColumnNotFull(column);
    }

    private boolean checkWin(){
        return false;
    }



}
