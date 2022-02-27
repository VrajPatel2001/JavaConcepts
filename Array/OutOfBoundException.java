package com.Array;

import java.util.Arrays;
import java.util.Random;

public class OutOfBoundException {
    public static void main(String[] args) {
        Random rand; // Generate random values and value specify the maximum number for random value
        rand = new Random();
        int[] a = new int[50];

       for(int i = 0; i < a.length;i++)
       {
           a[i] = rand.nextInt(100);
       }

       try{
           System.out.println(a[52]);
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e);
       }

        System.out.println(Arrays.toString(a));


    }
}
