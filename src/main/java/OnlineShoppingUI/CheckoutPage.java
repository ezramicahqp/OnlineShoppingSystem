package OnlineShoppingUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;


public class CheckoutPage extends JFrame{
    
    public CheckoutPage(){
        
        //PANELS
        JPanel panel = new JPanel();
        JPanel pnlproduct = new JPanel();
        JPanel pnlcustomer = new JPanel();
        JPanel pnldelivery = new JPanel();
        JPanel pnlpayment = new JPanel();
        JPanel pnlplaceOrder = new JPanel();
       //FRAME 
        JFrame frame = new JFrame();
        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("shOOPe");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(panel);
        frame.add(pnlproduct);
        frame.add(pnlcustomer);
        frame.add(pnldelivery);
        frame.add(pnlpayment);
        frame.add(pnlplaceOrder);
         
       
        //LABEL OF MAIN PANEL
        JLabel label = new JLabel("Checkout");
        label.setBounds(50, 20, 150, 25);
        label.setFont(new Font("Times New Roman", Font.BOLD, 18));
            
        //MAIN PANEL
        panel.add(label);        
        panel.setSize(900, 65);
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 900, 65);
        
        
        // PRODUCT  1
        JLabel lblProductName = new JLabel("Street Weaving Spider T-shirt");
        lblProductName.setBounds(300, 30, 500, 20);
        
        JLabel lblProductColor = new JLabel("color:");
        lblProductColor.setBounds(300, 60, 500, 20);
        JTextField txtColor = new JTextField();
        txtColor.setBounds(340, 60, 50, 20);
        txtColor.setEditable(false);
        
        JLabel lblProductSize = new JLabel("size:");
        lblProductSize.setBounds(400, 60, 500, 20);
        JTextField txtSize = new JTextField();
        txtSize.setBounds(440, 60, 50, 20);
        txtSize.setEditable(false);
        
        JLabel lblProductQuantity = new JLabel("quantity:");
        lblProductQuantity.setBounds(500, 60, 500, 20);
        JTextField txtQuantity = new JTextField();
        txtQuantity.setBounds(550, 60, 50, 20);
        txtQuantity.setEditable(false);
        
        JLabel lblProductPrice = new JLabel("price:");
        lblProductPrice.setBounds(300, 110, 500, 20);
        JTextField txtPrice = new JTextField();
        txtPrice.setBounds(340, 110, 50, 20);
        txtPrice.setEditable(false);
        
        JLabel lblPicture = new JLabel();
        lblPicture.setBounds(100, 15, 130, 130);
        ImageIcon icon = new ImageIcon(new ImageIcon("spider_tshirt.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        lblPicture.setIcon(icon);
        
        //PANEL product 1
        pnlproduct.add(lblProductName);
        pnlproduct.add(lblProductColor);
        pnlproduct.add(txtColor);
        pnlproduct.add(lblProductSize);
        pnlproduct.add(txtSize);
        pnlproduct.add(lblProductPrice);
        pnlproduct.add(txtPrice);
        pnlproduct.add(lblProductQuantity);
        pnlproduct.add(txtQuantity);
        pnlproduct.add(lblPicture);
        pnlproduct.setSize(900, 160);
        pnlproduct.setBounds(0, 70, 900, 160);
        //pnlproduct.setBackground(Color.red);
        
        //Customer info
        JTextField txtcustomerName = new JTextField();
        txtcustomerName.setText("customer name");
        txtcustomerName.setBounds(50, 25, 450, 20);
        txtcustomerName.setEditable(false);
        
        JTextField txtcustomerNumber = new JTextField();
        txtcustomerNumber.setText("contact number");
        txtcustomerNumber.setBounds(500, 25, 200, 20);
        txtcustomerNumber.setEditable(false);
        
        JTextField txtcustomerAddress = new JTextField();
        txtcustomerAddress.setText("customer address");
        txtcustomerAddress.setBounds(50, 55, 650, 20);
        txtcustomerAddress.setEditable(false);
        
        
        //Panel of Customer info
        pnlcustomer.add(txtcustomerName);
        pnlcustomer.add(txtcustomerNumber);
        pnlcustomer.add(txtcustomerAddress);
        pnlcustomer.setSize(900, 100);
        pnlcustomer.setBounds(0, 230, 900, 100);
        //pnlcustomer.setBackground(Color.red);

        //Delivery date details
        JLabel lbldeliveryDate = new JLabel("Delivery Date:");
        lbldeliveryDate.setBounds(50, 20, 200, 20);
        JTextField txtdeliveryDate = new JTextField();
        txtdeliveryDate.setBounds(50, 50, 300, 20);
        txtdeliveryDate.setEditable(false);
        
        JLabel lblshippingFee = new JLabel("Shipping Fee:");
        lblshippingFee.setBounds(500, 20, 100, 20);
        JTextField txtshippingFee = new JTextField();
        txtshippingFee.setBounds(500, 50, 100, 20);
        txtshippingFee.setEditable(false);
        
        
        //Panel of Deliver details
        pnldelivery.add(lbldeliveryDate);
        pnldelivery.add(txtdeliveryDate);
        pnldelivery.add(lblshippingFee);
        pnldelivery.add(txtshippingFee);
        pnldelivery.setSize(900, 100);
        pnldelivery.setBounds(0, 335, 900, 100);
        //pnldelivery.setBackground(Color.red);
        
        //payment method
        JLabel lblpaymentMethod = new JLabel("Payment Method");
        lblpaymentMethod.setBounds(50, 20, 200, 20);
        
        JRadioButton btnGCash = new JRadioButton("GCash");
        btnGCash.setBounds(50, 50, 100, 20);
        JRadioButton btnCard = new JRadioButton("Credit/Debit Card");
        btnCard.setBounds(300, 50, 150, 20);
        JRadioButton btnCOD = new JRadioButton("Cash on Delivery");
        btnCOD.setBounds(550, 50, 150, 20);
        
        ButtonGroup paymentMethods = new ButtonGroup();
        paymentMethods.add(btnCOD);
        paymentMethods.add(btnCard);
        paymentMethods.add(btnGCash);
        
        //Panel of Deliver details
        pnlpayment.add(lblpaymentMethod);
        pnlpayment.add(btnGCash);
        pnlpayment.add(btnCard);
        pnlpayment.add(btnCOD);
        pnlpayment.setSize(900, 100);
        pnlpayment.setBounds(0, 440, 900, 100);
        //pnlpayment.setBackground(Color.red);
        
        
        //Place order
        JButton btnplaceOrder = new JButton("Place Order");
        btnplaceOrder.setBounds(750, 25, 120, 20);
        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(550, 25, 50, 20);
        JTextField txtTotal = new JTextField();
        txtTotal.setBounds(585, 25, 100, 20);
        txtTotal.setEditable(false);
        
        //panel of place order
        pnlplaceOrder.add(btnplaceOrder);
        pnlplaceOrder.add(lblTotal);
        pnlplaceOrder.add(txtTotal);
        pnlplaceOrder.setSize(900, 70);
        //pnlplaceOrder.setBackground(Color.red);
        pnlplaceOrder.setBounds(0, 590, 900, 70);
        
        
    }
    public static void main(String[] args){
        new CheckoutPage();
        
        
        
        
    }
}
