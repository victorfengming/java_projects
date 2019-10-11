public class Client {
    public static void main(String[] args) {
        // 创建植物和僵尸
        Plant zw = new Plant("豌豆",1000,5);

        JiangShi js = new JiangShi("铁桶僵尸", 800, 20);

        zw.fight(js);

    }
}
