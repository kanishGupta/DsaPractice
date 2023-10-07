package org.array;
//If in an array an element is present more than n/2 no of times then it is called majority element.
//ex {2,3,2,4,5,2,2} --> 2  also moore voting algo.
public class MajorityElementAlgo {

    public static void main(String[] args) {
        int majorityCount = 0;
        int arr[] = {5,7,9,5,2,5,9,5,5};
        MajorityElementAlgo majorityElementAlgo = new MajorityElementAlgo();

        int majorityCandidate = majorityElementAlgo.findMajorityElement(arr);

        for(int arrayElement : arr){
            if(arrayElement == majorityCandidate){
                majorityCount++;
            }
        }

        if(majorityCount > arr.length/2){
            System.out.println("majority element is : " + majorityCandidate);
        }
        else{
            System.out.println("There is no majority element.");
        }
    }

    private int findMajorityElement(int[] arr) {

        int majorElem = arr[0], count = 1;

        for(int i = 1; i < arr.length; i++){
            if(majorElem == arr[i]){
                count++;
            }
            else{
                count--;
            }

            if(count<1){
                majorElem = arr[i];
            }
        }

        return majorElem;
    }
}
