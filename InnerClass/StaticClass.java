package com.InnerClass;

public class StaticClass {

    public static void main(String[] args) {
        //Demo a = new Demo(); Not needed for the B class.
        Demo.B b  = new Demo.B();
        b.show();


    }
}

class Demo{
    int  rollno;
    String sname; //Instance Variable

    static class B{ //For static class, we do not need the instance of the Demo class.
        public void show(){ //Inner class, For this we need the instance of A then we can use it with object of the class A.
            System.out.println("In B");
        }
    }
}
