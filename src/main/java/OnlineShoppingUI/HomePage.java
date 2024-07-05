
package OnlineShoppingUI;

import OnlineShoppingBL.*;
import OnlineShoppingDL.*;
import OnlineShoppingModels.*;


import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//import java.awt.event.*;


public class HomePage extends JFrame {
    
    ShoopeFeatures shoopeFeatures = new ShoopeFeatures();
  
        private JFrame tonsay;
        
        private JPanel panel;
        private JPanel productsMain;
        private JPanel panel1; 
        private JPanel panel2;
        private JPanel panel3; 
        
        
        private JButton btncart;
        private JButton btnLogo;
        private JButton btnAddToCart1;
        private JButton btnAddToCart2;
        private JButton btnAddToCart3;
       
        
        private JLabel lblhome;
        
        private JTextField txtprice;
        private JTextField producttxt1;
        private JTextField txtprice1;
        private JTextField producttxt2;
        private JTextField txtprice2;
        private JTextField producttxt3;
        
        private JButton btnPic1;
        private JButton btnPic2;
        private JButton btnPic3;
        
        
        
    public HomePage(){
        tonsay = new JFrame();
        
        panel = new JPanel();
        productsMain = new JPanel();
        btnLogo = new JButton();
        btncart = new JButton();
         
        tonsay.setSize(900,700);
        tonsay.setTitle("shOOPe");
        tonsay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tonsay.setResizable(false);
        tonsay.setLocationRelativeTo(null);
        tonsay.setLayout(null);
        tonsay.add(panel); 
        tonsay.add(productsMain); 
        
        tonsay.setVisible(true);
  
  
// menu 
       ImageIcon cart = new ImageIcon(new ImageIcon("cartIcon.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
       btncart.setBounds(785,25,40,40);
       btncart.setIcon(cart);
       btncart.setBackground(null);
       btncart.setBorder(null);
       btncart.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            new CartPage();
            tonsay.dispose();
        } 
    });
       panel.add(btncart);
      
       
       lblhome = new JLabel ("HOMEPAGE");
       lblhome.setBounds(130,30,100,35);
       lblhome.setFont(new Font("Times New Roman", Font.BOLD, 15));
       lblhome.setForeground(Color.WHITE);
       panel.add(lblhome);
            
       ImageIcon logo = new ImageIcon(new ImageIcon("shoopelogo.png").getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
       btnLogo.setIcon(logo);
       btnLogo.setBounds(20, 10, 100, 80); 
   //    btnLogo.addActionListener(this);
       btnLogo.setBorder(null); 
       panel.add(btnLogo);

        panel.setBackground(new Color(155, 114, 221));
        panel.setBounds( 0,0,900,100);
        panel.setLayout(null);
        // panel.add(label2);
           
    
          productsMain.setBackground(new Color(244, 205, 241));
         productsMain.setBounds( 0 ,100,900,600);
         productsMain.setLayout(null);
         productsMain.setVisible(true);
         
         //productsMain.add(panel1);
         int x = 0 ;
         int xx = 300;
         int xxx = 600;
         
         int y = 0 ;
         int yy = 0;
         int yyy = 0;
         
         //productsMain.add(panel2);
         //int yy = 0;
         //productsMain.add(panel3);
         // yyy = 0;

       ArrayList<ProductInfo> productInfo = shoopeFeatures.ProductInfoDisplay();
    
    for (int i = 0; i < productInfo.size(); i+=3) {
    panel1 = new JPanel();

    txtprice = new JTextField();
    producttxt1 = new JTextField();
    btnPic1 = new JButton();
    btnAddToCart1 = new JButton("Add to Cart");
    
    txtprice1 = new JTextField();
    producttxt2 = new JTextField();
    btnPic2 = new JButton();
    btnAddToCart2 = new JButton("Add to Cart");
    
    txtprice2 = new JTextField();
    producttxt3 = new JTextField();
    btnPic3 = new JButton();
    btnAddToCart3 = new JButton("Add to Cart");
    
    
    final ProductInfo product = productInfo.get(i);
    
    // product1
    txtprice.setText(String.valueOf(product.ProductPrice));
    txtprice.setBounds(50, 220, 100, 20);
    txtprice.setEditable(false);
    txtprice.setBorder(null);
    txtprice.setBackground(null);
    panel1.add(txtprice);

    producttxt1.setText(product.ProductName);
    producttxt1.setFont(new Font ("Roboto", Font.PLAIN, 11));
    producttxt1.setBounds(50, 200, 200, 20);
    producttxt1.setEditable(false);
    producttxt1.setBorder(null);
    producttxt1.setBackground(null);
    panel1.add(producttxt1);

    ImageIcon icon1 = new ImageIcon(new ImageIcon(String.valueOf(product.Picture)).getImage().getScaledInstance(133, 150, Image.SCALE_DEFAULT));
    btnPic1.setIcon(icon1);
    btnPic1.setBorder(null);
    btnPic1.setBounds(90, 40, 133, 150);
    panel1.add(btnPic1);

    
    btnAddToCart1.setBounds(150, 220, 100, 20);
    panel1.add(btnAddToCart1);
    
    //final ProductInfo product1 = productInfo.get(i);
    btnAddToCart1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            var x = new ProductView(product.ProductID, product.ProductName,product.ProductPrice, product.Picture);
            tonsay.dispose();
        } 
    });
    
    btnPic1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            var x = new ProductView(product.ProductID, product.ProductName,product.ProductPrice, product.Picture);
            tonsay.dispose();
        } 
    });

    
    panel1.setBackground(new Color(244, 205, 241));
    panel1.setLayout(null);
    panel1.setBounds(x, y, 300, 250);
    
    
    productsMain.add(panel1);
    y += 250;
}    
    
