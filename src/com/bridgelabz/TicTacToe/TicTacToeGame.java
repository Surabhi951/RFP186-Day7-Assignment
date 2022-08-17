package com.bridgelabz.TicTacToe;

public class TicTacToeGame {
    static char[] board = new char[10];

    public static void main(String[] args) {
        createEmptyBoard();
    }

    static void createEmptyBoard(){
        for(int index = 1; index < board.length; index++){
            board[index] = ' ';
        }
    }

}
