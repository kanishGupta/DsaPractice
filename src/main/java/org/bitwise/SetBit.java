package org.bitwise;

//kth bit is set or not.
//1 means set bit and unset bit means 0.

public class SetBit {

    public static void main(String[] args) {

        int num = 23, kth_bit = 4;

        check_kth_bit_is_set_or_not(num, kth_bit);
    }

    private static void check_kth_bit_is_set_or_not(int num, int kth_bit) {

       if((num >> (kth_bit-1) & 1) == 0){
          System.out.println(kth_bit + "th bit is unset.");
       }
       else{
           System.out.println(kth_bit + "th bit is set.");
       }
    }
}
