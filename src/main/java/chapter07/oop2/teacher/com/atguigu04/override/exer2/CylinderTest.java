package chapter07.oop2.teacher.com.atguigu04.override.exer2;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.3);
        cylinder.setLength(1.4);

        System.out.println("圆柱的体积为：" + cylinder.findVolume());
        System.out.println("圆柱的面积为：" + cylinder.findArea());
    }
}
