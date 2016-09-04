package com.jse.hackerrank.games.hangman;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangman game\nguess a word\n"
                + "6 times wrong guess = loose, otherwise = win");
        System.out.println("word is picked");
        
        boolean play = true;
        
        while (play) {
            Hangman game = new Hangman();
            
            do {
                System.out.println(game.drawPicture());
                System.out.println(game.getFormalCurrentGuess());
                //System.out.println(game.getMysteryWord());
                
                System.out.println("try to guess a character:");
                char guess = scanner.next().toLowerCase().charAt(0);
                
                while (game.isItGuessedAlready(guess)) {
                    System.out.println("try again (alredy guessed character)");
                    guess = scanner.next().toLowerCase().charAt(0);
                }
                
                if (game.playGuess(guess)) {
                    System.out.println("great guess, success, "
                            + "the character is in the word");
                } else {
                    System.out.println("bad guess, "
                            + "the character is not in the word");
                }
            } while (!game.gameOver());
            
            System.out.println("Play another game? (y/(n or anything else)");
            
            char response = scanner.next().toLowerCase().charAt(0);
            play = (response == 'y');
        }
        
        scanner.close();
    }
}
