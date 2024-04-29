package chapter07.oop2.teacher.com.atguigu06.polymorphism;

public class Man extends Person{
    boolean isSmoking;

    @Override
    public void eat() {
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk() {
        System.out.println("男人笔挺的走路");
    }

    public void earnMoney() {
        System.out.println("男人挣钱养家");
    }
}
