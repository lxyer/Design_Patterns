package com.lxyer.patterns.factory;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
