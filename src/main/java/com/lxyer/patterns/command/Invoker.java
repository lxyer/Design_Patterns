package com.lxyer.patterns.command;

public class Invoker {
    //创建命令对象
    private Command command;

    //通过函数传递命令参数
    public void setCommand(Command _command) {
        this.command = _command;
    }

    //执行命令
    public void action() {
        command.execute();
    }
}
