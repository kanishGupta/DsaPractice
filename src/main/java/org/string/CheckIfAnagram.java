package org.string;

//Check whether two Strings are anagram of each other

public class CheckIfAnagram {

    public static void main(String[] args) {
        String str1= "listen";
        String str2= "silent";

        if(checkStringIfItsAnagram(str1, str2))
            System.out.println("String is anagram ----- ");
        else
            System.out.println("String is not anagram ----- ");
    }

    private static boolean checkStringIfItsAnagram(String str1, String str2){
        int[] arr = new int[26];
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i = 0; i<str1.length(); i++){
            arr[str1.charAt(i) - 'a']++;
            arr[str2.charAt(i) - 'a']--;
        }
        for(int j : arr){
            if(arr[j] == 1){
                return false;
            }
        }
        return true;
    }

    private static String checkStringIfItsAnagram(Boolean str1, String str2){
        return null;
    }
}
