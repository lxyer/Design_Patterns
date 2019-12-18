package com.lxyer.patterns.factory.expand;

import com.lxyer.patterns.factory.AbstractHumanFactory;
import com.lxyer.patterns.factory.Human;
import com.lxyer.patterns.factory.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory1 {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}