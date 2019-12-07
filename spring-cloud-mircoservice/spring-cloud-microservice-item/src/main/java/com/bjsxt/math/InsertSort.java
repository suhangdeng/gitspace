package com.bjsxt.math;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {9, 3, 4, 12, 15, 7, 6};
        insert(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if (arr[j-1]>arr[j]) {
                    int temp = arr[j ];
                    arr[j ] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
