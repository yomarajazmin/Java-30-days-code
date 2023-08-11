package org.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day13_Abstract_Classes {

    /**
     * Problem Statement -
     * [Abstract Classes](https://www.hackerrank.com/challenges/30-abstract-classes)
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String bookTitle = e.nextLine().trim();
        String bookAuthor = e.nextLine().trim();
        int bookPrice = Integer.parseInt(e.nextLine().trim());
        MyBook myBook = new MyBook(bookTitle, bookAuthor, bookPrice);
        myBook.display();
        e.close();

    }
}
abstract class Book {
    private String title;
    private String author;
    private int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    abstract void display();
}

class MyBook extends Book {

    MyBook(String title, String author, int price) {
        super(title, author, price);
    }

    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }
}
