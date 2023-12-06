package org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MakeCubeAndFilterGreaterThan50 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        Arrays.stream(arr)
                .map(a -> a*a*a)
                .filter(a -> a>50)
                .forEach(System.out::println);

        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .limit(6)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
