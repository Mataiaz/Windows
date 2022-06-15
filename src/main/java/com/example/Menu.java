package com.example;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Menu extends JFrame{
    private JPanel contentPane;
    public static void main(String[] args) {
            Menu frame = new Menu();
            frame.setVisible(true);
    }

    //This will be the starting window where we pick options and paths to other windows
    public Menu () 
    {
        //Enables us to exit the program when pressing close on just the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Here we set the starting size, color and name
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.darkGray);
        TitledBorder tBorder = BorderFactory.createTitledBorder("This is a title border!");
        tBorder.setTitleColor(Color.BLACK);
        contentPane.setBorder(tBorder);
    }
}
