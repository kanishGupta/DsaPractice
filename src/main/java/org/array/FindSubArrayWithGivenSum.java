package org.array;

//Find Subarray with given sum | Set 1 (Non-negative Numbers) SLIDING WONDOW TECHNIQUE

public class FindSubArrayWithGivenSum {

    public static void main(String[] args) {

        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int givenSum = 23;

        subArrayWithGivenSum(arr, givenSum);
    }

    private static void subArrayWithGivenSum(int[] arr, int givenSum) {

        int lowerBound = 0, currentSum = 0;

        for(int i =0; i<arr.length; i++){

            currentSum = currentSum + arr[i];

            while(currentSum > givenSum){
                currentSum = currentSum - arr[lowerBound];
                lowerBound++;
            }

            if(currentSum == givenSum){
                System.out.print("SubArray with given Sum------ " + lowerBound + " to " + i);
                break;
            }
        }
    }
}
