package OnlineShoppingUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LogoAndLogin extends JFrame {

    public LogoAndLogin() {
        setTitle("shOOpe");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 900, 700);
        mainPanel.setBackground(Color.pink);
        mainPanel.setLayout(null);
        add(mainPanel);

        JButton btnLogo = new JButton();
        ImageIcon logo = new ImageIcon(new ImageIcon("logoshoope.png").getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT));
        btnLogo.setIcon(logo);
        btnLogo.setBounds(250, 250, 350, 300);
        btnLogo.setBorder(null);
        mainPanel.add(btnLogo);

        btnLogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current window
                LogoAndLogin1 loginPage = new LogoAndLogin1();
                loginPage.setVisible(true); // Open the login page
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LogoAndLogin();
    }
}
