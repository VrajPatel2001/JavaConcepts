package com.Important;

public class CountObjects {

    static {
        System.out.println("Static Block"); // This is static block and we can use it without declaring in the main method.
    } //All static blocks runs when program loads and all blocks run before main method executes.
    public static void main(String[] args) {

    }
    public class demo{
        static int nums = 0;
        public demo(){
            nums++;
        }
        public void counter(){
            nums++;
        }
    }
}
