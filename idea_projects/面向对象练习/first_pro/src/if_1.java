import java.util.Scanner;

public class if_1 {
    public static void main(String[] args) {
        System.out.println("请告诉我的兜里的钱");
        Scanner sc = new Scanner(System.in);

        // 获取到钱
        double money = sc.nextDouble();

        // 洗浴要用的钱
        double price = 1000;

        if (money > price){
            System.out.println("可以洗浴啦,哈哈哈!");
        }else{
            System.out.println("掰扯");
        }
        System.out.println("练剑");
    }
}
