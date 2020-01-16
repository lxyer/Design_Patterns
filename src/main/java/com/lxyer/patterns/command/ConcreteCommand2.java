package com.lxyer.patterns.command;

public class ConcreteCommand2 extends Command {
    //对哪个Receiver类进行命令处理
    private Receiver receiver;

    //通过构造器传递接收者
    public ConcreteCommand2(Receiver _receiver) {
        this.receiver = _receiver;
    }
    //执行命令
    @Override
    public void execute() {
        receiver.doSomething();
    }
}
