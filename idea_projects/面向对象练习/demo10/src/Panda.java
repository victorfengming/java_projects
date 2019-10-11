public class Panda extends Animal implements Valuable, Protectable {
    @Override
    public void eat() {
        System.out.println("熊猫吃竹子");
    }

    @Override
    public void cang() {
        System.out.println("可以藏起来,熊猫藏山里面");
    }

    @Override
    public void getMoney() {
        System.out.println("值钱了,熊猫可以换钱");
    }
}
