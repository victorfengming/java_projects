public class Cat extends Animal {

    public static void main(String[] args) {
        Animal ani = new Cat();
        if (ani instanceof Cat) {
            // 判断ani是否是一只猫

            System.out.println("是一只猫,lll");
        } else {
            System.out.println("不是一猫");
        }
    }

}
