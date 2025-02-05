package org.example;
public class Main {
    public static void main(String[] args) {
        // Test Case 1: Natural Ordering (By Title)
        System.out.println("Natural Order:");
        System.out.println(setDemo.treeSetDemo(null));

        // Test Case 2: Sorting by Publication Year (Ascending)
        System.out.println("\nSorted by Publication Year (Ascending):");
        System.out.println(setDemo.treeSetDemo(new PubDateAscComparator()));

        // Test Case 3: Sorting by Publication Year (Descending)
        System.out.println("\nSorted by Publication Year (Descending):");
        System.out.println(setDemo.treeSetDemo(new PubDateDescComparator()));

    }
}