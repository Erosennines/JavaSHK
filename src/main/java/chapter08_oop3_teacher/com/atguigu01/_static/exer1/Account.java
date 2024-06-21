package chapter08_oop3_teacher.com.atguigu01._static.exer1;

public class Account {
    private int id; // 账号
    private String password;    // 密码
    private double balance; // 余额
    private static double interestRage; //利率
    private static double minBalance = 1.0;   // 最小利率

    private static int init = 1001; // 用于自动生成id

    public Account() {
        this.id = init;
        init++;

        password = "000000";
    }

    public Account(String password, double balance) {
        this.password = password;
        this.balance = balance;

        this.id = init;
        init++;
    }


    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    public static double getInterestRage() {
        return interestRage;
    }

    public static void setInterestRage(double interestRage) {
        Account.interestRage = interestRage;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
