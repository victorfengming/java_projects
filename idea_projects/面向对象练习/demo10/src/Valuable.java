/**
 * 能继承接口的只能是接口
 * 说白了猴子只能生猴子
 *
 * 接口和类只能是实现关系 implements
 */

public interface Valuable {
    // 接口使用interface来声明
//    已经不是类了

//    很少网接口中写变量
//    public static final int money = 100;
//    上面前面的帮你实现了,可以统统省略
    int money = 100;
    // 接口中所有的方法都是抽象方法,可以省略掉abstract
    // 接口中所有的内容都是公开的,公共的
//    public abstract void getMoney();
//    可以省略public
//    public void getMoney();
    void getMoney();
    // 接口中所有的方法都是抽象方法,不可以有正常的方法

//    抽象类是使用它的子类类继承他的类,然后使用它的抽象方法
//    但是由于现在是接口了
}
