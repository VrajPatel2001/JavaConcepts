package com.ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //Reflection API is used at debugging to access private methods.
        Class c = Class.forName("com.ReflectionAPI.Test");
        Test t = (Test) c.newInstance();

        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(t,null);

        //more methods of class Class.
        System.out.println(c.isInterface()); //check if class file is interface or not
        System.out.println(c.getSuperclass()); //will give super class
    }
}
