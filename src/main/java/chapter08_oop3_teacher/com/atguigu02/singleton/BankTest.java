package chapter08_oop3_teacher.com.atguigu02.singleton;

/**
 * 饿汉式创建单例模式
 */
public class BankTest {
    public static void main(String[] args) {
        Bank instance = Bank.getInstance();
    }
}

class Bank {
    // 类的构造器私有化
    private Bank() {}

    // 在类的内部创建当前类
    private static Bank instance = new Bank();

    // 使用get方法获取当前类的实例，必须声明为类方法
    public static Bank getInstance() {
        return instance;
    }
}
