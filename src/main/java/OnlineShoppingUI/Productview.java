

package OnlineShoppingUI;





import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;


public class Productview extends JFrame{
   
    Productview(){
        JFrame f = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
      
      
        f.setTitle("Product View");
        f.setSize(900, 700);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(panel);
        f.add(panel2);
        f.add(panel3);
        f.add(panel4);
        f.add(panel5);
        f.add(panel6);
        f.add(panel7);
         
        f.setVisible(true);
        
        JButton btncart = new JButton();
        btncart.setBounds(780,30,90,30);
        ImageIcon cart = new ImageIcon(new ImageIcon("cartIcon.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        btncart.setIcon(cart);
        btncart.setBackground(null);
        btncart.setBorder(null);
        
        JButton btncategory = new JButton("Category");
        btncategory.setBounds(680,30,90,30);
        btncategory.setFont(new Font("Roboto",Font.BOLD, 12));
        
        JButton btncolor = new JButton("Color");
        btncolor.setBounds(600,170,100,40);
       
        JButton btnsize = new JButton("Size");
        btnsize.setBounds(750,170,100,40);
     
        JButton btnadd = new JButton("Add to Cart");
        btnadd.setBounds(600,250,100,40);
     
        JButton btnquantity = new JButton("Quantity");
        btnquantity.setBounds(750,250,100,40);
    
        JTextField name = new JTextField("Product name");
        name.setBounds(690,70,100,100);
    
        JButton btnLogo = new JButton();
        ImageIcon logo = new ImageIcon(new ImageIcon("shoopelogo.png").getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
        btnLogo.setIcon(logo);
        btnLogo.setBounds(20, 10, 100, 80); 
        btnLogo.setBorder(null);
        
       JButton btnPic3 = new JButton();
       btnPic3.setBounds(175,40,135,150);
       ImageIcon icon3 = new ImageIcon (new ImageIcon("shoes2.png").getImage().getScaledInstance(135,150, Image.SCALE_DEFAULT));
       btnPic3.setIcon(icon3);
       btnPic3.setBorder(null);

        
        f.add(btncart);
        f.add(btncategory);
        f.add(btncolor);
        f.add(btnsize);
        f.add(btnadd);
        f.add(btnquantity);
        f.add(name);
        
        
        
        panel.setBackground(new Color(155, 114, 221));
        panel.setBounds( 0,0,900,100);
        panel.add(btncart);
        panel.add(btncategory);
        panel.add(btnLogo);
       
        
        panel2.setBackground(new Color(244, 205, 241));
        panel2.setBounds( 0 ,100,300,250);
        panel2.add(btnPic3);
        
        panel3.setBackground(new Color(244, 205, 241));
        panel3.setBounds( 300 ,100,300,250);
        
        panel4.setBackground(new Color(244, 205, 241));
        panel4.setBounds( 600,100,300,250);
        
        panel5.setBackground(new Color(244, 205, 241));
        panel5.setBounds( 0,350,300,350);
        
        panel6.setBackground(new Color(244, 205, 241));
        panel6.setBounds( 300,350,300,350);
        
        panel7.setBackground(new Color(244, 205, 241));
        panel7.setBounds( 600,350,300,350);
    }

 
}
