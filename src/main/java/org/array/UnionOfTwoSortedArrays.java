package org.array;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        System.out.println("Union of two arrays: " + unionOfArrays(arr1, arr2));
    }

    private static List<Integer>  unionOfArrays(int[] arr1, int[] arr2) {

        List<Integer> list = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        //int[] arr = new int[n1+n2];
        int i=0;
        int j=0;

        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(list.size()==0 ||
                        list.get(list.size()-1) != arr1[i] ){
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if(list.size()==0 ||
                        list.get(list.size()-1) != arr2[j] ){
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n1){
                if(list.size()==0  ||
                        list.get(list.size()-1) != arr1[i]  ){
                    list.add(arr1[i]);
                }
                i++;
        }

        while(j < n2){
            if(list.size()==0  ||
                    list.get(list.size()-1) != arr2[j]  ){
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }
}
