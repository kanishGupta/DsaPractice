package org.java8.complexpractice;

import java.util.Arrays;

public class FindSecondLargestNumber {

    public static void main(String[] args) {

        int[] arr = {45,76,23,98,78,21,9};

        int secLargest = Arrays.stream(arr)
                                .sorted()
                                .skip(arr.length-2)
                                .findFirst().getAsInt();

        System.out.println("second largest element : " + secLargest);
    }
}
