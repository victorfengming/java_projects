public class Test {
    public static void main(String[] args) throws GenderException{

        Person p1 = new Person("张无忌", "男");

        Person p2 = new Person("赵敏", "女");

        ZaoTangZi ztz = new ZaoTangZi();

        ztz.check_nan(p2);
    }
}
