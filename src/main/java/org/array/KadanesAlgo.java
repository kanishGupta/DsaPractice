package org.array;


// Largest Sum Contiguous Subarray (Kadane’s Algorithm)

public class KadanesAlgo {

    public static void main(String[] args) {

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};  //ans is 7 for this example

        calculateLargestSum(arr);
    }

    private static void calculateLargestSum(int[] arr) {

        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for(int i=0; i< arr.length; i++){

            max_ending_here = max_ending_here + arr[i];

            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }

            if(max_ending_here < 0){ // main point, because -ve value will decrease the all over sum
                max_ending_here = 0;
            }
        }

        System.out.println("Largest Sum Contiguous Subarray----- "+ max_so_far);
    }
}
