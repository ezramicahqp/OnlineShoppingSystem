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
        tonsay.setTitle("shOOPe");
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
        
        
//       JButton btncart = new JButton("Cart");
//       btncart.setBounds(780,30,70,30);
//       btncart.setFont(new Font("Roboto",Font.BOLD, 12));

       JButton btncart = new JButton();
       ImageIcon cart = new ImageIcon(new ImageIcon("cartIcon.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
       btncart.setBounds(785,25,40,40);
       btncart.setIcon(cart);
       btncart.setBackground(null);
       btncart.setBorder(null);

       
       JButton btncategory = new JButton("Category");
       btncategory.setBounds(680,30,90,30);
       btncategory.setFont(new Font("Roboto",Font.BOLD, 12));
         
       JLabel label = new JLabel ("HOMEPAGE");
       label.setBounds(130,30,100,35);
       label.setFont(new Font("Times New Roman", Font.BOLD, 15));
       label.setForeground(Color.WHITE);
       
      // JLabel label2 = new JLabel ("shOOPe");
      // label2.setBounds(150,50,100,35);
      // label2.setFont(new Font("Times New Roman", Font.BOLD, 15));
      // label2.setForeground(Color.WHITE);
       
//        JLabel pricelbl = new JLabel("Price:");
//        pricelbl.setBounds(35, 220, 100, 20);
//        pricelbl.setFont(new Font ("Roboto", Font.BOLD, 13));
        JTextField txtprice = new JTextField();
        txtprice.setText("Php 300");
        txtprice.setBounds(50, 220, 100, 20);
        txtprice.setEditable(false);
        txtprice.setBorder(null);
        txtprice.setBackground(null);
        
        JTextField producttxt1 = new JTextField();
        producttxt1.setText("Black Shirt");
        //producttxt1.setFont(new Font ("Roboto", Font.BOLD, 13));
        producttxt1.setBounds(50,200,150,20);
        producttxt1.setEditable(false);
        producttxt1.setBorder(null);
        producttxt1.setBackground(null);
      
        
//       JLabel pricelbl1 = new JLabel("Price:");
//       pricelbl1.setBounds(20, 220, 100, 20);
//       pricelbl1.setFont(new Font ("Roboto", Font.BOLD, 13));
       JTextField txtprice1 = new JTextField();
        txtprice1.setText("Php 300");
        txtprice1.setBounds(50, 220, 100, 20);
        txtprice1.setEditable(false);
        txtprice1.setBorder(null);
        txtprice1.setBackground(null);
       
       JTextField producttxt2 = new JTextField();
       producttxt2.setText("Women's Blouse");
       //producttxt2.setFont(new Font ("Roboto", Font.BOLD, 13));
       producttxt2.setBounds(50,200,150,20);
       producttxt2.setEditable(false);
       producttxt2.setBorder(null);
       producttxt2.setBackground(null);
       
//       JLabel pricelbl2 = new JLabel("Price:");
//       pricelbl2.setBounds(20, 220, 100, 20);
//       pricelbl2.setFont(new Font ("Roboto", Font.BOLD, 13));
       JTextField txtprice2 = new JTextField();
        txtprice2.setText("Php 300");
        txtprice2.setBounds(50, 220, 100, 20);
        txtprice2.setEditable(false);
        txtprice2.setBorder(null);
        txtprice2.setBackground(null);
       
       
       JTextField producttxt3 = new JTextField();
       producttxt3.setText("Nike Shoes");
       //producttxt3.setFont(new Font ("Roboto", Font.BOLD, 13));
       producttxt3.setBounds(50,200,150,20);
       producttxt3.setEditable(false);
       producttxt3.setBorder(null);
       producttxt3.setBackground(null);
       
//       JLabel pricelbl3 = new JLabel("Price:");
//       pricelbl3.setBounds(35, 270, 100, 20);
//       pricelbl3.setFont(new Font ("Roboto", Font.BOLD, 13));
       JTextField txtprice3 = new JTextField();
        txtprice3.setText("Php 300");
        txtprice3.setBounds(50, 220, 100, 20);
        txtprice3.setEditable(false);
        txtprice3.setBorder(null);
        txtprice3.setBackground(null);
       
       JTextField producttxt4 = new JTextField();
       producttxt4.setText("Nike Shoes");
       //producttxt4.setFont(new Font ("Roboto", Font.BOLD, 13));
       producttxt4.setBounds(50,200,150,20);
       producttxt4.setEditable(false);
       producttxt4.setBorder(null);
       producttxt4.setBackground(null);
       
//       JLabel pricelbl4 = new JLabel("Price:");
//       pricelbl4.setBounds(35, 270, 100, 20);
//       pricelbl4.setFont(new Font ("Roboto", Font.BOLD, 13));
       JTextField txtprice4 = new JTextField();
        txtprice4.setText("Php 300");
        txtprice4.setBounds(50, 220, 100, 20);
        txtprice4.setEditable(false);
        txtprice4.setBorder(null);
        txtprice4.setBackground(null);
       
       JTextField producttxt5 = new JTextField();
       producttxt5.setText("Women's Pants");
       //producttxt5.setFont(new Font ("Roboto", Font.BOLD, 13));
       producttxt5.setBounds(50,200,150,20);
       producttxt5.setEditable(false);
       producttxt5.setBorder(null);
       producttxt5.setBackground(null);
       
//      JLabel pricelbl5 = new JLabel("Price:");
//       pricelbl5.setBounds(35, 270, 100, 20);
//       pricelbl5.setFont(new Font ("Roboto", Font.BOLD, 13));
       JTextField txtprice5 = new JTextField();
        txtprice5.setText("Php 300");
        txtprice5.setBounds(50, 220, 100, 20);
        txtprice5.setEditable(false);
        txtprice5.setBorder(null);
        txtprice5.setBackground(null);
       
       JTextField producttxt6 = new JTextField();
       producttxt6.setText("Men's Pants");
       //producttxt6.setFont(new Font ("Roboto", Font.BOLD, 13));
       producttxt6.setBounds(50,200,150,20);
       producttxt6.setEditable(false);
       producttxt6.setBorder(null);
       producttxt6.setBackground(null);
       
       
       
       
       
       
      // JLabel price1 = new JLabel("₱300.00 | Black Shirt");
      // price1.setBounds(100 ,210,150,20);
      // price1.setFont(new Font ("Roboto", Font.BOLD, 13));
       
      // JLabel price2 = new JLabel("₱350.00 | Blouse");
     //  price2.setBounds(100, 210, 150, 20);
     //  price2.setFont(new Font ("Roboto", Font.BOLD, 13));
        
     //  JLabel price3 = new JLabel("₱3,950.00 | Nike Shoes");
     //  price3.setBounds(78, 210, 150, 20);
    //   price3.setFont(new Font ("Roboto", Font.BOLD, 13));
       
     //  JLabel price4 = new JLabel("₱1,350.00 | Vans Shoes");
     //  price4.setBounds(75, 270, 150, 20);
     //  price4.setFont(new Font ("Roboto", Font.BOLD, 13));
      
     //  JLabel price5 = new JLabel("₱350.00 | Women's Pants");
     //  price5.setBounds(78, 270, 200, 20);
      // price5.setFont(new Font ("Roboto", Font.BOLD, 13));
       
       
       JLabel price6 = new JLabel("₱380.00 | Men's Pants");
       price6.setBounds(78, 270, 150, 20);
       price6.setFont(new Font ("Roboto", Font.BOLD, 13));
       
       //FOR TEST (CLICKABLE LOGO)
       JButton btnLogo = new JButton();
       ImageIcon logo = new ImageIcon(new ImageIcon("shoopelogo.png").getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
       btnLogo.setIcon(logo);
       btnLogo.setBounds(20, 10, 100, 80); 
       btnLogo.setBorder(null);
       
       
       
       JButton btnPic1 = new JButton();
       btnPic1.setBounds(90, 40, 133, 150);
       ImageIcon icon1 = new ImageIcon(new ImageIcon("blackshirt.png").getImage().getScaledInstance(133, 150, Image.SCALE_DEFAULT));
       btnPic1.setIcon(icon1);
       btnPic1.setBorder(null);

       JButton btnPic2 = new JButton();
       btnPic2.setBounds(95,40,113,150);
       ImageIcon icon2 = new ImageIcon (new ImageIcon("blouse.png").getImage().getScaledInstance(113,150, Image.SCALE_DEFAULT));
       btnPic2.setIcon(icon2);
       btnPic2.setBorder(null);

       JButton btnPic3 = new JButton();
       btnPic3.setBounds(75,40,135,150);
       ImageIcon icon3 = new ImageIcon (new ImageIcon("shoes2.png").getImage().getScaledInstance(135,150, Image.SCALE_DEFAULT));
       btnPic3.setIcon(icon3);
       btnPic3.setBorder(null);

       JButton btnPic4 = new JButton(); 
       btnPic4.setBounds(55,90,180,100);
       ImageIcon icon4 = new ImageIcon (new ImageIcon("shoes.png").getImage().getScaledInstance(180,100, Image.SCALE_DEFAULT));
       btnPic4.setIcon(icon4);
       btnPic4.setBorder(null);


       JButton btnPic5 = new JButton();  
       btnPic5.setBounds(100,40,100,150);
       ImageIcon icon5 = new ImageIcon (new ImageIcon("pants1.png").getImage().getScaledInstance(100,150, Image.SCALE_DEFAULT));
       btnPic5.setIcon(icon5);
       btnPic5.setBorder(null);
      

       JButton btnPic6 = new JButton();  
       btnPic6.setBounds(100,40,100,150);
       ImageIcon icon6 = new ImageIcon (new ImageIcon("pants.png").getImage().getScaledInstance(100,150, Image.SCALE_DEFAULT));
       btnPic6.setIcon(icon6);
       btnPic6.setBorder(null);


       
       JButton btnAddToCart1 = new JButton("Add to Cart");
        btnAddToCart1.setBounds(150, 220, 100, 20);
       
       JButton btnAddToCart2 = new JButton("Add to Cart");
        btnAddToCart2.setBounds(150, 220, 100, 20);
       
       JButton btnAddToCart3 = new JButton("Add to Cart");
        btnAddToCart3.setBounds(150, 220, 100, 20);
       
       JButton btnAddToCart4 = new JButton("Add to Cart");
        btnAddToCart4.setBounds(150, 220, 100, 20);
       
       JButton btnAddToCart5 = new JButton("Add to Cart");
        btnAddToCart5.setBounds(150, 220, 100, 20);
       
       JButton btnAddToCart6 = new JButton("Add to Cart");
        btnAddToCart6.setBounds(150, 220, 100, 20);
       
       
       panel.setBackground(new Color(155, 114, 221));
       panel.setBounds( 0,0,900,100);
       panel.add(btncart);
       panel.add(btncategory);
       panel.add(label);
    // panel.add(label2);
       panel.add(btnLogo);
       panel.setLayout(null);
      
       
       
       panel1.setBackground(new Color(244, 205, 241));
       panel1.setBounds( 0 ,100,300,250);
     //panel1.add(price1);
       panel1.add(btnPic1);
       //panel1.add(pricelbl);
       panel1.add(txtprice);
       panel1.add(producttxt1);
       panel1.add(btnAddToCart1);
       panel1.setLayout(null);
       
       
       panel2.setBackground(new Color(244, 205, 241));
       panel2.setBounds( 300 ,100,300,250);
     //panel2.add(price2);
       panel2.add(btnPic2);
       //panel2.add( pricelbl1);
       panel2.add(txtprice1);
       panel2.add(producttxt2);
       panel2.add(btnAddToCart2);
       panel2.setLayout(null);
       
       
       panel3.setBackground (new Color(244, 205, 241));
       panel3.setBounds( 600,100,300,250);
     //panel3.add(price3);
       panel3.add(btnPic3);
       //panel3.add( pricelbl2);
       panel3.add(txtprice2);
       panel3.add(producttxt3);
       panel3.add(btnAddToCart3);
       panel3.setLayout(null);
      
       
       panel4.setBackground(new Color(244, 205, 241));
       panel4.setBounds( 0,350,300,350);
     //panel4.add(price4);
       panel4.add(btnPic4);
       //panel4.add( pricelbl3);
       panel4.add(txtprice3);
       panel4.add(producttxt4);
       panel4.add(btnAddToCart4);
       panel4.setLayout(null);
       
       
       panel5.setBackground(new Color(244, 205, 241));
       panel5.setBounds( 300,350,300,350);
     //panel5.add(price5);
       panel5.add(btnPic5);
       //panel5.add( pricelbl4);
       panel5.add(txtprice4);
       panel5.add(producttxt5);
       panel5.add(btnAddToCart5);
       panel5.setLayout(null);
       
       
       
       panel6.setBackground(new Color(244, 205, 241));
       panel6.setBounds( 600,350,300,350);
     //panel6.add(price6);
       panel6.add(btnPic6);
       //panel6.add( pricelbl5);
       panel6.add(txtprice5);
       panel6.add(producttxt6);
       panel6.add(btnAddToCart6);
       panel6.setLayout(null);

    }
    
    public static void main(String[] args) {
        new homePage();
    }
    
}