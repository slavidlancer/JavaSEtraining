package com.jse.tutorials.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private int salary;
    private List<Employee> subordinates;
    
    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee) {
        this.subordinates.add(employee);
    }
    
    public void removeEmployee(Employee employee) {
        this.subordinates.remove(employee);
    }
    
    public List<Employee> getSubordinates() {
        return this.subordinates;
    }
    
    @Override
    public String toString() {
        return "Employee: [Name: " + this.name + ", department: " +
                this.department + ", salary:" + salary +"]";
    }
}
