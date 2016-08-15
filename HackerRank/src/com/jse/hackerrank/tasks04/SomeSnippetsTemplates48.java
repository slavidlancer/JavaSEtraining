package com.jse.hackerrank.tasks04;

import java.text.NumberFormat;
import java.util.Locale;

class Employee {
    protected static int count = 0; //class variable
    protected String name; //instance variable
    private int salary; //instance variable
    
    /** Parameterized Constructor 
     *   @param name The volunteer's name. **/
    Employee(String name) {
        this.name = name;
        
        Employee.count++;
    }
    
    /** @return The name instance variable. **/
    public String getName() {
        return this.name;
    }
    
    /** @return The salary instance variable. **/
    public int getSalary() {
        return this.salary;
    }
    
    /** @param salary The integer to set as the salary instance variable. **/
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    /** Print information about an instance of Employee. **/
    public void print() {
        if (this.salary == 0) {
            System.err.println("Error: No salary set for " + this.name +
                    "; please set salary and try again.\n");
        } else {
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
            
            System.out.println("Employee Name: " + this.name + "\nSalary: " +
                    numberFormat.format(this.salary)  +"\n");
        }
    }
}

class Volunteer extends Employee {
    private int hours; //instance variable
    
    /** Parameterized Constructor 
     *   @param name The volunteer's name. **/
    public Volunteer(String name) {
        super(name);
    }
    
    /** @return The hours instance variable **/
    public int getHours() {
        return this.hours;
    }
    
    /** @param Set the hours instance variable. **/
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    /** Overrides the superclass' print method and prints information about an instance of Volunteer. **/
    @Override
    public void print() {
        System.out.println("Volunteer Name: " + this.getName() + "\nHours: " +
                this.getHours() + "\n");
    }
}

public class SomeSnippetsTemplates48 {
    public static void main(String[] args) {
        Employee employee = new Employee("Name1");
        Employee volunteer1 = new Volunteer("Name2");
        Volunteer volunteer2 = new Volunteer("Name3");
        
        employee.print();
        employee.setSalary(5000);
        employee.print();
        
        volunteer1.print();
        volunteer1.setSalary(0);
        volunteer1.print();
        
        volunteer2.print();
        volunteer2.setHours(20);
        volunteer2.print();
    }
}
