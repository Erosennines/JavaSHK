package chapter07.oop2.teacher.com.atguigu04.override.test1;

public class OrderTest {
    public void method1() {
        Order order = new Order();

        // 通过对象调用order中声明的属性和方法
        order.orderDefault = 1;
        order.orderProtect = 1;
        order.orderPublic = 1;

        // 同包不能调用私有属性
//        order.orderPrivate = 1;

        order.methodDefault();
        order.methodProtect();
        order.methodPublic();

        // 同包不能使用私有方法

//        order.methodPrivate();
    }
}
