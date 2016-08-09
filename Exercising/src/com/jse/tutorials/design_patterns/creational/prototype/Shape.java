package com.jse.tutorials.design_patterns.creational.prototype;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    abstract void draw();
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
        
        return clone;
    }
}
