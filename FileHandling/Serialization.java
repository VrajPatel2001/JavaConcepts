package com.FileHandling;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialization means storing the state of an object in a file.
        Save obj = new Save();
        obj.a = 5;

        File f = new File("obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(obj); //this will store the object into the file

        obj.a = 1; //after change the value of obj, it will not affect the value stored in the file.

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save) ois.readObject(); //this will copy the obj into the obj1
        System.out.println(obj1.a);
    }
}

class Save implements Serializable{ //needs to implement this interface to allow serialization.
    int a;
}
