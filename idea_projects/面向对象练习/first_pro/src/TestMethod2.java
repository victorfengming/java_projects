import java.util.regex.Pattern;

public class TestMethod2 {

    public static void main(String[] args) {

        System.out.println(Pattern.matches("2223", "2223"));
        Pattern.matches("\\d+","2223aa");//返回false,需要匹配到所有字符串才能返回true,这里aa不能匹配到
        Pattern.matches("\\d+","22bb23");//返回false,需要匹配到所有字符串才能返回true,这里bb不能匹配到
    }

    /*
    方法重载之后就可以根据调用时候的参数的不同,会执行不同的方法
     */

}


