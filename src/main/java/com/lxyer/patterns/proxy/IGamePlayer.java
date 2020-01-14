package com.lxyer.patterns.proxy;

public interface IGamePlayer {
    //登录
    public void login(String userName,String password);
    //杀怪
    public void killBoss();
    //升级
    public void upgrade();
}
