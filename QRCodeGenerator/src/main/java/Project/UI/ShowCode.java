package Project.UI;

import javax.swing.*;
import java.awt.*;

public class ShowCode {
    private JPanel Main;
    private JPanel TitlePanel;
    private JPanel CodePanel;
    private JLabel picture;
    private JLabel title;

    public ShowCode() {
        JFrame frame = new JFrame("Code");
        picture = new JLabel(); // Initialize picture label
        ImageIcon imgThisImg = new ImageIcon("demo.png");
        picture.setIcon(imgThisImg);
        Main.add(picture); // Add picture label to Main panel
        frame.setContentPane(Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}