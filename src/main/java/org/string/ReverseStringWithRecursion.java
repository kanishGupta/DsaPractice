package org.string;

public class ReverseStringWithRecursion {

    public static void main(String[] args) {
        String str = "cricket";
        reverseRecursion(0,str.length()-1, str.toCharArray());
        //System.out.println(str);
    }

    private static void reverseRecursion(int start, int end, char[] toCharArray) {
        char temp;
        if(start<=end){
            temp = toCharArray[start];
            toCharArray[start] = toCharArray[end];
            toCharArray[end] = temp;
            start++;
            end--;
            reverseRecursion(start,end,toCharArray);
        }
        else{
            System.out.println(String.valueOf(toCharArray));
        }
    }
}
