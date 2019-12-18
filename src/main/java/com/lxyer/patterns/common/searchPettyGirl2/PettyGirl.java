package com.lxyer.patterns.common.searchPettyGirl2;

public class PettyGirl implements IGoodLookingGirl,IGreatTemperamentGirl {
    private String name;
    public PettyGirl(String _name){
        this.name = _name;
    }
    @Override
    public void goodLooking() {
        System.out.println(this.name + ":脸蛋很漂亮!");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + ":身材很好!");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + ":气质很好!");
    }
}
