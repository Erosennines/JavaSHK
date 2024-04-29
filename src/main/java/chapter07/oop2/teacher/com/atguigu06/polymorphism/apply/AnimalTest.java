package chapter07.oop2.teacher.com.atguigu06.polymorphism.apply;

public class AnimalTest extends Animal{
    public void adopt(Animal animal) {
        animal.eat();
        animal.jump();
    }

//    public void adopt(Dog dog) {
//        dog.eat();
//        dog.jump();
//    }
//
//    public void adopt(Cat cat) {
//        cat.eat();
//        cat.jump();
//    }

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.adopt(new Dog());
    }
}

class Animal {
    public void eat() {
        System.out.println("动物进食");
    }

    public void jump() {
        System.out.println("动物跳");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void jump() {
        System.out.println("狗急跳墙");
    }

    public void watchDoor() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫跳");
    }

    public void catchMouse() {
        System.out.println("狗看家");
    }
}