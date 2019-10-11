public class Client {

    public static void main(String[] args) {
        Animal c = new Cat();   // 这里是多态性
        c.eat();
        c.dong();
        c.smell();

    }

}
