package com.Neuedu.HomeWork;

import java.io.Serializable;

/**
 * Create by Jia on 2020/2/10/010 14:55
 */
public class MyBook implements Serializable {
    private static final long serialVersionUID = -1529975472479161951L;
    private String name;
    private Double price;
    private String press;   //出版社
    private String author;
    private String bookISBN;

    public MyBook(String name, Double price, String press, String author, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBN = bookISBN;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyBook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }
}
