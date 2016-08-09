package com.jse.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class SomeSnippetsTemplates15 {
    static class Volume {
        double getVolume(int a) {
            double result = a * a * a;
            
            return result;
        }
        
        double getVolume(int l, int b, int h) {
            double result = l * b * h;
            
            return result;
        }
        
        double getVolume(double r) {
            double result = Math.PI * r * r * r * 2 / 3;
            
            return result;
        }
        
        double getVolume(double r, double h) {
            double result = h * Math.PI * r * r;
            
            return result;
        }
    }
    
    static class Display {
        public void display(double value) {
            System.out.printf("%.3f\n", value);
        }
    }
    
    static class Calculate {
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            Calculate cal = new Calculate();
            int T = cal.getINTVal();
            
            while (T-- > 0) {
                double volume = 0.0d;
                int ch = cal.getINTVal();
                
                if (ch == 1) {
                    int a = cal.getINTVal();
                    volume = Calculate.doCalc().getVolume(a);
                } else if (ch == 2) {
                    int l = cal.getINTVal();
                    int b = cal.getINTVal();
                    int h = cal.getINTVal();
                    volume = Calculate.doCalc().getVolume(l, b, h);
                } else if (ch == 3) {
                    double r = cal.getDoubleVal();
                    volume = Calculate.doCalc().getVolume(r);
                } else if (ch == 4) {
                    double r = cal.getDoubleVal();
                    double h = cal.getDoubleVal();
                    volume = Calculate.doCalc().getVolume(r, h);
                }
                
                cal.output.display(volume);
            }
        } catch (NumberFormatException nfe) {
            System.out.print(nfe);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        input.close();
    }
}
