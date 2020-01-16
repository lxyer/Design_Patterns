package com.lxyer.patterns.command;

public abstract class Command {
    //每一个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
