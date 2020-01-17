package com.lxyer.patterns.strategy;

/**
 * 封装角色
 */
public class Context {
    //抽象策略
    private Strategy strategy = null;

    //构造函数设置具体策略
    public Context(Strategy _strategy) {
        this.strategy = _strategy;
    }

    //封装后执行策略方法
    public void doAnything() {
        strategy.doSomething();
    }
}
