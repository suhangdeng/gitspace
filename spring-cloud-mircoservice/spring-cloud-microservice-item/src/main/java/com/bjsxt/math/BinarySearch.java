package com.bjsxt.math;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 12, 14, 16, 18, 20};
        System.out.println(BinarySearch.search(arr, 12));
    }

    public static int search(int[] arr, int num) {
        int low=0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid=(low+high)/2;
            if (arr[mid] < num) {
               low=mid+1;
            } else if (arr[mid] > num) {
                high=mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
