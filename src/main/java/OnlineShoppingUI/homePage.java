package OnlineShoppingUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.Font;

public class homePage extends JFrame{
    public homePage(){
        JFrame tonsay = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel(); 
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel(); 
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel(); 
        JPanel panel6 = new JPanel();
      
        
        tonsay.setSize(900,700);
        tonsay.setTitle("Homepage");
        tonsay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tonsay.setResizable(false);
        tonsay.setLayout(null);
        tonsay.add(panel); 
        tonsay.add(panel1); 
        tonsay.add(panel2); 
        tonsay.add(panel3); 
        tonsay.add(panel4); 
        tonsay.add(panel5); 
        tonsay.add(panel6); 
       
        tonsay.setVisible(true);
        
        
       JButton btncart = new JButton("Cart");
       btncart.setBounds(780,30,70,30);
       btncart.setFont(new Font("Times New Roman",Font.BOLD, 12));
       
       JButton btncategory = new JButton("Category");
       btncategory.setBounds(680,30,90,30);
       btncategory.setFont(new Font("Times New Roman",Font.BOLD, 12));
         
       JLabel label = new JLabel ("HOMEPAGE");
       label.setBounds(150,30,100,35);
       label.setFont(new Font("Times New Roman", Font.BOLD, 15));
       label.setForeground(Color.WHITE);
        
       JLabel price1 = new JLabel("₱300.00 | Black Shirt");
       price1.setBounds(100 ,210,150,20);
       price1.setFont(new Font ("Times New Roman", Font.BOLD, 13));
       
       JLabel price2 = new JLabel("₱350.00 | Blouse");
       price2.setBounds(100, 210, 150, 20);
       price2.setFont(new Font ("Times New Roman", Font.BOLD, 13));
        
       JLabel price3 = new JLabel("₱3,950.00 | Nike Shoes");
       price3.setBounds(78, 210, 150, 20);
       price3.setFont(new Font ("Times New Roman", Font.BOLD, 13));
       
       JLabel price4 = new JLabel("₱1,350.00 | Vans Shoes");
       price4.setBounds(75, 270, 150, 20);
       price4.setFont(new Font ("Times New Roman", Font.BOLD, 13));
      
       JLabel price5 = new JLabel("₱350.00 | Women's Pants");
       price5.setBounds(78, 270, 150, 20);
       price5.setFont(new Font ("Times New Roman", Font.BOLD, 13));
       
       
       JLabel price6 = new JLabel("₱380.00 | Men's Pants");
       price6.setBounds(78, 270, 150, 20);
       price6.setFont(new Font ("Times New Roman", Font.BOLD, 13));
       
       //FOR TEST (CLICKABLE LOGO)
       JButton btnLogo = new JButton();
       ImageIcon logo = new ImageIcon(new ImageIcon("logopic.jpg").getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT));
       btnLogo.setIcon(logo);
       btnLogo.setBounds(0, 0, 120, 100); 
       btnLogo.setBorder(null);
       //
       
       JButton btnPic1 = new JButton();
       btnPic1.setBounds(90, 50, 133, 150);
       ImageIcon icon1 = new ImageIcon(new ImageIcon("blackshirt.png").getImage().getScaledInstance(133, 150, Image.SCALE_DEFAULT));
       btnPic1.setIcon(icon1);
       btnPic1.setBorder(null);
      
       JButton btnPic2 = new JButton();
       btnPic2.setBounds(95,50,113,150);
       ImageIcon icon2 = new ImageIcon (new ImageIcon("blouse.png").getImage().getScaledInstance(113,150, Image.SCALE_DEFAULT));
       btnPic2.setIcon(icon2);
       btnPic2.setBorder(null);
      
       JButton btnPic3 = new JButton();
       btnPic3.setBounds(75,50,135,150);
       ImageIcon icon3 = new ImageIcon (new ImageIcon("shoes2.png").getImage().getScaledInstance(135,150, Image.SCALE_DEFAULT));
       btnPic3.setIcon(icon3);
       btnPic3.setBorder(null);
      
       JButton btnPic4 = new JButton(); 
       btnPic4.setBounds(55,100,180,100);
       ImageIcon icon4 = new ImageIcon (new ImageIcon("shoes.png").getImage().getScaledInstance(180,100, Image.SCALE_DEFAULT));
       btnPic4.setIcon(icon4);
       btnPic4.setBorder(null);
       
       JButton btnPic5 = new JButton();  
       btnPic5.setBounds(100,80,100,150);
       ImageIcon icon5 = new ImageIcon (new ImageIcon("pants1.png").getImage().getScaledInstance(100,150, Image.SCALE_DEFAULT));
       btnPic5.setIcon(icon5);
       btnPic5.setBorder(null);
      
       JButton btnPic6 = new JButton();  
       btnPic6.setBounds(100,80,100,150);
       ImageIcon icon6 = new ImageIcon (new ImageIcon("pants.png").getImage().getScaledInstance(100,150, Image.SCALE_DEFAULT));
       btnPic6.setIcon(icon6);
       //btnPic6.setBorder(null);
       
       
       panel.setBackground(Color.BLACK);
       panel.setBounds( 0,0,900,100);
       panel.add(btncart);
       panel.add(btncategory);
       panel.add(label);
       panel.add(btnLogo);
       
       
       panel1.setBackground(new Color(244, 205, 241));
       panel1.setBounds( 0 ,100,300,250);
       panel1.add(price1);
       panel1.add(btnPic1);
       
       
       panel2.setBackground(new Color(244, 205, 241));
       panel2.setBounds( 300 ,100,300,250);
       panel2.add(price2);
       panel2.add(btnPic2);
       
       
       panel3.setBackground(new Color(244, 205, 241));
       panel3.setBounds( 600,100,300,250);
       panel3.add(price3);
       panel3.add(btnPic3);
      
       
       panel4.setBackground(new Color(244, 205, 241));
       panel4.setBounds( 0,350,300,350);
       panel4.add(price4);
       panel4.add(btnPic4);
       
       
       panel5.setBackground(new Color(244, 205, 241));
       panel5.setBounds( 300,350,300,350);
       panel5.add(price5);
       panel5.add(btnPic5);
       
       
       panel6.setBackground(new Color(244, 205, 241));
       panel6.setBounds( 600,350,300,350);
       panel6.add(price6);
       panel6.add(btnPic6);
   

    }
    
    public static void main(String[] args) {
        new homePage();
    }
    
}