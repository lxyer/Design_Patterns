package com.lxyer.patterns.common.searchPettyGirl1;

public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;
    public AbstractSearcher(IPettyGirl _pettyGirl){
        this.pettyGirl = _pettyGirl;
    }
    public abstract void show();
}
