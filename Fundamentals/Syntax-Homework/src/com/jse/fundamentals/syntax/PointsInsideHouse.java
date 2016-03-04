package com.jse.fundamentals.syntax;

import java.util.Scanner;

public class PointsInsideHouse {
    public static void main(String[] args) {
        double bottom = 8.50;
        double top = 13.50;
        double leftRectangleLeftBorder = 12.50;
        double leftRectangleRightBorder = 17.50;
        double rightRectangleLeftBorder = 20.00;
        double rightRectangleRightBorder = 22.50;
        Scanner input = new Scanner(System.in);
        System.out.print("point X = ");
        double x = input.nextDouble();
        System.out.print("point Y = ");
        double y = input.nextDouble();
        
        boolean isInside = isPointInRectangle(x, y, top, bottom,
                leftRectangleLeftBorder, leftRectangleRightBorder) ||
                isPointInRectangle(x, y, top, bottom, rightRectangleLeftBorder,
                        rightRectangleRightBorder) || isInsideTriangle(x, y);
        
        String result = isInside ? "inside" : "outside";
        System.out.println("the point is " + result);
        
        input.close();
    }
    
    public static boolean isPointInRectangle(double x, double y, double top,
            double bottom, double left, double right) {
        if ((x >= left) && (x <= right) && (y >= bottom) && (y <= top)) {
            return true;
        }

        return false;
    }
    
    public static boolean isInsideTriangle(double x, double y) {
        double areaABC = getTriangleArea(12.50, 8.50, 22.50, 8.50, 17.50, 3.50);
        double areaAPB = getTriangleArea(12.50, 8.50, x, y, 22.50, 8.50);
        double areaBPC = getTriangleArea(22.50, 8.50, x, y, 17.50, 3.50);
        double areaCPA = getTriangleArea(17.50, 3.50, x, y, 12.50, 8.50);

        if (areaABC == (areaAPB + areaBPC + areaCPA)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static double getTriangleArea(double aX, double aY, double bX,
            double bY, double cX, double cY) {
        double area = 0;
        area += aX*(bY - cY);
        area += bX*(cY - aY);
        area += cX*(aY - bY);
        area /= 2.0;
        area = Math.abs(area);
        
        return area;
    }
}
