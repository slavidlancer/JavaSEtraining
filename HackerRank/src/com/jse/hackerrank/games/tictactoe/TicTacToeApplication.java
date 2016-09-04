package com.jse.hackerrank.games.tictactoe;

import java.util.Scanner;

public class TicTacToeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        
        while (play) {
            System.out.print("player: ");
            char playerToken = scanner.next().charAt(0);
            System.out.print("computer: ");
            char opponentToken = scanner.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();
            System.out.println("Tic Tac Toe game");
            System.out.println();
            TicTacToe.printIndexBoard();
            System.out.println();
            
            while (game.gameOver().equals("not over")) {
                if (game.currentMarker == game.userMarker) {
                    System.out.println("player's turn, number:");
                    int spot = scanner.nextInt();
                    
                    while (!game.playTurn(spot)) {
                        System.out.println("try again\nplayer's turn, number:");
                        spot = scanner.nextInt();
                    }
                } else {
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                }
                
                System.out.println();
                game.printBoard();
            }
            
            System.out.println(game.gameOver());
            System.out.println();
            
            System.out.println("Continue with new game? "
                    + "(y/(n or anything else))");
            char response = scanner.next().toLowerCase().charAt(0);
            play = (response == 'y');
            
            System.out.println();
            System.out.println();
        }
        
        scanner.close();
    }
}
