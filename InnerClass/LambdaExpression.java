package com.InnerClass;

public class LambdaExpression {
    public static void main(String[] args) {
        demoInterface d = ()->{
            System.out.println("In Demo Interface");
        };
        d.show();
    }
}

interface demoInterface{ //If interface has only one method, we can use lambda expression to use it, instead of creating the class.
    void show(); //
}
