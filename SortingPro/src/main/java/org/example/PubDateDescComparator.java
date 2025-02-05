package org.example;

import java.util.Comparator;

public class PubDateDescComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int yearComparison = Integer.compare(b2.getYear(), b1.getYear()); // Descending order
        return (yearComparison != 0) ? yearComparison : b1.getTitle().compareTo(b2.getTitle()); // Title ascending
    }
}

