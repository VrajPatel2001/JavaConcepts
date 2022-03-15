package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {
    public static void main(String[] args) {
        //Java 8 has many features and internal iteration is one of them.
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        //to fetch the above values, we can do iteration with for loop and iterator. And also with the enhanced for loop, but these are the external iterations.

        for(int i: values){
            System.out.println(i);
        }

        // forEach accepts the consumer interface (Functional Interface) object, and it has one accept method to declare and accept method receives one object -
        // return by forEach method.
        //For functional interface, we can use lambda expression.

       // values.forEach(i-> System.out.println(i)); //Internal iteration.
        values.forEach(System.out::println); // Method reference (:: shows that this is a method reference.)

        //We can call any method through this method reference. forEach method will return one value from the list and will pass automatically to the method.
        values.forEach(InternalIteration::doubleInt);


        //We can define method in interface by default keyword. And it is same as class method.
    }

       public static void doubleInt(int i) {
           System.out.println(i*2);
        }
}


