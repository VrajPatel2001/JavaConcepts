package com.DateAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class demoDate {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now(); //current date
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

       LocalTime t1 =LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(t1);
//        for(String s: ZoneId.getAvailableZoneIds())
//        {
//            System.out.println(s);
//        }
    }
}
