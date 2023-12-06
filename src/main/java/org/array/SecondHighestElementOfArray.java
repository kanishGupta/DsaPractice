package org.array;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SecondHighestElementOfArray {

    public static void main(String args[]){

        List<Integer> list = Arrays.asList(5,8,1,9,4,7,0,3);

        Integer i = list.stream().sorted( (a,b) -> b.compareTo(a)).collect(Collectors.toList()).get(1);
        System.out.println("2nd highest element :" + i + "  " + 1/2);
    }

}