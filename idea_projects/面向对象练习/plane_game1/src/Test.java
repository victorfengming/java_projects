
public class Test {

    int index;
    String ch;



    public Test(int index, String ch) {
        this.index = index;
        this.ch = ch;
    }

    public void test1(){
        System.out.println(index);
        System.out.println(ch);
    }

    public Test() {
        System.out.println("asfdhgfhj");
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCh() {

        return ch;
    }

    public void setCh(String ch) {

        this.ch = ch;
    }

    public static void main(String[] args) {

//        Test t = new Test();
        Test t2 = new Test(1,"yans");

        //System.out.println(t);
        t2.test1();

    }
}

