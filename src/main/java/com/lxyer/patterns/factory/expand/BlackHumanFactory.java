package com.lxyer.patterns.factory.expand;

import com.lxyer.patterns.factory.AbstractHumanFactory;
import com.lxyer.patterns.factory.BlackHuman;
import com.lxyer.patterns.factory.Human;

public class BlackHumanFactory extends AbstractHumanFactory1 {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
