package com.softuni.jse.coding101;

import java.util.Scanner;

public class PointOnSegment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = Integer.parseInt(input.nextLine());
        int second = Integer.parseInt(input.nextLine());
        int point = Integer.parseInt(input.nextLine());
        int distance = 0;
        int distanceFirst = 0;
        int distanceSecond = 0;
        
        if (((point >= first) && (point <= second)) ||
                ((point >= second) && (point <= first))) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        
        distanceFirst = Math.abs(point - first);
        distanceSecond = Math.abs(point - second);
        
        distance = distanceFirst < distanceSecond ? distanceFirst :
            distanceSecond;
        
        System.out.println(distance);
        
        input.close();
    }
}
