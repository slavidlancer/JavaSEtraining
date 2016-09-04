package com.jse.hackerrank.games.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hangman {
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;
    
    private String mysteryWord;
    private StringBuilder currentGuess;
    private List<Character> previousGuesses = new ArrayList<>();
    private int maxTries = 6;
    private int currentTries = 0;
    private List<String> dictionary = new ArrayList<>();
    
    public Hangman() throws IOException {
        initializeStreams();
        this.mysteryWord = pickWord();
        this.currentGuess = initializeCurrentGuess();
    }
    
    private void initializeStreams() throws IOException {
        try {
            File inputFile = new File(getClass().
                    getResource("/resources/dictionary.txt").toURI());
            Hangman.fileReader = new FileReader(inputFile);
            Hangman.bufferedReader = new BufferedReader(Hangman.fileReader);
            String currentLine = Hangman.bufferedReader.readLine();
            
            while (currentLine != null) {
                this.dictionary.add(currentLine);
                currentLine = Hangman.bufferedReader.readLine();
            }
            
            Hangman.bufferedReader.close();
            Hangman.fileReader.close();
        } catch (Exception e) {
            System.out.println("the streams cannot be initialized");
            
            this.dictionary.add("guess");
            this.dictionary.add("word");
        }
    }
    
    private String pickWord() {
        Random random = new Random();
        String word = "";
        
        try {
            int wordIndex = Math.abs(random.nextInt()) % this.dictionary.size();
            word = this.dictionary.get(wordIndex);
        } catch (Exception e) {
            System.out.println("wrong or empty dictionary");
        }
        
        return word;
    }
    
    private StringBuilder initializeCurrentGuess() {
        StringBuilder currentGuess = new StringBuilder();
        
        for (int i = 0; i < (this.mysteryWord.length() * 2); i++) {
            if (i % 2 == 0) {
                currentGuess.append("_");
            } else {
                currentGuess.append(" ");
            }
        }
        
        return currentGuess;
    }
    
    public String getMysteryWord() {
        return this.mysteryWord;
    }
    
    public String getFormalCurrentGuess() {
        String formalCurrentGuess = "current guess: " +
                this.currentGuess.toString();
        
        return formalCurrentGuess;
    }
    
    public boolean gameOver() {
        if (isItAWin()) {
            System.out.println("you win, guessed word: " + this.mysteryWord);
            
            return true;
        } else if (isItALost()) {
            System.out.println(drawOtherLegAndFullPerson());
            System.out.println("you lost, wrong word in 6 tries");
            System.out.println("the word is: " + this.mysteryWord);
            
            return true;
        }
        
        return false;
    }
    
    private boolean isItALost() {
        boolean isALost = (this.currentTries >= this.maxTries);
        
        return isALost;
    }
    
    private boolean isItAWin() {
        String guess = getCondensedCurrentGuess();
        boolean isAWin = guess.equals(this.mysteryWord);
        
        return isAWin;
    }
    
    private String getCondensedCurrentGuess() {
        String guess = this.currentGuess.toString().replace(" ", "");
        
        return guess;
    }
    
    public boolean isItGuessedAlready(char guess) {
        boolean isItGuessed = this.previousGuesses.contains(guess);
        
        return isItGuessed;
    }
    
    public boolean playGuess(char guess) {
        boolean isItAGoodGuess = false;
        this.previousGuesses.add(guess);
        
        for (int i = 0; i < this.mysteryWord.length(); i++) {
            if (this.mysteryWord.charAt(i) == guess) {
                this.currentGuess.setCharAt((i * 2), guess);
                isItAGoodGuess = true;
            }
        }
        
        if (!isItAGoodGuess) {
            this.currentTries++;
        }
        
        return isItAGoodGuess;
    }
    
    public String drawPicture() {
        switch (this.currentTries) {
            case 0: 
                return drawNoPerson();
                
            case 1:
                return drawHead();
                
            case 2:
                return drawBody();
                
            case 3:
                return drawOneArm();
                
            case 4:
                return drawOtherArm();
                
            case 5:
                return drawOneLeg();
                
            case 6:
            default:
                return drawOtherLegAndFullPerson();
        }
    }
    
    private String drawNoPerson() {
        String draw = " - - - - -\n" +
               "|        |\n" +
               "|\n" +
               "|\n" +
               "|\n" +
               "|\n" +
               "|\n" +
               "|\n";
        
        return draw;
    }
    
    private String drawHead() {
        String draw = " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n";
         
         return draw;
    }
    
    private String drawBody() {
        String draw = " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|        |\n" +
                "|        |\n" +
                "|\n" +
                "|\n" +
                "|\n";
         
         return draw;
    }
    
    private String drawOneArm() {
        String draw =  " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|       /|\n" +
                "|        |\n" +
                "|\n" +
                "|\n" +
                "|\n";
         
         return draw;
    }
    
    private String drawOtherArm() {
        String draw = " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|       /|\\\n" +
                "|        |\n" +
                "|\n" +
                "|\n" +
                "|\n";
         
         return draw;
    }
    
    private String drawOneLeg() {
        String draw = " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|       /|\\\n" +
                "|        |\n" +
                "|       /\n" +
                "|\n" +
                "|\n";
         
         return draw;
    }
    
    private String drawOtherLegAndFullPerson() {
        String draw = " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|       /|\\\n" +
                "|        |\n" +
                "|       / \\\n" +
                "|\n" +
                "|\n";
         
         return draw;
    }
}
