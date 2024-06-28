package OnlineShoppingUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class cartPageTwo extends JFrame{

    public cartPageTwo(){
       //PANELS
       JPanel panel = new JPanel();
       JPanel pnlproduct = new JPanel();
       JPanel pnlproduct2 = new JPanel();
        
       //FRAME 
        JFrame frame = new JFrame();
        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("shOOPe");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(panel);
        frame.add(pnlproduct);
        frame.add(pnlproduct2);
        //frame.setBackground(Color.pink);

        
        //BUTTONS OF MAIN PANEL
        JButton btnView = new JButton("View");
        btnView.setBounds(550, 20, 70, 25);
       
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(650, 20, 70, 25);
        
        JButton btnCheckout = new JButton("Checkout");
        btnCheckout.setBounds(750, 20, 90, 25);
        
        
        //LABEL OF MAIN PANEL
        JLabel label = new JLabel("My Cart");
        label.setBounds(130, 20, 80, 25);
        label.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label.setForeground(Color.WHITE);
        
        JButton btnLogo = new JButton();
        ImageIcon logo = new ImageIcon(new ImageIcon("shoopelogo.png").getImage().getScaledInstance(90, 70, Image.SCALE_DEFAULT));
        btnLogo.setIcon(logo);
        btnLogo.setBounds(30, 0, 90, 70); 
        btnLogo.setBorder(null);

        
        //MAIN PANEL
        panel.add(label);        
        panel.add(btnView);
        panel.add(btnDelete);
        panel.add(btnCheckout);
        panel.setSize(900, 65);
        panel.setBackground(new Color(155, 114, 221));
        panel.setBounds(0, 0, 900, 65);
        panel.add(btnLogo);
        
        
        
        // PRODUCT  1
        JTextField txtproductName = new JTextField();
        txtproductName.setText("Black Shirt");
        txtproductName.setBounds(350, 30, 500, 20);
        txtproductName.setEditable(false);
        txtproductName.setBorder(null);
        txtproductName.setBackground(null);
        
        JLabel lblProductSize = new JLabel("size:");
        lblProductSize.setBounds(500, 90, 100, 20);
        JTextField txtSize = new JTextField();
        txtSize.setBounds(550, 90, 100, 20);
        txtSize.setEditable(false);
        txtSize.setBorder(null);
        txtSize.setBackground(null);
        
        JLabel lblProductColor = new JLabel("color:");
        lblProductColor.setBounds(350, 90, 100, 20);
        JTextField txtColor = new JTextField();
        txtColor.setBounds(400, 90, 100, 20);
        txtColor.setEditable(false);
        txtColor.setBorder(null);
        txtColor.setBackground(null);
        
        
        JTextField txtPrice = new JTextField();
        txtPrice.setText("Php 300");
        txtPrice.setBounds(350, 130, 150, 20);
        txtPrice.setEditable(false);
        txtPrice.setBorder(null);
        txtPrice.setBackground(null);
        
        JLabel lblProductQuantity = new JLabel("quantity:");
        lblProductQuantity.setBounds(650, 90, 150, 20);
        JTextField txtQuantity = new JTextField();
        txtQuantity.setBounds(700, 90, 100, 20);
        txtQuantity.setEditable(false);
        txtQuantity.setBorder(null);
        txtQuantity.setBackground(null);
        
        JCheckBox checkBox = new JCheckBox();
        checkBox.setSize(20, 20);
        checkBox.setBounds(50, 80,20, 20);
        checkBox.setBackground(null);
        
        JButton btnPicture = new JButton();
        ImageIcon product = new ImageIcon(new ImageIcon("blackshirt.png").getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
        btnPicture.setIcon(product);
        btnPicture.setBounds(150, 30, 130, 130); 
        btnPicture.setBorder(null);
       
        
//        // PRODUCT  2
//        JTextField txtproductName2 = new JTextField();
//        txtproductName2.setText("Graphic Striped Trim Sweater Vest");
//        txtproductName2.setBounds(350, 30, 500, 20);
//        txtproductName2.setEditable(false);
//        txtproductName2.setBorder(null);
//        txtproductName2.setBackground(null);
//        
//        JLabel lblProductSize2 = new JLabel("size:");
//        lblProductSize2.setBounds(500, 90, 100, 20);
//        JTextField txtSize2 = new JTextField();
//        txtSize2.setBounds(550, 90, 100, 20);
//        txtSize2.setEditable(false);
//        txtSize2.setBorder(null);
//        txtSize2.setBackground(null);
//        
//        JLabel lblProductColor2 = new JLabel("color:");
//        lblProductColor2.setBounds(350, 90, 100, 20);
//        JTextField txtColor2 = new JTextField();
//        txtColor2.setBounds(400, 90, 100, 20);
//        txtColor2.setEditable(false);
//        txtColor2.setBorder(null);
//        txtColor2.setBackground(null);
//        
//        JTextField txtPrice2 = new JTextField();
//        txtPrice2.setText("Php 559");
//        txtPrice2.setBounds(350, 130, 150, 20);
//        txtPrice2.setEditable(false);
//        txtPrice2.setBorder(null);
//        txtPrice2.setBackground(null);
//        
//        JLabel lblProductQuantity2 = new JLabel("quantity:");
//        lblProductQuantity2.setBounds(650, 90, 150, 20);
//        JTextField txtQuantity2 = new JTextField();
//        txtQuantity2.setBounds(700, 90, 100, 20);
//        txtQuantity2.setEditable(false);
//        txtQuantity2.setBorder(null);
//        txtQuantity2.setBackground(null);
//        
//        JCheckBox checkBox2 = new JCheckBox();
//        checkBox2.setSize(20, 20);
//        checkBox2.setBounds(50, 80,20, 20);
//        checkBox2.setBackground(null);
//        
//        JButton btnPicture2 = new JButton();
//        ImageIcon product2 = new ImageIcon(new ImageIcon("Sweater_Vest.jpg").getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
//        btnPicture2.setIcon(product2);
//        btnPicture2.setBounds(150, 30, 130, 130); 
//        btnPicture2.setBorder(null);
       
        
        
        //PANEL product 1
        pnlproduct.add(txtproductName);
        pnlproduct.add(lblProductColor);
        pnlproduct.add(txtColor);
        pnlproduct.add(lblProductSize);
        pnlproduct.add(txtSize);
        pnlproduct.add(txtPrice);
        pnlproduct.add(lblProductQuantity);
        pnlproduct.add(txtQuantity);
        pnlproduct.add(checkBox);
        pnlproduct.add(btnPicture);
        pnlproduct.setSize(900, 200);
        pnlproduct.setBounds(0, 70, 900, 200);
        pnlproduct.setBackground(new Color(244, 205, 241));
        
        
        
//        //PANEL product 2
//        pnlproduct2.add(txtproductName2);
//        pnlproduct2.add(lblProductColor2);
//        pnlproduct2.add(txtColor2);
//        pnlproduct2.add(lblProductSize2);
//        pnlproduct2.add(txtSize2);
//        pnlproduct2.add(txtPrice2);
//        pnlproduct2.add(lblProductQuantity2);
//        pnlproduct2.add(txtQuantity2);
//        pnlproduct2.add(checkBox2);
//        pnlproduct2.add(btnPicture2);
//        pnlproduct2.setSize(900, 200);
//        pnlproduct2.setBounds(0, 270, 900, 200);
//        pnlproduct2.setBackground(new Color(244, 205, 241));
        
        
    }
    public static void main(String[] args){
        new cartPageTwo();
        
        
        
        
    }
}
