package com.bridgelabz.TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;

    public static void main(String[] args) {
        createEmptyBoard();
        chooseLetter();
    }

    static void createEmptyBoard(){
        for(int index = 1; index < board.length; index++){
            board[index] = ' ';
        }
    }

    static void chooseLetter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("choose a letter :: X or O :");
        userLetter = sc.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }
}
