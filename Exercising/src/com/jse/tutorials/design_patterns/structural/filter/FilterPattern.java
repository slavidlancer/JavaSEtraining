package com.jse.tutorials.design_patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterPattern {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        
        persons.add(new Person("Name1", "Male", "Single"));
        persons.add(new Person("Name2", "Male", "Married"));
        persons.add(new Person("Name3", "Female", "Single"));
        persons.add(new Person("Name4", "Female", "Married"));
        persons.add(new Person("Name5", "Male", "Single"));
        persons.add(new Person("Name6", "Female", "Married"));
        
        Criteria maleCriteria = new CriteriaMale();
        Criteria femaleCriteria = new CriteriaFemale();
        Criteria singleCriteria = new CriteriaSingle();
        
        Criteria singleMaleCriteria = new AndCriteria(singleCriteria,
                maleCriteria);
        Criteria singleOrFemaleCriteria = new OrCriteria(singleCriteria,
                femaleCriteria);
        
        System.out.println("males:");
        printPersons(maleCriteria.meetCriteria(persons));
        
        System.out.println("\nfemales:");
        printPersons(femaleCriteria.meetCriteria(persons));
        
        System.out.println("\nsingle males:");
        printPersons(singleMaleCriteria.meetCriteria(persons));
        
        System.out.println("\nsingle or female:");
        printPersons(singleOrFemaleCriteria.meetCriteria(persons));
    }
    
    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person: [name: " + person.getName() +
                    ", gender: " + person.getGender() + ", marital Status: " +
                    person.getMaritalStatus() + "]");
        }
    }
}
