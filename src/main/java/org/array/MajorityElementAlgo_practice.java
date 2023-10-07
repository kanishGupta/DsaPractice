package org.array;

public class MajorityElementAlgo_practice {

    public static void main(String[] args)
    {

        int[] arr = {5,7,9,5,2,5,9,5,5};
        int count = 0;

        int majElem = findMajorityElement(arr);
        for(int i : arr){
            if( majElem == i){
                count++;
            }
        }

        if(count > arr.length/2)
        {
            System.out.println("majority element is "+ majElem);
        }
        else{
            System.out.println("no majority element is");
        }
    }

    public static int findMajorityElement(int[] arr){

        int freq = 1;
        int majElem = arr[0];

        for(int i=1; i< arr.length; i++){
            if(majElem == arr[i]){
                freq++;
            }else{
                freq--;
            }
            if(freq < 1){
                majElem = arr[i];
            }

        }

        return majElem;
    }

}