public abstract class Animal {

    public abstract void eat();
    // abstract 修饰方法,这个方法就是一个抽象方法,抽象方法没有方法体
    public abstract void dong();

//    抽象类中也可以有正常的方法
    public void smell(){
        System.out.println("我在smell");
    }

}
