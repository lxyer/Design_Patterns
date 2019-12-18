package com.lxyer.patterns.common.searchPettyGirl2;

public class Client {
    public static void main(String[] args) {
        //定义一个美女
        IGreatTemperamentGirl xiShi = new PettyGirl("西施");
        Searcher searcher = new Searcher(xiShi);
        searcher.show();
    }
}
