package org.bitwise;

//kth bit is set or not.
//1 means set bit and unset bit means 0.

public class Count_Set_Bit {

    public static void main(String[] args) {

        int num = 32;

        count_number_of_set_bits(num);
    }

    private static void count_number_of_set_bits(int num) {
        int count = 0;

        while(num>0){
            if((num & 1) != 0){ // & means and operation between two numbers in binary format
                count++;
            }
            num = num >> 1;
        }

        System.out.println("------Total no of set bits : " + count + " ------------");
    }
}
