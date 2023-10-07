package org.string;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "cricket";

        System.out.println("rteversed string " + reverseTheString(str.toCharArray()));
    }

    private static String reverseTheString(char[] toCharArray) {
        int end = toCharArray.length-1;
        char temp;
        for( int i = 0; i<toCharArray.length && i<=end; i++,end--){
            temp = toCharArray[i];
            toCharArray[i] = toCharArray[end];
            toCharArray[end] = temp;
        }
        //return new String(toCharArray);
        //return String.valueOf(toCharArray);
        return  String.copyValueOf(toCharArray);
    }
}
