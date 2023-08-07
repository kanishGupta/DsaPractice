package org.array;

//Subarray with 0 sum - we will solve this with prfeix sum and hashing

//arr[] = {1, 4, -2, -2, 5, -4, 3}
//
//        Consider all prefix sums, one can notice that there is a subarray with 0 sum when :
//
//        Either a prefix sum repeats
//        Or, prefix sum becomes 0.
//        Prefix sums for above array are: 1, 5, 3, 1, 6, 2, 5

import java.util.HashSet;

public class FindIfSubArrayWithZeroSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, -2, -2, 5, -4, 3};

        if(checkIfSubArrayWithZeroSumExist(arr)){
            System.out.println("--------It contains subarray with 0 sum-------");
        }
        else{
            System.out.println("--------It does not contains subarray with 0 sum-------");
        }
    }

    private static boolean checkIfSubArrayWithZeroSumExist(int[] arr) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
           sum = sum + arr[i];

           if(sum == 0 || arr[i] == 0 || set.contains(arr[i])){
               return true;
           }

           set.add(arr[i]);
        }

        return false;
    }
}
