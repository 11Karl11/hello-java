package test.java.designMode.singleton;

/**
 * @author karl xie
 * Created on 2020-03-11 20:53
 */

public class User {
    //私有化构造函数
    private User() {
    }

    //定义一个静态枚举类
    enum SingletonEnum {
        //创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private User user;

        //私有化枚举的构造函数
        SingletonEnum() {
            user = new User();
        }

        public User getInstance() {
            return user;
        }
    }

    //对外暴露一个获取User对象的静态方法
    public static User getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(User.getInstance());
        System.out.println(User.getInstance());
        System.out.println(User.getInstance() == User.getInstance());
    }
}