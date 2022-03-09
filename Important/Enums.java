package com.Important;

enum Mobile{ //Enum is converted into class, and it is working as a class and has all the features of the class.
    APPLE(100), SAMSUNG,HTC(20);
    int price;

    Mobile()
    {
        price = 80;
    }

    Mobile(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class Enums {
    public static void main(String[] args) {
        Mobile m = Mobile.APPLE;

        switch (m)
        {
            case APPLE :
                System.out.println("Apple is best");
                break;
            case SAMSUNG : System.out.println("Samsung");
            break;

        }
    }
}
