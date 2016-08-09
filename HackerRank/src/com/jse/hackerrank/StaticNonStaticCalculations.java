package com.jse.hackerrank;

class A {
    static int i = 1111;
 
    static {
        i = i-- - --i;
    }
 
    {
        i = i++ + ++i;
    }
}
 
class B extends A {
    static {
        i = --i - i--;
    }
 
    {
        i = ++i + i++;
    }
}

class C
{
    @SuppressWarnings({ "null", "unused" })
    int methodOfA()
    {
        return (true ? null : 0);
    }
}

public class StaticNonStaticCalculations {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);
        C c = new C();
        //c.methodOfA(); //NullPointerException
    }
}
