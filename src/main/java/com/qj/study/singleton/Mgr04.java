package com.qj.study.singleton;

/**
 * lazy loading
 * 懒汉式
 * 加 synchronized 解决了线程不安全问题，但效率下降
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {}

    public static synchronized Mgr04 getInstance(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(INSTANCE == null) {
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            // lambda 表达式对只有一个方法的匿名内部类的表示
            new Thread(()-> {
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
