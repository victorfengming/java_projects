import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class re1 {
    public static void main(String[] args) {

        String pattern = "123";

        String ob = "12312354676";

        boolean b = Pattern.matches(pattern, ob);

        System.out.println(b);
//        模式
        Pattern p = Pattern.compile("bbb");

        Matcher m = p.matcher("22bb23");

        System.out.println(m.find());
    }
}
