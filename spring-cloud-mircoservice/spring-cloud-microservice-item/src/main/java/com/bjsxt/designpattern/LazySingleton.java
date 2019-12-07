package com.bjsxt.designpattern;

public class LazySingleton {
    private static final LazySingleton LAZY_SINGLETON=new LazySingleton();

    private LazySingleton() {
    }

    public static LazySingleton getLazySingleton() {
        return LAZY_SINGLETON;
    }
}
