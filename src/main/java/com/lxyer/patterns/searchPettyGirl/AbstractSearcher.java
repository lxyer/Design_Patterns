package com.lxyer.patterns.searchPettyGirl;

public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;
    public AbstractSearcher(IPettyGirl _pettyGirl){
        this.pettyGirl = _pettyGirl;
    }
    public abstract void show();
}
