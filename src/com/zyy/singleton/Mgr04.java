package com.zyy.singleton;

/**
 * 通过synchronized解决线程不安全问题，但是效率下降
 */
public class Mgr04 {
    private Mgr04() {

    }
    private static Mgr04 INSTANCE;
    public static synchronized Mgr04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }
}
