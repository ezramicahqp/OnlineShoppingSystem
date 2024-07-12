
package OnlineShoppingUI;

import OnlineShoppingBL.*;
import OnlineShoppingDL.*;
import OnlineShoppingModels.*;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class TransactionPage extends JFrame implements ActionListener{

    private  JFrame frame = new JFrame();
    private  JPanel upperPanel = new JPanel();
    private  JPanel mainPanel = new JPanel();
    private  JLabel label = new JLabel("My Orders");
    private  JButton btnLogo = new JButton();
   
    private JLabel lblTransactionNum;
    private JTextField txtTransactionNum;
    
    private JPanel pnlOrderCard;
    private JTextField txtProductName;
    private JLabel lblProductColor;
    private JTextField txtColor;
    private JLabel lblProductSize;
    private JTextField txtSize;
    
    private JTextField txtcustomerName;
    private JTextField txtcustomerNumber;
    private JTextField txtcustomerAddress;
    
    private JLabel lbldeliveryDate;
    private JTextField txtdeliveryDate;
    private JLabel lblpaymentMethod;
    private JTextField txtpaymentMethod;
    
    private JLabel lblTotal;
    private JTextField txtTotal;
    
    
    ShoopeFeatures shoopeFeatures = new ShoopeFeatures();
    
    public TransactionPage(){
     
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
        
        label.setBounds(130, 20, 150, 25);
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
        
        
    
     
    ArrayList<ProductInfo> productInfo = shoopeFeatures.OrderedProductDisplay();
     
    for (int i = 0; i < productInfo.size(); i++) {  
        
        pnlOrderCard = new JPanel();
       
    final ProductInfo product = productInfo.get(i);
    
        lblTransactionNum = new JLabel("Transaction Number:");
        lblTransactionNum.setBounds(20, 50, 150, 20);
        pnlOrderCard.add(lblTransactionNum);

        txtTransactionNum = new JTextField();
        txtTransactionNum.setText("TRN-00"+String.valueOf(product.CheckoputID)+"-SO");
        txtTransactionNum.setBounds(30, 70, 100, 20);
        txtTransactionNum.setEditable(false);
        txtTransactionNum.setBorder(null);
        txtTransactionNum.setBackground(null);
        pnlOrderCard.add(txtTransactionNum);
        
        lbldeliveryDate = new JLabel("Delivery Date:");
        lbldeliveryDate.setBounds(20, 150, 100, 20);
        pnlOrderCard.add(lbldeliveryDate);
        
        txtdeliveryDate = new JTextField();
        txtdeliveryDate.setText(product.DeliveryDate);
        txtdeliveryDate.setBounds(120, 150, 100, 20);
        txtdeliveryDate.setEditable(false);
        txtdeliveryDate.setBorder(null);
        txtdeliveryDate.setBackground(null);
        pnlOrderCard.add(txtdeliveryDate);
        
        txtProductName = new JTextField();
        txtProductName.setText(product.ProductName);
        txtProductName.setBounds(250, 50, 200, 20);
        txtProductName.setEditable(false);
        txtProductName.setBorder(null);
        txtProductName.setBackground(null);
        pnlOrderCard.add(txtProductName);
        
        lblProductSize = new JLabel("size:");
        lblProductSize.setBounds(250, 70, 100, 20);
        pnlOrderCard.add(lblProductSize);

        txtSize = new JTextField();
        txtSize.setText(product.ProductSize);
        txtSize.setBounds(300, 70, 100, 20);
        txtSize.setEditable(false);
        txtSize.setBorder(null);
        txtSize.setBackground(null);
        pnlOrderCard.add(txtSize);
          
        lblProductColor = new JLabel("color:");
        lblProductColor.setBounds(250, 90, 100, 20);
        pnlOrderCard.add(lblProductColor);
        

        txtColor = new JTextField();
        txtColor.setText(product.ProductColor);
        txtColor.setBounds(300, 90, 100, 20);
        txtColor.setEditable(false);
        txtColor.setBorder(null);
        txtColor.setBackground(null);
        pnlOrderCard.add(txtColor);
        
        lblTotal = new JLabel("Total:");
        lblTotal.setBounds(250, 150, 100, 20);
        pnlOrderCard.add(lblTotal);
        
        txtTotal = new JTextField();
        txtTotal.setText(product.OrderTotal);
        txtTotal.setBounds(300, 150, 150, 20);
        txtTotal.setEditable(false);
        txtTotal.setBorder(null);
        txtTotal.setBackground(null);
        pnlOrderCard.add(txtTotal);
      
        lblpaymentMethod = new JLabel("Payment Method");
        lblpaymentMethod.setBounds(500, 150, 150, 20);
        pnlOrderCard.add(lblpaymentMethod);
        
        txtpaymentMethod = new JTextField();
        txtpaymentMethod.setText(product.PaymentMethod);
        txtpaymentMethod.setBounds(600, 150, 100, 20);
        txtpaymentMethod.setEditable(false);
        txtpaymentMethod.setBorder(null);
        txtpaymentMethod.setBackground(null);
        pnlOrderCard.add(txtpaymentMethod);
        
       
    }
    
    
        ArrayList<UserInfo> userInfo = shoopeFeatures.UserWhoOrderedDisplay();
     
    for (int j = 0; j < userInfo.size(); j++) {  
    
    final UserInfo customer = userInfo.get(j);
        
        txtcustomerName = new JTextField();
        txtcustomerName.setText("Customer: " + customer.CustomerName);
        txtcustomerName.setBounds(500, 50, 450, 20);
        txtcustomerName.setEditable(false);
        txtcustomerName.setBorder(null);
        txtcustomerName.setBackground(null);
        pnlOrderCard.add(txtcustomerName);

        txtcustomerNumber = new JTextField();
        txtcustomerNumber.setText("Contact #: " + customer.CustomerNumber);
        txtcustomerNumber.setBounds(500, 70, 200, 20);
        txtcustomerNumber.setEditable(false);
        txtcustomerNumber.setBorder(null);
        txtcustomerNumber.setBackground(null);
        pnlOrderCard.add(txtcustomerNumber);
        
        txtcustomerAddress = new JTextField();
        txtcustomerAddress.setText("Address: " + customer.CustomerAddress);
        txtcustomerAddress.setBounds(500, 90, 650, 20);
        txtcustomerAddress.setEditable(false);
        txtcustomerAddress.setBorder(null);
        txtcustomerAddress.setBackground(null);
        pnlOrderCard.add(txtcustomerAddress);
        
        
        pnlOrderCard.setBounds(0, y, 900, 200);
        pnlOrderCard.setBackground(new Color(244, 205, 241));
        pnlOrderCard.setLayout(null);
        
         mainPanel.add(pnlOrderCard); 
         y+= 200;
    } 
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}


