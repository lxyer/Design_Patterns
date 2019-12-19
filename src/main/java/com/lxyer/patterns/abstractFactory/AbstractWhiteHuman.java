package com.lxyer.patterns.abstractFactory;

/**
 * @author deepsec
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白种人的皮肤是白色的!");
    }

    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}
