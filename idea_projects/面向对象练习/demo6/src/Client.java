public class Client {

    public static void main(String[] args) {
//        Cat c = new Cat();
//        Dog d = new Dog();
//        DaXiang dx = new DaXiang();
//
//        Person p = new Person();
//
//        p.feedCat(c);
//        p.feedDog(d);
//        p.feedDaXiang(dx);

        Cat c = new Cat();  // 创建一只猫

        Animal ani1 = new Cat();    // 可以把猫当成动物来看
        Animal ani2 = new Dog();
//        把子类的对象,赋值给父类的引用
//        这种方式又被称为向上转型

        Animal ani3 = new DaXiang();


        Person p = new Person();

        p.feed(ani1);
        p.feed(ani2);
        p.feed(ani3);

        // 多态:把不同的数据类型进行统一


        // 向下转型
        Cat cc = (Cat)ani1;
        System.out.println(cc);
        p.feed(cc);
    }

}
