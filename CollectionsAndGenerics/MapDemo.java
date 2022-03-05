package com.CollectionsAndGenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SimpleTimeZone;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(); //HashMap stores the value as it is easy fetch the value.
        //Hashtable is the same as HashMap, but it is synchronized.
        map.put("myName","Vraj");
        map.put("actor","John");
        map.put("ceo","Sundar");
        map.put("actor","Akshay"); //This will not create the new key, but it will change the value of the key.

        Set<String> keys = map.keySet();
        for(String key: keys)
        {
            System.out.println(key + " " + map.get(key));
        }

        //Another method for retrieving
        Set<Map.Entry<String ,String>> values = map.entrySet();
        for(Map.Entry<String,String> e: values)
        {
            System.out.println(e.getKey() + " " + e.getValue());

        }

        //In the HashMap and Hashtable insertion is not fixed. it is not in order.
        // For fixed insertion, we can use LinkedHashMap and for sorted format use TreeHashMap
    }
}
