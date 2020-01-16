package com.lxyer.patterns.command;

public class Client {
    public static void main(String[] args) {
        //声明调用者
        Invoker invoker = new Invoker();
        //定义接收者
        Receiver receiver = new ConcreteReciver1();
        //定义命令
        Command command = new ConcreteCommand1(receiver);
        //把命令交给调用者执行
        invoker.setCommand(command);
        invoker.action();
    }
}
