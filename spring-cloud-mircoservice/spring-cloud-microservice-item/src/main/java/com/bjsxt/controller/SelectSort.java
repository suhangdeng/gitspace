package com.bjsxt.controller;

import com.bjsxt.designpattern.Singleton;

import java.util.Arrays;
import java.util.Collections;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {4, 9, 12, 15, 10, 8, 7};
        SelectSort.selectSort(arr);
        Collections.sort(Arrays.asList(arr.toString()));
    }

    private static void selectSort(int[] arr) {
        //选择
        for (int i = 0; i < arr.length; i++) {
            //默认第一个是最小的。
            int min = arr[i];
            //记录最小的下标
            int index = i;
            //通过与后面的数据比较得出，最小值和下标
            for (int j = i+1; j <arr.length; j++) {
                if (min > arr[j]) {
                    //如果最小值大于比较的值，则将该比较值作为最小值
                    min = arr[j];
                    index = j;
                }
            }
            //Todo:然后将最小值与本次循环的开始值进行交换
            int temp = arr[i];
            arr[i]=min;
            arr[index] = temp;
        }
    }
}
