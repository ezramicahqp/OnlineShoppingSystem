package OnlineShoppingUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.Icon;

public class homePage extends JFrame{
    public homePage(){
        JFrame tonsay = new JFrame();
        JPanel layout = new JPanel();
        tonsay.setBackground(Color.black);
        tonsay.setSize(900,700);
        tonsay.setName("Homepage");
        tonsay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
       
       JLabel label = new JLabel ("Homepage");
       label.setBounds(150,20,70,35);
       label.setFont(new Font("Serif",Font.BOLD, 13));
       tonsay.add(label);
       
       ImageIcon logol = new ImageIcon("logo.jpg");
       JLabel logolbl = new JLabel(logol);
       logolbl.setIcon(logol);
       logolbl.setBounds(50, 20, 40, 30);
       tonsay.add(logolbl);
       logolbl.validate();
       
       
       ImageIcon blouse = new ImageIcon("blouse.jpg");
       JLabel toplabel = new JLabel(blouse);
       toplabel.setIcon(blouse);
       toplabel.setBounds(50, 500, 50,40);
       tonsay.add(toplabel);
       toplabel.validate();
       
       
       JLabel price1 = new JLabel("₱300.00 | Black Shirt");
       price1.setBounds(150, 200, 70, 35);
       price1.setFont(new Font ("Serif", Font.BOLD, 13));
       tonsay.add(price1);
       
       
       layout.add(btncart);
       layout.add(btncategory);
       layout.add(label);
       layout.add(logolbl);
       layout.add(toplabel);
       layout.add(price1);
    }
    
    

    
    
    
    
    
    

    public static void main(String[] args) {
        new homePage();
    }
    
}