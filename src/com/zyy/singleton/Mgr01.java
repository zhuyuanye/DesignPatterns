package com.zyy.singleton;

/**
 * 饿汉式
 * 类加载到内存后就加载一个单例，JVM保证线程安全（jvm保证每个class只加载到内存一次）
 * 简单实用，推荐使用
 * 唯一缺点，不管用到与否，类装载时就完成实例化
 * Class.forName(“”)
 */
public class Mgr01 {
    //定义静态实例
    private static final Mgr01 INSTANCE = new Mgr01();
    //构造方法设成私有的
    private Mgr01() {
    }
    //只能调getInstance创建
    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
