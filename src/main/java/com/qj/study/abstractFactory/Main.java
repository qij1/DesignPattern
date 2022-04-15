package com.qj.study.abstractFactory;

public class Main {
    public static void main(String[] args) {
        // 没使用之前，产品族很难扩展
        Car car = new Car();
        car.go();
        AK47 w = new AK47();
        w.shoot();
        Bread b = new Bread();
        b.printName();

        // 使用抽象工厂时候，可以实现任意定制产品一族
        AbstractFactory factory = new MagicFactory();
        Vechicle vechicle = factory.createVechicle();
        Food food = factory.createFood();
        Weapon weapon = factory.createWeapon();


    }
}
