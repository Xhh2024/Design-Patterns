package xhh.club.desgin.single.hungry;

/**
 * 单例模式 -> 饿汉模式
 */
public class SingleHungry {
    /**
     * 创建单例模式步骤
     * 1.私有化构造器
     * 2.提供一个对外访问的方法
     */

    /**
     * 类加载的时候对象就被创建了, 保证了唯一性, 不需要考虑多线程情况
     */
    private static SingleHungry instance = new SingleHungry();
    private SingleHungry(){}
    public static SingleHungry getInstance(){
        return instance;
    }


}
