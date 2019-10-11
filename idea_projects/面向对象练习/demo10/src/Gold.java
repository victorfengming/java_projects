public class Gold implements Valuable {
    //    必须重写抽象方法
    //    接口里面叫做实现
    //    必须实现抽象方法
    @Override
    public void getMoney() {
        System.out.println("黄金可以换钱!");
    }
}
