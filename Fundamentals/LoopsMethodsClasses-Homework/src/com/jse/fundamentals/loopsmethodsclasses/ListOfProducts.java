package com.jse.fundamentals.loopsmethodsclasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.jse.fundamentals.loopsmethodsclasses.item.Product;

public class ListOfProducts {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        File fileInput = new File("resources/products_list.txt");
        File fileOutput = new File("bin/com/jse/products_list_output.txt");
        
        try {
            Scanner fileScanner = new Scanner(fileInput);
            
            while (fileScanner.hasNext()) {
                String name = fileScanner.next();
                BigDecimal price = fileScanner.nextBigDecimal();
                products.add(new Product(name, price));
            }
            
            fileScanner.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        
        Collections.sort(products);
        
        try {
            PrintWriter printWriter = new PrintWriter(fileOutput);
            
            for (Product product : products) {
                printWriter.println(product.toString());
            }
            
            printWriter.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
