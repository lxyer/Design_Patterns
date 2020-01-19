package com.lxyer.patterns.adaptee;

/**
 * 适配器角色
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.doSomething();
    }
}
