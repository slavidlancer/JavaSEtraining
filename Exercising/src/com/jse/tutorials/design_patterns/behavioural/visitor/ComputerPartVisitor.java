package com.jse.tutorials.design_patterns.behavioural.visitor;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Monitor monitor);
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
}
