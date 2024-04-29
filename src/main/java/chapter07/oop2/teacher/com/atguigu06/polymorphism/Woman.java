package chapter07.oop2.teacher.com.atguigu06.polymorphism;

public class Woman extends Person{
    boolean isBeauty;

    public void eat() {
        System.out.println("女人吃饭");
    }

    public void walk() {
        System.out.println("女人走路");
    }

    public void goShopping() {
        System.out.println("女人喜欢逛街");
    }
}
