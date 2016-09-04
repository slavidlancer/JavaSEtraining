package com.jse.hackerrank.tasks09;

import java.util.HashSet;
import java.util.Set;

class User {
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;
    
    public User(String username, String password, int age,
            Set<Integer> orderIDs) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.orderIDs = orderIDs;
    }
}

public class SomeSnippetsTemplates98 {
    public static void main(String[] args) {
        Set<Integer> orderIDs = new HashSet<>();
        orderIDs.add(666);
        orderIDs.add(0);
        orderIDs.add(999);
        
        User user = new User("name", "pass", 1, orderIDs);
        
        System.out.println(user.username + ", " + user.password + ", " +
                user.age + ": " + user.orderIDs);
    }
}
