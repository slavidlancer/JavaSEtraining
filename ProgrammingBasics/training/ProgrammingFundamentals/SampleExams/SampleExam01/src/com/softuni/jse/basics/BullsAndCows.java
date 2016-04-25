package com.softuni.jse.basics;

import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = Integer.parseInt(input.nextLine());
        int bulls = Integer.parseInt(input.nextLine());
        int cows = Integer.parseInt(input.nextLine());
        boolean solutionFound = false;
        
        for (int d1 = 1; d1 <= 9; d1++) {
            for (int d2 = 1; d2 <= 9; d2++) {
                for (int d3 = 1; d3 <= 9; d3++) {
                    for (int d4 = 1; d4 <= 9; d4++) {
                        int secretNumberDigit1 = (secretNumber / 1000) % 10;
                        int secretNumberDigit2 = (secretNumber / 100) % 10;
                        int secretNumberDigit3 = (secretNumber / 10) % 10;
                        int secretNumberDigit4 = (secretNumber / 1) % 10;
                        
                        int oldDigit1 = d1;
                        int oldDigit2 = d2;
                        int oldDigit3 = d3;
                        int oldDigit4 = d4;
                        
                        int b = 0;
                        int c = 0;
                        
                        if (d1 == secretNumberDigit1) {
                            b++;
                            secretNumberDigit1 = -1;
                            d1 = -2;
                        }
                        
                        if (d2 == secretNumberDigit2) {
                            b++;
                            secretNumberDigit2 = -1;
                            d2 = -2;
                        }
                        
                        if (d3 == secretNumberDigit3) {
                            b++;
                            secretNumberDigit3 = -1;
                            d3 = -2;
                        }
                        
                        if (d4 == secretNumberDigit4) {
                            b++;
                            secretNumberDigit4 = -1;
                            d4 = -2;
                        }
                        
                        if (d1 == secretNumberDigit2) {
                            c++;
                            secretNumberDigit2 = -1;
                        } else if (d1 == secretNumberDigit3) {
                            c++;
                            secretNumberDigit3 = -1;
                        } else if (d1 == secretNumberDigit4) {
                            c++;
                            secretNumberDigit4 = -1;
                        }
                        
                        if (d2 == secretNumberDigit1) {
                            c++;
                            secretNumberDigit1 = -1;
                        } else if (d2 == secretNumberDigit3) {
                            c++;
                            secretNumberDigit3 = -1;
                        } else if (d2 == secretNumberDigit4) {
                            c++;
                            secretNumberDigit4 = -1;
                        }
                        
                        if (d3 == secretNumberDigit1) {
                            c++;
                            secretNumberDigit1 = -1;
                        } else if (d3 == secretNumberDigit2) {
                            c++;
                            secretNumberDigit2 = -1;
                        } else if (d3 == secretNumberDigit4) {
                            c++;
                            secretNumberDigit4 = -1;
                        }
                        
                        if (d4 == secretNumberDigit1) {
                            c++;
                            secretNumberDigit1 = -1;
                        } else if (d4 == secretNumberDigit2) {
                            c++;
                            secretNumberDigit2 = -1;
                        } else if (d4 == secretNumberDigit3) {
                            c++;
                            secretNumberDigit3 = -1;
                        }
                        
                        d1 = oldDigit1;
                        d2 = oldDigit2;
                        d3 = oldDigit3;
                        d4 = oldDigit4;
                        
                        if ((b == bulls) && (c == cows)) {
                            if (solutionFound) {
                                System.out.print(" ");
                            }
                            
                            System.out.print(d1 + "" + d2 + "" + d3 + "" +
                                    d4);
                            solutionFound = true;
                        }
                    }
                }
            }
        }
        
        if (!solutionFound) {
            System.out.println("No");
        }
        
        input.close();
    }
}
