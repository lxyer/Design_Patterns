package com.lxyer.patterns.proxy;

public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(String _name) {
        this.name = _name;
    }

    @Override
    public void login(String userName, String password) {
        System.out.println("登录名为" + userName + "的用户" + this.name + "登录成功!");
    }

    @Override
    public void killBoss() {
        System.out.println(name + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(name + "升了一级");
    }
}
