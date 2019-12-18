package com.lxyer.patterns.singletonPattern;

public class Emperor {
    //系统启动初始化一个皇帝
    private static final Emperor emperor = new Emperor();
    private Emperor(){
    }
    public static Emperor getInstance() {
        return emperor;
    }
    //皇上发话
    public static void say(){
        System.out.println("我是秦始皇!!!");
    }
}
