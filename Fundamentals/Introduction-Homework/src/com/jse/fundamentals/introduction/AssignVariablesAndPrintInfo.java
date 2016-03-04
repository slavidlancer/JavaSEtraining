package com.jse.fundamentals.introduction;

public class AssignVariablesAndPrintInfo {
    public static void main(String[] args) {
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 32768;
        int intValueOther = 2000000000;
        long longValue = 919827112351L;
        char charValue = 'c';
        boolean booleanValue = false;
        float floatValue = 0.5f;
        double doubleValue = 0.1234567891011d;
        String stringValue = "the string";
        
        System.out.println(byteValue + " " + shortValue + " " + intValue + " "
                + intValueOther + " " + longValue + " " + charValue + " " +
                booleanValue + " " + floatValue + " " + doubleValue + " " +
                stringValue);
    }
}
