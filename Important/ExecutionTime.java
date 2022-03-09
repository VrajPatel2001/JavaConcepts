package com.Important;

import java.util.ArrayList;

public class ExecutionTime {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<=1000000;i++)
        {
            a.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
