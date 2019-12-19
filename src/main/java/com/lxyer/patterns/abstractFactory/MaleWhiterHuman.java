package com.lxyer.patterns.abstractFactory;

public class MaleWhiterHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("白种人男性");
    }
}
