package org.example;

import java.awt.*;
import java.awt.event.*;

public class CheckboxExample extends Frame implements ActionListener {

    Checkbox cb1, cb2, cb3;
    Button b;
    Label label;

    CheckboxExample() {

        setLayout(null);
        setTitle("AWT Checkbox Example");

        cb1 = new Checkbox("Java");
        cb1.setBounds(50, 50, 100, 30);

        cb2 = new Checkbox("Python");
        cb2.setBounds(50, 90, 100, 30);

        cb3 = new Checkbox("C++");
        cb3.setBounds(50, 130, 100, 30);

        b = new Button("Show Selected");
        b.setBounds(50, 180, 120, 30);
        b.addActionListener(this);

        label = new Label();
        label.setBounds(50, 230, 300, 30);

        add(cb1);
        add(cb2);
        add(cb3);
        add(b);
        add(label);

        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String msg = "Selected: ";
        if (cb1.getState()) msg += "Java ";
        if (cb2.getState()) msg += "Python ";
        if (cb3.getState()) msg += "C++ ";
        label.setText(msg);
    }

    public static void main(String[] args) {
        new CheckboxExample();
    }
}