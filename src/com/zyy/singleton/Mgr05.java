package com.zyy.singleton;

public class Mgr05 {
    private Mgr05() {

    }
    private static Mgr05 INSTANCE;
    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            //试图通过减小同步代码块的方式提高效率,不可行
            synchronized (Mgr05.class) {
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }
}
