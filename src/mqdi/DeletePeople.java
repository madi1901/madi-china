package mqdi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeletePeople extends Container {
    private JLabel enterIdLabel;
    private JTextField idPlaceText;
    private JButton enterButton;
    private JButton backButton;

    public DeletePeople() {
        setSize(500, 600);
        setLayout(null);

        enterIdLabel = new JLabel("Enter ID");
        enterIdLabel.setBounds(90, 60, 60, 30);
        enterIdLabel.setBackground(Color.lightGray);
        enterIdLabel.setForeground(Color.black);
        add(enterIdLabel);


        idPlaceText = new JTextField();
        idPlaceText.setBounds(150, 60, 150, 30);
        idPlaceText.setBackground(Color.lightGray);
        idPlaceText.setForeground(Color.black);
        add(idPlaceText);


        enterButton = new JButton("ENTER");
        enterButton.setBounds(90, 140, 100, 30);
        enterButton.setBackground(Color.lightGray);
        enterButton.setForeground(Color.black);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer id = Integer.valueOf(idPlaceText.getText());
                if(idPlaceText.getText().equals("")){
                    JOptionPane.showMessageDialog(Main.frame.deleteWindow,"ENTER ID PlEASE!!!");
                }
                PackageData pd =new PackageData("DELETE",id);
                Main.connect(pd);
                idPlaceText.setText("");
            }
        });
        add(enterButton);

        backButton = new JButton("BACK");
        backButton.setBounds(200, 140, 100, 30);
        backButton.setBackground(Color.lightGray);
        backButton.setForeground(Color.black);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.deleteWindow.setVisible(false);
            }
        });
        add(backButton);
    }
}
