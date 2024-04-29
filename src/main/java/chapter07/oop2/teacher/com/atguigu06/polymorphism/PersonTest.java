package chapter07.oop2.teacher.com.atguigu06.polymorphism;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Man m1 = new Man();

        // 多态性：
        Person p2 = new Man();

        /*
         多态性的应用：虚拟方法的调用
            在多态场景下，调用方法时：
                编译时，认为方法是左边声明的父类类型的方法
                运行时，实际执行的是子类重写父类的方法
         */
        p2.eat();
        p2.walk();
    }
}
