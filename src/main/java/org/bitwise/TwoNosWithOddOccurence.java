package org.bitwise;

//Find the two numbers with odd occurrences in an unsorted array

//Input: {12, 23, 34, 12, 12, 23, 12, 45}
//Output: 34 and 45
//
//Input: {4, 4, 100, 5000, 4, 4, 4, 4, 100, 100}
//Output: 100 and 5000

//Here we will find the xor of all the numbers, once we will get the xor of last two numbers which are different then we need to find out
//any set bit(we are finding right most set bit) out of the xor of these two left_out numbers because of that set bit these nos are different and
//their xor is giving 1 instaed of 0
//for ex 5 and 1 their xor is 4
//   5    101
//   1 ^  001
//        100 their 3rd bit from right is set, for all the numbers there is a posibility
//          that their 3rd bit is either 1 or 0. so their & with 100 will give either 0 or 1, this is how we will able to segregate
//          nos in two groups. then their xor will give single odd occuring no from each grp.
public class TwoNosWithOddOccurence {

    public static void main(String[] args) {

        int[] arr = {4,2,4,5,2,3,3,1};
        int xorOfAllNum, rightMostBit, leftSetOddOccurNo = 0, rightSetOddOccurNo = 0;

        if(arr.length==2){
            System.out.println("two numbers with odd occurrences in an unsorted array------" + arr);
        }

        else{
            xorOfAllNum = findXorOfAllNumbers(arr);
            rightMostBit = findRightMostSetBit(xorOfAllNum);

            for(int i = 0; i < arr.length; i++ ){

                if( (rightMostBit & arr[i]) == 0) {
                    leftSetOddOccurNo = leftSetOddOccurNo ^ arr[i];
                }
                else{
                    rightSetOddOccurNo = rightSetOddOccurNo ^ arr[i];
                }
            }

            System.out.println("********----two occuring numbers*******------" + leftSetOddOccurNo + " & " + rightSetOddOccurNo);
        }
    }

    private static int findRightMostSetBit(int xorOfAllNum) {
        int  count=0;
        while(xorOfAllNum >0){
            if( (xorOfAllNum & 1) == 0 ){  // when xorOfAllNum & 1 comes out to be 1 then we can say we got out right most set bit.
                xorOfAllNum = xorOfAllNum >> 1;
                count++;
            }
            else{
                return (int) Math.pow(2,count);
            }
        }
        return (int) Math.pow(2,count);
    }

    private static int findXorOfAllNumbers(int[] arr) {
        int xor = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
