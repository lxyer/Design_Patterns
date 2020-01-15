package com.lxyer.patterns.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

public class DynamicProxy {
    public static<T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        return (T) DynamicProxy.newProxyInstance(loader, interfaces, handler);
    }
}
