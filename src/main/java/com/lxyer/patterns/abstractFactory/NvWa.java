package com.lxyer.patterns.abstractFactory;

public class NvWa {
    public static void main(String[] args) {
        //女性生产线
        HumanFactory femaleFactory = new FemaleFactory();
        //男性生产线
        HumanFactory maleFactory = new MaleFactory();
        Human femaleBlackHuman = femaleFactory.createBlackHuman();
        Human maleBlackHuman = maleFactory.createBlackHuman();
        System.out.println("黑人女性相关信息:");
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();
        femaleBlackHuman.getSex();
        System.out.println("黑人男性相关信息:");
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
        maleBlackHuman.getSex();
    }
}
