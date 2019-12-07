package com.bjsxt.controller;




public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 2, 4};
         bubbleSort(arr);
        System.out.println(arr.length);
        System.out.println(5+2);


    }

    private static void bubbleSort(int[] arr) {
        //冒泡,外层循环遍历次数
        for (int i = 0; i < arr.length; i++) {
           //内层循环，升序(如果前一个数比后一个数大，则交换)
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //内层循环获取一个最大值
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
