package org.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class convertArrayListToStreams {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ank");
        stringList.add("sam");
        stringList.add("neh");
        stringList.add("ad");

        Stream<String> stream = stringList.stream();

        //normal sort and ap
        stream.sorted().map( s -> s + " kanishk").forEach(System.out::println);
//reverse sort
        stream.sorted( (a,b) -> b.compareTo(a)).map( s -> s + " kanishk").forEach(System.out::println);
    }
}
