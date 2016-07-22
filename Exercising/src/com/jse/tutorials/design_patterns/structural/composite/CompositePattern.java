package com.jse.tutorials.design_patterns.structural.composite;

public class CompositePattern {
    public static void main(String[] args) {
        Employee cEO = new Employee("Ceo 01", "CEO", 6660);
        Employee headSales = new Employee("Head sales 01", "Sales", 5000);
        Employee headMarketing = new Employee("Head Marketing 01", "Marketing",
                4000);
        Employee clerk1 = new Employee("Clerk 01", "Marketing", 1000);
        Employee clerk2 = new Employee("Clerk 02", "Marketing", 1000);
        Employee salesExecutive1 = new Employee("Sales Executive 01", "Sales",
                2000);
        Employee salesExecutive2 = new Employee("Sales Executive 02", "Sales",
                2000);
        
        cEO.addEmployee(headSales);
        cEO.addEmployee(headMarketing);
        headSales.addEmployee(salesExecutive1);
        headSales.addEmployee(salesExecutive2);
        headMarketing.addEmployee(clerk1);
        headMarketing.addEmployee(clerk2);
        
        System.out.println(cEO);
        
        for (Employee headEmployee : cEO.getSubordinates()) {
            System.out.println("\t" + headEmployee);
            
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println("\t\t" + employee);
            }
        }
    }
}
