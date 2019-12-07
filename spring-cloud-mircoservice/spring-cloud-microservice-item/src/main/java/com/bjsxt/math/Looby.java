package com.bjsxt.math;

import java.math.BigInteger;

public class Looby {
    public static void main(String[] args) {
        System.out.println(Looby.lol(10));
    }

    public static BigInteger lol(int x) {
        if (x == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(x).multiply(lol(x-1));
        }
    }
}
