package com.dpatterns.singleton;

public class Run {
    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance().singletonMethod();
        StaticBlockSingleton.getStaticBlockSingleton().StaticBlockSingletonTest();
        LazySingleton.getLazySingleton().lazySingletonTest();
        ThreadSafeSingleton.getThreadSafeSingleton().ThreadSafesingletonTest();
        BillPughSingleton.getBillPughSingleton().BillPughSingletonTest();
    }
}
