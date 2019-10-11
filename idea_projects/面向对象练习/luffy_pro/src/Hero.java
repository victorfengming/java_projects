public class Hero {
    String name;
    String skill_q;
    String skill_e;
    String skill_w;
    String skill_r;

    // 构造方法
    public Hero(String name){
        this.name = name;
    }

    public Hero(String name, String skill_q, String skill_w, String skill_e, String skill_r){
        this.skill_e = skill_e;

        this.skill_r = skill_r;
        this.skill_q = skill_q;
        this.skill_w = skill_w;
    }

    public void fight(){
        System.out.println(this.name+"在上阵杀敌");
    }

    public static void main(String[] args) {
        Hero h = new Hero("盖伦", "小保健", "防御", "电风扇", "大宝剑");

        h.fight();
    }

}
