public class Test {

//    public static void change(int b){
//        b = 20;
//    }

    public static void change(Cat cat) {
        c = new Cat("火猫");
    }

    public static void main(String[] args) {
//        int a = 10;
//        change(a);
//
//        System.out.println(a);
        Cat c = new Cat("蓝猫");
        change(c);
        System.out.println(c.name);
    }

}
