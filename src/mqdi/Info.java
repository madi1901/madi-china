package mqdi;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Info extends Container {
    private JTextArea about;
    private JButton backButton;

    public Info() {
        setSize(500, 600);
        setLayout(null);

        about = new JTextArea("\n" +
                "We are an organization that accepts applications from people of different " +"\n"+
                "ages for MARATHON in the city. We give an opportunity for all age groups," +"\n"+
                "all  genders to participate in the competition and support. Good luck to all!");
        about.setBounds(90, 60, 550, 130);
        about.setBackground(Color.lightGray);
        about.setForeground(Color.black);
        add(about);

        backButton = new JButton("BACK");
        backButton.setBounds(45, 220, 145,30);
        backButton.setBackground(Color.lightGray);
        backButton.setForeground(Color.black);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.infoWindow.setVisible(false);
            }
        });
        add(backButton);
    }
}