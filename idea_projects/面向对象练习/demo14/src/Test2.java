import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123";

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名:");
        String uname = sc.nextLine();

        System.out.println("清输入密码:");
        String upwd = sc.nextLine();

//        判断用户名和密码是否OK
        if (uname.equals(username) && upwd.equals(password)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
