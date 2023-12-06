package org.array;

public class FindTheNumberThatAppearsOnce {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};

        System.out.println("the number that appears once : " + numberWithSingleAppearance(arr));
    }

    private static int numberWithSingleAppearance(int[] arr) {

        int num = arr[0];

        for(int i=1; i< arr.length; i++){
            num = num^arr[i];
        }
        return num;
    }
}

