package com.jse.hackerrank.tasks10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Email {
    private String firstName;
    private String email;
    
    public Email(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}

public class SomeSnippetsTemplates104 {
    static List<Email> emailsTable;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int n = scanner.nextInt();
        emailsTable = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            String firstName = scanner.next();
            String email = scanner.next();
            
            emailsTable.add(new Email(firstName, email));
        }
        
        for (String name : getGmailUsers()) {
            System.out.println(name);
        }
        
        scanner.close();
    }

    private static List<String> getGmailUsers() {
        List<String> names = new ArrayList<>();
        String emailRegEx = ".*@gmail.com";
        Pattern pattern = Pattern.compile(emailRegEx);
        
        for (Email emailEntry : emailsTable) {
            Matcher matcher = pattern.matcher(emailEntry.getEmail());
            
            if (matcher.matches()) {
                names.add(emailEntry.getFirstName());
            }
        }
        
        Collections.sort(names);
        
        return names;
    }
}
