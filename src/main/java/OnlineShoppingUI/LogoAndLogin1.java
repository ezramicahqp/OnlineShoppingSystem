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
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        
        JPanel pnlShoopeLogo = new JPanel();
        //pnlShoopeLogo.setBounds(220, 0, 350, 230);
        pnlShoopeLogo.setBounds(0, 0, 900, 700);
        pnlShoopeLogo.setLayout(null);
        pnlShoopeLogo.setBackground(new Color(255, 255, 255,180));
        add(pnlShoopeLogo);
        
        
        JPanel pnlWelcomeBanner = new JPanel();
        pnlWelcomeBanner.setBounds(50, 230, 350, 50);
        pnlWelcomeBanner.setLayout(null);
        pnlWelcomeBanner.setBackground(new Color(255, 255, 255,0));
        pnlShoopeLogo.add(pnlWelcomeBanner);
        
  
        JPanel pnlMainPanelLining = new JPanel();
        pnlMainPanelLining.setBounds(250, 290, 400, 320);
        pnlMainPanelLining.setLayout(null);
        pnlMainPanelLining.setBackground(new Color(155, 114, 221,120));
        pnlShoopeLogo.add(pnlMainPanelLining);
        
        JPanel mainPanel = new JPanel();
        //mainPanel.setBounds(260, 300, 380, 300);
        mainPanel.setBounds(10, 10, 380, 300);
        mainPanel.setBackground(new Color(244, 205, 241));
        mainPanel.setLayout(null);
        pnlMainPanelLining.add(mainPanel);
       
        
        
        JLabel imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("shoope_bg_pic.png").getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT));
        imageLabel.setIcon(imageIcon);
        imageLabel.setBounds(0, 0, 900, 700);
        //headerPanel.add(imageLabel);
        add(imageLabel);
        
        
        Label lblEmailAdd = new Label("Email Address: ");
        lblEmailAdd.setBounds(35, 60, 100, 30);
        mainPanel.add(lblEmailAdd);
        
        Label lblPassword = new Label("Password:");
        lblPassword.setBounds(35, 130, 100, 30);
        mainPanel.add(lblPassword);
        
       
        JLabel hdrWelcome = new JLabel("Welcome Shopper!" );
        hdrWelcome.setBounds(25, 0, 350, 50);
        hdrWelcome.setFont(new Font("Times New Roman", Font.ITALIC, 35));
        hdrWelcome.setOpaque(false);
        pnlWelcomeBanner.add(hdrWelcome);
        
        JLabel hdrShoopeLogo = new JLabel();
        ImageIcon icon = new ImageIcon(new ImageIcon("shOOPe.png").getImage().getScaledInstance(370, 250, Image.SCALE_DEFAULT));
        hdrShoopeLogo.setBounds(250, 0, 370, 250);
        hdrShoopeLogo.setIcon(icon);
        pnlShoopeLogo.add(hdrShoopeLogo);
        

        
        Label l4 = new Label("Please Login to continue");
        l4.setBounds(20, 10, 300, 30);
        l4.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        mainPanel.add(l4);
        
        TextField txtEmailAdd = new TextField();
        txtEmailAdd.setBounds(35, 90, 300, 30);
        mainPanel.add(txtEmailAdd);
        
        TextField txtPassword = new TextField();
        txtPassword.setBounds(35, 160, 300, 30);
        mainPanel.add(txtPassword);
        
        Button a = new Button("Login");
        a.setBounds(35, 250, 100, 30);
        mainPanel.add(a);
        
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Username = txtEmailAdd.getText();
                String Password = txtPassword.getText();
                
                if (Username.equals("Ed Dela Cruz") && Password.equals("OOP")) {
                    JOptionPane.showMessageDialog(null, "Successfully Logged In!", "Login Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

   
}
