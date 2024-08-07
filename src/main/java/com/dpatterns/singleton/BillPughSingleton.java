package com.dpatterns.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){

    }

    public static BillPughSingleton getBillPughSingleton() {
        return SingletonHelper.INSTANCE ;
    }
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public void BillPughSingletonTest(){
        System.out.println("Bill Pugh Singleton Test");
    }
}
