package com.jse.fundamentals.loopsmethodsclasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromTextFile {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("resources/numbers.txt");
            BufferedReader textReader = new BufferedReader(fileReader);
            long sum = 0;
            
            String lineContent = textReader.readLine().trim();
            
            while ((lineContent != "") && (lineContent != null)) {
                sum += Integer.parseInt(lineContent);
                lineContent = textReader.readLine();
            }
            
            System.out.println(sum);
            
            textReader.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
