package com.lxyer.patterns.decorator;

import com.lxyer.patterns.command.ConcreteCommand1;
import com.lxyer.patterns.command.ConcreteReciver1;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecorator1(component);
        //第二次修饰
        component = new ConcreteDecorator2(component);
        //修饰后运行
        component.operate();
    }
}
