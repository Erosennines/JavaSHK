package chapter08_oop3_teacher.com.atguigu01._static.exer1;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1);

        Account a2 = new Account("123456", 2000);
        System.out.println(a2);

        Account.setMinBalance(10);
        Account.setInterestRage(0.0123);

        System.out.println("银行存款利率为：" + Account.getInterestRage());
        System.out.println("银行最小存款额为：" + Account.getMinBalance());
    }
}
