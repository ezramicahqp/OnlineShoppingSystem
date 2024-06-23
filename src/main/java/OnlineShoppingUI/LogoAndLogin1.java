package OnlineShoppingUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LogoAndLogin1 extends JFrame {
    
    public LogoAndLogin1() {
        setTitle("shOOPe");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        
        
        JPanel headerPanel = new JPanel();
        headerPanel.setBounds(0, 0, 900, 300);
        headerPanel.setLayout(null);
        add(headerPanel);
        
        
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 895, 700);
        mainPanel.setBackground(Color.pink);
        mainPanel.setLayout(null);
        add(mainPanel);
        
        
        
        JLabel imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("shoope_bg_pic.png").getImage().getScaledInstance(900, 300, Image.SCALE_DEFAULT));
        imageLabel.setIcon(imageIcon);
        imageLabel.setBounds(0, 0, 900, 300);
        headerPanel.add(imageLabel);
        
        
        
        Label l1 = new Label("Email Address: ");
        l1.setBounds(330, 360, 100, 30);
        mainPanel.add(l1);
        
        Label l2 = new Label("Password:");
        l2.setBounds(330, 430, 100, 30);
        mainPanel.add(l2);
        
        JPanel lblWelcomeShopper = new JPanel();
        lblWelcomeShopper.setBounds(20, 200, 500, 100);
        lblWelcomeShopper.setBackground(Color.pink);
        lblWelcomeShopper.setLayout(null);
        //headerPanel.add(lblWelcomeShopper);
        add(lblWelcomeShopper);
        
        
        Label l3 = new Label("Welcome Shopper!");
        //l3.setBounds(40, 200, 600, 100);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 50));
        lblWelcomeShopper.add(l3);
        
        Label l4 = new Label("Please Login to continue");
        l4.setBounds(330, 290, 300, 100);
        l4.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        mainPanel.add(l4);
        
        TextField t1 = new TextField();
        t1.setBounds(330, 390, 300, 30);
        mainPanel.add(t1);
        
        TextField t3 = new TextField();
        t3.setBounds(330, 460, 300, 30);
        mainPanel.add(t3);
        
        Button a = new Button("Login");
        a.setBounds(330, 500, 100, 30);
        mainPanel.add(a);
        
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Username = t1.getText();
                String Password = t3.getText();
                
                if (Username.equals("Ed Dela Cruz") && Password.equals("OOP")) {
                    JOptionPane.showMessageDialog(null, "Successfully Logged In!", "Login Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
