package com.lxyer.patterns.proxy.common;

public class Proxy implements Subject {
    //要代理哪个实现类
    private Subject subject = null;

    //默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }

    //通过构造函数传递代理者
    public Proxy(Object... objects) {

    }

    //实现接口中的方法
    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    //预处理
    private void after() {
    }

    //后处理
    private void before() {
    }
}
