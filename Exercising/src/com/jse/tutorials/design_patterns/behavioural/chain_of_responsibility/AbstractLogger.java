package com.jse.tutorials.design_patterns.behavioural.chain_of_responsibility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    
    protected int level;
    protected AbstractLogger nextLogger;
    
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        
        if (this.nextLogger != null) {
            this.nextLogger.logMessage(level, message);
        }
    }
    
    abstract protected void write(String message);
}