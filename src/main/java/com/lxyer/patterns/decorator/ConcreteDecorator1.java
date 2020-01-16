package com.lxyer.patterns.decorator;

/**
 * 具体的装饰类
 */
public class ConcreteDecorator1 extends Decorator {
    //定义被修饰者,并把对象传递到父类构造方法中
    public ConcreteDecorator1(Component _component) {
        super(_component);
    }

    private void method1() {
        System.out.println("mothod1 修饰");
    }

    //重写父类的方法
    @Override
    public void operate() {
        method1();
        super.operate();
    }
}
