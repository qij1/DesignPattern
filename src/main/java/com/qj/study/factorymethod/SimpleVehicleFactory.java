package com.qj.study.factorymethod;

/**
 * 简单工厂拓展性不好
 */
public class SimpleVehicleFactory {
    public Car createFactory() {
        return new Car();
    }

    public Broom createBroomFactory() {
        return new Broom();
    }
}
