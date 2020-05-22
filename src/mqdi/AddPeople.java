package mqdi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPeople extends Container {
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel genderLabel;
    private JLabel ageLabel;

    private JTextField nameText;
    private JTextField surnameText;
    private String[] gender = {"MAN", "WOMAN"};
    private JComboBox genderBox;
    private JTextField ageText;

    private JButton addButton;
    private JButton backButton;

    public AddPeople(){
        setSize(500, 400);
        setLayout(null);

        nameLabel = new JLabel("NAME: ");
        nameLabel.setBounds(90, 60, 60, 30);
        nameLabel.setBackground(Color.lightGray);
        nameLabel.setForeground(Color.black);
        add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(150, 60, 150, 30);
        nameText.setBackground(Color.lightGray);
        nameText.setForeground(Color.black);
        add(nameText);

        surnameLabel = new JLabel("SURNAME: ");
        surnameLabel.setBounds(90, 100, 60, 30);
        surnameLabel.setBackground(Color.lightGray);
        surnameLabel.setForeground(Color.black);
        add(surnameLabel);

        surnameText = new JTextField();
        surnameText.setBounds(150, 100, 150, 30);
        surnameText.setBackground(Color.lightGray);
        surnameText.setForeground(Color.black);
        add(surnameText);

        genderLabel = new JLabel("GENDER: ");
        genderLabel.setBounds(90, 140, 60, 30);
        genderLabel.setBackground(Color.lightGray);
        genderLabel.setForeground(Color.black);
        add(genderLabel);

        genderBox = new JComboBox(gender);
        genderBox.setBounds(150, 140, 150, 30);
        genderBox.setBackground(Color.lightGray);
        genderBox.setForeground(Color.black);
        add(genderBox);

        ageLabel = new JLabel("AGE: ");
        ageLabel.setBounds(90, 180, 60, 30);
        ageLabel.setBackground(Color.lightGray);
        ageLabel.setForeground(Color.black);
        add(ageLabel);

        ageText = new JTextField();
        ageText.setBounds(150, 180, 150, 30);
        ageText.setBackground(Color.lightGray);
        ageText.setForeground(Color.black);
        add(ageText);

        addButton = new JButton("ADD HUMAN");
        addButton.setBounds(90, 220, 210, 30);
        addButton.setBackground(Color.lightGray);
        addButton.setForeground(Color.black);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String surname = surnameText.getText();
                String gender = (String)genderBox.getSelectedItem();
                String age = ageText.getText();

                People people=new People(null, name, surname, gender,age);
                PackageData pd = new PackageData("ADD", people);
                Main.connect(pd);


                nameText.setText("");
                surnameText.setText("");
                ageText.setText("");
            }
        });
        add(addButton);

        backButton = new JButton("BACK");
        backButton.setBounds(90, 260, 210, 30);
        backButton.setBackground(Color.lightGray);
        backButton.setForeground(Color.black);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.addWindow.setVisible(false);
            }
        });
        add(backButton);
    }
}

