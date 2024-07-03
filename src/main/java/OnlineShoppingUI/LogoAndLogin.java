package OnlineShoppingUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LogoAndLogin extends JFrame implements ActionListener {

private final JFrame frame1 = new JFrame();
private final JPanel mainPanel = new JPanel();
private final JLabel lblContinue = new JLabel();
private final JButton btnLogo = new JButton();

public LogoAndLogin() {
   mPanel();
        frame1.setTitle("shOOpe!");
        frame1.setSize(900,700);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
      //  frame1.setResizable(false);
        frame1.add(mainPanel);
        frame1.setVisible(true);
    }

public void mPanel() {


        //JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 900, 700);
        mainPanel.setBackground(new Color(155, 114, 221));
        mainPanel.setLayout(null);

        lblContinue.setText("Click logo to proceed!");
        lblContinue.setBounds(350, 600, 200, 50);
        lblContinue.setFont(new Font("Roboto", Font.BOLD, 16));
        mainPanel.add(lblContinue);

        ImageIcon logo = new ImageIcon(new ImageIcon("logoshoope.png").getImage().getScaledInstance(300, 250,      Image.SCALE_DEFAULT));
        btnLogo.setIcon(logo);
       // btnLogo.setHorizontalTextPosition(JButton.CENTER);
       // btnLogo.setVerticalTextPosition(JButton.CENTER);
        //btnLogo.setBounds(0, 0, 900, 700);
        btnLogo.setBounds(300, 250, 300, 250);
        btnLogo.setBorder(null);

        mainPanel.add(btnLogo);

        //btnLogo.setText("Login");
       // btnLogo.setBounds(0, 0, 900, 700);
        btnLogo.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnLogo)
            {
               // Close the current window
                LogoAndLogin1 loginPage = new LogoAndLogin1();
                 frame1.dispose(); 
                //loginPage.setVisible(true); // Open the login page
                }
                
            }


        
//        mainPanel.add(btnLogo);
//        setVisible(true);



    public static void main(String[] args) {
        new LogoAndLogin();
    }
}