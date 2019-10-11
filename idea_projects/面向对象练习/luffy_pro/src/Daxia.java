public class Daxia {
    String name;
    String waihao;
    int age;
    String bangpai;


    //    我们需要两个构造方法

    public Daxia(String name, int age, String bangpai) {
        this.name = name;
        this.age = age;
        this.bangpai = bangpai;
    }

    // 构造方法也是方法,也可以进行重载
    // 可以让我们有更多的方式去创建对象

    public Daxia(String name, int age, String bangpai, String waihao) {
        this(name, age, bangpai);
        // this还可以调用当前类中其他的构造方法
        this.waihao = waihao;
    }
    public static void main(String[] args) {
        // yuebuqun
        Daxia dx1 = new Daxia("岳不群",18,"华山派");

        Daxia dx2 = new Daxia("武松",28,"梁山派","行者");
    }

}

