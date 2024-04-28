package chapter07.oop2.teacher.com.atguigu04.override.test2;

import chapter07.oop2.teacher.com.atguigu04.override.test1.Order;

public class OrderTest {
    public void method() {
        Order order = new Order();

        // 不同包非子类只有公共属性和方法才能使用
        order.orderPublic = 1;
        order.methodPublic();
    }
}
