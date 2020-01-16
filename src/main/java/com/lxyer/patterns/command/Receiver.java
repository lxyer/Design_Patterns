package com.lxyer.patterns.command;

public abstract class Receiver {
    //接收者抽象方法,定义每个接收者都必须要完成的业务
    public abstract void doSomething();
}
