package OnlineShoppingUI;

import OnlineShoppingBL.*;
import OnlineShoppingDL.*;
import OnlineShoppingModels.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.*;


public class CheckoutPage extends JFrame implements ActionListener{
    
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();
    private final JPanel pnlproduct = new JPanel();
    private final JPanel pnlcustomer = new JPanel();
    private final JPanel pnldelivery = new JPanel();
    private final JPanel pnlpayment = new JPanel();
    private final JPanel pnlplaceOrder = new JPanel();
    
    private final JLabel label = new JLabel("Checkout");
    private final JButton btnLogo = new JButton();
    
    private final JTextField txtProductName = new JTextField();
    private final JLabel lblProductColor = new JLabel("color:");
    private final JTextField txtColor = new JTextField();
    private final JLabel lblProductSize = new JLabel("size:");
    private final JTextField txtSize = new JTextField();
    private final JLabel lblProductQuantity = new JLabel("quantity:");
    private final JTextField txtQuantity = new JTextField();
    private final JTextField txtPrice = new JTextField();
    private final JLabel lblPicture = new JLabel();
    
    private final JTextField txtcustomerName = new JTextField();
    private final JTextField txtcustomerNumber = new JTextField();
    private final JTextField txtcustomerAddress = new JTextField();
    
    private final JLabel lbldeliveryDate = new JLabel("Delivery Date:");
    private final JTextField txtdeliveryDate = new JTextField();
    private final JLabel lblshippingFee = new JLabel("Shipping Fee:");
    private final JTextField txtshippingFee = new JTextField();
    private final JLabel lblpaymentMethod = new JLabel("Payment Method");
    private final JRadioButton btnGCash = new JRadioButton("GCash");
    private final JRadioButton btnCard = new JRadioButton("Credit/Debit Card");
    private final JRadioButton btnCOD = new JRadioButton("Cash on Delivery");
    private final ButtonGroup paymentMethods = new ButtonGroup();
    private JLabel selectedMethod = new JLabel();
    
    private final JButton btnplaceOrder = new JButton("Place Order");
    private final JLabel lblTotal = new JLabel("Total:");
    private final JTextField txtTotal = new JTextField();
    
    
    
