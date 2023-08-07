package org.bitwise;

//Program to find whether a given number is power of 2

//Input : n = 4
//        Output : Yes
//        Explanation: 22 = 4
//
//        Input : n = 32
//        Output : Yes
//        Explanation: 25 = 32

public class Power_of_2 {

    public static void main(String[] args) {

        int num = 1;

        is_given_number_power_of_2(num);
    }

    private static void is_given_number_power_of_2(int num) {

        System.out.println("Given no is power of 2 : " +
                ( num!=0 && (num & (num-1) ) == 0 ) );
    }
}
