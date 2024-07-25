package chapter08_oop3_teacher.com.atguigu05.field.interview;

public class Test02 {
    static int x, y, z;

    static {
        int x = 5;
        x--;
    }

    static {
        x--;
    }

    public static void method() {
        y = z++ + ++z;
    }

    public static void main(String[] args) {
        System.out.println("x = " + x);
        z--;
        method();
        System.out.println("result = " + (z + y + ++z));
    }
}
