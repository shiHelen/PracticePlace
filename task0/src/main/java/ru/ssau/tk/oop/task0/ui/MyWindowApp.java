package ru.ssau.tk.oop.task0.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindowApp extends JFrame {
    private int count = 3;
    private JLabel countLabel;
    private JButton OK;

    public MyWindowApp() {
        super("TabulatedFunction");
        setBounds(200, 200, 400, 400);
        countLabel = new JLabel("Количество точек у функции: " + count);
        OK = new JButton("OK");


        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(countLabel, BorderLayout.WEST);

        buttonsPanel.add(OK);

        add(buttonsPanel, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        MyWindowApp app = new MyWindowApp();
        app.setVisible(true);
    }
}

