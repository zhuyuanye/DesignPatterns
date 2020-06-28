package com.zyy.singleton;

public class Mgr06 {
    private Mgr06() {

    }
    private static Mgr06 INSTANCE;
    public static Mgr06 getInstance() {
        if (INSTANCE == null) {
            //双重检查
            synchronized (Mgr06.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }
}
