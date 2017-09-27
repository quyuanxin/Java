public class Singleton {
    //饿汉式
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
class Singleton2{
    //懒汉式 线程安全
    private static Singleton2 instance;

    private  static Singleton2 getInstance(){
        if(instance==null){
            instance = new Singleton2();
        }
        return instance;
    }

}