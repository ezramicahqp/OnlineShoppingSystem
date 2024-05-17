package OnlineShoppingUI;
import java.awt.*;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.Color;


public class LogoAndLogin {
    public static void main(String[] args) {
        Frame f=new Frame("shOOpe");
        f.setBackground(Color.pink);
      
        
        ImageIcon icon = new ImageIcon("logopic.jpg");
        Object[] options = {"Continue to SHOOPE!"};
        int choice = JOptionPane.showOptionDialog(null,"","Welcome to Shoope", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options,  // Custom button text
        options[0]); // Default button

    
        if (choice == JOptionPane.OK_OPTION) {
            System.out.println("User clicked Continue");
        }
    
         
        
        Label l1 = new Label("Email Address: ");
        l1.setBounds(40, 360, 100, 30); 
        Label l2 = new Label("Password:");
        l2.setBounds(40, 430, 100, 30); 
        Label l3 = new Label("Welcome Shopper!");
        l3.setBounds(40,200,600,100);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 50));
        Label l4 = new Label("Please Login to continue");
        l4.setBounds(40,290,300,100);
        l4.setFont(new Font("Times New Roman", Font.ITALIC, 15));        
        Label l5 = new Label();
        l5.setBackground(Color.white);
        l5.setBounds(0,10,895,90); 
        /*Label l6 = new Label("shOOPe");
        l6.setBounds(40,100,300,150);
        l6.setFont(new Font("Times New Roman", Font.BOLD, 65)); */
        Label l7 = new Label();
        l7.setBackground(Color.white);
        l7.setBounds(0,650,895,150);


        
          f.add(l1);
          f.add(l2);
          f.add(l3);
          f.add(l4);
          f.add(l5);
          //f.add(l6);
          f.add(l7);
        
        TextField t1 = new TextField();
        t1.setBounds(40, 390, 300, 30); 
        f.add(t1);
        TextField t3 = new TextField();
        t3.setBounds(40, 460, 300, 30);
        f.add(t3);
        
        
        
        Button a=new Button("Login");
        a.setBounds(40,500,100,30); 
        a.addActionListener((ActionEvent e) -> {
            t1.setText("Hi!");
            f.setVisible(true);
        });
   
        
        
      
                f.add(a);
                f.setSize(900,700);
                f.setLayout(null);
                f.setVisible(true);
                
                f.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                f.dispose();
            }

        
        
                });
        
}
}
