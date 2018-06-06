package com.wzy.template.headfirst.frame;

import javax.swing.*;
import java.awt.*;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 17:32
 */
public class MyFrame extends JFrame {

    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        new MyFrame("Head First Design Patterns");
    }
}
