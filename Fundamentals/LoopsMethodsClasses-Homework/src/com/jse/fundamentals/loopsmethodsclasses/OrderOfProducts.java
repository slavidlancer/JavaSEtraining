package com.jse.fundamentals.loopsmethodsclasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.TreeSet;
import com.jse.fundamentals.loopsmethodsclasses.item.Product;

public class OrderOfProducts {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();
        File fileProducts = new File("resources/products.txt");
        File fileOrder = new File("resources/order.txt");
        File fileOutput = new File("bin/com/jse/order_output.txt");
        BigDecimal totalSum = new BigDecimal(0).setScale(2);
        
        try {
            Scanner fileScanner = new Scanner(fileProducts);
            
            while (fileScanner.hasNext()) {
                String name = fileScanner.next();
                BigDecimal price = fileScanner.nextBigDecimal();
                products.add(new Product(name, price));
            }
            
            fileScanner.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        
        try {
            Scanner fileScanner = new Scanner(fileOrder);
            
            while (fileScanner.hasNext()) {
                double quantity = fileScanner.nextDouble();
                String name = fileScanner.next();
                
                for (Product product : products) {
                    if (product.getName().equals(name)) {
                        totalSum = totalSum.add(product.getPrice().multiply(
                                new BigDecimal(quantity)));
                    }
                }
            }
            
            fileScanner.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        
        try {
            PrintWriter printWriter = new PrintWriter(fileOutput);
            DecimalFormat formatter = new DecimalFormat("#0.00");
            
            printWriter.println(formatter.format(totalSum));
            
            printWriter.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
