package chapter08_oop3_teacher.com.atguigu05.field.exer;

class Root {
    static {
        System.out.println("Root的静态初始化块");  // 3
    }

    {
        System.out.println("Root的普通初始化块");
    }

    public Root() {
        System.out.println("Root的无参数构造器");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid的静态初始化块");   // 2
    }

    {
        System.out.println("Mid的普通初始化块");
    }

    public Mid() {
        System.out.println("Mid的无参数构造器");  // 4
    }

    public Mid(String msg) {
        // 通过this调用同一类中重载的构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值为：" + msg);  // 5
    }
}

class Leaf extends Mid {
    static {
        System.out.println("Leaf的静态初始化块");  // 1
    }

    {
        System.out.println("Leaf的普通初始化块");  // 6
    }

    public Leaf() {
        super("尚硅谷");
        System.out.println("Leaf的构造器"); // 7

    }
}

public class LeafTest {
    public static void main(String[] args) {
        new Leaf();
    }
}
