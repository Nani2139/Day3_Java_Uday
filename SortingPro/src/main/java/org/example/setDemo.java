package org.example;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
public class setDemo {
    public static Set<Book> treeSetDemo(Comparator<Book> comparator) {
        Set<Book> books = (comparator == null) ? new TreeSet<>() : new TreeSet<>(comparator);

        books.add(new Book("Effective Java", "Joshua Bloch", 2008));
        books.add(new Book("Harry Potter", "J.K.Rowling", 1997));
        books.add(new Book("Walden", "Henry David Thoreau", 1854));
        books.add(new Book("The Last Lecture", "Randy Pausch", 2008));

        return books;
    }
}


