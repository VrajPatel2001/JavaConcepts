package com.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {

        //For some resources, we have to close after use, and instead of closing into the finally block, we can declare in the try block and
        //it will be deallocated automatically, and even we do not have to write the catch block.
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
        }
//        catch (IOException io)
//        {
//            System.out.println("IO exception");
//        }
//        finally {
//            br.close();
//        }
    }
}
