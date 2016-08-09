package com.jse.tutorials.duck_typing;

public class DuckTyping {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Person person = new Person();
        
        try {
            actAsADuck(duck);
            actAsADuck(person);
        } catch (NoSuchMethodException nsme) {
            System.err.println("Method not found: " + nsme.getMessage());
            nsme.printStackTrace();
        } catch (Exception e) {
            System.err.println("Execution failed:");
            e.printStackTrace();
        }
    }
    
    static void actAsADuck(Object object) throws Exception {
        Class<?> objectClass = object.getClass();
        
        objectClass.getDeclaredMethod("walk").invoke(object);
        objectClass.getDeclaredMethod("swim").invoke(object);
        objectClass.getDeclaredMethod("quack").invoke(object);
    }
}
