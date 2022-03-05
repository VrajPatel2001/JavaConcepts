package com.CollectionsAndGenerics;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>(); //HashSet value will store the values in the form it is fetched easily.
        //TreeSet will store it based on the ascending order.

        values.add(5);
        values.add(9);
        values.add(5); //Repetition of value will not be stored in the set collection.
        values.add(10);

        for(int i: values)
        {
            System.out.println(i);
        }
    }
}
