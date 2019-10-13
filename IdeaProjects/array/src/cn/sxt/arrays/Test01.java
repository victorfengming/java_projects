package cn.sxt.arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] arr01 = new int[10];    // 声明了一个整数的数组
//        索引下标: 0123456789
//        arr01是在栈空间中,int[]10是在堆空间中有十个地址
        String[] arr02;
        // 声明了一个String类型的数组,这个数组不能放别的,之能放这个
        User[] arr03 = new User[3];   // 类型可以自己定义的

        arr01[0] = 13;
        arr01[1] = 15;
        arr01[2] = 20;
        arr01[9] = 20;


    }
}

class User{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}