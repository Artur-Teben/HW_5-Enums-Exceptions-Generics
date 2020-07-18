package com.java.oop.teben.generics;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private List<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public void add(T num) {
        list.add(num);
    }

    public T getSmallestValue() {
        T min = list.get(0);
        for (T temp : list) {
            if (temp.compareTo(min) < 0) {
                min = temp;
            }
        }
        return min;
    }

    public T getLargestValue() {
        T max = list.get(0);
        for (T temp : list) {
            if (temp.compareTo(max) >= 0) {
                max = temp;
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return  "" + list;
    }
}
