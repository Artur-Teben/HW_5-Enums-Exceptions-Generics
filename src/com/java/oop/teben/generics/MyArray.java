package com.java.oop.teben.generics;

import java.util.Arrays;

public class MyArray<T extends Comparable<T>> {
    private final T[] array;

    public MyArray(T[] array) {
        this.array = array;
    }

    public T getLowestValue() {
        T min = array[0];
        for (T temp : array) {
            if (temp.compareTo(min) < 0) {
                min = temp;
            }
        }
        return min;
    }

    public T getHighestValue() {
        T max = array[0];
        for (T temp : array) {
            if (temp.compareTo(max) >= 0) {
                max = temp;
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "" + Arrays.toString(array);
    }
}
