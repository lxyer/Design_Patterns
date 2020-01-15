package com.lxyer.patterns.proxy.dynamicProxy;

public class BeforeAdvice implements IAdvice{
    @Override
    public void exec() {
        System.out.println("前置通知");
    }
}
