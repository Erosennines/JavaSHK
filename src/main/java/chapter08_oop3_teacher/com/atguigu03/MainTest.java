package chapter08_oop3_teacher.com.atguigu03;

public class MainTest {
    public static void main(String[] args) {    // 看做是程序的入口
        String[] arr = new String[]{"AA", "BB", "CC"};
        Main.main(arr);
    }
}

class Main {
    public static void main(String[] args) {    // 看做是普通的静态方法
        System.out.println("Main的main()方法调用");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
