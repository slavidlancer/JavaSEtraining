package com.softuni.jse.fundamentals;

public class Rectangle {
    private int top;
    private int left;
    /*private int bottom;
    private int right;*/
    private int width;
    private int height;
    
    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public int getTop() {
        return this.top;
    }
    
    public void setTop(int top) {
        this.top = top;
    }
    
    public int getLeft() {
        return this.left;
    }
    
    public void setLeft(int left) {
        this.left = left;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int calculateArea() {
        return this.width * this.height;
    }
    
    /*public void setBottom() {
        this.bottom = this.top + this.height;
    }*/
    
    public int getBottom() {
        return this.top + this.height;
    }
    
    /*public void setRight() {
        this.right = this.left + this.width;
    }*/
    
    public int getRight() {
        return this.left + this.width;
    }
    
    public boolean isInside(Rectangle rectangle) {
        return (rectangle.left <= this.left) &&
                (rectangle.getRight() >= this.getRight()) &&
                (rectangle.top <= this.top) &&
                (rectangle.getBottom() >= this.getBottom());
    }
}
