package com.Exception;

public class DemoException {
    public static void main(String[] args) {
        try
        {

            int i = 5/0;
        }
        catch (ArithmeticException a)
        {
            System.out.println(a);  // After the try block throws the exception the program will not show any errors as we have handled them.
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong"); // we can have multiple catch block and also can put the Exception object as it will catch the all exception
        }

    }
}
