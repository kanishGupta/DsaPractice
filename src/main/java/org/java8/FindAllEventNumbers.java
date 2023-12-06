package org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllEventNumbers {

    public static void main(String[] args) {

        int[] arr = {45,76,23,98,78,21,9};

        Arrays.stream(arr)
                .filter( a -> a%2==0 )
                .forEach(System.out::println);
    }
}
