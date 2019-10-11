public class JiangShi {
    String name;
    int hp;
    int attack;

//    构造方法
    public JiangShi(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void eat(Plant zw){
        System.out.println(this.name+"在吃"+zw.name+"植物");
        zw.hp -= this.attack;
        System.out.println("植物还有学量"+zw.hp);
    }
}