for (int i = 1; i < productInfo.size(); i+=3) {
    // Create a new panel for each product
  
    panel2 = new JPanel();
    panel3 = new JPanel();

    
   
    
    txtprice1 = new JTextField();
    producttxt2 = new JTextField();
    btnPic2 = new JButton();
    btnAddToCart2 = new JButton("Add to Cart");
    
    
    
    
    final ProductInfo product = productInfo.get(i);
        
    // product1
    txtprice1.setText(String.valueOf(product.ProductPrice));
    txtprice1.setBounds(50, 220, 100, 20);
    txtprice1.setEditable(false);
    txtprice1.setBorder(null);
    txtprice1.setBackground(null);
    panel2.add(txtprice1);

    producttxt2.setText(product.ProductName);
    producttxt2.setFont(new Font ("Roboto", Font.PLAIN, 11));
    producttxt2.setBounds(50, 200, 200, 20);
    producttxt2.setEditable(false);
    producttxt2.setBorder(null);
    producttxt2.setBackground(null);
    panel2.add(producttxt2);

    /*ImageIcon icon2 = new ImageIcon (new ImageIcon("blouse.png").getImage().getScaledInstance(113,150, Image.SCALE_DEFAULT));*/
    ImageIcon icon2 = new ImageIcon (new ImageIcon(product.Picture).getImage().getScaledInstance(133,150, Image.SCALE_DEFAULT));
    btnPic2.setIcon(icon2);
    btnPic2.setBorder(null);
    btnPic2.setBounds(90, 40, 133, 150);
    panel2.add(btnPic2);
    


    // Adding "Add to Cart" button with ActionListener
    btnAddToCart2.setBounds(150, 220, 100, 20);
    panel2.add(btnAddToCart2);
    
    //final ProductInfo product = productInfo.get(i);
    btnAddToCart2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            var x = new ProductView(product.ProductID, product.ProductName ,product.ProductPrice, product.Picture);
            tonsay.dispose();
        } 
    });
    
    btnPic2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            var x = new ProductView(product.ProductID, product.ProductName,product.ProductPrice, product.Picture);
            tonsay.dispose();
        } 
    });

    // Setting panel properties
    panel2.setBackground(new Color(244, 205, 241));
    panel2.setLayout(null);
    panel2.setBounds(xx, yy, 300, 250);
    
    
    
    // Adding the panel to the main container
    productsMain.add(panel2);
    yy += 250;
    
}

for (int i = 2; i < productInfo.size(); i+=3) {
    // Create a new panel for each product
    
    panel3 = new JPanel();

    // Create new instances of JTextField, JButton, and other components for each product
   
    txtprice2 = new JTextField();
    producttxt3 = new JTextField();
    btnPic3 = new JButton();
    btnAddToCart3 = new JButton("Add to Cart");
    
    
    final ProductInfo product = productInfo.get(i);
    
    
    // product1
    txtprice2.setText(String.valueOf(product.ProductPrice));
    txtprice2.setBounds(50, 220, 100, 20);
    txtprice2.setEditable(false);
    txtprice2.setBorder(null);
    txtprice2.setBackground(null);
    panel3.add(txtprice2);

    producttxt3.setText(product.ProductName);
    producttxt3.setFont(new Font ("Roboto", Font.PLAIN, 11));
    producttxt3.setBounds(50, 200, 200, 20);
    producttxt3.setEditable(false);
    producttxt3.setBorder(null);
    producttxt3.setBackground(null);
    panel3.add(producttxt3);

     ImageIcon icon3 = new ImageIcon (new ImageIcon(product.Picture).getImage().getScaledInstance(135,150, Image.SCALE_DEFAULT));
     btnPic3.setIcon(icon3);
    btnPic3.setBorder(null);
    btnPic3.setBounds(90, 40, 133, 150);
    panel3.add(btnPic3);

    // Adding "Add to Cart" button with ActionListener
    btnAddToCart3.setBounds(150, 220, 100, 20);
    panel3.add(btnAddToCart3);
    
    //final ProductInfo product3 = productInfo.get(i);
    btnAddToCart3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            var x = new ProductView(product.ProductID, product.Picture,product.ProductPrice, product.Picture);
            tonsay.dispose();
        } 
    });
    
    btnPic3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            var x = new ProductView(product.ProductID, product.ProductName,product.ProductPrice, product.Picture);
            tonsay.dispose();
        } 
    });

    // Setting panel properties
    panel3.setBackground(new Color(244, 205, 241));
    panel3.setLayout(null);
    panel3.setBounds(xxx, yyy, 300, 250);
    
    
    
    // Adding the panel to the main container
    productsMain.add(panel3);
    yyy += 250;
    
    
}

// Revalidate and repaint the main container after adding all panels
productsMain.revalidate();
productsMain.repaint();

    }
    
}
