package com.jse.tutorials.design_patterns.structural.filter;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria firstCriteria;
    private Criteria secondCriteria;
    
    public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }
    
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = this.firstCriteria.meetCriteria(
                persons);
        List<Person> secondCriteriaPersons = this.secondCriteria.meetCriteria(
                persons);
        
        for (Person person : secondCriteriaPersons) {
            if (!firstCriteriaPersons.contains(person)) {
                firstCriteriaPersons.add(person);
            }
        }
        
        return firstCriteriaPersons;
    }
}
