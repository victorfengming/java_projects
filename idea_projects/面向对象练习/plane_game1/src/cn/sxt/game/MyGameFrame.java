package cn.sxt.game;

import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class MyGameFrame extends JFrame {

//    Image plane = GameUtil.getImage("images/plane.jpg");

    // 这个方法自动被调用
    @Override
    public void paint(Graphics g) {

        //        保护现场
        Color c = g.getColor();
        Font f = g.getFont();
        g.setColor(Color.BLUE);

        g.drawLine(100,100,300,300);
        g.drawRect(100,100,300,300);
        g.drawOval(100,100,300,300);
        g.fillRect(100,100,30,60);

        //        还原现场
        g.setColor(c);
        g.setFont(f);
    }

    /**
     * 初始化窗口
     */
    private void launchFrame(){
        this.setTitle("尚学堂学员_程序猿作品");
        this.setSize(600,400);
        this.setLocation(200,100);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            //重写父类方法,匿名内部类
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        new PaintThread().start();

    }

    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("充分华");
                repaint();  // 重画方法

                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }



    public static void main(String[] args) {

        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }

}
