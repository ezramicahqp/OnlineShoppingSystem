package OnlineShoppingUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.Font;

public class homePage extends JFrame{
    public homePage(){
        JFrame tonsay = new JFrame();
        JPanel layout = new JPanel();
        
        tonsay.setSize(900,700);
        tonsay.setName("Homepage");
        tonsay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tonsay.setLayout(new BorderLayout());
        tonsay.setVisible(true);
        
        tonsay.add(layout);

       JButton btncart = new JButton("Cart");
       btncart.setBounds(750,20,70,40);
       btncart.setFont(new Font("Serif",Font.BOLD, 12));
       btncart.getAlignmentY();
       tonsay.add(btncart);
       
       JButton btncategory = new JButton("Category");
       btncategory.setBounds(650,20,90,40);
       btncategory.setFont(new Font("Serif",Font.BOLD, 12));
       tonsay.add(btncategory);
       
       JLabel label = new JLabel ("HOMEPAGE");
       label.setBounds(150,20,100,35);
       label.setFont(new Font("Serif",Font.BOLD, 13));
       tonsay.add(label);
              
       JLabel price1 = new JLabel("₱300.00 | Black Shirt");
       price1.setBounds(100, 280, 300, 35);
       price1.setFont(new Font ("Serif", Font.BOLD, 13));
       tonsay.add(price1);
       
       JLabel price2 = new JLabel("₱350.00 | Blouse");
       price2.setBounds(100, 580, 300, 35);
       price2.setFont(new Font ("Serif", Font.BOLD, 13));
       tonsay.add(price2);
       
       JLabel price3 = new JLabel("₱3,950.00 | Nike Shoes");
       price3.setBounds(350, 280, 300, 35);
       price3.setFont(new Font ("Serif", Font.BOLD, 13));
       tonsay.add(price3);
       
       JLabel price4 = new JLabel("₱1,350.00 | Vans Shoes");
       price4.setBounds(350, 580, 300, 35);
       price4.setFont(new Font ("Serif", Font.BOLD, 13));
       tonsay.add(price4);
       
       JLabel price5 = new JLabel("₱350.00 | Women's Pants");
       price5.setBounds(650, 280, 300, 35);
       price5.setFont(new Font ("Serif", Font.BOLD, 13));
       tonsay.add(price5);
       
       JLabel price6 = new JLabel("₱380.00 | Men's Pants");
       price6.setBounds(650, 580, 300, 35);
       price6.setFont(new Font ("Serif", Font.BOLD, 13));
       tonsay.add(price6);
       
       ImageIcon logol = new ImageIcon("logo.jpg");
       JLabel logolbl = new JLabel(logol);
       logolbl.setIcon(logol);
       logolbl.setBounds(100, 50, 50, 50);
       tonsay.add(logolbl);
       logolbl.validate();
       
       ImageIcon blouse = new ImageIcon("blouse.jpg");
       JLabel toplabel = new JLabel(blouse);
       toplabel.setIcon(blouse);
       toplabel.setBounds(50, 580, 113,150);
       tonsay.add(toplabel);
       toplabel.validate();
       
       
       layout.setBackground(new Color(244,205,241));
       layout.setPreferredSize(new Dimension (100,90));
       layout.add(btncart);
       layout.add(btncategory);
       layout.add(label);
       layout.add(price1);
       layout.add(price2);
       layout.add(price3);
       layout.add(price4);
       layout.add(price5);
       layout.add(price6);
   
       layout.add(logolbl);
       layout.add(toplabel);
       
    }
    
    public static void main(String[] args) {
        new homePage();
    }
    
}
