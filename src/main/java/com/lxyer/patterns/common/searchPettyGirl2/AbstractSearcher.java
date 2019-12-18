package com.lxyer.patterns.common.searchPettyGirl2;

public abstract class AbstractSearcher {
    protected IGreatTemperamentGirl pettyGirl;
    public AbstractSearcher(IGreatTemperamentGirl _pettyGirl){
        this.pettyGirl = _pettyGirl;
    }
    public abstract void show();
}
