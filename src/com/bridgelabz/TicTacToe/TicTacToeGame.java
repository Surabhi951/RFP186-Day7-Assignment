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
        isGameOver(board,userLetter);
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

    public static boolean isGameOver(char[] board,char letter){

        boolean option1 = (board[1]==letter && board[2] == letter && board[3] == letter);
        boolean option2 = (board[4]==letter && board[5] == letter && board[6] == letter);
        boolean option3 = (board[7]==letter && board[8] == letter && board[9] == letter);
        boolean option4 = (board[1]==letter && board[4] == letter && board[7] == letter);
        boolean option5 = (board[2]==letter && board[5] == letter && board[8] == letter);
        boolean option6 = (board[3]==letter && board[6] == letter && board[9] == letter);
        boolean option7 = (board[1]==letter && board[5] == letter && board[9] == letter);
        boolean option8 = (board[3]==letter && board[5] == letter && board[7] == letter);
        if( option1 || option2 || option3 || option4 || option5 || option6 || option7 || option8 ){

            System.out.println("Player wins!!!");


            return true;
        }
        if(board[1]!=' ' && board[2]!=' ' && board[3]!=' ' && board[4]!=' ' && board[5]!=' ' && board[6]!=' ' && board[7]!=' ' && board[8]!=' ' && board[9]!=' '){
            System.out.println("Tie!!");
            return true;
        }
        return false;
    }


}
