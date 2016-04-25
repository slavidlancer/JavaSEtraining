package com.softuni.jse.coding101;

import java.math.BigDecimal;
import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigDecimal usd = new BigDecimal(input.nextLine().trim());
        BigDecimal bgn = usd.multiply(new BigDecimal(1.79549));
        
        System.out.println(bgn.setScale(2, BigDecimal.ROUND_HALF_UP));
        
        input.close();
    }
}
