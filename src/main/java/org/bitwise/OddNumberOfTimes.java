package org.bitwise;

//Given an array of positive integers. All numbers occur an even number of times
// except one number which occurs an odd number of times. Find the number
// in O(n) time & constant space.

//Input : arr = {1, 2, 3, 2, 3, 1, 3}
//        Output : 3
//
//        Input : arr = {5, 7, 2, 7, 5, 2, 5}
//        Output : 5

public class OddNumberOfTimes {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 3, 1, 3,3,7};
        int result;

        result = fetch_no_occuring_odd_no_of_times(arr);
        System.out.println("one number which occurs an odd number of times------------ : "+ result);
    }

    private static int fetch_no_occuring_odd_no_of_times(int[] arr) {
        int odd_num = arr[0];
        for(int i=1; i< arr.length; i++){
            odd_num = odd_num ^ arr[i];  // xor operator gives zero when 1^1 or 0^0  and gives 1 1^0 . so here similar numbers will get cancel
        }                                // out each other and odd occuring single number will remain active.
        return odd_num;
    }
}
