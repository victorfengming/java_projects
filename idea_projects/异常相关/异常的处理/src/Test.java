public class Test {

    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);

        }catch (Exception e){
//            e.printStackTrace();
            System.out.println("系统出错了,请联系管理员");
        } finally {
            System.out.println("最终的");
        }

    }

}
