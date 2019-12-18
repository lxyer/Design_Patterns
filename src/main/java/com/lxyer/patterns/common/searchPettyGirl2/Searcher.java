package com.lxyer.patterns.common.searchPettyGirl2;

public class Searcher extends AbstractSearcher {
    public Searcher(IGreatTemperamentGirl _pettyGirl) {
        super(_pettyGirl);
    }

    @Override
    public void show() {
        System.out.println("美女信息如下:");
        super.pettyGirl.greatTemperament();
    }
}
