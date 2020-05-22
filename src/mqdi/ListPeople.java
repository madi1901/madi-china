package mqdi;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListPeople extends Container {
    public static JTextArea text;
    private JButton buttonLIST;
    private JButton buttonBACK;

    public ListPeople() {
        setSize(500,400);
        setLayout(null);

        text = new JTextArea();
        text.setBounds(90, 50, 300, 150);
        text.setBackground(Color.lightGray);
        text.setForeground(Color.black);
        add(text);

        buttonLIST = new JButton("LIST PEOPLE");
        buttonLIST.setBounds(90, 220, 145, 30);
        buttonLIST.setBackground(Color.lightGray);
        buttonLIST.setForeground(Color.black);
        buttonLIST.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PackageData pd = new PackageData("LIST");
                Main.connect(pd);
            }
        });
        add(buttonLIST);

        buttonBACK = new JButton("BACK");
        buttonBACK.setBounds(245, 220, 145,30);
        buttonBACK.setBackground(Color.lightGray);
        buttonBACK.setForeground(Color.black);
        buttonBACK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.listWindow.setVisible(false);
            }
        });
        add(buttonBACK);



    }
}