package com.String;

import java.util.Locale;
import java.util.Scanner;

public class Basic {
    // Accept two strings and perform following operations
    // Find out length
    // Concatenation
    // Convert to UPPERCASE

    public static void main(String[] args) {
        String s1,s2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings:");
        s1 = input.nextLine();
        s2 = input.nextLine();

//        String s3 = s1.concat(s2); //Concat
        String s3 = s1+" " +s2;
        System.out.println("Concatenation:"+s3);

        System.out.println(s1 + " Length is " + s1.length());
        System.out.println(s2 + " Length is " + s2.length());

        System.out.println(s1.toUpperCase());

    }
}
