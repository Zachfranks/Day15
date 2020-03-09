package CodeMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Struct;

class Student
{
    public String FirstName;
    public String LastName;
    public String MiddleInt;
    public int    Grade;
    public boolean Selected;
};




public class App {

    private JPanel PanelMenu;
    private JButton Btn;
    private JCheckBox cb;
    private JComboBox cbb;
    private JTextField txtMiddle;
    private JTextField txtSecond;
    private JTextField txtfirst;


    public App() {


        Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PanelMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
