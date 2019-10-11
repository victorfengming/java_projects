import javax.annotation.processing.SupportedSourceVersion;
import java.util.Random;
import java.util.Scanner;

public class Home_work {
    public static void main(String[] args) {

        Random rd = new Random();

        int n = rd.nextInt(100);

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("请输入一个数字:");
            int a = sc.nextInt();
             // 判断
            if (a > n) {
                System.out.println("对不起彩打了");
            } else if (a < n) {
                System.out.println("菜小了");
            } else{
                System.out.println("成了");
                break;

            }
        }


    }
}
