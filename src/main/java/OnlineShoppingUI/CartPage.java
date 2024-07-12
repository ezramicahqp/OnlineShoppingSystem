
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

    private  JFrame frame = new JFrame();
    private  JPanel upperPanel = new JPanel();
    private  JPanel mainPanel = new JPanel();
    private  JLabel label = new JLabel("My Cart");
    private  JButton btnLogo = new JButton();
   // private final JButton btnDelete = new JButton("Delete");
    private  JButton btnCheckout;
    
    
    private  JPanel pnlproduct;
    private  JButton btnPicture;
    private  JTextField txtproductName;
    private  JLabel lblProductSize;
    private  JTextField txtSize;
    private  JLabel lblProductColor;
    private  JTextField txtColor;
    private  JTextField txtPrice;
    private  JLabel lblProductQuantity;
    private  JTextField txtQuantity;
    
    
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
     
        
        upperPanel.setLayout(null);
   
         mainPanel.setBackground(new Color(244, 205, 241));
         mainPanel.setBounds( 0 ,70,900,1000);
         mainPanel.setLayout(null);

        
        int y = 0;
        

    
     ArrayList<ProductInfo> productInfo = shoopeFeatures.CartItemsDisplay();
    
    for (int i = 0; i < productInfo.size(); i++) {  
        
        pnlproduct = new JPanel();
        btnPicture = new JButton();
        txtproductName = new JTextField();
        lblProductSize = new JLabel("size:");
        txtSize = new JTextField();
        lblProductColor = new JLabel("color:");
        txtColor = new JTextField();
        txtPrice = new JTextField();
        lblProductQuantity = new JLabel("quantity:");
        txtQuantity = new JTextField();
        btnCheckout = new JButton("Checkout");
        
        final ProductInfo product = productInfo.get(i);
        
        txtproductName = new JTextField();
        txtproductName.setText(product.ProductName);
        txtproductName.setBounds(300, 30, 500, 20);
        txtproductName.setEditable(false);
        txtproductName.setBorder(null);
        txtproductName.setBackground(null);
        pnlproduct.add(txtproductName);
        
        lblProductSize.setBounds(450, 90, 100, 20);
        pnlproduct.add(lblProductSize);
        txtSize.setText(product.ProductSize);
        txtSize.setBounds(500, 90, 100, 20);
        txtSize.setEditable(false);
        txtSize.setBorder(null);
        txtSize.setBackground(null);
        pnlproduct.add(txtSize);
               
        lblProductColor.setBounds(300, 90, 100, 20);
        pnlproduct.add(lblProductColor);
        txtColor.setText(product.ProductColor);
        txtColor.setBounds(350, 90, 100, 20);
        txtColor.setEditable(false);
        txtColor.setBorder(null);
        txtColor.setBackground(null);
        pnlproduct.add(txtColor);
        
        
        txtPrice.setText("Php " + String.valueOf(product.ItemTotal));
        txtPrice.setBounds(300, 130, 150, 20);
        txtPrice.setEditable(false);
        txtPrice.setBorder(null);
        txtPrice.setBackground(null);
        pnlproduct.add(txtPrice);
        
        lblProductQuantity.setBounds(600, 90, 150, 20);
        pnlproduct.add(lblProductQuantity);
        txtQuantity.setText(String.valueOf(product.Quantity));
        txtQuantity.setBounds(650, 90, 100, 20);
        txtQuantity.setEditable(false);
        txtQuantity.setBorder(null);
        txtQuantity.setBackground(null);
        pnlproduct.add(txtQuantity);
        

        
        ImageIcon productPicture = new ImageIcon(new ImageIcon(product.Picture).getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
        btnPicture.setIcon(productPicture);
        btnPicture.setBounds(100, 30, 130, 130); 
        btnPicture.setBorder(null);
        pnlproduct.add(btnPicture);
        
        btnCheckout.setBounds(750, 50, 90, 25);
        btnCheckout.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            var x = new CheckoutPage(product.ProductName, product.Picture,product.ProductSize, product.ProductColor,product.ItemTotal,product.Quantity);
            frame.dispose();
        } 
        });
        pnlproduct.add(btnCheckout);
        
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

