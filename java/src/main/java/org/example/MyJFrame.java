package org.example;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First JFrame");

        JLabel label = new JLabel("Dr. D.Y. Patil School of Science and Technology, Pune");

        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
