package com.lxyer.patterns.proxy;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);
        System.out.println("开始时间:" + System.currentTimeMillis());
        proxy.login("lxyer", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束");
    }
}
