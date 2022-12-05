package com.zzg.mode.singleton;

/**
 * 饿汉式
 * 类加载器加载时就会实例化一个单例，jvm保证线程安全
 * 优点：简单实用，推荐使用
 * 缺点：无论是否使用都会有一个实例
 * 单例模式
 *
 * @author 张中贵
 */
public class Mgr01 {
    public static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {
    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public void test() {
        System.out.println("这是一个饿汉形式的单例模式");
    }
}
