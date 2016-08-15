package com.jse.hackerrank.tasks04;

abstract class Canine {
    protected String name;
    protected String color;
    protected String gender;
    protected int age;
    
    /** Parameterized Constructor 
     *   @param name Dog's name
     *   @param color Dog's color
     *   @param age Dog's age
     *   @param maleOrFemale Dog's gender ('M' for male, 'F' for female)
     **/
    Canine(String name, String color, int age, char maleOrFemale) {
        this.name = name;
        this.color = color;
        this.gender = (maleOrFemale == 'M') ? "Male" : "Female";
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    /** Abstract method declaration
     *   @return Implementations should return a string describing the breed **/
    abstract String getBreed();
    
    /** Abstract method declaration
     *   @param canine Other canine to greet
     *   @return Implementations should print the specific greeting **/
    abstract void greet(Canine canine);
    abstract void talk(Canine canine);
    
    /** Defined method **/
    void speak() {
        System.out.println("a canine is speaking");
    }
    
    /** Defined method **/
    void printInfo() {
        System.out.println(this.getName() + " is " +
                (((this.getAge() % 10) == 8) ? "an " : "a ") +
                this.getAge() + " year old " + this.getGender() + " " +
                this.getBreed() + " with a " + this.getColor() + " coat.");
    }
}

class KleeKai extends Canine {
    /** Parameterized Constuctor **/
    public KleeKai(String name, String color, int age, char maleOrFemale) {
        super(name, color, age, maleOrFemale);
    }
    
    /** Abstract method implementation
     *   @return "Klee Kai" **/
    @Override
    String getBreed() {
        return "Klee Kai";
    }
    
    /** Abstract method implementation, print greeting **/
    @Override
    void greet(Canine canine) {
        System.out.println(this.getBreed() + " is greeting a " +
                canine.getBreed() + ": bark bark");
    }
    
    @Override
    void speak() {
        System.out.println("a Klee Kai is barking");
    }
    
    @Override
    void talk(Canine canine) {
        this.speak();
        System.out.println("\twow-wow");
    }
}

class SiberianHusky extends Canine {
    /** Parameterized Constuctor **/
    public SiberianHusky(String name, String color, int age,
            char maleOrFemale) {
        super(name, color, age, maleOrFemale);
    }
    
    /** Abstract method implementation
     *   @return "Siberian Husky" **/
    @Override
    String getBreed() {
        return "Siberian Husky";
    }
    
    /** Abstract method implementation, print greeting **/
    @Override
    void greet(Canine canine) {
        System.out.println(this.getBreed() + " is greeting a " +
                canine.getBreed() + ": bark bark");
    }
    
    @Override
    void talk(Canine canine) {
        this.speak();
    }
}

abstract class AlienDog extends Canine {
    AlienDog(String name, String color, int age, char maleOrFemale) {
        super(name, color, age, maleOrFemale);
        this.gender = "alien";
    }
    
    /*@Override
    abstract String getBreed();*/
    
    /** Abstract method implementation, print greeting **/
    @Override
    abstract void greet(Canine canine);
    
    @Override
    void talk(Canine canine) {
        System.out.println(this.getBreed() + " to " + canine.getBreed() + ": " +
                "comprende?");
    }
}

abstract class CosmicDog extends AlienDog {
    CosmicDog(String name, String color, int age, char maleOrFemale) {
        super(name, color, age, maleOrFemale);
    }
    
    /** Abstract method implementation
     *   @return "Cosmic Dog" **/
    @Override
    String getBreed() {
        return "Cosmic Dog";
    }
    
    @Override
    void speak() {
        super.speak();
        System.out.println("\t(canine of alien cosmic type)");
    }
    
    void talkSpecific(Canine canine) {
        System.out.println(this.getBreed() + " to " + canine.getBreed() +
                ": specific talk is this");
    }
    
    void talkSpecific(KleeKai canine) {
        System.out.println("empty talk");
    }
    
