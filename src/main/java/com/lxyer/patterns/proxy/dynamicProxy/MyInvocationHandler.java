package com.lxyer.patterns.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理Handler类
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target;
//通过构造函数传进来一个对象
    public MyInvocationHandler(Object _obj) {
        this.target = _obj;
    }
//代理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法,所有通过动态代理实现的方法全部通过invoke方法调用
        return method.invoke(target,args);
    }
}
