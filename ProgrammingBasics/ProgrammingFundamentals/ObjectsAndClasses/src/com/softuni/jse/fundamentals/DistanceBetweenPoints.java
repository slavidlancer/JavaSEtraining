package com.softuni.jse.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point point1 = readPoint(input);
        Point point2 = readPoint(input);
        
        double distance = calculateDistance(point1, point2);
        
        System.out.printf("Distance: %.3f\n", distance);
        
        input.close();
    }
    
    private static Point readPoint(Scanner input) {
        Point point = null;
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).
                map(String::trim).mapToInt(Integer::parseInt).toArray();
        int x = numbers[0];
        int y = numbers[1];
        point = new Point(x, y);
        
        return point;
    }
    
    private static double calculateDistance(Point point1, Point point2) {
        double a = Math.abs(point2.getX() - point1.getX());
        double b = Math.abs(point2.getY() - point1.getY());
        double distance = Math.sqrt(a * a + b * b);
        
        return distance;
    }
}
