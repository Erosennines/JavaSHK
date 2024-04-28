package chapter07.oop2.teacher.com.atguigu04.override.test1;

public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtect;
    public int orderPublic;

    private void methodPrivate() {}
    void methodDefault() {}
    protected void methodProtect() {}
    public void methodPublic() {}

    // 类内部
    public void show() {
        orderPrivate = 1;
        orderDefault = 1;
        orderProtect = 1;
        orderPublic = 1;

        methodPrivate();
        methodDefault();
        methodProtect();
        methodPublic();
    }


}
