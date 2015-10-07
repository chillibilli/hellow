import javax.swing.*;
import java.awt.*;

/**
 * Created by y.dubrov on 07.10.2015.
 */
public class Main {

    private JPanel p;
    private JLabel label;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().p);
        frame.getContentPane().setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
