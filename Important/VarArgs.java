package com.Important;

public class VarArgs {
    //Variable Arguments

    public static void main(String[] args) {

        demo(1,2,3);
    }

    static void demo(int ...a) // ... represents VarArgs
    {
        for(int i:a)
        System.out.println(i);
    }
}
