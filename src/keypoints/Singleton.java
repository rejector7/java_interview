package keypoints;

import org.junit.Test;

/**
 * 单例模式主要分为两种：饿汉模式 & 懒汉模式
 * 在此基础上，考虑多线程以及效率问题。
 *
 */

public class Singleton {
    @Test
    public void test(){
        Singlenton06.INSTANCE.exampleFunc();
    }
}


/**
 * 饿汉模式：
 * 没有延迟加载：希望能够在真正使用到对象的时候才进行实例化。
 * 没有线程同步问题
 * 静态属性只在第一次类加载时初始化一次
 *
 */
class Singleton01{
    private static Singleton01 INSTANCE = new Singleton01();
    private Singleton01(){}

    public static Singleton01 getInstance(){
        return INSTANCE;
    }
}

/**
 * 懒汉模式：
 * 存在线程同步问题
 * 实现懒加载
 */
class Singleton02{
    private static Singleton02 INSTANCE;
    private Singleton02(){}

    public static Singleton02 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }
}

/**
 * 懒汉模式 + 线程同步
 * 效率问题
 */

class Singleton03{
    private static Singleton03 INSTANCE;
    private Singleton03(){}

    public static synchronized Singleton03 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }
}

/**
 * 懒汉模式 + 线程同步 + 双重检查 + volatile
 * 效率较高
 *
 * 双重检查可能存在问题：
 * 初始化对象可能存在指令重排序。
 * new 对象时，可能先进行内存分配，返回对象引用，再完成初始化。
 * 此时就会遇到对象未完成初始化的情况。
 *
 * volatile会禁止指令重排序。
 */

class Singleton04{
    private static volatile Singleton04 INSTANCE;
    private Singleton04(){}

    public static Singleton04 getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton04.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton04();
                }
            }
        }
        return INSTANCE;
    }
}

/**
 * 使用静态内部类，与饿汉模式相似，同样是利用静态属性只初始化一次
 * 但与饿汉模式不同的是：静态内部类可以实现懒加载。
 */

class Singleton05{
    private Singleton05(){}

    private static class SingletonInstance{
        private static Singleton05 INSTANCE = new Singleton05();
    }

    public Singleton05 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}

/**
 *
 * 使用枚举类型
 */

enum Singlenton06{
    INSTANCE(1, "name");

    Singlenton06(int age, String name) {
    }

    public void exampleFunc(){
        System.out.println("run singleton06 func");
    }
}