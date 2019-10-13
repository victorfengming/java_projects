package cn.sxt.game;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.spec.MGF1ParameterSpec;

/**
 * 飞机游戏的主窗口
 * @author 秋叶夏风
 */
public class MyGameFrame extends JFrame {
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
