package com.lxyer.patterns.model;

public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final public  void run(){
        this.start();
        this.engineBoom();
        //判断是否需要响
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    };
    //钩子方法
    protected boolean isAlarm(){
        return true;
    }
}
