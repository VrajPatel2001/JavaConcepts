package com.String;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class ReadInput {
    public static void main(String[] args) throws IOException {

        //we can take input from Scanner class and BufferedReader
        // Also can use System.in.read();
        // Takes the character and return its ASCII value
//        int i;
//
//        StringBuilder str = new StringBuilder();
//
//        while( (i =System.in.read()) != 10)
//        {
//            str.append((char) i);
//        }
//        System.out.println(str);

        //Buffer reader

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        int n = parseInt(br.readLine());
        System.out.println(n);
    }
}
