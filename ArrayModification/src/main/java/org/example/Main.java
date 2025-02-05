package org.example;
import org.example.ArrayModification;
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        ArrayModification.swap(intArray, 1, 3); // Swap elements at index 1 and 3
        System.out.println(java.util.Arrays.toString(intArray)); // [1, 4, 3, 2, 5]

        String[] strArray = {"A", "B", "C", "D"};
        ArrayModification.swap(strArray, 0, 2);
        Character[] c={'A','B'};
        ArrayModification.swap(c,0,1);
        System.out.println(java.util.Arrays.toString(strArray)); // ["C", "B", "A", "D"]
    }
}