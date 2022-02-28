package com.ObjectCloning;

public class ObjectCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Abc a = new Abc(3,7);
        Abc b= (Abc)(a.clone());

        a.j = 0;
        System.out.println(a);
        System.out.println(b);
    }
}

class Abc implements Cloneable{ //Marker interface
    int i;
    int j;

    Abc(int a, int b)
    {
        i  = a;
        j = b;
    }

    public String toString(){

        return "Abc:" + i + " " + j;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}