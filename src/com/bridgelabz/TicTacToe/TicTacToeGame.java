package com.bridgelabz.TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
    public enum CurrentPlayer{
        PLAYER,COMPUTER
    }

    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;
    static int position;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        createEmptyBoard();
        chooseLetter();
        showBoard();
        playerMove();
        showBoard();
        CurrentPlayer currentPlayer= toss();
        System.out.println(currentPlayer);

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

    static void showBoard(){
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    static void makeMove(int position,char currentPlayerLetter, char[] board){

        switch(position){
            case 1:
                if(board[1]==' ')
                    board[1] = currentPlayerLetter;
                break;
            case 2:
                if(board[2]==' ')
                    board[2] = currentPlayerLetter;
                break;
            case 3:
                if(board[3]==' ')
                    board[3] = currentPlayerLetter;
                break;
            case 4:
                if(board[4]==' ')
                    board[4] = currentPlayerLetter;
                break;
            case 5:
                if(board[5]==' ')
                    board[5] = currentPlayerLetter;
                break;
            case 6:
                if(board[6]==' ')
                    board[6] = currentPlayerLetter;
                break;
            case 7:
                if(board[7]==' ')
                    board[7] = currentPlayerLetter;
                break;
            case 8:
                if(board[8]==' ')
                    board[8] = currentPlayerLetter;
                break;
            case 9:
                if(board[9]==' ')
                    board[9] = currentPlayerLetter;
                break;
            default:
                break;
        }
    }

    static void playerMove(){
        System.out.println("Enter the position(1-9)");
        position = sc.nextInt();
        while(board[position]!=' '){
            System.out.println("Invalid option!! Please Try Again");
            position = sc.nextInt();
        }
        makeMove(position,userLetter,board);
        System.out.println("Player move to position "+position);
    }

    static CurrentPlayer toss(){
        if((int)(Math.random()*10)%2==1){
            System.out.println("Player will start the game");
            return CurrentPlayer.PLAYER;
        }
        else{
            System.out.println("Computer will start the game");
            return CurrentPlayer.COMPUTER;
        }
    }
}
