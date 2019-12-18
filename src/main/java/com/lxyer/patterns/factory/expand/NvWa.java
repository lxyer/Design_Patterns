package com.lxyer.patterns.factory.expand;

import com.lxyer.patterns.factory.Human;

public class NvWa {
    public static void main(String[] args) {
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
    }
}
