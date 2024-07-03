package OnlineShoppingUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LogoAndLogin1 implements ActionListener {
    
    private final JFrame frame = new JFrame();
    
    private final JPanel pnlMainPanelLining = new JPanel();
    private final JPanel mainPanel = new JPanel();
    private final JPanel shoopeLogo = new JPanel();
    private final JPanel welcomeBanner = new JPanel();
    
    private final JLabel lblEmailAdd = new JLabel();
    private final JLabel lblPassword = new JLabel();
    private final JLabel lblLogin = new JLabel();
    private final JLabel hdrWelcome = new JLabel();
    private final JLabel hdrShoopeLogo = new JLabel();
    
    private final JTextField txtEmailAdd = new JTextField();
    private final JTextField txtPassword = new JTextField();
    
    private final JButton button = new JButton("Login");

    public LogoAndLogin1() {
        
        //Buttons();
        MainPanel();
        Welcome();
        panelLining();
        Logo();
        
        frame.setTitle("Login Here!");
        frame.setSize(900,700);
       
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame. setLocationRelativeTo(null);
        frame.setResizable(false);
     //   frame.add(button);

    }

    public void panelLining(){ 
        
    
        pnlMainPanelLining.setBounds(250, 290, 400, 320);
        pnlMainPanelLining.setLayout(null);
        pnlMainPanelLining.setBackground(new Color(155, 114, 221, 120));
        shoopeLogo.add(pnlMainPanelLining);
     
    }
    
    public void Welcome(){
        
       
        welcomeBanner.setBounds(0, 230, 350, 50);
        welcomeBanner.setLayout(null);
        welcomeBanner.setBackground(new Color(255, 255, 255, 0));
       // welcomeBanner.add(hdrWelcome);
        shoopeLogo.add(welcomeBanner);
    }
    
    public void Logo() {
        
        shoopeLogo.setBounds(5, 0, 900, 700);
        shoopeLogo.setLayout(null);
        shoopeLogo.setBackground(new Color(255, 255, 255,180));
        frame.add(shoopeLogo);
        
        
        hdrShoopeLogo.setBounds(250, 0, 370, 250);
        ImageIcon icon = new ImageIcon(new ImageIcon("shOOPe.png").getImage().getScaledInstance(370, 250, Image.SCALE_DEFAULT));
        hdrShoopeLogo.setIcon(icon);
        shoopeLogo.add(hdrShoopeLogo);
        
        JLabel imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("shoope_bg_pic.png").getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT));
        imageLabel.setIcon(imageIcon);
        imageLabel.setBounds(0, 0, 900, 700);
        frame.add(imageLabel);
    }
    
    public void MainPanel() {
        mainPanel.setBounds(10, 10, 380, 300);
        mainPanel.setBackground(new Color(244, 205, 241));
        mainPanel.setLayout(null);
        pnlMainPanelLining.add(mainPanel);
        
       
        txtEmailAdd.setBounds(300, 400, 300, 30);
        //mainPanel.add(txtEmailAdd);
        frame.add(txtEmailAdd);
        txtPassword.setBounds(300, 480, 300, 30);
       // mainPanel.add(txtPassword);
        frame.add(txtPassword);
        
        lblEmailAdd.setText("Email Address");
        lblEmailAdd.setBounds(300, 360, 100, 30);
       // mainPanel.add(lblEmailAdd);
        frame.add(lblEmailAdd);
        
        lblPassword.setText("Password");
        lblPassword.setBounds(300, 445, 100, 30);
       // mainPanel.add(lblPassword);
        frame.add(lblPassword);
        
        
        //lblPassword.setText("Password");
       // lblPassword.setBounds(35, 60, 100, 30);
       // mainPanel.add(lblPassword);
        hdrWelcome.setText("Welcome Shopper!" );
        hdrWelcome.setBounds(200, 230, 350, 60);
        hdrWelcome.setFont(new Font("Times New Roman", Font.ITALIC, 35));
        //hdrWelcome.setOpaque(false);
        //mainPanel.add(hdrWelcome);
        frame.add(hdrWelcome);
        
    
        button.setBounds(300, 530, 100, 30);
        button.addActionListener(this);
       // mainPanel.add(button);
        frame.add(button);
        
        lblLogin.setText ("Please Login to continue");
        lblLogin.setBounds(300, 315, 300, 30);
        lblLogin.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        //mainPanel.add(lblLogin);
        frame.add(lblLogin);
       
        
        

       
        
       
        
        
        /*button.addActionListener(new ActionListener() {
            @Override
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
        */
        frame.setVisible(true);
        

    }
 

   @Override
   public void actionPerformed(ActionEvent e) {
        
      button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Username = txtEmailAdd.getText();
                String Password = txtPassword.getText();
                
                 if(e.getSource() == button) {
                     
                     HomePage hp = new HomePage();
                     frame.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

    
    

} 

