package chapter08_oop3_teacher.com.atguigu04.block;

public class BlockTest {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.eat();

        System.out.println(Person.info);
    }
}

class Person {
    String name;
    int age;

    static String info = "我是一个人";

    public void eat() {
        System.out.println("人吃饭");
    }

    // 非静态代码块
    {
        System.out.println("非静态代码块1");
        age = 1;
    }

    // 静态代码块
    static {
        System.out.println("静态代码块");
        System.out.println("info = " + info);
    }
}