package mqdi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paper extends Container {
    private JButton startButton;
    private JButton exitButton;
    private JTextArea textArea;

    public Paper() {
        setSize(500, 600);
        setLayout(null);

        startButton = new JButton("START");
        startButton.setBounds(140, 160, 300, 30);
        startButton.setBackground(Color.lightGray);
        startButton.setForeground(Color.black);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.firstWindow.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(startButton);

        exitButton = new JButton("EXIT");
        exitButton.setBounds(140, 200, 300, 30);
        exitButton.setBackground(Color.lightGray);
        exitButton.setForeground(Color.black);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
    }
}
