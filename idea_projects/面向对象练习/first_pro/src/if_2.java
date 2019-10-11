import java.util.Scanner;

public class if_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = sc.nextDouble();

        if (money>1000){
            System.out.println("洗浴中心");
        }else if(money>500){
            System.out.println("洗脚城也不错");
        }else if(money>200){
            System.out.println("川大姐");
        }else{
            System.out.println("左手右手一个慢动作");
        }

        System.out.println("该练剑练剑");
    }
}
