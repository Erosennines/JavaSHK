package chapter08_oop3_teacher.com.atguigu04.block.excr;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getInfo());

        User u2 = new User("Tom", "654321");
        System.out.println(u2.getInfo());

        User1 u3 = new User1();
        System.out.println(u3.getInfo());
    }
}
