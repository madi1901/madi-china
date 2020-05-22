package mqdi;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class MainMenu extends Container {
    private JButton addButton= new JButton("ADD");
    private JButton listButton;
    private JButton deleteButton;
    private JButton backButton;
    private JButton infoButton;


    public MainMenu(){
        setSize(1200, 500);
        setLayout(null);

        addButton.setBounds(100, 80, 300, 30);
        addButton.setBackground(Color.lightGray);
        addButton.setForeground(Color.black);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(true);
            }
        });
        add(addButton);

        listButton = new JButton("LIST");
        listButton.setBounds(100, 120, 300, 30);
        listButton.setBackground(Color.lightGray);
        listButton.setForeground(Color.black);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.listWindow.setVisible(true);

            }
        });
        add(listButton);

        deleteButton = new JButton("DELETE");
        deleteButton.setBounds(100, 160, 300, 30);
        deleteButton.setBackground(Color.lightGray);
        deleteButton.setForeground(Color.black);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.deleteWindow.setVisible(true);

            }
        });
        add(deleteButton);

        backButton = new JButton("BACK");
        backButton.setBounds(100, 240, 300, 30);
        backButton.setBackground(Color.lightGray);
        backButton.setForeground(Color.black);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.firstWindow.setVisible(true);
            }
        });
        add(backButton);

        infoButton = new JButton("INFO ABOUT US");
        infoButton.setBounds(100, 40, 300, 30);
        infoButton.setBackground(Color.lightGray);
        infoButton.setForeground(Color.black);
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.infoWindow.setVisible(true);
            }
        });
        add(infoButton);

    }
}