package com.FileHandling;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationWithXML {
    public static void main(String[] args) throws FileNotFoundException {
        //XML is one of the most efficient data storage
        // we can also share the file over the network and also can deserialization.

        Student st1 = new Student();
        st1.setRollno(101);
        st1.setSname("Vraj");

        Student st2 = new Student();
        st2.setRollno(102);
        st2.setSname("Smit");

        List<Student> s = new ArrayList<>();
        s.add(st1);
        s.add(st2);

        College c = new College();
        c.setStudents(s);
        // In this xml serialization, we can see the actual data in the file, whereas normal serialization will store it with encryption.
        XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
        x.writeObject(c);
        x.close();
    }
}


