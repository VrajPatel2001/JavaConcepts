package com.CollectionsAndGenerics;

import com.FileHandling.College;

import java.util.*;

import static java.util.Collections.*;

public class DemoCollection {
    public static void main(String[] args) {
//        Collection values = new ArrayList(); //In this one, type of collection is object.
//        /* But collection cannot work at specific index. For that we can use list interface. */
//        values.add(5);
//        values.add("Vraj");
//        values.add(5.2f);
//        values.remove(5.2f);

        List<Integer> valuesWithGen = new ArrayList<>(); //This one is specific Integer type.
        valuesWithGen.add(235);
        valuesWithGen.add(431);
        valuesWithGen.add(658);
        valuesWithGen.add(340);


//        Iterator i = values.iterator();
//        while (i.hasNext())
//        {
//            System.out.println(i.next());
//        }

//        Comparator<Integer> com = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if((o1%10) > (o2%10))
//                return 1;
//
//                return 0;
//            }
//
//        };

        Comparator<Integer> com = new ComInt();
        //valuesWithGen.sort(com);
        sort(valuesWithGen,com);


        for(int o : valuesWithGen)
        {
            System.out.println(o);
        }




        /*
        ArrayList: Increases capacity by 50% //Not ThreadSafe //fast //Recommended
        Vector: Increases capacity by 100% // Threadsafe //slow
        */

        /*
        ArrayList: time-consuming for adding elements between arrayList. For fetching values, ArrayList is faster.
        LinkedList: fast when adding number in between. For fetching values, LinkedList is slower.
        */
    }
}

class ComInt implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1%10,o2%10);
    }
}

//Comparable interface
class Student implements Comparable<Student>
{

    int rollno;
    int marks;

    public Student(int rollno,int marks)
    {
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o) {
        return this.marks>o.marks?-1:0;
    }


}
