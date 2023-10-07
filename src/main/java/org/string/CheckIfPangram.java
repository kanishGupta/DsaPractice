package org.string;

//A pangram is a sentence containing every letter in the English Alphabet.

public class CheckIfPangram {

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        if(checkStringIfItsPangram(str))
        System.out.println("String is Pangram ----- ");

        else
            System.out.println("String is not Pangram ----- ");
    }

    private static boolean checkStringIfItsPangram(String str) {
        boolean[] arr = new boolean[26];

        for(char c : str.toCharArray()){

            if( 'a' <= c && c <= 'z'){
                arr[c - 'a'] = true;
            }
            else if( 'A' <= c && c <= 'Z'){
                arr[c - 'A'] = true;
            }
        }
        for(boolean flag : arr){
            if(flag == false){
                return false;
            }
        }
        return true;
    }
}
