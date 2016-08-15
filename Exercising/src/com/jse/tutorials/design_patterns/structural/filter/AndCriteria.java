package com.jse.tutorials.design_patterns.structural.filter;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria firstCriteria;
    private Criteria secondCriteria;
    
    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }
    
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = this.firstCriteria.meetCriteria(
                persons);
        
        return this.secondCriteria.meetCriteria(firstCriteriaPersons);
    }
}
