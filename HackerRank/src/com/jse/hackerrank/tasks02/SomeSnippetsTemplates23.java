package com.jse.hackerrank.tasks02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private int id;
    private String fName;
    private double cgpa;
    
    public Student(int id, String fName, double cgpa) {
        super();
        this.id = id;
        this.fName = fName;
        this.cgpa = cgpa;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getFName() {
        return this.fName;
    }
    
    public double getCgpa() {
        return this.cgpa;
    }
    
    @Override
    public int compareTo(Student o) {
        Student student = o;
        
        if (this.cgpa == student.cgpa) {
            if (this.fName.equals(student.fName)) {
                return this.id - student.id;
            } else {
                return this.fName.compareTo(student.fName);
            }
        } else {
            if (student.cgpa - this.cgpa > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

public class SomeSnippetsTemplates23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = Integer.parseInt(input.nextLine());
        List<Student> studentsList = new ArrayList<Student>();
        
        while (testCases > 0) {
            int id = input.nextInt();
            String fName = input.next();
            double cgpa = input.nextDouble();
            
            Student student = new Student(id, fName, cgpa);
            studentsList.add(student);
            
            testCases--;
        }
        
        /*Collections.sort(studentsList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Double student1Cgpa = new Double(o1.getCgpa());
                Double student2Cgpa = new Double(o2.getCgpa());
                int compareResult = student2Cgpa.compareTo(student1Cgpa);
                
                return compareResult;
            };
        });*/
        
        Collections.sort(studentsList);
        
        for (Student student : studentsList) {
            System.out.println(student.getFName());
        }
        
        input.close();
    }
}
