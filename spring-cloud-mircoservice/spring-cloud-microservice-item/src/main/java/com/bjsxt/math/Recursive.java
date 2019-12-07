package com.bjsxt.math;

public class Recursive {
    public static void main(String[] args) {
        System.out.println(Recursive.f(10));
    }

    public static int f(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return f(x - 1) + f(x - 2);
        }
    }
}
