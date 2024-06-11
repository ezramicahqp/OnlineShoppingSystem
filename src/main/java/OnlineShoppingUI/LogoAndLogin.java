package OnlineShoppingUI;
import java.awt.*;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LogoAndLogin extends JFrame{
    
    JButton logopic;
    
    public LogoAndLogin(){
        JFrame f=new JFrame("shOOpe");
        f.getContentPane().setBackground(Color.pink);
        
        JDialog dialog = new JDialog((Frame) null, "Welcome to Shoope", true);
        dialog.setLayout(new FlowLayout());
        dialog.setSize(600, 600);
        
       JButton btnLogo = new JButton();
       ImageIcon logo = new ImageIcon(new ImageIcon("logopic.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
       btnLogo.setIcon(logo);
       btnLogo.setBounds(20, 10, 100, 80); 
       
       btnLogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
                System.out.println("User clicked Continue");
            }
        });
       
       
        dialog.add(btnLogo);
        dialog.add(new JLabel("Click button to continue"));
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        
    
     Label l1 = new Label("Email Address: ");
        l1.setBounds(330, 360, 100, 30); 
        Label l2 = new Label("Password:");
        l2.setBounds(330, 430, 100, 30); 
        Label l3 = new Label("Welcome Shopper!");
        l3.setBounds(40,200,600,100);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 50));
        Label l4 = new Label("Please Login to continue");
        l4.setBounds(330,290,300,100);
        l4.setFont(new Font("Times New Roman", Font.ITALIC, 15));        
        Label l5 = new Label();
        l5.setBackground(Color.pink);
        l5.setBounds(0,10,895,90); 
       /* Label l6 = new Label("shOOPe");
        l6.setBounds(40,100,300,150);
        l6.setFont(new Font("Times New Roman", Font.BOLD, 65)); */
        Label l7 = new Label();
        l7.setBackground(Color.pink);
        l7.setBounds(0,650,895,300);


        
          f.add(l1);
          f.add(l2);
          f.add(l3);
          f.add(l4);
          f.add(l5);
         // f.add(l6);
          f.add(l7);
        
        TextField t1 = new TextField();
        t1.setBounds(330, 390, 300, 30); 
        f.add(t1);
        TextField t3 = new TextField();
        t3.setBounds(330, 460, 300, 30);
        f.add(t3);
        
        
        
        Button a=new Button("Login");
        a.setBounds(330,500,100,30); 
        a.addActionListener((ActionEvent e) -> {
        JOptionPane.showMessageDialog(a, e);
            
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
    
    public static void main(String[] args) {
        //Frame f=new Frame("shOOpe");
        //f.setBackground(Color.pink);
        new LogoAndLogin();
        
       
      
        
        /*ImageIcon icon = new ImageIcon("logopic.jpg");
        Object[] options = {"Continue to SHOOPE!"};
        int choice = JOptionPane.showOptionDialog(null,"","Welcome to Shoope", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options,  // Custom button text
        options[0]); // Default button

    
        if (choice == JOptionPane.OK_OPTION) {
            System.out.println("User clicked Continue");
        }
    
         
        */
       
}
}
