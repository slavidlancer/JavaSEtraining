package com.jse.tutorials.design_patterns.behavioural.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("displaying " + computer.getClass().getSimpleName());
    }
    
    @Override
    public void visit(Monitor monitor) {
        System.out.println("displaying " + monitor.getClass().getSimpleName());
    }
    
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("displaying " + keyboard.getClass().getSimpleName());
    }
    
    @Override
    public void visit(Mouse mouse) {
        System.out.println("displaying " + mouse.getClass().getSimpleName());
    }
}
