package org.array;
// complexity is log(n)
public class BinarySearchAlgo {

    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 10, 40 };
        int searchElement = 10;
        int position = binarySearch(arr, searchElement);

        if(position == -1){
            System.out.println("No such element.");
        }
        else{
            System.out.println("element is present at : " + position);
        }
    }

    private static int binarySearch(int[] arr, int searchElement) {

        int l=0,mid=0,r=arr.length-1;

        while(l <= r){

        mid = (l+r)/2;

        if(arr[mid] == searchElement){
            return mid;
        }

        else if (arr[mid] < searchElement) {
            l = mid+1;
        }

        else{
            r = mid -1;
        }

        }
        return -1;
    }
}
