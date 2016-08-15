package com.jse.tutorials.design_patterns.behavioural.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
