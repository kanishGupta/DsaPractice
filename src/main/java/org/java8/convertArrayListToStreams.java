package org.java8;

import java.util.ArrayList;
import java.util.List;

public class convertArrayListToStreams {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ank");
        stringList.add("sam");
        stringList.add("az");
        stringList.add("neh");
        stringList.add("ad");

        // In one line display all records that start with 'a' in stringList
        System.out.println("\n1. Use stream for filtering and display");
        //stringList.stream().reduce()
    }
}
