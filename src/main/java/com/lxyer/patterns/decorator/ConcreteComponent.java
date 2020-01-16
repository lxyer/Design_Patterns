package com.lxyer.patterns.decorator;

/**
 * 具体构件
 */
public class ConcreteComponent extends Component{
    //具体实现
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
