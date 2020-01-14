package com.lxyer.patterns.proxy.dynamicProxy;

import org.springframework.aop.BeforeAdvice;

import java.lang.reflect.InvocationHandler;

public class DynamicProxy {
    public static<T> T newProxyInstance(ClassLoader loader, Class<T>[] interfaces, InvocationHandler handler){
        if (true) {
            new BeforeAdvice().exec();
        }
    }
}
