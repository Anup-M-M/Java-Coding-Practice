package org.example.java8features.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Book{
     String bookName;
     long bookPages;
     int numBooks;

    public Book(String bookName, long bookPages, int numBooks) {
        this.bookName = bookName;
        this.bookPages = bookPages;
        this.numBooks = numBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPages=" + bookPages +
                ", numBooks=" + numBooks +
                '}';
    }
}
public class CollectStream {

    public static void main(String[] args) {

        Book book1 = new Book("CoreJava",250, 5);
        Book book2 = new Book("AdvancedJava",500, 10);
        Book book3 = new Book("AWS",200, 1);

        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);

        Long nob =list.stream().collect(Collectors.counting());
        System.out.println("Num of Books : "+ nob);

        int tb=  list.stream().collect(Collectors.summingInt(n -> n.numBooks));
        System.out.println("Total of Books : "+ tb);

//        List<Integer> list = Arrays.asList(3,6,5,10,4,8,5);
//
//        List<Integer> collectList = list.stream()
//                                        .map(n -> n*2)
//        // accumulating or copying element from stream object to collection object,
//        // summarizing elements according to various criteria,
//                                        .collect(Collectors.toList());
//
//        System.out.println("collectList : " + collectList);

    }
}
