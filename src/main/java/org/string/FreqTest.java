package org.string;

//frequency of each element in the string.

class FreqTest {

    public static void main(String args[]){

        String str = "abcdsdad"; //a=2, b=1, c=1, d=3, s=1, d=3, a=2, d=1
        findFreq(str.toCharArray());
        System.out.println("no of processors : "+Runtime.getRuntime().availableProcessors());
    }

    public static void findFreq(char[] arr){

        int[] intArray = new int[26];

        for(int i =0; i<arr.length; i++){
            intArray[arr[i] - 'a']++;
        }

        for(int i =0; i<arr.length; i++){
            System.out.println("frquency of " + arr[i] + " : " + intArray[arr[i] - 'a']);
        }

    }

}
