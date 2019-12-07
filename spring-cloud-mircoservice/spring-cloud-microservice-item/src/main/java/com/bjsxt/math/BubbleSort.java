package com.bjsxt.math;



public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={5,3,7,9,12,10,8};
       BubbleSort.bubble(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void bubble(int[]arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
