package chapter07.oop2.teacher.com.atguigu05._super;

public class Student extends Person {
    String school;

    // 学号
    int id = 1002;

    public void study() {
        System.out.println("学生学习");
    }

    public void eat() {
        System.out.println("学生多吃饭");
    }

    public void sleep() {
        System.out.println("多生多睡觉");
    }

    public void show() {
        eat();
        this.eat();
        super.eat();
    }

    public void show1() {
        super.doSport();
        this.doSport();
    }

    // 测试同名属性
    public void show2() {
        System.out.println(id);
        System.out.println(super.id);
    }

    public Student() {
        super();
        System.out.println("Student.....");
    }

    public Student(String school, int id) {
        this.school = school;
        this.id = id;
    }
}
