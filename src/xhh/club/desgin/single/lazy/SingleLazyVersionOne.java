package xhh.club.desgin.single.lazy;

/**
 * 单例子模式 -> 懒汉模式 版本1.0
 * @author 谢环环
 * @date 2023/06/12
 */
public class SingleLazyVersionOne {
    /**
     * 做一个单例模式的步骤:
     *  1.构造函数私有化
     *  2.提供一个对外访问的接口
     */
    private static SingleLazyVersionOne instance;
    private SingleLazyVersionOne(){}

    /**
     * 最简单的单例模式, 存在哪些问题
     * 1.线程不安全
     * 2.可能会出现对象覆盖的情况, 可以画线程图
     * 3. A,B同时今入if代码块中, A可能就被B覆盖了
     * @return
     */
    public static SingleLazyVersionOne getInstance(){
        if (instance == null){
            return new SingleLazyVersionOne();
        }
        return instance;
    }
}
