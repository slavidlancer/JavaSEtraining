package com.softuni.jse.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point[] points = readPoints(input);
        Point[] closestTwoPoints = findClosestTwoPoints(points);
        
        System.out.printf("%.3f\n",
                calculateDistance(closestTwoPoints[0], closestTwoPoints[1]));
        
        printPoint(closestTwoPoints[0]);
        printPoint(closestTwoPoints[1]);
        
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
    
    private static Point[] readPoints(Scanner input) {
        int n = Integer.parseInt(input.nextLine());
        Point[] points = new Point[n];
        
        for (int i = 0; i < n; i++) {
            points[i] = readPoint(input);
        }
        
        return points;
    }
    
    private static Point[] findClosestTwoPoints(Point[] points) {
        Point[] closestTwoPoints = null;
        double minDistance = Double.MAX_VALUE;
        
        for (int p1 = 0; p1 < points.length; p1++) {
            for (int p2 = p1 + 1; p2 < points.length; p2++) {
                double distance = calculateDistance(points[p1], points[p2]);
                
                if (distance < minDistance) {
                    minDistance = distance;
                    
                    closestTwoPoints = new Point[] {
                            points[p1], points[p2]
                    };
                }
            }
        }
        
        return closestTwoPoints;
    }
    
    private static double calculateDistance(Point point1, Point point2) {
        double a = Math.abs(point2.getX() - point1.getX());
        double b = Math.abs(point2.getY() - point1.getY());
        double distance = Math.sqrt(a * a + b * b);
        
        return distance;
    }
    
    private static void printPoint(Point point) {
        System.out.println("(" + point.getX() + ", " + point.getY() + ")");
    }
}
