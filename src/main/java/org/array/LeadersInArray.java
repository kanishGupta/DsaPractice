package org.array;

//An element is a leader if it is greater than all the elements to its right.
//we will start from right and keep adding max elements in an empty array then output the same.
//{16,17,4,3,5,2}  --> 17,5,2
public class LeadersInArray {

    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};

        if(arr.length == 0)
            System.out.println("No element in the array");

        if(arr.length == 1)
            System.out.println("leaders in the array : " + arr);

        if(arr.length > 1) {
            System.out.print("leaders in the array : ");
            findLeader(arr);
        }
    }

    private static void findLeader(int[] arr) {

        int maxElementTillNow = Integer.MIN_VALUE;

        for(int i = arr.length-1; i >= 0; i--){

            if (arr[i] > maxElementTillNow){
                maxElementTillNow = arr[i];
                System.out.print(maxElementTillNow + " ");
            }
        }
    }
}
