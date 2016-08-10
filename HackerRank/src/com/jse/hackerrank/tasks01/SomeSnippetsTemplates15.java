package com.jse.hackerrank.tasks01;

import java.io.IOException;
import java.util.Scanner;

class Calculate {
    Scanner input;
    public Display output;
    
    public Calculate() throws IOException {
        this.input = new Scanner(System.in);
        this.output = new Display();
        
        if (this.input == null) {
            throw new IOException();
        }
    }
    
    public int getINTVal() {
        int value = input.nextInt();
        
        if (value <= 0) {
            throw new NumberFormatException("All the values must be "
                    + "positive");
        }
        
        return value;
    }
    
    public double getDoubleVal() {
        double value = input.nextDouble();
        
        if (value <= 0) {
            throw new NumberFormatException("All the values must be "
                    + "positive");
        }
        
        return value;
    }
    
    public static Volume doCalc() {
        return new Volume();
    }
}

class Volume {
    public double getVolume(int a) {
        double result = a * a * a;
        
        return result;
    }
    
    public double getVolume(int l, int b, int h) {
        double result = l * b * h;
        
        return result;
    }
    
    public double getVolume(double r) {
        double result = Math.PI * r * r * r * 2 / 3;
        
        return result;
    }
    
    public double getVolume(double r, double h) {
        double result = h * Math.PI * r * r;
        
        return result;
    }
}

class Display {
    public void display(double value) {
        System.out.printf("%.3f\n", value);
    }
}

public class SomeSnippetsTemplates15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            Calculate calculate = new Calculate();
            int T = calculate.getINTVal();
            
            while (T-- > 0) {
                double volume = 0.0d;
                int ch = calculate.getINTVal();
                
                if (ch == 1) {
                    int a = calculate.getINTVal();
                    volume = Calculate.doCalc().getVolume(a);
                } else if (ch == 2) {
                    int l = calculate.getINTVal();
                    int b = calculate.getINTVal();
                    int h = calculate.getINTVal();
                    volume = Calculate.doCalc().getVolume(l, b, h);
                } else if (ch == 3) {
                    double r = calculate.getDoubleVal();
                    volume = Calculate.doCalc().getVolume(r);
                } else if (ch == 4) {
                    double r = calculate.getDoubleVal();
                    double h = calculate.getDoubleVal();
                    volume = Calculate.doCalc().getVolume(r, h);
                }
                
                calculate.output.display(volume);
            }
        } catch (NumberFormatException nfe) {
            System.out.print(nfe);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        input.close();
    }
}
