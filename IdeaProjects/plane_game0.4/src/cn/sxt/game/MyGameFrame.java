package cn.sxt.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 飞机游戏的主窗口
 * @author 秋叶夏风
 */
public class MyGameFrame extends JFrame {

    //    加载图片对象
    Image plane_img = GameUtil.getImage("images/planesm.png");
    Image bg = GameUtil.getImage("images/bgsm.png");

    Plane plane = new Plane(plane_img,250,250);
    Plane plane2 = new Plane(plane_img,20,50);
    Plane plane3 = new Plane(plane_img,50,20);
    int plane_x = 500;
    int plane_y = 250;


    @Override
    public void paint(Graphics g) {

        g.drawImage(bg, 0, 0, null);
        g.drawImage(plane_img, plane_x, plane_y, null);

        // huafeiji
        plane.drawSelf(g);
        plane2.drawSelf(g);
        plane3.drawSelf(g);


    }

    /*
     * 线程:这一个程序要是想要跑起来需要多个线程
     * 很多线程来配合的
     *
     * 内部类可以直接使用外部的属性
     * 定义在另一个类的里面,这个类就可以使用属性和方法,随便用的那种
     * */

    /**
     * 帮助我们反复重画窗口
     */
    class PaintThread extends Thread{

        @Override
        public void run() {
            while (true) {

                System.out.println("窗口重画一次");

                // 重画方法
                repaint();
                // 暂停一下
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 初始化窗口
     */
    public void launchFrame() {
        this.setTitle("秋叶夏风_程序员作品");
        this.setVisible(true);
//        给窗口设置大小
        this.setSize(500,500);
//        设置位置
        this.setLocation(200,100);
//        匿名内部类
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // 启动线程,窗口的线程
        new PaintThread().start();

    }

    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }

}
