public class Test {
    {
        System.out.println("这里是通用构造器");
    }

    static {
        System.out.println("静态构造器");
    }

    public Test(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        new Test();
    }
}
