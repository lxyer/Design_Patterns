package com.lxyer.patterns.proxy.dynamicProxy;

public class RealSubject implements Subject{
    @Override
    public void doSomething(String str) {
        System.out.println("DO something");
    }
}
