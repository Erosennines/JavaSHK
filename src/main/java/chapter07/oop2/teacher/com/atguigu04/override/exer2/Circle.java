package chapter07.oop2.teacher.com.atguigu04.override.exer2;

public class Circle {
    private double radius;  // 半径

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return 3.14 * Math.pow(radius, 2);
    }
}
