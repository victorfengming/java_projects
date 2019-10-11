public class Test {
    public static void main(String[] args) {
        String str1 = "小红";
        String str2 = "小红";

        str2 = "小白";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


        String str3 = new String("杠精");
        // 这行要出现两个对象
        // 杠精两个字就是一个对象,new一个string又是一个对象(str3)
        // str3 的对象指向杠精
        String str4 = new String("杠精");
        // 杠精有了,str4有新出现一个
        System.out.println(str3 == str4);
        // 这个==是判断内存地址
        System.out.println(str3.equals(str4));
        //  在字符串中的equals中重写了  判断字符串中的内容是否一致的

        //        结论:字符串的判断您必须用equals 可以帮我们判断内容
        //        字符串的判断一定要用equals来判断
        //        小练习:"模你用户登录"

    }
}
