package chapter07.oop2.teacher.com.atguigu05._super.exer;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount acc = new CheckAccount(1122, 20000, 0.045, 5000);

        acc.withdraw(5000);

        System.out.println("您的账户余额为：" + acc.getBalance());
        System.out.println("您的可透支余额为：" + acc.getOverdraft());

        acc.withdraw(18000);

        System.out.println("您的账户余额为：" + acc.getBalance());
        System.out.println("您的可透支余额为：" + acc.getOverdraft());

        acc.withdraw(3000);

        System.out.println("您的账户余额为：" + acc.getBalance());
        System.out.println("您的可透支余额为：" + acc.getOverdraft());
    }
}
