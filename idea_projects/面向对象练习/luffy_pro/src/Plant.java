public class Plant {
    String name;
    int hp;
    int attack;

//    构造方法
    public Plant(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    // 植物打僵尸
    public void fight(JiangShi js){
        System.out.println(this.name+"在打"+js.name);
        // 僵尸掉血
        js.hp -= this.attack;
        System.out.println("僵尸的血量剩余"+js.hp);
    }

}
