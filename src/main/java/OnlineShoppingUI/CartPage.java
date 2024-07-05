
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

public class CartPage extends JFrame implements ActionListener{

    private final JFrame frame = new JFrame();
    private final JPanel upperPanel = new JPanel();
    private final JPanel mainPanel = new JPanel();
    private final JLabel label = new JLabel("My Cart");
    private final JButton btnLogo = new JButton();
   // private final JButton btnDelete = new JButton("Delete");
    private final JButton btnCheckout = new JButton("Checkout");
    
    
    private final JPanel pnlproduct = new JPanel();
    private final JButton btnPicture = new JButton();
    private final JTextField txtproductName = new JTextField();
    private final JLabel lblProductSize = new JLabel("size:");
    private final JTextField txtSize = new JTextField();
    private final JLabel lblProductColor = new JLabel("color:");
    private final JTextField txtColor = new JTextField();
    private final JTextField txtPrice = new JTextField();
    private final JLabel lblProductQuantity = new JLabel("quantity:");
    private final JTextField txtQuantity = new JTextField();
    private final JCheckBox checkBox = new JCheckBox();
    private  ImageIcon logo = new ImageIcon("shoopelogo.png");
    
    ShoopeFeatures shoopeFeatures = new ShoopeFeatures();
    
    public CartPage(){
     
       //FRAME  
        frame.setTitle("shOOPe");
        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(upperPanel);
        frame.add(mainPanel);
        
        
    //MAIN PANEL
        upperPanel.setSize(900, 65);
        upperPanel.setBackground(new Color(155, 114, 221));
        upperPanel.setBounds(0, 0, 900, 65);
        
        label.setBounds(130, 20, 80, 25);
        label.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label.setForeground(Color.WHITE);
        upperPanel.add(label);
        
        ImageIcon logo = new ImageIcon(new ImageIcon("shoopelogo.png").getImage().getScaledInstance(90, 70, Image.SCALE_DEFAULT));
        btnLogo.setIcon(logo);
        btnLogo.setBounds(30, 0, 90, 70); 
        btnLogo.setBorder(null);
        btnLogo.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            new HomePage();
            frame.dispose();
        } 
    });
        upperPanel.add(btnLogo);
        
//        btnDelete.setBounds(650, 20, 80, 25);
//        btnDelete.addActionListener(this);
//        upperPanel.add(btnDelete);
        
//        btnCheckout.setBounds(750, 20, 90, 25);
//        btnCheckout.addActionListener(new ActionListener(){
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            var x = new ProductView(product.ProductID, product.ProductName,product.ProductPrice, product.Picture);
//            frame.dispose();
//        } 
//    });
//        upperPanel.add(btnCheckout);
        upperPanel.setLayout(null);
   
         mainPanel.setBackground(new Color(244, 205, 241));
         mainPanel.setBounds( 0 ,70,900,1000);
         mainPanel.setLayout(null);

    
      
        
        int y = 0;
        

    
     ArrayList<ProductInfo> productInfo = shoopeFeatures.CartItemsDisplay();
    
    for (int i = 0; i < productInfo.size(); i++) {  
        
        final ProductInfo product = productInfo.get(i);
        
        txtproductName.setText(product.ProductName);
        txtproductName.setBounds(350, 30, 500, 20);
        txtproductName.setEditable(false);
        txtproductName.setBorder(null);
        txtproductName.setBackground(null);
        pnlproduct.add(txtproductName);
        
        lblProductSize.setBounds(500, 90, 100, 20);
        pnlproduct.add(lblProductSize);
        txtSize.setText(product.ProductSize);
        txtSize.setBounds(550, 90, 100, 20);
        txtSize.setEditable(false);
        txtSize.setBorder(null);
        txtSize.setBackground(null);
        pnlproduct.add(txtSize);
               
        lblProductColor.setBounds(350, 90, 100, 20);
        pnlproduct.add(lblProductColor);
        txtColor.setText(product.ProductColor);
        txtColor.setBounds(400, 90, 100, 20);
        txtColor.setEditable(false);
        txtColor.setBorder(null);
        txtColor.setBackground(null);
        pnlproduct.add(txtColor);
        
        
        txtPrice.setText(String.valueOf(product.ItemTotal));
        txtPrice.setBounds(350, 130, 150, 20);
        txtPrice.setEditable(false);
        txtPrice.setBorder(null);
        txtPrice.setBackground(null);
        pnlproduct.add(txtPrice);
        
        lblProductQuantity.setBounds(650, 90, 150, 20);
        pnlproduct.add(lblProductQuantity);
        txtQuantity.setText(String.valueOf(product.Quantity));
        txtQuantity.setBounds(700, 90, 100, 20);
        txtQuantity.setEditable(false);
        txtQuantity.setBorder(null);
        txtQuantity.setBackground(null);
        pnlproduct.add(txtQuantity);
        
        checkBox.setSize(20, 20);
        checkBox.setBounds(50, 80,20, 20);
        checkBox.setBackground(null);
//        checkBox.addActionListener(new ActionListener(){
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if(e.getSource()==btnDelete){
//            ProductInfo prodInfo = new ProductInfo();
//            
//            prodInfo.ProductName = product.ProductName;
//            prodInfo.ProductSize = product.ProductSize;
//            prodInfo.ProductColor = product.ProductColor;
//            
//            
//            shoopeFeatures.DeleteItem(prodInfo);
//            }else if(e.getSource()==btnCheckout){
//            var x = new CheckoutPage();
//            }
//            frame.dispose();
//        } 
//    });
//        pnlproduct.add(checkBox);
        
        
        ImageIcon productPicture = new ImageIcon(new ImageIcon(product.Picture).getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
        btnPicture.setIcon(productPicture);
        btnPicture.setBounds(150, 30, 130, 130); 
        btnPicture.setBorder(null);
        pnlproduct.add(btnPicture);
        
        btnCheckout.setBounds(750, 20, 90, 25);
        btnCheckout.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            var x = new CheckoutPage(product.ProductName, product.Picture,product.ProductSize, product.ProductColor,product.ItemTotal,product.Quantity);
            frame.dispose();
        } 
        });
        upperPanel.add(btnCheckout);
        
        pnlproduct.setBounds(0, y, 900, 200);
        pnlproduct.setBackground(new Color(244, 205, 241));
        pnlproduct.setLayout(null);
        
         mainPanel.add(pnlproduct); 
         y += 200;
       
    }  
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

