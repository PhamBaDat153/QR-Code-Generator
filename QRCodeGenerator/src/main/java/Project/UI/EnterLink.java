package Project.UI;

import Project.QRGenerator.CodeGenerator;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class EnterLink extends JFrame {
    private JPanel Main;
    private JPanel ButtonPanel;
    private JPanel CenterPanel;
    private JButton submitButton;
    private JTextField textField1;

    public EnterLink() {
        setContentPane(Main);
        setTitle("Qr Generator");
        setSize(500, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String link = textField1.getText();
                CodeGenerator qrCodeGenerator = new CodeGenerator();
                try {
                    qrCodeGenerator.generateQR(link);
                } catch (WriterException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (NotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                new ShowCode();
                dispose();
            }
        });
    }
}
