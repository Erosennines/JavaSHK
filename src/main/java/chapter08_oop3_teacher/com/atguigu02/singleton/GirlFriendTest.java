package chapter08_oop3_teacher.com.atguigu02.singleton;

/**
 * 懒汉式单例模式
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend.getGirlFriend();
    }
}

class GirlFriend {
    // 1. 构造器私有化
    private GirlFriend() {}

    // 2. 声明但不创建对象
    private static GirlFriend girlFriend = null;

    // 3. 通过get方法获取当前类的对象，如果未创建对象，则在方法内部进行创建
    public static GirlFriend getGirlFriend() {
        if (girlFriend == null) {
            girlFriend = new GirlFriend();
        }

        return girlFriend;
    }
}
