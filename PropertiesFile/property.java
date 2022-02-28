package com.PropertiesFile;

import java.io.*;
import java.util.Properties;

public class property {

    public static void main(String[] args) throws IOException {
        Properties p = new Properties(); //This store the key and value type of data.

        OutputStream os = new FileOutputStream("dataConfig.properties"); //OutputStream is an abstract class and have to use file output stream to create object


        p.setProperty("url","localhost:3306/myDb");
        p.setProperty("uname","Vraj");
        p.setProperty("pass","0000");

        p.store(os,null); //this will store the properties' data in a file.

        InputStream is = new FileInputStream("dataConfig.properties");
        p.load(is); //ths retrieves the data rom the file and store it into properties object.

        System.out.println(p.getProperty("uname"));

        System.out.println(p.getProperty("url"));
        p.list(System.out);


    }
}
