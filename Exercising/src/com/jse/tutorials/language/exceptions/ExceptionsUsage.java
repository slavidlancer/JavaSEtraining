package com.jse.tutorials.language.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionsUsage {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        String line = "";
        
        try {
            line = bufferedReader.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        System.out.println(line);
    }
}
