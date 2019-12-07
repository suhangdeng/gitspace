package com.bjsxt.designpattern;



public class StaticInner {
    private static class singletonHolder {
        private static final StaticInner STATIC_INNER=new StaticInner();

    }
    private StaticInner() {
    }

    public static StaticInner getInstance() {
        return singletonHolder.STATIC_INNER;
    }

}
