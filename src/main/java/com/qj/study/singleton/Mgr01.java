package com.qj.study.singleton;

/**
 * 饿汉式
 * 类加载到内存之后，就实例化一个单例，jvm保证线程安全
 * 简单实用，推荐使用
 * 缺点：不管用到与否，类加载时就完成实例化
 * Class.forName
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {}

    public static Mgr01 getInstance(){
        return INSTANCE;
    }
}
