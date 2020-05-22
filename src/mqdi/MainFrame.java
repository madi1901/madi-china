package mqdi;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static Info infoWindow;
    public static MainMenu menuWindow;
    public static AddPeople addWindow;
    public static ListPeople listWindow;
    public static DeletePeople deleteWindow;
    public static Paper firstWindow;

    public MainFrame(){
        setSize(600, 400);
        setTitle("MARATHON-2020");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        infoWindow = new Info();
        infoWindow.setLocation(0,0);
        infoWindow.setVisible(false);
        add(infoWindow);

        menuWindow = new MainMenu();
        menuWindow.setLocation(0,0);
        menuWindow.setVisible(false);
        add(menuWindow);

        addWindow = new AddPeople();
        addWindow.setLocation(0, 0);
        addWindow.setVisible(false);
        add(addWindow);

        listWindow = new ListPeople();
        listWindow.setLocation(0,0);
        listWindow.setVisible(false);
        add(listWindow);

        deleteWindow = new DeletePeople();
        deleteWindow.setLocation(0,0);
        deleteWindow.setVisible(false);
        add(deleteWindow);

        firstWindow = new Paper();
        firstWindow.setLocation(0,0);
        add(firstWindow);

    }



}
