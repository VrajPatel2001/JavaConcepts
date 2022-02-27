package com.Array;

public class JaggedArray {


    public static void main(String[] args) {
        int[][] jagged = {
                {1,4,6},
                {5,3},
                {87,7, 9, 10}
        };
//Jagged arrays are those arrays which does not have any fix column size.
        for(int[] i:jagged)
        {
            for(int j: i)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
