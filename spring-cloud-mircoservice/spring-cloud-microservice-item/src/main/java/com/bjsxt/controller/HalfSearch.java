package com.bjsxt.controller;

public class HalfSearch {
    //二分查找算法
    public static int binarySearch(int[] arr, int num) {
           int low=0;
           int high=arr.length-1;
        while (low <= high) {
            int mid=(high+low)/2;
            if (arr[mid] < num) {
                low = mid + 1;
            } else if (arr[mid] > num) {
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 23, 25, 27, 29, 40};
        int i = HalfSearch.binarySearch(arr, 27);
        System.out.println(i);
    }
}
