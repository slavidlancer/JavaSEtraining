package com.jse.tutorials.design_patterns.behavioural.visitor;

public class VisitorPattern {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
