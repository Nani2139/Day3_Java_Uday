package org.example;

public class ArrayModification {
    public static <T> void swap(T[] array, int i, int j) {
        if (i < 0 || j < 0 || i >= array.length || j >= array.length) {
            throw new IndexOutOfBoundsException("going out of bound provide appropriate number");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
