package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("b1", 70000));
        books.add(new Book("b2", 75000));
        books.add(new Book("b3", 15000));

        System.out.println("Number of books: " + books.size());
        System.out.println("Total amount of books: " + calculateAmount(books));
        System.out.println("Amount after discount: " + calculateDiscountPercent(calculateAmount(books),0.3));
    }
    public static long calculateAmount(List<Book> books){
        long amount = 0;
        for (Book book : books) {
            amount += book.getPrice();
        }
        return amount;
    }
    public static long calculateDiscountPercent(long amount,double percent){
        return Math.round(amount - amount*percent);
    }
}
