package com.softuni.jse.coding101;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        double sumOdd = Double.MIN_VALUE;
        double sumEven = Double.MIN_VALUE;
        double maxOdd = Double.MIN_VALUE;
        double minOdd = Double.MIN_VALUE;
        double maxEven = Double.MIN_VALUE;
        double minEven = Double.MIN_VALUE;
        
        if (n > 0) {
            maxOdd = Double.parseDouble(input.nextLine());
            minOdd = maxOdd;
            sumOdd = 0;
            sumOdd += maxOdd;
            
            if (n > 1) {
                maxEven = Double.parseDouble(input.nextLine());
                minEven = maxEven;
                sumEven = 0;
                sumEven += maxEven;
            }
        }
        
        for (int i = 1; i < n - 1; i++) {
            double number = Double.parseDouble(input.nextLine());
            
            if (i % 2 == 0) {
                if (number > maxEven) {
                    maxEven = number;
                } else if (number < minEven) {
                    minEven = number;
                }
                
                sumEven += number;
            } else if (i % 2 != 0) {
                if (number > maxOdd) {
                    maxOdd = number;
                } else if (number < minOdd) {
                    minOdd = number;
                }
                
                sumOdd += number;
            }
        }
        
        /*if (sumOdd == Double.MIN_VALUE) {
            System.out.println("OddSum=0");
        } else {
            if (sumOdd == (long) sumOdd) {
                System.out.println("OddSum=" + String.format("%d",
                    (long) sumOdd));
            } else {
                System.out.println("OddSum=" + String.format("%s", sumOdd));
            }
        }

        if (minOdd == Double.MIN_VALUE) {
            System.out.println("OddMin=No");
        } else {
            if (minOdd == (long) minOdd) {
                System.out.println("OddMin=" + String.format("%d",
                    (long) minOdd));
            } else {
                System.out.println("OddMin=" + String.format("%s", minOdd));
            }
        }

        if (maxOdd == Double.MIN_VALUE) {
            System.out.println("OddMax=No");
        } else {
            if (maxOdd == (long) maxOdd) {
                System.out.println("OddMax=" + String.format("%d",
                    (long) maxOdd));
            } else {
                System.out.println("OddMax=" + String.format("%s", maxOdd));
            }
        }

        if (sumEven == Double.MIN_VALUE) {
            System.out.println("EvenSum=0");
        } else {
            if (sumEven == (long) sumEven) {
                System.out.println("EvenSum=" + String.format("%d",
                    (long) sumEven));
            } else {
                System.out.println("EvenSum=" + String.format("%s", sumEven));
            }
        }

        if (minEven == Double.MIN_VALUE) {
            System.out.println("EvenMin=No");
        } else {
            if (minEven == (long) minEven) {
                System.out.println("EvenMin=" + String.format("%d",
                    (long) minEven));
            } else {
                System.out.println("EvenMin=" + String.format("%s", minEven));
            }
        }

        if (maxEven == Double.MIN_VALUE) {
            System.out.println("EvenMax=No");
        } else {
            if (maxEven == (long) maxEven) {
                System.out.println("EvenMax=" + String.format("%d",
                    (long) maxEven));
            } else {
                System.out.println("EvenMax=" + String.format("%s", maxEven));
            }
        }*/
        
        System.out.println("OddSum=" + ((sumOdd == Double.MIN_VALUE) ? "0" :
            sumOdd));
        System.out.println("OddMin=" + ((minOdd == Double.MIN_VALUE) ? "No" :
            minOdd));
        System.out.println("OddMax=" + ((maxOdd == Double.MIN_VALUE) ? "No" :
            maxOdd));
        System.out.println("EvenSum=" + ((sumEven == Double.MIN_VALUE) ? "0" :
            sumEven));
        System.out.println("EvenMin=" + ((minEven == Double.MIN_VALUE) ? "No" :
            minEven));
        System.out.println("EvenMax=" + ((maxEven == Double.MIN_VALUE) ? "No" :
            maxEven));
        
        input.close();
    }
}
