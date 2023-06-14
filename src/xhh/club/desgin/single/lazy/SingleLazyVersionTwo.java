package xhh.club.desgin.single.lazy;


/**
 * 单例模式 -> 懒汉模式 版本1.0
 * @author 谢环环
 * @date 2023/06/12
 */
public class SingleLazyVersionTwo {
    /**
     * 创建一个单例模式的步骤
     * 1.私有构造函数
     * 2.提供一个对外访问对象的方法
     */
    private static SingleLazyVersionTwo instance;
    private SingleLazyVersionTwo(){}

    /**
     * 加一个锁, 防止A线程未执行完, B线程抢先执行完, 导致数据不一致
     * 缺点: 在高并发场景下, 性能比较差, 需要一个一个去等待线程释放锁
     * @return
     */
    public static synchronized SingleLazyVersionTwo getInstance(){
        if (instance == null){
            return new SingleLazyVersionTwo();
        }
        return instance;
    }

}
