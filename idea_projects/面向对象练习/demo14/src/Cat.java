public class Cat {
    String name;
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public boolean equals(Cat c) {
        if (this.color == c.color) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("小花", "红色");
        Cat c2 = new Cat("小花", "红色");

        System.out.println(c1 == c2);
        // false 默认判断的是两个对象的内存地址是否相等
        //        一般用在基本数据类型上面
        System.out.println(c1.equals(c2));
        // 得到的是true 调用的是子类中的equals方法



    }
}
