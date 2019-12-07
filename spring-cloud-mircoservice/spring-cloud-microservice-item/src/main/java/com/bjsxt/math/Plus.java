package com.bjsxt.math;

public class Plus {
    public static void main(String[] args) {
        System.out.println(Plus.add(100));
    }

    public static int add(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + add(num - 1);
        }
    }
}
