import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        //        用户输入
        //        scanner
        //        1. 创建一个扫描器
        Scanner sc = new Scanner(System.in);
        // 2.使用扫描器来获取到用户输入的内容
        //        int a = sc.nextInt();
        //
        //        System.out.println(a);
        //
        //        double d = sc.nextDouble();
        //
        //        System.out.println(d);


        String s = sc.nextLine();

        System.out.println(s);
    }
}
