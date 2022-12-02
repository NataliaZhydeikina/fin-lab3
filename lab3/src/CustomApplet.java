import javax.swing.*;
import java.awt.*;
public class CustomApplet extends JApplet {
            private Container c;
            private JLabel title;
            private JLabel name;
            private JTextField tname;
            private JLabel mno;
            private JTextField tmno;
            private JLabel dob;
            private JComboBox date;
            private JButton sub;
            private JButton reset;

            public CustomApplet() {
                setBounds(300, 90, 620, 400);
                c = getContentPane();
                c.setLayout(null);
                title = new JLabel("Movie Magic Quiz");
                title.setFont(new Font("Arial", Font.PLAIN, 30));
                title.setSize(300, 50);
                title.setLocation(200, 30);
                c.add(title);
                name = new JLabel("Name:");
                name.setFont(new Font("Arial", Font.PLAIN, 15));
                name.setSize(100, 20);
                name.setLocation(100, 100);
                c.add(name);
                tname = new JTextField();
                tname.setFont(new Font("Arial", Font.PLAIN, 15));
                tname.setSize(250, 20);
                tname.setLocation(250, 100);
                c.add(tname);
                mno = new JLabel("Favorite movie:");
                mno.setFont(new Font("Arial", Font.PLAIN, 15));
                mno.setSize(100, 20);
                mno.setLocation(100, 150);
                c.add(mno);
                tmno = new JTextField();
                tmno.setFont(new Font("Arial", Font.PLAIN, 15));
                tmno.setSize(250, 20);
                tmno.setLocation(250, 150);
                c.add(tmno);
                dob = new JLabel("When Last Seen?");
                dob.setFont(new Font("Arial", Font.PLAIN, 15));
                dob.setSize(150, 20);
                dob.setLocation(100, 200);
                c.add(dob);
                date = new JComboBox(new String[] {
                        "Three weeks ago",
                        "Yesterday",
                        "I'd be watching it if wasn't for this dumb quiz"
                });
                date.setFont(new Font("Arial", Font.PLAIN, 15));
                date.setSize(250, 20);
                date.setLocation(250, 200);
                c.add(date);
                sub = new JButton("Send");
                sub.setFont(new Font("Arial", Font.PLAIN, 15));
                sub.setSize(100, 40);
                sub.setLocation(150, 250);
                c.add(sub);
                reset = new JButton("Cancel");
                reset.setFont(new Font("Arial", Font.PLAIN, 15));
                reset.setSize(100, 40);
                reset.setLocation(270, 250);
                c.add(reset);

                setVisible(true);
            }

            public static void main(String[] args) {
                try {
                    CustomApplet customApplet = new CustomApplet();
                    JFrame jFrame = new JFrame("customApplet");
                    jFrame.setContentPane(customApplet);
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jFrame.setVisible(true);
                    jFrame.setPreferredSize(new Dimension(620, 400));
                    jFrame.pack();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
}




