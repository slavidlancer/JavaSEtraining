package com.jse.hackerrank.tasks08;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Calculator {
    public int power(int n, int p) throws Exception {
        if ((n < 0) || (p < 0)) {
            throw new Exception("n and p should be non-negative");
        }
        
        int result = (int) Math.pow(n, p);
        
        return result;
    }
}

class HotChocolate {
    public static final double TOO_HOT_TEMPERATURE = 30;
    public static final double TOO_COLD_TEMPERATURE = 5;
    
    public static void drinkHotChocolate(double chocolateTemperature)
            throws TemperatureException { //throws TooHotException, TooColdException
        if (chocolateTemperature >= TOO_HOT_TEMPERATURE) {
            throw new TooHotException();
        } else if (chocolateTemperature <= TOO_COLD_TEMPERATURE) {
            throw new TooColdException();
        }
    }
}

class TemperatureException extends Exception {
    private static final long serialVersionUID = 1L;
}

class TooColdException extends TemperatureException {
    private static final long serialVersionUID = 1L;
}

class TooHotException extends TemperatureException {
    private static final long serialVersionUID = 1L;
}

public class SomeSnippetsTemplates81 {
    List<String> list;
    int[] intArray = new int[4];
    
    public SomeSnippetsTemplates81() {
        this.list = null;
    }
    
    SomeSnippetsTemplates81(String check) {
        this.list = new LinkedList<>();
        this.list.add(check);
    }
    
    void testExceptionDemo(int index, String check) {
        try {
            int newInt = intArray[index];
            
            list.indexOf(check);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.err.println("aioobe: " + aioobe.getMessage());
        } catch (NullPointerException npe) {
            System.err.println("npe: " + npe.getMessage());
        } finally {
            System.out.println("final message");
        }
        
        System.out.println("last lines");
    }
    
    void propagateException() throws Exception {
        throw new Exception("always thrown exception");
    }
    
    public static void main(String[] args) throws InterruptedException { //throws TemperatureException
        SomeSnippetsTemplates81 nullList = new SomeSnippetsTemplates81();
        nullList.testExceptionDemo(1, "x");
        
        SomeSnippetsTemplates81 notNullList = new SomeSnippetsTemplates81("x");
        notNullList.testExceptionDemo(100, "x");
        
        try {
            nullList.propagateException();
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " +
                    e.getMessage());
        }
        
        double currentChocolateTemperature = 35;
        boolean isWrongTemperature =
                ((currentChocolateTemperature >=
                            HotChocolate.TOO_HOT_TEMPERATURE) ||
                (currentChocolateTemperature <=
                            HotChocolate.TOO_COLD_TEMPERATURE));
        
        while (isWrongTemperature) {
            try {
                HotChocolate.drinkHotChocolate(currentChocolateTemperature);
                
                System.out.println("drinking: ok");
                
                isWrongTemperature = false;
            } catch (TooHotException the) {
                System.err.println("too hot exception");
                
                currentChocolateTemperature -= 1;
            } catch (TooColdException tce) {
                System.err.println("too cold exception");
                
                currentChocolateTemperature += 1;
            } catch (TemperatureException te) { //without this if "throws TooHotException, TooColdException" is only present
                System.err.println("temperature problem, exception");
            }
            
            TimeUnit.SECONDS.sleep(1);
        }
        
        System.out.println("drinking: finished");
        
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            
            Calculator calculator = new Calculator();
            
            try {
                int answer = calculator.power(n, p);
                
                System.out.println(answer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }
}
