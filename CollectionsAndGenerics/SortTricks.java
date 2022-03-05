package com.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTricks {
    //Comparable and Comparator

    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell",16,800));
        laps.add(new Laptop("Apple",8,1200));
        laps.add(new Laptop("Acer",12,600));

        Comparator<Laptop> com = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if(o1.getPrice() > o2.getPrice())
                {
                    return 1;
                }
                else
                    return -1;
            }
        };


        Collections.sort(laps); //if this class has comparable interface, then it will look for the compareTo method and will sort based on that.
        Collections.sort(laps,com); //This will sort based on the comparator.
        for(Laptop l: laps)
        {
            System.out.println(l);
        }
    }


    /*
    In this example, one may want to sort the custom class arrayList. For that we can use the Comparable interface and also can use Comparator
    interface.
    Comparable interface is implemented in the class declaration and has compareTo method.
    For that, we do not have to call this method. Sort method automatically calls it.
    And if you want to sort again on the other bases (like on bases of other variables), we can use Comparator interface.
    For this, we have to make an object of Comparator of it and should call it in the sort method.
    */
}

