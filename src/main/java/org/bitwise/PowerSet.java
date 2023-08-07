package org.bitwise;

//Power Set: Power set P(S) of a set S is the set of all subsets of S. For example S = {a, b, c} then P(s) = {{}, {a}, {b}, {c}, {a,b}, {a, c}, {b, c}, {a, b, c}}.
//        If S has n elements in it then P(s) will have 2n elements

public class PowerSet {

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c'};

        printPowerSet(arr);
    }

    private static void printPowerSet(char[] arr) {

        int noOfCombinations = (int) Math.pow(2, arr.length);

        for(int count = 0; count<noOfCombinations; count++){
            System.out.print("{");

            for(int bitPos = 0; bitPos< arr.length; bitPos++){
                if( (1 & (count >> bitPos)) > 0 ){
                        System.out.print(arr[bitPos]);
                }
            }

            System.out.print("}");
            System.out.println();
        }
;    }
}
