package com.lxyer.patterns.abstractFactory;

public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人的皮肤是黑色的!");
    }

    @Override
    public void talk() {
        System.out.println("Hei,man!");
    }
}
