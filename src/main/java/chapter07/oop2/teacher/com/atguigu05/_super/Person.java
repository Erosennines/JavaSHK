package chapter07.oop2.teacher.com.atguigu05._super;

public class Person {
    String name;
    private int age;

    public Person() {
        System.out.println("Person......");
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 身份证
    int id = 1001;

    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public void doSport() {
        System.out.println("人运动");
    }

}
