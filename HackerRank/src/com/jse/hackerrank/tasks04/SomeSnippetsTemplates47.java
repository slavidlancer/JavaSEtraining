package com.jse.hackerrank.tasks04;

import java.util.HashMap;
import java.util.Map;

class Book {
    private String title;
    private int pageCount;
    private int isbn;
    private boolean isCheckedOut;
    private int dayCheckedOut = -1;
    
    public Book(String title, int pageCount, int isbn) {
        this.title = title;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.isCheckedOut = false;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getPageCount() {
        return this.pageCount;
    }
    
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    public int getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    public boolean isCheckedOut() {
        return this.isCheckedOut;
    }
    
    public void setCheckedOut(boolean isCheckedOut, int dayCheckedOut) {
        this.isCheckedOut = isCheckedOut;
        setDayCheckedOut(dayCheckedOut);
    }
    
    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }
    
    public void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }
}

class LibraryCatalogue {
    private Map<String, Book> booksCollection = new HashMap<>();
    private int currentDay = 0;
    private int lengthOfCheckoutPeriod = 7;
    private double initialLateFee = 0.50;
    private double feePerLateDay = 1.00;
    
    public LibraryCatalogue(Map<String, Book> booksCollection) {
        this.booksCollection = booksCollection;
    }
    
    public LibraryCatalogue(Map<String, Book> booksCollection,
            int lengthOfCheckoutPeriod, double initialLateFee,
            double feePerLateDay) {
        this.booksCollection = booksCollection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }
    
    public Map<String, Book> getBooksCollection() {
        return this.booksCollection;
    }
    
    public void setBooksCollection(Map<String, Book> booksCollection) {
        this.booksCollection = booksCollection;
    }
    
    public Book getBook(String title) {
        return this.booksCollection.get(title);
    }
    
    public void addBook(Book book) {
        this.booksCollection.put(book.getTitle(), book);
    }
    
    public int getCurrentDay() {
        return this.currentDay;
    }
    
    public void nextDay() {
        this.currentDay++;
    }
    
    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }
    
    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }
    
    public void setLengthOfCheckoutPeriod(int lengthOfCheckoutPeriod) {
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
    }
    
    public double getInitialLateFee() {
        return this.initialLateFee;
    }
    
    public void setInitialLateFee(double initialLateFee) {
        this.initialLateFee = initialLateFee;
    }
    
    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }
    
    public void setFeePerLateDay(double feePerLateDay) {
        this.feePerLateDay = feePerLateDay;
    }
    
    public void checkOutBook(String title) {
        Book book = this.getBook(title);
        
        if (book.isCheckedOut()) {
            bookIsAlreadyCheckedOut(book);
        } else {
            book.setCheckedOut(true, this.currentDay);
            
            System.out.println("book \"" + book.getTitle() +
                    "\" was just checked out, due on day " +
                    (book.getDayCheckedOut() + this.lengthOfCheckoutPeriod));
        }
    }
    
    public void returnBook(String title) {
        Book book = this.getBook(title);
        int daysLate = this.currentDay - (book.getDayCheckedOut() +
                this.getLengthOfCheckoutPeriod());
        
        if (daysLate > 0) {
            System.out.print("owed: " + (this.getInitialLateFee() +
                    daysLate * this.getFeePerLateDay()) + " $; ");
            System.out.println(daysLate + " days late");
        } else {
            System.out.println("book returned");
        }
        
        book.setCheckedOut(false, -1);
    }
    
    public void bookIsAlreadyCheckedOut(Book book) {
        System.out.print("book \"" + book.getTitle() +
                "\": already checked out; ");
        System.out.println("should be back on day: " +
                (book.getDayCheckedOut() +
                this.getLengthOfCheckoutPeriod()));
    }
}

public class SomeSnippetsTemplates47 {
    public static void main(String[] args) {
        Map<String, Book> booksCollection = new HashMap<>();
        Book book01 = new Book("Harry Potter", 666, 123498765);
        booksCollection.put(book01.getTitle(), book01);
        LibraryCatalogue libraryCatalogue = new LibraryCatalogue(
                booksCollection);
        libraryCatalogue.checkOutBook("Harry Potter");
        libraryCatalogue.nextDay();
        libraryCatalogue.nextDay();
        libraryCatalogue.nextDay();
        libraryCatalogue.checkOutBook("Harry Potter");
        libraryCatalogue.setCurrentDay(17);
        libraryCatalogue.returnBook("Harry Potter");
        libraryCatalogue.checkOutBook("Harry Potter");
    }
}