    void talkSpecific(SiberianHusky canine) {
        System.out.println("empty talk");
    }
}

class GreenDog extends CosmicDog {
    GreenDog(String name, String color, int age, char maleOrFemale) {
        super(name, color, age, maleOrFemale);
    }
    
    /** Abstract method implementation, print greeting **/
    @Override
    void greet(Canine canine) { //(AlienDog canine) //not accepted
        System.out.println(this.getBreed() + " is greeting a " +
                canine.getBreed() + ": hello, how are you?");
    }
    
    /*
    //AlienDog.talk(Canine canine) is being used (overriden)
    void talk(SiberianHusky canine) {
        System.out.println(this.getBreed() + " to " + canine.getBreed() +
                ": what's up in Siberia?");
    }
    
    void talk(KleeKai canine) {
        System.out.println(this.getBreed() + " to " + canine.getBreed() +
                ": nihao");
    }*/
    
    @Override
    void talkSpecific(SiberianHusky canine) {
        System.out.println(this.getBreed() + " to " + canine.getBreed() +
                ": what's up in Siberia?");
    }
    
    @Override
    void talkSpecific(KleeKai canine) {
        System.out.println(this.getBreed() + " to " + canine.getBreed() +
                ": nihao");
    }
}

public class SomeSnippetsTemplates49 {
    public static void main(String[] args) {
        //Canine puppy = new Canine("DogName1", "Grey/White", 5, 'F'); //cannot be instantiated
        Canine puppy01 = new KleeKai("DogName1", "Grey/White", 5, 'F');
        Canine puppy02 = new SiberianHusky("DogName2", "Grey/Black/White", 16,
                'F');
        Canine puppy03 = new GreenDog("DogName3", "green", 8, ' ');
        AlienDog puppy04 = new GreenDog("DogName4", "green", 0, ' ');
        CosmicDog puppy05 = new GreenDog("DogName5", "green", 0, ' ');
        GreenDog puppy06 = new GreenDog("DogName6", "green", 0, ' ');
        Object puppy07 = new KleeKai("DogName7", "green", 0, ' ');
        Object stringObject = "string";
        String newString = (String) stringObject;
        System.out.println(stringObject.hashCode());
        System.out.println(newString.hashCode() + " " + newString.intern());
        System.out.println(puppy07.hashCode());
        
        puppy01.printInfo();
        puppy02.printInfo();
        puppy03.printInfo();
        puppy04.printInfo();
        puppy05.printInfo();
        puppy06.printInfo();
        
        puppy01.greet(puppy02);
        puppy02.greet(puppy01);
        puppy03.greet(puppy01);
        puppy03.greet(puppy02);
        puppy03.greet(puppy04);
        puppy01.greet(puppy03);
        puppy02.greet(puppy03);
        puppy01.greet(puppy04);
        puppy02.greet(puppy04);
        puppy04.greet(puppy01);
        puppy04.greet(puppy02);
        puppy04.greet(puppy03);
        
        puppy01.speak();
        puppy02.speak();
        puppy03.speak();
        puppy04.speak();
        
        puppy03.talk(puppy01);
        puppy03.talk(puppy02);
        
        puppy04.talk(puppy01);
        puppy04.talk(puppy02);
        
        puppy05.talk(puppy01);
        puppy05.talk(puppy02);
        puppy05.talk(puppy04);
        
        System.out.println();
        
        puppy06.talk(puppy01);
        puppy06.talk(puppy02);
        puppy06.talk(puppy05);
        
        System.out.println();
        
        puppy06.talkSpecific((KleeKai) puppy01);
        puppy06.talkSpecific((SiberianHusky) puppy02);
        puppy06.talkSpecific(puppy05);
        
        KleeKai puppy08 = (KleeKai) puppy07;
        System.out.println(puppy08.getBreed());
        puppy08.talk(puppy06);
        System.out.println(puppy08.getName());
        
        if (puppy08 instanceof Canine) {
            Canine canine = puppy08;
            canine.speak();
            canine.talk(puppy06);
            System.out.println(canine.getName());
            
            /*canine = (Canine) puppy08;
            canine.speak();*/
        }
        
        puppy08.speak();
    }
}
