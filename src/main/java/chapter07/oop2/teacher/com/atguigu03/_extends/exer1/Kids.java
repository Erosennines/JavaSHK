package chapter07.oop2.teacher.com.atguigu03._extends.exer1;

/**
 * 定义Kids类继承ManKind，并包括：
 *  - 成员变量int yearsOld
 *  - 方法printAge()打印yearOld的值
 */
public class Kids extends ManKind{
    private int yearsOld;

    public Kids() {}

    public Kids(int yearOld) {
        this.yearsOld = yearOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("I am " + yearsOld + " years old");
    }
}
