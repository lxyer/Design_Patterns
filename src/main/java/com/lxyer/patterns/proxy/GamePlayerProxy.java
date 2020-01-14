package com.lxyer.patterns.proxy;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    //构造器
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    @Override
    public void login(String userName, String password) {
        gamePlayer.login(userName, password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }
}
