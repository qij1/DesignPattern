package com.qj.study.singleton;

/**
 * lazy loading
 * 懒汉式
 * 仍然存在线程不安全问题
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05() {}

    public static Mgr05 getInstance(){
        if(INSTANCE == null) {
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            // lambda 表达式对只有一个方法的匿名内部类的表示
            new Thread(()-> {
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
