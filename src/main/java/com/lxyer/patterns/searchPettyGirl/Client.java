package com.lxyer.patterns.searchPettyGirl;

public class Client {
    public static void main(String[] args) {
        //定义一个美女
        IPettyGirl xiShi = new PettyGirl("西施");
        Searcher searcher = new Searcher(xiShi);
        searcher.show();
    }
}
