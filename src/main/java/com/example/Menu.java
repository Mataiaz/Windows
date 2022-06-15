package com.example;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.net.*;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame{
    private JPanel contentPane;
    private JLabel lblA;
    public static void main(String[] args) {
            Menu frame = new Menu();
            frame.setVisible(true);
    }

    public Menu () 
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add();
        
    }
}
