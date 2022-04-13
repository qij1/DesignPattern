package com.qj.study.singleton;

/**
 * lazy loading
 * 懒汉式
 * 缺点：虽然达到按需初始化的目的，但线程不安全
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {}

    public static Mgr03 getInstance(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(INSTANCE == null) {
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            // lambda 表达式对只有一个方法的匿名内部类的表示
            new Thread(()-> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
