package chapter07.oop2.teacher.com.atguigu06.polymorphism;

public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();

        // 向下转型
        Man m1 = (Man) p1;

        System.out.println(m1.isSmoking);

        /*
        向下转型可能会出现问题：类型转换异常
        为了避免该异常，使用instanceof进行判断，避免出现类型转换异常
         */
        Person p2 = new Woman();
//        Man m2 = (Man) p2;
//        m2.earnMoney();
        if (p2 instanceof Man) {
            Man m2 = (Man) p2;
            m2.earnMoney();
        }
    }
}
