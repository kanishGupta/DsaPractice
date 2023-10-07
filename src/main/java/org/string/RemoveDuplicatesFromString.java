package org.string;

public class RemoveDuplicatesFromString {

    public static void main(String[] args)
    {
        char str[] = "geeksforgeeksGMNMG".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }

    private static String removeDuplicate(char[] str, int n) {

        int[] countArr = new int[256];
        String noDupStr = "";

        for(int i =0; i<n; i++){
            ++countArr[str[i]];
            if(countArr[str[i]] == 1){
                noDupStr = noDupStr + str[i];
            }
        }

        return noDupStr;
    }
}
