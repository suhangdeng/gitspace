package com.bjsxt.controller;

public class Recursive {
    public static int sum(int i) {
        if (i == 1) {
            return 1;
        }

        return i + sum(i - 1);
    }
    public static void main(String[] args) {
        System.out.println("计算结果"+Recursive.sum(100));
  /*      for (int j = 1; j < 20; j++) {
            System.out.println("兔子第"+j+"个月的总数为"+f(j));
        }
    }
    public static int f(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return f(x - 1) + f(x - 2);
        }*/

    }
}
