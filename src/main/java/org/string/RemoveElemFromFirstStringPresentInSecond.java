package org.string;

public class RemoveElemFromFirstStringPresentInSecond {

    public static void main(String args[])
    {
        String string1 = "geeksforgeeks";
        String string2 = "mask";

        int n1 = string1.length();
        int n2 = string2.length();
        System.out.println(
                removeChars(string1, n1, string2.toCharArray(), n2));
    }

    private static String removeChars(String string1, int n1, char[] toCharArray, int n2) {

        int[] freqArray = new int[26];
        String str = "";

        for(char c : toCharArray){
            freqArray[c - 'a']--;
        }

        for(int i =0; i <n1; i++){
            if(freqArray[string1.charAt(i) - 'a'] == 0){
                str += string1.charAt(i);
            }
        }
        return str;
    }
}
