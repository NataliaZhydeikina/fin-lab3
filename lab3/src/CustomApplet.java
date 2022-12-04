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
                setBounds(300, 90, 820, 400);
                c = getContentPane();
                c.setLayout(null);
                title = new JLabel("Розрахунок фінансового показника \"Додана вартість\"");
                title.setFont(new Font("Arial", Font.PLAIN, 30));
                title.setSize(800, 50);
                title.setLocation(20, 30);
                c.add(title);
                name = new JLabel("Вартість виробленої продукції:");
                name.setFont(new Font("Arial", Font.PLAIN, 15));
                name.setSize(300, 20);
                name.setLocation(50, 100);
                c.add(name);
                tname = new JTextField();
                tname.setFont(new Font("Arial", Font.PLAIN, 15));
                tname.setSize(250, 20);
                tname.setLocation(350, 100);
                c.add(tname);
                mno = new JLabel("Вартість сировини і енергії");
                mno.setFont(new Font("Arial", Font.PLAIN, 15));
                mno.setSize(300, 20);
                mno.setLocation(50, 150);
                c.add(mno);
                tmno = new JTextField();
                tmno.setFont(new Font("Arial", Font.PLAIN, 15));
                tmno.setSize(250, 20);
                tmno.setLocation(350, 150);
                c.add(tmno);
                /*dob = new JLabel("When Last Seen?");
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
                c.add(date);*/
                sub = new JButton("Порахувати");
                sub.setFont(new Font("Arial", Font.PLAIN, 15));
                sub.setSize(150, 40);
                sub.setLocation(150, 250);
                c.add(sub);
                reset = new JButton("Cancel");
                reset.setFont(new Font("Arial", Font.PLAIN, 15));
                reset.setSize(150, 40);
                reset.setLocation(370, 250);
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
                    jFrame.setPreferredSize(new Dimension(820, 400));
                    jFrame.pack();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
}




