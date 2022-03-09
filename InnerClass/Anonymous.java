package com.InnerClass;

public class Anonymous {

    public static void main(String[] args) {

        B b = new B();
        b.show();

       B obj = new B(){ //Instead of creating the Class C for extra feature, we can use the Anonymous class.
           public void show(){
               System.out.println("In Anonymous");
           }
       };
       obj.show();

    }
}

class B{
    public void show(){ //Inner class, For this we need the instance of A then we can use it with object of the class A.
        System.out.println("In B");
    }
}

class C extends B{
    @Override
    public void show(){
        System.out.println("In C");
    }
}