package com.jse.hackerrank.tasks08;

import java.util.Random;

interface CharacterType {
    String base = "Character"; //public static final
    
    void attack(); //public
    void heal(); //public
    String getWeapon(); //public
}

interface Jedi extends CharacterType {
    void disappear();
}

abstract class Ghost implements CharacterType {
    //public void attack() {}
    
    @Override
    public void heal() {
        System.out.println("healing by Ghost");
    }
}

class GhostRider extends Ghost { //implements Character or Jedi
    private String weapon = "chi";

    @Override
    public void attack() {
        System.out.println("attacking by Ghost Rider");
    }
    
    /*@Override
    public void disappear() {
        System.out.println("disappeared");
    }*/
    
    @Override
    public String getWeapon() {
        return this.weapon;
    }
}

class Enemy implements CharacterType {
    private String weapon = "light saber";
    
    /*public Enemy() {}*/
    
    @Override
    public void attack() {
        System.out.println("attacking by Enemy");
    }
    
    @Override
    public void heal() {
        System.out.println("healing by Enemy");
    }
    
    @Override
    public String getWeapon() {
        return this.weapon;
    }
    
    public void drawWeapon() {
        System.out.println("draw weapon");
    }
}

class Hero implements CharacterType {
    private String weapon = "the force";
    
    @Override
    public void attack() {
        System.out.println("Enemy attacking by Hero");
    }
    
    @Override
    public void heal() {
        System.out.println("healing by Hero");
    }
    
    @Override
    public String getWeapon() {
        return this.weapon;
    }
}

public class SomeSnippetsTemplates85 {
    public static void main(String[] args) {
        Enemy dartVader = new Enemy();
        Hero obiWanKenoby = new Hero();
        
        dartVader.attack();
        obiWanKenoby.attack();
        dartVader.heal();
        obiWanKenoby.heal();
        System.out.println("enemy weapon: " + dartVader.getWeapon());
        System.out.println("hero weapon: " + obiWanKenoby.getWeapon());
        
        CharacterType spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
    
    public static CharacterType summonCharacter() {
        Random rand = new Random();
        
        if ((Math.abs(rand.nextInt()) % 2) == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }
}
