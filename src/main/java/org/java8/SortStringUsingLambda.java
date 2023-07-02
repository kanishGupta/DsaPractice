package org.java8;

import java.util.Arrays;

public class SortStringUsingLambda {

    public static void main(String[] args) {
// sort string
        String[] stringArray = {"ab", "ef", "cd"};

// using inner class
//        Comparator comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//        Arrays.sort(stringArray, comparator);

//using lambda expression
//        Arrays.sort(stringArray, (String a, String b) -> {
//            return a.compareTo(b);
//        });

//One line format of lambda expression.
        Arrays.sort(stringArray, (a, b) -> a.compareTo(b));

        for (String string: stringArray) {
            System.out.println(string);
        }
    }
}
