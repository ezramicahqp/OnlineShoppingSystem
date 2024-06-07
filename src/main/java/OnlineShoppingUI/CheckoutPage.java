package OnlineShoppingUI;


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
        label.setBounds(130, 20, 150, 25);
        label.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label.setForeground(Color.WHITE);
        JButton btnLogo = new JButton();
        ImageIcon logo = new ImageIcon(new ImageIcon("logopic.jpg").getImage().getScaledInstance(70, 55, Image.SCALE_DEFAULT));
        btnLogo.setIcon(logo);
        btnLogo.setBounds(30, 5, 70, 55); 
        btnLogo.setBorder(null);
        
        //MAIN PANEL
        panel.add(label);
        panel.add(btnLogo);        
        panel.setSize(900, 65);
        panel.setBackground(Color.black);
        panel.setBounds(0, 0, 900, 65);
        
        
        // PRODUCT  1
        JTextField txtProductName = new JTextField("Street Weaving Spider T-shirt");
        txtProductName.setBounds(300, 30, 500, 20);
        txtProductName.setText("Street Weaving Spider T-shirt");
        txtProductName.setEditable(false);
        txtProductName.setBorder(null);
        txtProductName.setBackground(null);
        
        JLabel lblProductColor = new JLabel("color:");
        lblProductColor.setBounds(300, 60, 500, 20);
        JTextField txtColor = new JTextField();
        txtColor.setBounds(340, 60, 50, 20);
        txtColor.setEditable(false);
        txtColor.setBorder(null);
        txtColor.setBackground(null);
        
        JLabel lblProductSize = new JLabel("size:");
        lblProductSize.setBounds(400, 60, 500, 20);
        JTextField txtSize = new JTextField();
        txtSize.setBounds(440, 60, 50, 20);
        txtSize.setEditable(false);
        txtSize.setBorder(null);
        txtSize.setBackground(null);
        
        JLabel lblProductQuantity = new JLabel("quantity:");
        lblProductQuantity.setBounds(500, 60, 500, 20);
        JTextField txtQuantity = new JTextField();
        txtQuantity.setBounds(550, 60, 50, 20);
        txtQuantity.setEditable(false);
        txtQuantity.setBorder(null);
        txtQuantity.setBackground(null);
        
        
        JTextField txtPrice = new JTextField();
        txtPrice.setText("Php 559");
        txtPrice.setBounds(300, 110, 500, 20);
        txtPrice.setEditable(false);
        txtPrice.setBorder(null);
        txtPrice.setBackground(null);
        
        JLabel lblPicture = new JLabel();
        lblPicture.setBounds(100, 15, 130, 130);
        ImageIcon icon = new ImageIcon(new ImageIcon("spider_tshirt.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        lblPicture.setIcon(icon);
        
        //PANEL product 1
        pnlproduct.add(txtProductName);
        pnlproduct.add(lblProductColor);
        pnlproduct.add(txtColor);
        pnlproduct.add(lblProductSize);
        pnlproduct.add(txtSize);
        pnlproduct.add(txtPrice);
        pnlproduct.add(lblProductQuantity);
        pnlproduct.add(txtQuantity);
        pnlproduct.add(lblPicture);
        pnlproduct.setSize(900, 160);
        pnlproduct.setBounds(0, 70, 900, 160);
        pnlproduct.setBackground(Color.pink);
        
        //Customer info
        JTextField txtcustomerName = new JTextField();
        txtcustomerName.setText("customer name");
        txtcustomerName.setBounds(50, 25, 450, 20);
        txtcustomerName.setEditable(false);
        txtcustomerName.setBorder(null);
        txtcustomerName.setBackground(null);
        
        JTextField txtcustomerNumber = new JTextField();
        txtcustomerNumber.setText("contact number");
        txtcustomerNumber.setBounds(500, 25, 200, 20);
        txtcustomerNumber.setEditable(false);
        txtcustomerNumber.setBorder(null);
        txtcustomerNumber.setBackground(null);
        
        JTextField txtcustomerAddress = new JTextField();
        txtcustomerAddress.setText("customer address");
        txtcustomerAddress.setBounds(50, 55, 650, 20);
        txtcustomerAddress.setEditable(false);
        txtcustomerAddress.setBorder(null);
        txtcustomerAddress.setBackground(null);
        
        
        //Panel of Customer info
        pnlcustomer.add(txtcustomerName);
        pnlcustomer.add(txtcustomerNumber);
        pnlcustomer.add(txtcustomerAddress);
        pnlcustomer.setSize(900, 100);
        pnlcustomer.setBounds(0, 235, 900, 100);
        pnlcustomer.setBackground(Color.pink);

        //Delivery date details
        JLabel lbldeliveryDate = new JLabel("Delivery Date:");
        lbldeliveryDate.setBounds(50, 20, 200, 20);
        JTextField txtdeliveryDate = new JTextField();
        txtdeliveryDate.setText("August 2");
        txtdeliveryDate.setBounds(50, 50, 300, 20);
        txtdeliveryDate.setEditable(false);
        txtdeliveryDate.setBorder(null);
        txtdeliveryDate.setBackground(null);
        
        JLabel lblshippingFee = new JLabel("Shipping Fee:");
        lblshippingFee.setBounds(500, 20, 100, 20);
        JTextField txtshippingFee = new JTextField();
        txtshippingFee.setText("Php 35");
        txtshippingFee.setBounds(500, 50, 100, 20);
        txtshippingFee.setEditable(false);
        txtshippingFee.setBorder(null);
        txtshippingFee.setBackground(null);
        
        
        //Panel of Deliver details
        pnldelivery.add(lbldeliveryDate);
        pnldelivery.add(txtdeliveryDate);
        pnldelivery.add(lblshippingFee);
        pnldelivery.add(txtshippingFee);
        pnldelivery.setSize(900, 100);
        pnldelivery.setBounds(0, 340, 900, 100);
        pnldelivery.setBackground(Color.pink);
        
        //payment method
        JLabel lblpaymentMethod = new JLabel("Payment Method");
        lblpaymentMethod.setBounds(50, 20, 200, 20);
        
        JRadioButton btnGCash = new JRadioButton("GCash");
        btnGCash.setBounds(50, 50, 100, 20);
        btnGCash.setBackground(null);
        JRadioButton btnCard = new JRadioButton("Credit/Debit Card");
        btnCard.setBounds(300, 50, 150, 20);
        btnCard.setBackground(null);
        JRadioButton btnCOD = new JRadioButton("Cash on Delivery");
        btnCOD.setBounds(550, 50, 150, 20);
        btnCOD.setBackground(null);
        
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
        pnlpayment.setBounds(0, 445, 900, 100);
        pnlpayment.setBackground(Color.pink);
        
        
        //Place order
        JButton btnplaceOrder = new JButton("Place Order");
        btnplaceOrder.setBounds(750, 25, 120, 20);
        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(550, 25, 50, 20);
        JTextField txtTotal = new JTextField();
        txtTotal.setBounds(585, 25, 100, 20);
        txtTotal.setEditable(false);
        txtTotal.setBorder(null);
        txtTotal.setBackground(null);
        
        //panel of place order
        pnlplaceOrder.add(btnplaceOrder);
        pnlplaceOrder.add(lblTotal);
        pnlplaceOrder.add(txtTotal);
        pnlplaceOrder.setSize(900, 70);
        pnlplaceOrder.setBackground(Color.white);
        pnlplaceOrder.setBounds(0, 590, 900, 70);
        
        
        
    }
    public static void main(String[] args){
        new CheckoutPage();
        
        
        
        
    }
}
