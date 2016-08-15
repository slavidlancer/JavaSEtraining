package com.jse.hackerrank.tasks04;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private int token;
    private String fName;
    private double cgpa;
    
    public Student(int id, String fName, double cgpa) {
       super();
       this.token = id;
       this.fName = fName;
       this.cgpa = cgpa;
    }
    
    public int getToken() {
       return token;
    }
    
    public String getFName() {
       return this.fName;
    }
    
    public double getCgpa() {
       return cgpa;
    }
    
    @Override
    public int compareTo(Student student) {
        if (this.getCgpa() != student.getCgpa()) {
            return Double.compare(student.getCgpa(), this.getCgpa());
        } else if (!(this.getFName().equals(student.getFName()))) {
            return this.getFName().compareTo(student.getFName());
        } else {
            Integer.compare(this.getToken(), student.getToken());
        }
        
        return 0;
    }
}

public class SomeSnippetsTemplates41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalEvents = Integer.parseInt(input.nextLine());
        Queue<Student> priorityQueue = new PriorityQueue<>();
        
        while (totalEvents > 0) {
            String event = input.next();
            
            if ("ENTER".equals(event)) {
                String name = input.next();
                double cgpa = input.nextDouble();
                int token = input.nextInt();
                
                priorityQueue.offer(new Student(token, name, cgpa));
            } else if ("SERVED".equals(event)) {
                priorityQueue.poll();
            }
            
            
            totalEvents--;
        }
        
        if (priorityQueue.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!priorityQueue.isEmpty()) {
                System.out.println(priorityQueue.poll().getFName());
            }
        }
        
        input.close();
    }
}
