package com.CollectionsAndGenerics;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
        Container<Double> obj = new Container<>();
        obj.value = 9.1;
        obj.show();
        obj.demoOfSubClass(new ArrayList<Double> ());
        obj.demoOfSuper(new ArrayList<Number>());

    }
}

class Container<T extends Number> //We can only use Integer, Float, Double with this Number class.
{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println(value.getClass().getName());
    }

    public void demoOfSuper(ArrayList<? super T> obj) //Provided object (?) should be T or super class of T.

    {
        /*
        For example,
        If T is Integer, then obj should be Number or other super class.
        */
    }

    public void demoOfSubClass(ArrayList<? extends T> obj) //Provided object (?) should be T or any subclass of T.
    {
        /*
        For example,
        If T is number, then obj should be Integer or other subclasses.
         */

    }



}

