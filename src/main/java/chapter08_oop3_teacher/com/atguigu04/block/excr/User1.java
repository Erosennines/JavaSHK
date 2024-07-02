package chapter08_oop3_teacher.com.atguigu04.block.excr;

public class User1 {
    private String username;
    private String password;
    private long registrationTime;  // 注册时间

    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
    }

    public User1() {
        username = System.currentTimeMillis() + "";
        password = "123456";
    }

    public User1(String username, String password) {
//        System.out.println("新用户注册");
//        registrationTime = System.currentTimeMillis();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getInfo() {
        return "用户名" + username + "，密码：" + password + "，注册时间" + registrationTime;
    }
}
