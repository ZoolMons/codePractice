package WhiteBoard;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-24:2019
 * Des:单例
 */

/**
 *单例，饿汉式加载（线程安全，调用效率高，但是不能实现延迟加载）---直接new
 */

//静态内部类的方式
/*public class singleton {
    private static class blackInstance{
        private static singleton instace = new singleton();
    }

    private singleton(){
    }

    public static singleton getBlack(){
        return blackInstance.instace;
    }
}*/

//双重校验锁
public class singleton{
    private volatile static singleton singleton;
    private singleton(){};
    public static singleton getInstance(){
        if (singleton == null){
            synchronized (singleton.class){
                if (singleton == null) {
                    singleton = new singleton();
                }
            }
        }
        return singleton;
    }
}