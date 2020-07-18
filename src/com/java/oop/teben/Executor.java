package com.java.oop.teben;

import com.java.oop.teben.generics.MyArray;
import com.java.oop.teben.generics.MyList;

public class Executor {
    public void execute() {
        MyList<Integer> intList = new MyList<>();
        intList.add(-3);
        intList.add(4);
        intList.add(3);
        intList.add(-8);
        intList.add(90);
        System.out.println("Integer list: " + intList);
        System.out.println("Smallest value in integer list: " + intList.getSmallestValue());
        System.out.println("Largest value in integer list: " + intList.getLargestValue());


        MyList<String> strList = new MyList<>();
        strList.add("abc");
        strList.add("def");
        strList.add("ghi");
        strList.add("jkl");
        strList.add("mno");
        System.out.println("\nString list: " + strList);
        System.out.println("Smallest value in string list: " + strList.getSmallestValue());
        System.out.println("Largest value in string list: " + strList.getLargestValue());

        Integer [] intArray = {1, 2, 3, 4 ,5};
        MyArray<Integer> myArray = new MyArray<>(intArray);

        System.out.println("\nInteger array: " + myArray);
        System.out.println("Highest value of array: " + myArray.getHighestValue());
        System.out.println("Lowest value of array: " + myArray.getLowestValue());
    }
}
