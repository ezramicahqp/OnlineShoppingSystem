package OnlineShoppingUI;

import OnlineShoppingBL.*;
import OnlineShoppingDL.*;
import OnlineShoppingModels.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    private final JButton btnplaceOrder = new JButton("Place Order");
    private final JLabel lblTotal = new JLabel("Total:");
    private final JTextField txtTotal = new JTextField();
    
    
    
    public CheckoutPage(){
                        
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
        
        MainPanel();
        PnlProduct();
        PnlCustomerInfo();
        PnlDelivery();
        PnlPaymentMethod();
        PnlPlaceOrder();
    }
       
    public void MainPanel(){
        
        label.setBounds(130, 20, 150, 25);
        label.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label.setForeground(Color.WHITE);        
        ImageIcon logo = new ImageIcon(new ImageIcon("shoopelogo.png").getImage().getScaledInstance(90, 70, Image.SCALE_DEFAULT));
        btnLogo.setIcon(logo);
        btnLogo.setBounds(30, 0, 90, 70); 
        btnLogo.setBorder(null);
        btnLogo.addActionListener(this);
        
        //MAIN PANEL
        panel.add(label);
        panel.add(btnLogo);        
        panel.setSize(900, 65);
        panel.setBackground(new Color(155, 114, 221));
        panel.setBounds(0, 0, 900, 65);
        panel.setLayout(null);
    }    
        
    public void PnlProduct(){

        txtProductName.setBounds(300, 30, 500, 20);
        txtProductName.setText("Street Weaving Spider T-shirt");
        txtProductName.setEditable(false);
        txtProductName.setBorder(null);
        txtProductName.setBackground(null);
        pnlproduct.add(txtProductName);
       
        lblProductColor.setBounds(300, 60, 500, 20);
        pnlproduct.add(lblProductColor);
        txtColor.setBounds(340, 60, 50, 20);
        txtColor.setEditable(false);
        txtColor.setBorder(null);
        txtColor.setBackground(null);
        pnlproduct.add(txtColor);
    
        lblProductSize.setBounds(400, 60, 500, 20);
        pnlproduct.add(lblProductSize);
        txtSize.setBounds(440, 60, 50, 20);
        txtSize.setEditable(false);
        txtSize.setBorder(null);
        txtSize.setBackground(null);
        pnlproduct.add(txtSize);
     
        lblProductQuantity.setBounds(500, 60, 500, 20);
        pnlproduct.add(lblProductQuantity);
        txtQuantity.setBounds(550, 60, 50, 20);
        txtQuantity.setEditable(false);
        txtQuantity.setBorder(null);
        txtQuantity.setBackground(null);
        pnlproduct.add(txtQuantity);

        txtPrice.setText("Php 559");
        txtPrice.setBounds(300, 110, 500, 20);
        txtPrice.setEditable(false);
        txtPrice.setBorder(null);
        txtPrice.setBackground(null);
        pnlproduct.add(txtPrice);

        
        lblPicture.setBounds(100, 15, 130, 130);
        ImageIcon icon = new ImageIcon(new ImageIcon("spider_tshirt.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        lblPicture.setIcon(icon);
        pnlproduct.add(lblPicture);

       
        pnlproduct.setSize(900, 160);
        pnlproduct.setBounds(0, 70, 900, 160);
        pnlproduct.setBackground(new Color(244, 205, 241));
        pnlproduct.setLayout(null);
    }

    public void PnlCustomerInfo(){

        txtcustomerName.setText("customer name");
        txtcustomerName.setBounds(50, 25, 450, 20);
        txtcustomerName.setEditable(false);
        txtcustomerName.setBorder(null);
        txtcustomerName.setBackground(null);
        pnlcustomer.add(txtcustomerName);

        txtcustomerNumber.setText("contact number");
        txtcustomerNumber.setBounds(500, 25, 200, 20);
        txtcustomerNumber.setEditable(false);
        txtcustomerNumber.setBorder(null);
        txtcustomerNumber.setBackground(null);
        pnlcustomer.add(txtcustomerNumber);

        txtcustomerAddress.setText("customer address");
        txtcustomerAddress.setBounds(50, 55, 650, 20);
        txtcustomerAddress.setEditable(false);
        txtcustomerAddress.setBorder(null);
        txtcustomerAddress.setBackground(null);
        pnlcustomer.add(txtcustomerAddress);
        
        pnlcustomer.setSize(900, 100);
        pnlcustomer.setBounds(0, 235, 900, 100);
        pnlcustomer.setBackground(new Color(244, 205, 241));
        pnlcustomer.setLayout(null);
    }
        
    public void PnlDelivery(){
        
        lbldeliveryDate.setBounds(50, 20, 200, 20);
        pnldelivery.add(lbldeliveryDate);
        txtdeliveryDate.setText("August 2");
        txtdeliveryDate.setBounds(50, 50, 300, 20);
        txtdeliveryDate.setEditable(false);
        txtdeliveryDate.setBorder(null);
        txtdeliveryDate.setBackground(null);
        pnldelivery.add(txtdeliveryDate);
        
        lblshippingFee.setBounds(500, 20, 100, 20);
        pnldelivery.add(lblshippingFee);
        txtshippingFee.setText("Php 35");
        txtshippingFee.setBounds(500, 50, 100, 20);
        txtshippingFee.setEditable(false);
        txtshippingFee.setBorder(null);
        txtshippingFee.setBackground(null);
        pnldelivery.add(txtshippingFee);
     
        pnldelivery.setSize(900, 100);
        pnldelivery.setBounds(0, 340, 900, 100);
        pnldelivery.setBackground(new Color(244, 205, 241));
        pnldelivery.setLayout(null);
    }   
        
    public void PnlPaymentMethod(){
        
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
    }    
        
    public void PnlPlaceOrder(){
        
        btnplaceOrder.setBounds(750, 25, 120, 20);
        pnlplaceOrder.add(btnplaceOrder);
        
        lblTotal.setBounds(550, 25, 50, 20);
        txtTotal.setBounds(585, 25, 100, 20);
        txtTotal.setEditable(false);
        txtTotal.setBorder(null);
        txtTotal.setBackground(null);
        pnlplaceOrder.add(lblTotal);
        pnlplaceOrder.add(txtTotal);
        
        pnlplaceOrder.setSize(900, 70);
        pnlplaceOrder.setBackground(Color.white);
        pnlplaceOrder.setBounds(0, 590, 900, 70);
        pnlplaceOrder.setLayout(null);    
    }
    
    
    public static void main(String[] args){
        new CheckoutPage();
         
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new HomePage();
        frame.dispose();
    }
}
