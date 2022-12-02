import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {
    public static void main(String[] args) {
        Main main = new Main();
        JFrame jFrame = new JFrame("Main");
        jFrame.add(main);
        jFrame.setVisible(true);
        jFrame.setPreferredSize(new Dimension(200, 200));
        jFrame.pack();
    }
    @Override
    public void paint(Graphics g){
        g.drawString("Hello applet!", 50, 25);
    }
}