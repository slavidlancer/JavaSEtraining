package com.jse.tutorials.design_patterns.behavioural.chain_of_responsibility;

public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        
        loggerChain.logMessage(AbstractLogger.INFO, "this is an information");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "this is a debug level information");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "this is an error information");
    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        
        return errorLogger;
    }
}
