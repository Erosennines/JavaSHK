package chapter07.oop2.teacher.com.atguigu04.override.test2;

import chapter07.oop2.teacher.com.atguigu04.override.test1.Order;

public class SubOrder extends Order {
    public void method() {
        orderProtect = 1;
        orderPublic = 1;

        // 不同包且不是子类，私有、默认属性和方法都不可用
//        orderPrivate = 1;
//        orderDefault = 1;
    }
}
