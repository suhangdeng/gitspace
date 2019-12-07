package com.bjsxt.controller;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 2, 4};
        //插入排序
        insert(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void insert(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            //外层循环，从第二个开始比较
            for (int j = i+1; j>0 ; j--) {
                //内层循环，与前面排好序的数据比较，如果后面的数据小于前面的则交换
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else {
                    break;
                }
            }
        }
    }
}
