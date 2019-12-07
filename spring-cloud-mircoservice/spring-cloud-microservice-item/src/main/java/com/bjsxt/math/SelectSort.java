package com.bjsxt.math;



public class SelectSort {
    public static void main(String[] args) {
        int[]arr={5,7,9,20,15,14,13,21};
        select(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                //默认第一个数为最小
                int min=arr[i];
                int index=i;
                if (min>arr[j]) {
                    //如果min大于后面的数，则将后面的数设置为最小数
                    min=arr[j];
                    index=j;
                }
                //将第一个数往后挪
                int temp = arr[i];
                arr[i]=min;
                arr[index]=temp;
            }
        }
    }
}
