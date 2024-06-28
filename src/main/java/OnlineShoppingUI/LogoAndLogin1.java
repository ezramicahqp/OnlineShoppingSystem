package OnlineShoppingUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LogoAndLogin1 extends JFrame {
    
    private final JFrame frame = new JFrame();
    
    private final JPanel panel = new JPanel();
    private final JPanel mainPanel = new JPanel();
    
    private final JLabel lblWelcome = new JLabel();
    private final JLabel lblLogin = new JLabel();
    private final JLabel lblEmail = new JLabel();
    private final JLabel lblPassword = new JLabel();
    
    private final JTextField txtEmail = new JTextField();
    private final JTextField txtPassword = new JTextField();
    
    private final JButton buttonLog = new JButton();
    
    public LogoAndLogin1() {
        
        Panel();
        MainPanel();
        
        frame.setTitle("Login Here!");
        frame.setSize(900,700);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void Panel() {
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("panel.png").getImage().getScaledInstance(900, 200, Image.SCALE_DEFAULT));
        JLabel label = new JLabel(imageIcon);
        panel.add(label);
        panel.setBounds(0, 0, 900, 200);
        frame.add(panel);

    }
    
    public void MainPanel() {
        
        mainPanel.setBackground(Color.PINK);
        mainPanel.setLayout(null);
        add(mainPanel);
        
        
        lblWelcome.setText("Welcome Shopper!");
        lblWelcome.setBounds(40, 200, 600, 100);
        lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 50));
        mainPanel.add(lblWelcome);
        
        lblLogin.setText("Please Login To Continue");
        lblLogin.setBounds(330, 290, 300, 100);
        lblLogin.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        mainPanel.add(lblLogin);
        
        lblEmail.setText("Email Address:");
        lblEmail.setBounds(330, 360, 100, 30);
        lblEmail.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        mainPanel.add(lblEmail);
        
        lblPassword.setText("Password");
        lblPassword.setBounds(330, 430, 100, 30);
        lblPassword.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        mainPanel.add(lblPassword);
        
        txtEmail.setBounds(330, 390, 300, 30);
        txtPassword.setBounds(330, 460, 300, 30);
        mainPanel.add(txtEmail);
        mainPanel.add(txtPassword);
        
        buttonLog.setText("Login");
        buttonLog.setBounds(330, 500, 100, 30);
        buttonLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Username = txtEmail.getText();
                String Password = txtPassword.getText();
                if(e.getSource() == buttonLog) {
                     frame.dispose();
                     homePage hp = new homePage();
                /*if(Username.equals("Ed DelaCruz") && Password.equals("OOP")) {
                    JOptionPane.showMessageDialog(null, "Successfully Logged In!", "Login Success", JOptionPane.INFORMATION_MESSAGE);
                } */
                }
                else {
                    JOptionPane.showMessageDialog(null, "Login Failed", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        mainPanel.add(buttonLog);
        
        
        frame.add(mainPanel);


    }
    
}
