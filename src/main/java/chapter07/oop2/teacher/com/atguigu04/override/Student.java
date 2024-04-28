package chapter07.oop2.teacher.com.atguigu04.override;

public class Student extends Person{
    String school;

    public void study() {
        System.out.println("学生学习");
    }

    @Override
    public void eat() {
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show1() {
        System.out.println("age: " + getAge());
    }

    public void sleep() {
        System.out.println("学生应该多睡觉");
    }
}
