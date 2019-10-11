public class TestMethod {
    /**
     *用户自己定义的方法
     * 方法之间不能嵌套,也就是说不能再方法中定义方法
     * @param args
     */
    public static void yue(){
        System.out.println("揍你!!!!");
    }

    /**
     * 写一个从1-100的方法
     * @param args
     */
    public  static void count100(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }


    // 主方法
    public static void main(String[] args) {
//        yue();
        count100();
    }

    //    不可以在方法中定义方法
}
