package org.example;
import java.util.Comparator;

public class PubDateAscComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int yearComparison = Integer.compare(b1.getYear(), b2.getYear());
        return (yearComparison != 0) ? yearComparison : b1.getTitle().compareTo(b2.getTitle());
    }
}

