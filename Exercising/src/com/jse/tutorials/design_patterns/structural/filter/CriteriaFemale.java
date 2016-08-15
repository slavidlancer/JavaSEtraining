package com.jse.tutorials.design_patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        
        for (Person person : persons) {
            if ("FEMALE".equalsIgnoreCase(person.getGender())) {
                femalePersons.add(person);
            }
        }
        
        return femalePersons;
    }
}
