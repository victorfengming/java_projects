public class Car {
    String color;
    int speed;
    int seat = 5;

    /*
    构造方法
    在创建对象的时候，自动调用的方法
    语法:
        public 类名(传参){

        }
    */

    public void run() {
        System.out.println(this.color + "颜色的车在跑");
    }

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.color = "绿色";
        c1.speed = 120;

        Car c2 = new Car();
        c2.color = "红色";
        c2.speed = 180;

        c1.run();
        c2.run();
    }
}