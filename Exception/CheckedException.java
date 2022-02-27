package com.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class CheckedException {
    public static void main(String[] args) throws IOException, SQLException { //This throws keyword ignore the errors which caused by the exception, but it will not handle the exception only avoid it.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //this can throw an exception that is why mention it or handle it. And it is known at compile time, so it is called checked exception.
        try {
            int a = Integer.parseInt(br.readLine());
            if(a<10)
            {
                //throw new myException("Value should be greater than 10"); //Own exception
                throw new ArithmeticException("Value should be greater than 10"); //It is used to create out own exception with the help of exception class and throw at any specific condition.
            }
        } catch (IOException io)
        {
            System.out.println("IO exception");
        } catch (Exception ae)
        {
            System.out.println(ae);
        } finally { //This will be executed in any case
            br.close();
            System.out.println("Bye");
        }
    }
}

class myException extends Exception
{
    public myException(String message) {
        super(message);
    }
}
