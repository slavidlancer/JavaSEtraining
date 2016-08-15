package com.jse.hackerrank.tasks05;

import java.util.Scanner;

abstract class Book {
    protected String title;
    protected String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    /*public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }*/
    
    protected abstract void display();
}

class MyBook extends Book {
    private int price;
    
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public void display() {
        System.out.println("Title: " + this.getTitle() + "\nAuthor: " +
                this.getAuthor() + "\nPrice: " + this.getPrice());
    }
}

public class SomeSnippetsTemplates51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        Book newNovel = new MyBook(title, author, price);
        newNovel.display();
        
        scanner.close();
    }
}
