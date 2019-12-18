package com.lxyer.patterns.factory.expand;

import com.lxyer.patterns.factory.AbstractHumanFactory;
import com.lxyer.patterns.factory.Human;
import com.lxyer.patterns.factory.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory1 {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
