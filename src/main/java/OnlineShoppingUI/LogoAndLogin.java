package OnlineShoppingUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LogoAndLogin extends JFrame {

    public LogoAndLogin() {
        setTitle("shOOpe");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 900, 700);
        mainPanel.setBackground(new Color(155, 114, 221));
        mainPanel.setLayout(null);
        add(mainPanel);

        JLabel lblContinue = new JLabel ("Click logo to proceed!");
        lblContinue.setFont(new Font("Roboto", Font.BOLD, 16));
        lblContinue.setBounds(350, 600, 200, 50);
        mainPanel.add(lblContinue);
        
        
        JButton btnLogo = new JButton();
        ImageIcon logo = new ImageIcon(new ImageIcon("logoshoope.png").getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT));
        btnLogo.setIcon(logo);
        btnLogo.setBounds(300, 250, 300, 250);
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
