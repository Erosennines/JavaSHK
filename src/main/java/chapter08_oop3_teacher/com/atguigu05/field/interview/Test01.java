package chapter08_oop3_teacher.com.atguigu05.field.interview;

class HelloA {
    public HelloA() {
        System.out.println("HelloA");
    }

    {
        System.out.println("I'm A class");
    }

    static {
        System.out.println("static A");
    }
}

class HelloB extends HelloA {
    public HelloB() {
        System.out.println("HelloB");
    }

    {
        System.out.println("I'm B Class");
    }

    static {
        System.out.println("static B");
    }
}

public class Test01 {
    public static void main(String[] args) {
        new HelloB();
    }
}
