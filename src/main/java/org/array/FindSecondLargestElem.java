package org.array;

public class FindSecondLargestElem {

    public static void main(String[] args) {
        int[] arr = {5,7,2,9,4,1,6,8,32,23,47};
        int largest =Integer.MIN_VALUE;
        int secLargest =Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
        }

        System.out.println("second largest element : "+secLargest);
    }
}
