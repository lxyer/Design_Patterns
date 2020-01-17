package com.lxyer.patterns.strategy;

/**
 * 具体策略角色
 */
public class ConcreteStrategy2 implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算方法");
    }
}
