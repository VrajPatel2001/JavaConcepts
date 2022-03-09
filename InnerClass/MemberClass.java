package com.InnerClass;

public class MemberClass {

    public static void main(String[] args) {
        A a = new A();
        A.B b  = a.new B();
        b.show();
    }
}

class A{
    int  rollno;
    String sname; //Instance Variable

    class B{
        public void show(){ //Inner class, For this we need the instance of A then we can use it with object of the class A.
            System.out.println("In B");
        }
    }
}
