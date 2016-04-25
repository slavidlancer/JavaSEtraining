package com.softuni.jse.coding101;

import java.math.BigDecimal;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigDecimal value = new BigDecimal(input.nextLine());
        String inputCurrency = input.nextLine();
        String outputCurrency = input.nextLine();
        
        String bGN = "BGN";
        String uSD = "USD";
        String eUR = "EUR";
        String gBP = "GBP";
        BigDecimal uSDToBGN = new BigDecimal(1.79549);
        BigDecimal eURToBGN = new BigDecimal(1.95583);
        BigDecimal gBPToBGN = new BigDecimal(2.53405);
        BigDecimal firstRate = null;
        BigDecimal secondRate = null;
        BigDecimal result = new BigDecimal(0).setScale(2);
        
        if (inputCurrency.equals(bGN)) {
            firstRate = new BigDecimal(1).setScale(5);
        } else if (inputCurrency.equals(uSD)) {
            firstRate = uSDToBGN;
        } else if (inputCurrency.equals(eUR)) {
            firstRate = eURToBGN;
        }
        else if (inputCurrency.equals(gBP)) {
            firstRate = gBPToBGN;
        }
        
        if (outputCurrency.equals(bGN)) {
            secondRate = new BigDecimal(1).setScale(5);
        } else if (outputCurrency.equals(uSD)) {
            secondRate = uSDToBGN;
        } else if (outputCurrency.equals(eUR)){
            secondRate = eURToBGN;
        } else if (outputCurrency.equals(gBP)) {
            secondRate = gBPToBGN;
        }
        
        result = value.multiply(firstRate.divide(secondRate,
                BigDecimal.ROUND_CEILING));
        
        System.out.print(result.setScale(2, BigDecimal.ROUND_FLOOR));
        
        input.close();
    }
}
