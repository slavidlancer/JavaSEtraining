package com.jse.hackerrank.tasks02;

class Flower {
    String getWhatIsYourName() {
        return "I have many names and types";
    }
}

class Jasmine extends Flower {
    @Override
    String getWhatIsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String getWhatIsYourName() {
        return "Lily";
    }
}

class Lotus extends Flower {
    @Override
    String getWhatIsYourName() {
        return "Lotus";
    }
}

class State {
    Flower getYourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends State {
    @Override
    Jasmine getYourNationalFlower() {
        return new Jasmine();
    }
}

class Karnataka extends State {
    @Override
    Lotus getYourNationalFlower() {
        return new Lotus();
    }
}

class AndhraPradesh extends State {
    @Override
    Lily getYourNationalFlower() {
        return new Lily();
    }
}

public class SomeSnippetsTemplates26 {
    public static void main(String[] args) {
        State firstState = new AndhraPradesh();
        State secondState = new WestBengal();
        State thirdState = new Karnataka();
        
        System.out.println(printFlower(firstState).getWhatIsYourName());
        System.out.println(printFlower(secondState).getWhatIsYourName());
        System.out.println(printFlower(thirdState).getWhatIsYourName());
    }
    
    private static Flower printFlower(State state) {
        return state.getYourNationalFlower();
    }
}
