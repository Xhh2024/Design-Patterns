package xhh.club.desgin.single.lazy;

/**
 * 单例模式 -> 懒汉模式 -> 版本3.0
 * @author 谢环环
 * @date 2023/06/12
 */
public class SingleLazyVersionThree {
    /**
     * 创建单例模式的步骤
     * 1.私有化构造函数
     * 2.提供一个对外访问的对象的方法
     */
    private static SingleLazyVersionThree instance;
    private SingleLazyVersionThree(){}

    /**
     * 降低锁的粒度, 双重检查锁定DCL, 在多线程情况下保持高性能
     * 缺点: 不是安全的, 因为new SingleLazy()不是原子操作
     *       1.分配空间给对象
     *       2.在空间内创建对象
     *       3.将对象赋值引用instance
     *       比如: 1 -> 3 -> 2 顺序
     * 涉及到jvm的指令重排
     * @return
     */
    public static SingleLazyVersionThree getInstance(){
        //第一重检查
        if (instance == null){
            synchronized (SingleLazyVersionThree.class){
                //第二重检查
                if (instance == null){
                    return new SingleLazyVersionThree();
                }
            }
        }
        return instance;
    }
}
