package com.lxyer.patterns.abstractFactory;

public class FemaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("白种人女性");
    }
}
