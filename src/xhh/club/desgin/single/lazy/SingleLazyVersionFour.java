package xhh.club.desgin.single.lazy;

/**
 * 单利模式 -> 懒汉模式 版本4.0
 */
public class SingleLazyVersionFour {
    /**
     * 创建单例模式的步骤
     * 1.私有化构造器
     * 2.提供一个对外访问的对象的方法
     */
    private SingleLazyVersionFour(){}

    /**
     * 限制它指令重排
     * @return
     */
    private static volatile SingleLazyVersionFour instance;
    public static SingleLazyVersionFour getInstance(){
        if (instance == null){
            synchronized (SingleLazyVersionFour.class){
                if (instance == null){
                    return new SingleLazyVersionFour();
                }
            }
        }
        return instance;
    }
}
