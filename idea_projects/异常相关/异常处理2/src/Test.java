import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test {
    public static void read() throws Exception{

        InputStream is = new FileInputStream(new File("哈哈"));

    }

    public static void main(String[] args) {
//        read();
    }

}
