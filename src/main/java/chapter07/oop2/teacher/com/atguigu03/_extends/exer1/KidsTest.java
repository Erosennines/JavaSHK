package chapter07.oop2.teacher.com.atguigu03._extends.exer1;

/**
 * 定义类KidsTest，在类的main方法中实例化Kids对象someKid，用该对象访问父类的成员方法及变量
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kids = new Kids();

        kids.setSex(1);
        kids.setSalary(100);
        kids.setYearsOld(12);

        // 来自父类的方法
        kids.manOrWoman();
        kids.employeed();
        kids.printAge();
    }
}