    public CheckoutPage(String ProductName, String Picture, String ProductSize, String ProductColor, int ItemTotal, int Quantity){
                        
        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("shOOPe");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.add(pnlproduct);
        frame.add(pnlcustomer);
        frame.add(pnldelivery);
        frame.add(pnlpayment);
        frame.add(pnlplaceOrder);
        
        
        label.setBounds(130, 20, 150, 25);
        label.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label.setForeground(Color.WHITE);        
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
        
        //MAIN PANEL
        panel.add(label);
        panel.add(btnLogo);        
        panel.setSize(900, 65);
        panel.setBackground(new Color(155, 114, 221));
        panel.setBounds(0, 0, 900, 65);
        panel.setLayout(null);


        txtProductName.setBounds(300, 30, 500, 20);
        txtProductName.setText(ProductName);
        txtProductName.setEditable(false);
        txtProductName.setBorder(null);
        txtProductName.setBackground(null);
        pnlproduct.add(txtProductName);
       
        lblProductColor.setBounds(300, 60, 500, 20);
        txtColor.setText(ProductColor);
        pnlproduct.add(lblProductColor);
        txtColor.setBounds(340, 60, 50, 20);
        txtColor.setEditable(false);
        txtColor.setBorder(null);
        txtColor.setBackground(null);
        pnlproduct.add(txtColor);
    
        lblProductSize.setBounds(400, 60, 500, 20);
        pnlproduct.add(lblProductSize);
        txtSize.setText(ProductSize);
        txtSize.setBounds(440, 60, 50, 20);
        txtSize.setEditable(false);
        txtSize.setBorder(null);
        txtSize.setBackground(null);
        pnlproduct.add(txtSize);
     
        lblProductQuantity.setBounds(500, 60, 500, 20);
        pnlproduct.add(lblProductQuantity);
        txtQuantity.setText(String.valueOf(Quantity));
        txtQuantity.setBounds(550, 60, 50, 20);
        txtQuantity.setEditable(false);
        txtQuantity.setBorder(null);
        txtQuantity.setBackground(null);
        pnlproduct.add(txtQuantity);

        txtPrice.setText("Php" + String.valueOf(ItemTotal));
        txtPrice.setBounds(300, 110, 500, 20);
        txtPrice.setEditable(false);
        txtPrice.setBorder(null);
        txtPrice.setBackground(null);
        pnlproduct.add(txtPrice);

        
        lblPicture.setBounds(100, 15, 130, 130);
        ImageIcon icon = new ImageIcon(new ImageIcon(Picture).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        lblPicture.setIcon(icon);
        pnlproduct.add(lblPicture);

       
        pnlproduct.setSize(900, 160);
        pnlproduct.setBounds(0, 70, 900, 160);
        pnlproduct.setBackground(new Color(244, 205, 241));
        pnlproduct.setLayout(null);
   
        ShoopeFeatures shoopeFeatures = new ShoopeFeatures();
        ArrayList<UserInfo> userInfo = shoopeFeatures.UserInfoDisplay();

        for (int i = 0; i < userInfo.size(); i++) {
         
        final UserInfo user = userInfo.get(i);
            
        txtcustomerName.setText(user.CustomerName);
        txtcustomerName.setBounds(50, 25, 450, 20);
        txtcustomerName.setEditable(false);
        txtcustomerName.setBorder(null);
        txtcustomerName.setBackground(null);
        pnlcustomer.add(txtcustomerName);

        txtcustomerNumber.setText(user.CustomerNumber);
        txtcustomerNumber.setBounds(500, 25, 200, 20);
        txtcustomerNumber.setEditable(false);
        txtcustomerNumber.setBorder(null);
        txtcustomerNumber.setBackground(null);
        pnlcustomer.add(txtcustomerNumber);

        txtcustomerAddress.setText(user.CustomerAddress);
        txtcustomerAddress.setBounds(50, 55, 650, 20);
        txtcustomerAddress.setEditable(false);
        txtcustomerAddress.setBorder(null);
        txtcustomerAddress.setBackground(null);
        pnlcustomer.add(txtcustomerAddress);
        
        }
        
        pnlcustomer.setSize(900, 100);
        pnlcustomer.setBounds(0, 235, 900, 100);
        pnlcustomer.setBackground(new Color(244, 205, 241));
        pnlcustomer.setLayout(null);
    
        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = currentDate.plusDays(7);
        
        lbldeliveryDate.setBounds(50, 20, 200, 20);
        pnldelivery.add(lbldeliveryDate);
        txtdeliveryDate.setText(String.valueOf(newDate));
        txtdeliveryDate.setBounds(50, 50, 300, 20);
        txtdeliveryDate.setEditable(false);
        txtdeliveryDate.setBorder(null);
        txtdeliveryDate.setBackground(null);
        pnldelivery.add(txtdeliveryDate);
        
        int sf = 35;
        lblshippingFee.setBounds(500, 20, 100, 20);
        pnldelivery.add(lblshippingFee);
        txtshippingFee.setText("Php " + sf);
        txtshippingFee.setBounds(500, 50, 100, 20);
        txtshippingFee.setEditable(false);
        txtshippingFee.setBorder(null);
        txtshippingFee.setBackground(null);
        pnldelivery.add(txtshippingFee);
     
        pnldelivery.setSize(900, 100);
        pnldelivery.setBounds(0, 340, 900, 100);
        pnldelivery.setBackground(new Color(244, 205, 241));
        pnldelivery.setLayout(null);
   
        
        lblpaymentMethod.setBounds(50, 20, 200, 20);
        pnlpayment.add(lblpaymentMethod);
        
        btnGCash.setBounds(50, 50, 100, 20);
        btnGCash.setBackground(null);
        pnlpayment.add(btnGCash);
        
        btnCard.setBounds(300, 50, 150, 20);
        btnCard.setBackground(null);
        pnlpayment.add(btnCard);
        
        btnCOD.setBounds(550, 50, 150, 20);
        btnCOD.setBackground(null);
        pnlpayment.add(btnCOD);
        
        paymentMethods.add(btnCOD);
        paymentMethods.add(btnCard);
        paymentMethods.add(btnGCash);
        
        pnlpayment.setSize(900, 100);
        pnlpayment.setBounds(0, 445, 900, 100);
        pnlpayment.setBackground(new Color(244, 205, 241));
        pnlpayment.setLayout(null);

        int orderTotal = ItemTotal + sf;
        
        lblTotal.setBounds(550, 25, 50, 20);
        txtTotal.setBounds(585, 25, 100, 20);
        txtTotal.setEditable(false);
        txtTotal.setBorder(null);
        txtTotal.setBackground(null);
        txtTotal.setText("Php" + String.valueOf(orderTotal));
        pnlplaceOrder.add(lblTotal);
        pnlplaceOrder.add(txtTotal);
        
        pnlplaceOrder.setSize(900, 70);
        pnlplaceOrder.setBackground(Color.white);
        pnlplaceOrder.setBounds(0, 590, 900, 70);
        pnlplaceOrder.setLayout(null);
        
        
        btnplaceOrder.setBounds(750, 25, 120, 20);
        btnplaceOrder.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
          
            
            String paymentMethod = "";
                if (btnGCash.isSelected()) {
                    paymentMethod = "GCash";
                } else if (btnCard.isSelected()) {
                    paymentMethod = "Card";
                } else if (btnCOD.isSelected()) {
                    paymentMethod = "Cash on Delivery";
                }
            
            ProductInfo prodInfo = new ProductInfo();
            UserInfo userInfo = new UserInfo();
            
            userInfo.CustomerName = txtcustomerName.getText();
            userInfo.CustomerAddress = txtcustomerAddress.getText();
            userInfo.CustomerNumber = txtcustomerNumber.getText();
            prodInfo.DeliveryDate = txtdeliveryDate.getText();
            prodInfo.PaymentMethod = paymentMethod;
            prodInfo.ProductName = ProductName;
            prodInfo.ProductSize = ProductSize;
            prodInfo.ProductColor = ProductColor;
            prodInfo.OrderTotal = txtTotal.getText();
            
            
            shoopeFeatures.PlaceOrder(prodInfo, userInfo);
            
        JOptionPane.showMessageDialog(null, "Order placed!", "Order Status", JOptionPane.INFORMATION_MESSAGE);
            HomePage hp = new HomePage();
            frame.dispose();
        } 
    });
        pnlplaceOrder.add(btnplaceOrder);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
}
