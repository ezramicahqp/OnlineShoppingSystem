package OnlineShoppingUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class cartPage extends JFrame{

    public cartPage(){
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

        
        //BUTTONS OF MAIN PANEL
        JButton btnView = new JButton("View");
        btnView.setBounds(550, 20, 70, 25);
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(650, 20, 70, 25);
        
        JButton btnCheckout = new JButton("Checkout");
        btnCheckout.setBounds(750, 20, 90, 25);
        
        
        //LABEL OF MAIN PANEL
        JLabel label = new JLabel("My Cart");
        label.setBounds(100, 20, 80, 25);
        label.setFont(new Font("Times New Roman", Font.BOLD, 18));
            
        //MAIN PANEL
        panel.add(label);        
        panel.add(btnView);
        panel.add(btnDelete);
        panel.add(btnCheckout);
        panel.setSize(900, 65);
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 900, 65);
        
        
        // PRODUCT  1
        JLabel lblProductName = new JLabel("Street Weaving Spider T-shirt");
        lblProductName.setBounds(350, 30, 500, 20);
        
        JLabel lblProductSize = new JLabel("size:");
        lblProductSize.setBounds(500, 90, 500, 20);
        JTextField txtSize = new JTextField();
        txtSize.setBounds(550, 90, 50, 20);
        txtSize.setEditable(false);
        
        JLabel lblProductColor = new JLabel("color:");
        lblProductColor.setBounds(350, 90, 500, 20);
        JTextField txtColor = new JTextField();
        txtColor.setBounds(400, 90, 50, 20);
        txtColor.setEditable(false);
        
        JLabel lblProductPrice = new JLabel("price:");
        lblProductPrice.setBounds(350, 130, 500, 20);
        JTextField txtPrice = new JTextField();
        txtPrice.setBounds(400, 130, 50, 20);
        txtPrice.setEditable(false);
        
        JLabel lblProductQuantity = new JLabel("quantity:");
        lblProductQuantity.setBounds(650, 90, 500, 20);
        JTextField txtQuantity = new JTextField();
        txtQuantity.setBounds(700, 90, 50, 20);
        txtQuantity.setEditable(false);
        
        JCheckBox checkBox = new JCheckBox();
        checkBox.setSize(20, 20);
        checkBox.setBounds(50, 80,20, 20);
        
        JLabel lblPicture = new JLabel();
        lblPicture.setBounds(150, 30, 130, 130);
        ImageIcon icon = new ImageIcon(new ImageIcon("spider_tshirt.jpg").getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
        lblPicture.setIcon(icon);
        
        
        // PRODUCT  2
        JLabel lblProductName2 = new JLabel("Graphic Striped Trim Sweater Vest");
        lblProductName2.setBounds(350, 30, 500, 20);
        
        JLabel lblProductSize2 = new JLabel("size:");
        lblProductSize2.setBounds(500, 90, 500, 20);
        JTextField txtSize2 = new JTextField();
        txtSize2.setBounds(550, 90, 50, 20);
        txtSize2.setEditable(false);
        
        JLabel lblProductColor2 = new JLabel("color:");
        lblProductColor2.setBounds(350, 90, 500, 20);
        JTextField txtColor2 = new JTextField();
        txtColor2.setBounds(400, 90, 50, 20);
        txtColor2.setEditable(false);
        
        JLabel lblProductPrice2 = new JLabel("price:");
        lblProductPrice2.setBounds(350, 130, 500, 20);
        JTextField txtPrice2 = new JTextField();
        txtPrice2.setBounds(400, 130, 50, 20);
        txtPrice2.setEditable(false);
        
        JLabel lblProductQuantity2 = new JLabel("quantity:");
        lblProductQuantity2.setBounds(650, 90, 500, 20);
        JTextField txtQuantity2 = new JTextField();
        txtQuantity2.setBounds(700, 90, 50, 20);
        txtQuantity2.setEditable(false);
        
        JCheckBox checkBox2 = new JCheckBox();
        checkBox2.setSize(20, 20);
        checkBox2.setBounds(50, 80,20, 20);
        
        JLabel lblPicture2 = new JLabel();
        lblPicture2.setBounds(150, 30, 130, 130);
        ImageIcon icon2 = new ImageIcon(new ImageIcon("Sweater_Vest.jpg").getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
        lblPicture2.setIcon(icon2);
        
        
        
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
        pnlproduct.add(checkBox);
        pnlproduct.add(lblPicture);
        pnlproduct.setSize(900, 200);
        pnlproduct.setBounds(0, 70, 900, 200);
        //pnlproduct.setBackground(Color.red);
        
        
        
        //PANEL product 2
        pnlproduct2.add(lblProductName2);
        pnlproduct2.add(lblProductColor2);
        pnlproduct2.add(txtColor2);
        pnlproduct2.add(lblProductSize2);
        pnlproduct2.add(txtSize2);
        pnlproduct2.add(lblProductPrice2);
        pnlproduct2.add(txtPrice2);
        pnlproduct2.add(lblProductQuantity2);
        pnlproduct2.add(txtQuantity2);
        pnlproduct2.add(checkBox2);
        pnlproduct2.add(lblPicture2);
        pnlproduct2.setSize(900, 200);
        pnlproduct2.setBounds(0, 270, 900, 200);
        //pnlproduct2.setBackground(Color.red);
        
        
    }
    public static void main(String[] args){
        new cartPage();
        
        
        
        
    }
}
