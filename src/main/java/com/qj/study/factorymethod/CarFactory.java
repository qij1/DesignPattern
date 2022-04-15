package com.qj.study.factorymethod;

/**
 * 工厂方法
 */
public class CarFactory {
    public Moveable create() {
        System.out.println("a car created");
        return new Car();
    }
}
