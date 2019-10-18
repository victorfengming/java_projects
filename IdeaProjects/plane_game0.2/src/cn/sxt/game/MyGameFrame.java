package cn.sxt.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.spec.MGF1ParameterSpec;

/**
 * 飞机游戏的主窗口
 * @author 秋叶夏风
 */
public class MyGameFrame extends JFrame {

    //    加载图片对象
    Image ball = GameUtil.getImage("images/ball.png");

    @Override
    public void paint(Graphics g) {
        // 自动被调用.g相当于一只画笔

//        将老的颜色进行保存
        Color c = g.getColor();
//        将老的字体进行保存
        Font f = g.getFont();

        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial",Font.BOLD,50));
        g.drawLine(100,100,190,180);
        g.drawRect(100,60,80,90);
        g.drawOval(30,20,45,67);
        g.fillRect(100,200,40,49);
        g.drawString("ZHI胡",100,300);
        g.drawImage(ball, 250, 250, null);


        // 还原现场
        g.setColor(c);
        g.setFont(f);
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
    }

    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }

}
