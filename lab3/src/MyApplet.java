import javax.swing.*;
import java.awt.*;

public class MyApplet extends JApplet {
    private JTextField nameField;
    private JTextField movieField;
    private JComboBox dateComboBox;
    private JButton sendButton;
    private JButton cancelButton;
    private JPanel planeMain;
    private JLabel nameLabel;
    private JLabel movieLabel;
    private JLabel dateLabel;
    private JLabel title;
    private Container c;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("MyApplet");
        MyApplet myApplet = new MyApplet();
        jFrame.setContentPane(myApplet.planeMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setPreferredSize(new Dimension(600, 400));
        jFrame.pack();
    }
}
