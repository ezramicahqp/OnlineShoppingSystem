
package OnlineShoppingUI;

import OnlineShoppingBL.*;
import OnlineShoppingDL.*;
import OnlineShoppingModels.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class ProductView extends JFrame implements ActionListener{
    
    public ShoopeFeatures shoopeFeatures = new ShoopeFeatures();
    private String prodName;
    
    JFrame f;
    JPanel panel;
    JPanel panel2;

    
  
   private JButton btncart = new JButton();
   private JComboBox <String>cmbcolor;
   private JComboBox <String>cmbsize;
   private JTextField name = new JTextField();
   private JButton btnadd = new JButton("Add to Cart");
   private JButton btnAddQuantity, btnMinusQuantity;
   private JLabel lblQuantity;
   private JTextField txtPrice = new JTextField();
   private  JButton btnLogo = new JButton();
   private JButton btnPic3 = new JButton();
   private JTextField txtDescription = new JTextField();
   private int intQuantity = 0;
   private int total;
   private int price;
   private JLabel selectedSize = new JLabel();
   private JLabel selectedColor = new JLabel();
   
   
    ProductView(int productID, String productName, int productPrice, String picture){
 
        f = new JFrame();
        panel = new JPanel();
        panel2 = new JPanel();
        
        this.price = productPrice;

    
        f.setTitle("Product View");
        f.setSize(900, 700);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.add(panel);
        f.add(panel2);

         
        f.setVisible(true);
        
        
        btncart.setBounds(780,30,90,30);
        ImageIcon cart = new ImageIcon(new ImageIcon("cartIcon.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        btncart.setIcon(cart);
        btncart.setBackground(null);
        btncart.setBorder(null);
        btncart.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            new CartPage();
            f.dispose();
        } 
    });
     
       
        
        
        cmbcolor = new JComboBox<>();
        ArrayList<ProductInfo> colors = shoopeFeatures.GetProductColors();
        for (int i = 0; i < colors.size(); i++) {
            
            final ProductInfo color = colors.get(i);
            cmbcolor.addItem(color.ProductColor);
        }
        cmbcolor.setBounds(500,250,100,30);
        panel2.add(cmbcolor);
        
        String color = cmbcolor.getSelectedItem().toString();
        selectedColor.setText( color);
       
        
        cmbsize = new JComboBox<>();
        ArrayList<ProductInfo> sizes = shoopeFeatures.GetProductSizes();
        for (int i = 0; i < sizes.size(); i++) {
            
            final ProductInfo size = sizes.get(i);
            cmbsize.addItem(size.ProductSize);
        }
        cmbsize.setBounds(700,250,100,30);
        panel2.add(cmbsize);
        
        String size = (String) cmbsize.getSelectedItem();
        selectedSize.setText( size);

        
        btnAddQuantity = new JButton("+");
        btnAddQuantity.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            intQuantity++;
            lblQuantity.setText(String.valueOf(intQuantity));
        } 
    });
        btnAddQuantity.setBounds(500,200,50,30);
        panel2.add(btnAddQuantity);
        
        lblQuantity = new JLabel("0");
        lblQuantity.setBounds(570,200,30,30);
        panel2.add(lblQuantity);
        
        btnMinusQuantity = new JButton("-");
        btnMinusQuantity.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if(intQuantity > 0){
            intQuantity--;
            lblQuantity.setText(String.valueOf(intQuantity));}
        } 
    });
        btnMinusQuantity.setBounds(600,200,50,30);
        panel2.add(btnMinusQuantity);
    
        
        name.setText(productName);
        name.setFont(new Font("Roboto", Font.BOLD, 16));
        name.setEditable(false);
        name.setBorder(null);
        name.setBackground(null);
        name.setBounds(500,90,300,50);
        panel2.add(name);
        
        txtPrice.setText(String.valueOf(productPrice));
        txtPrice.setBounds(500,130,300,50);
        txtPrice.setEditable(false);
        txtPrice.setBorder(null);
        txtPrice.setBackground(null);
        panel2.add(txtPrice);
        
        total = intQuantity * productPrice;
        
       
        ImageIcon logo = new ImageIcon(new ImageIcon("shoopelogo.png").getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
        btnLogo.setIcon(logo);
        btnLogo.setBounds(20, 10, 100, 80); 
        btnLogo.setBorder(null);
        btnLogo.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            new HomePage();
            f.dispose();
        } 
    });
        
       btnPic3.setBounds(100,70,320,360);
       ImageIcon icon3 = new ImageIcon (new ImageIcon(picture).getImage().getScaledInstance(320,360, Image.SCALE_DEFAULT));
       btnPic3.setIcon(icon3);
       btnPic3.setBorder(null);
       
      
     
        
        panel.setBackground(new Color(155, 114, 221));
        panel.setBounds( 0,0,900,100);
        panel.add(btncart);
        panel.add(btnLogo);
        panel.setLayout(null);
       
        
        panel2.setBackground(new Color(244, 205, 241));
        panel2.setBounds( 0 ,100,900,600);
        panel2.add(btnPic3);
        panel2.setLayout(null);
        
        //ProductInfo productInfo = new ProductInfo();
        //productInfo.ItemTotal = total;
        
    btnadd.setBounds(500,400,100,30);
    panel2.add(btnadd);
    btnadd.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            total = intQuantity * productPrice;
            
            String size = (String) cmbsize.getSelectedItem();
            selectedSize.setText( size);
            
            String color = cmbcolor.getSelectedItem().toString();
            selectedColor.setText( color);
            
            ProductInfo prodInfo = new ProductInfo();
            prodInfo.ProductID = productID;
            prodInfo.ProductName = productName;
            prodInfo.ProductPrice = price;
            prodInfo.Picture = picture;
            prodInfo.ProductSize = selectedSize.getText();
            prodInfo.ProductColor = selectedColor.getText();
            prodInfo.ItemTotal = total;
            
            shoopeFeatures.AddToCart(prodInfo, intQuantity);
        } 
    });
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

