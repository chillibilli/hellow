import sun.awt.windows.WToolkit;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class Main {

    private JPanel p;
    private JLabel label;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().p);
        frame.getContentPane().setPreferredSize(new Dimension(DEF_WIDTH, DEF_HEIGHT));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setLocationByPlatform(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        frame.setLocation((screenSize.width - DEF_WIDTH) / 2, (screenSize.height - DEF_HEIGHT) / 2);
        frame.setVisible(true);
    }

    final static int DEF_WIDTH = 300;
    final static int DEF_HEIGHT = 200;
}
