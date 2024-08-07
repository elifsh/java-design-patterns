package com.dpatterns.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton  staticBlockSingleton;
    static {
        try {
            staticBlockSingleton = new StaticBlockSingleton();
        }catch (Exception e){
        }
    }
    private StaticBlockSingleton() {
    }
    public static StaticBlockSingleton getStaticBlockSingleton() {
        return staticBlockSingleton;
    }

    public void StaticBlockSingletonTest() {
        System.out.println("static block singleton test");
    }
}
