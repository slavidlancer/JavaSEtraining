package com.jse.tutorials.design_patterns.structural.filter;

public class Person {
    private String name;
    private String gender;
    private String maritalStatus;
    
    public Person(String name, String gender, String martialStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = martialStatus;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getMaritalStatus() {
        return this.maritalStatus;
    }
    
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
