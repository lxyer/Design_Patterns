package com.lxyer.patterns.abstractFactory;

public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黄种人男性");
    }
}
