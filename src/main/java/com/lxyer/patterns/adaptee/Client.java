package com.lxyer.patterns.adaptee;


public class Client {
    public static void main(String[] args) {
        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //现在增加了适配器⻆色后的业务逻辑
        Target target1 = new Adapter();
        target1.request();
    }
}
