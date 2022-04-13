package com.qj.study.singleton;

/**
 * lazy loading
 * 懒汉式
 * 加 synchronized 并且双重检验加锁，解决效率低问题
 */
public class Mgr06 {
    private static volatile Mgr06 INSTANCE;  //volatile 要加上： JIT编译时 指令重排

    private Mgr06() {}

    public static Mgr06 getInstance(){
        if(INSTANCE == null) {
            // 双重检查
            synchronized (Mgr06.class) {
                if(INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            // lambda 表达式对只有一个方法的匿名内部类的表示
            new Thread(()-> {
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
