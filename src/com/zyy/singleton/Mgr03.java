package com.zyy.singleton;

/**
 * 懒汉式
 * 虽然达到了按需初始化的目的，但是带来了线程不安全的问题
 */
public class Mgr03 {
    private Mgr03() {
    }
    //final必须初始化
    private static Mgr03 INSTANCE;
    public static Mgr03 getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            //lamda表达式，对于只有一个方法的匿名内部类
            new Thread(()->
                //同一个类的不同对象的hashcode不同
                System.out.println(Mgr03.getINSTANCE().hashCode())
                ).start();
        }
    }
}
