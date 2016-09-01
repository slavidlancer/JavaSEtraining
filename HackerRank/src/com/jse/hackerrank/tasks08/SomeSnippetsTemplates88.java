package com.jse.hackerrank.tasks08;

//import static com.jse.hackerrank.HairColor.*;

class Person {
  HairColor hairColor = HairColor.BLONDE;
  
  public Person() {
      int a = 5;
  }
}

enum HairColor {
  BLONDE, BROWN, BLACK, RED, ORANGE, PINK, BLUE, GREEN, PURPLE, RAINBOW, OTHER
}

public class SomeSnippetsTemplates88 {
    public static void main(String[] args) {
        Person person = new Person();
        Person personAlias = person;
        
        person.hairColor = HairColor.PINK;
        //personAlias.hairColor = HairColor.PINK; //same
        
        System.out.println("hair color of person: " + person.hairColor);
        System.out.println("hair color of person's alias: " +
                personAlias.hairColor);
    }
}
