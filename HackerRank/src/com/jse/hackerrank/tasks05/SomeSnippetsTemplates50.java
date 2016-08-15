package com.jse.hackerrank.tasks05;

import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int id;
    
    Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getID() {
        return this.id;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public void printPerson() {
        System.out.println("Name: " + this.firstName + " " + this.lastName +
                "\nID: " + this.id);
    }
}

class Student extends Person {
    private int[] testScores;
    
    public Student(String firstName, String lastName, int id,
            int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }
    
    public char calculate() {
        int numberOfTestScores = this.testScores.length;
        int sum = 0;
        double averageTestScore = 0.0;
        char letter = '0';
        
        for (int i = 0; i < numberOfTestScores; i++) {
            sum += this.testScores[i];
        }
        
        averageTestScore = (double) sum / numberOfTestScores;
        
        if (averageTestScore < 40) {
            letter = 'T';
        } else if ((averageTestScore >= 40) && (averageTestScore < 55)) {
            letter = 'D';
        } else if ((averageTestScore >= 55) && (averageTestScore < 70)) {
            letter = 'P';
        } else if ((averageTestScore >= 70) && (averageTestScore < 80)) {
            letter = 'A';
        } else if ((averageTestScore >= 80) && (averageTestScore < 90)) {
            letter = 'E';
        } else if ((averageTestScore >= 90) && (averageTestScore <= 100)) {
            letter = 'O';
        }
        
        return letter;
    }
}

public class SomeSnippetsTemplates50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String lastName = input.next();
        int id = input.nextInt();
        int numberOfScores = input.nextInt();
        int[] testScores = new int[numberOfScores];
        
        for (int i = 0; i < numberOfScores; i++) {
            testScores[i] = input.nextInt();
        }
        
        input.close();
        
        Student student = new Student(firstName, lastName, id, testScores);
        student.printPerson();
        
        System.out.println("grade: " + student.calculate());
    }
}
