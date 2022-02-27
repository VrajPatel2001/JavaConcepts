package com.String;

public class StringMutable {
    public static void main(String[] args) {
        //we can use StringBuffer and StringBuilder

        StringBuffer sbf = new StringBuffer("Vraj");  //StringBuffer is safe for use by multiple threads. Whereas StringBuilder is not safe.
        sbf.append(" Patel");
        sbf.replace(0,4,"Smit"); //Here end is excluded
        sbf.delete(1,2); // here end is excluded
        System.out.println(sbf.toString());
    }
}
