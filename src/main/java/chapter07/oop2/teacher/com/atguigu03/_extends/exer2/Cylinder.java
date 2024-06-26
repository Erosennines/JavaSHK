package chapter07.oop2.teacher.com.atguigu03._extends.exer2;

public class Cylinder extends Circle{
    private double length;  // 高

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // 求圆柱的体积
    public double findVolume() {
//        return 3.14 * Math.sqrt(getRadius()) * length;
        return findArea() * length;
    }
}
