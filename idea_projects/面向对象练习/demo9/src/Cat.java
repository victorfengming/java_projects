public class Cat extends Animal{

    // 重写父类抽象方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void dong() {
        System.out.println("猫懒洋洋的动");
    }


}
