package com.lxyer.patterns.adaptee;

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("我是具体目标角色的实现方法");
    }
}
