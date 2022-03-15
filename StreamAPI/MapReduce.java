package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapReduce {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(18,22,35,49,12,50,60,46,76);

        //int sum = widgets.stream()
        //                      .filter(w -> w.getColor() == RED)
        //                      .mapToInt(w -> w.getWeight())
        //                      .sum();

        //in this example, widgets is a Collection<Widget>.
        // We create a stream of Widget objects via Collection.stream(), filter it to produce a stream containing only the red widgets,
        // and then transform it into a stream of int values representing the weight of each red widget.
        // Then this stream is summed to produce a total weight.


//        Function<Integer,Integer> f = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer i) {
//                return i*2;
//            }
//        };
//        Stream s = values.stream(); //This will create a stream of a List.
//        Stream s1 = s.map(f); // in stream s1, map function will perform f function on every element of list.
//
//        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer + integer2;
//            }
//        };
//
//        Integer result = (Integer) s1.reduce(0,b);


        //In one line, we can achieve above lines.
        System.out.println(values.stream()
                                 .map(i->i*2)
                                 .reduce(0,(c,e)->c+e));

        //Filter
        System.out.println(values.stream().filter(i->i%5==0).reduce(0,(c,e)->c+e));

        //we can also find first element by findFirst method.
        System.out.println(values.stream()
                                .filter(i->i%5==0) //map, filter methods are lazy methods, and they do not finish methods until further requirements.
                                .findFirst()
                                .orElse(0)); // findFirst is a terminal method. And will finish it immediately.

    }
}
