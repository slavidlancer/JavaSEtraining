package com.softuni.jse.basics;

import java.math.BigDecimal;
import java.util.Scanner;

public class CartesianCoordinateSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigDecimal x = new BigDecimal(input.nextLine());
        BigDecimal y = new BigDecimal(input.nextLine());
        
        /*if (x == 0) {
            if (y == 0) {
                System.out.println("0");
            } else {
                System.out.println("5");
            }
        } else if (y == 0) {
            System.out.println("6");
        } else if (x > 0) {
            if (y < 0) {
                System.out.println("4");
            } else {
                System.out.println("1");
            }
        } else {
            if (y < 0) {
                System.out.println("3");
            } else {
                System.out.println("2");
            }
        }*/
        
        /*if (x == 0 && y == 0) {
            System.out.println("0");
        } else if (x == 0) {
            System.out.println("5");
        } else if (y == 0) {
            System.out.println("6");
        } else if ((x > 0) && (y > 0)) {
            System.out.println("1");
        } else if ((x < 0) && (y > 0)) {
            System.out.println("2");
        } else if ((x < 0) && (y < 0)) {
            System.out.println("3");
        } else if ((x > 0) && (y < 0)) {
            System.out.println("4");
        }*/
        
        if ((x.compareTo(BigDecimal.ZERO) == 0) &&
                (y.compareTo(BigDecimal.ZERO) == 0)) {
            System.out.println("0");
        } else if (x.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("5");
        } else if (y.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("6");
        } else if ((x.compareTo(BigDecimal.ZERO) > 0) &&
                (y.compareTo(BigDecimal.ZERO) > 0)) {
            System.out.println("1");
        } else if ((x.compareTo(BigDecimal.ZERO) < 0) &&
                (y.compareTo(BigDecimal.ZERO) > 0)) {
            System.out.println("2");
        } else if ((x.compareTo(BigDecimal.ZERO) < 0) &&
                (y.compareTo(BigDecimal.ZERO) < 0)) {
            System.out.println("3");
        } else if ((x.compareTo(BigDecimal.ZERO) > 0) &&
                (y.compareTo(BigDecimal.ZERO) < 0)) {
            System.out.println("4");
        }
        
        input.close();
    }
}
