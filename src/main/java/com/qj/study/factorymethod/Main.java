package com.qj.study.factorymethod;

public class Main {
    public static void main(String[] args) {
        Moveable car = new CarFactory().create();
        car.go();
    }
}
