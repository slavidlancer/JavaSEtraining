package com.jse.tutorials.design_patterns.behavioural.interpreter;

public class IntrepreterPattern {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        
        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Is Julie married? " +
                isMarriedWoman.interpret("Married Julie"));
    }
    
    private static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        
        return new AndExpression(julie, married);
    }
    
    private static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        
        return new OrExpression(robert, john);
    }
}
