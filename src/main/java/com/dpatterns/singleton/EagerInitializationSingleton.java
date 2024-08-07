package com.dpatterns.singleton;

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();
    private EagerInitializationSingleton() {

    }
    public static EagerInitializationSingleton getInstance() {
        return instance;
    }
    public void singletonMethod() {
        System.out.println("EagerInitializationSingleton singleton method");
    }
}
