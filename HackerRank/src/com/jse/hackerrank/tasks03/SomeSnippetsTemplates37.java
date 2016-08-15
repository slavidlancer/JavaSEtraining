package com.jse.hackerrank.tasks03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    private String name;
    private int score;
    
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getScore() == o2.getScore()) {
            return o1.getName().compareTo(o2.getName());
        }
        
        return o2.getScore() - o1.getScore();
    }
    
}

public class SomeSnippetsTemplates37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Player[] players = new Player[n];
        Checker checker = new Checker();
        
        for (int i = 0; i < n; i++) {
            players[i] = new Player(input.next(), input.nextInt());
        }
        
        input.close();
        
        Arrays.sort(players, checker);
        
        for (int i = 0; i < players.length; i++) {
            System.out.printf("%s %s\n", players[i].getName(),
                    players[i].getScore());
        }
    }
}
