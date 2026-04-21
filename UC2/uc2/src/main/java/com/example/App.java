package com.example;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        // Players
        String player1 = "Player 1";
        String player2 = "Player 2";

        // Symbols
        char player1Symbol;
        char player2Symbol;

        // Random toss
        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1

        String currentPlayer;
        char currentSymbol;

        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentSymbol = 'X';
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
            currentSymbol = 'X';
        }

        // Output
        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " starts first!");
        System.out.println(player1 + " symbol: " + player1Symbol);
        System.out.println(player2 + " symbol: " + player2Symbol);
        System.out.println("Current Player: " + currentPlayer + " (" + currentSymbol + ")");
    }
}