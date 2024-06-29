package OnlineShoppingUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.*;


public class homePage extends JFrame {
//implements ActionListener{
        
        private final JFrame tonsay = new JFrame();
        
        private final JPanel panel = new JPanel();
        private final JPanel productsMain = new JPanel();
        private final JPanel panel1 = new JPanel(); 
        private final JPanel panel2 = new JPanel();
        private final JPanel panel3 = new JPanel(); 
        private final JPanel panel4 = new JPanel();
        private final JPanel panel5 = new JPanel(); 
        private final JPanel panel6 = new JPanel();
        
        private final JButton btncart = new JButton();
        private final JButton btncategory = new JButton("Category");
        private final JButton btnLogo = new JButton();
        private final JButton btnAddToCart1 = new JButton("Add to Cart");
        private final JButton btnAddToCart2 = new JButton("Add to Cart");
        private final JButton btnAddToCart3 = new JButton("Add to Cart");
        private final JButton btnAddToCart4 = new JButton("Add to Cart");
        private final JButton btnAddToCart5 = new JButton("Add to Cart");
        private final JButton btnAddToCart6 = new JButton("Add to Cart");
        
        private final JLabel lblhome = new JLabel ("HOMEPAGE");
        
        private final JTextField txtprice = new JTextField();
        private final JTextField producttxt1 = new JTextField();
        private final JTextField txtprice1 = new JTextField();
        private final JTextField producttxt2 = new JTextField();
        private final JTextField txtprice2 = new JTextField();
        private final JTextField producttxt3 = new JTextField();
        private final JTextField txtprice3 = new JTextField();
        private final JTextField producttxt4 = new JTextField();
        private final JTextField txtprice4 = new JTextField();
        private final JTextField producttxt5 = new JTextField();
        private final JTextField txtprice5 = new JTextField();
        private final JTextField producttxt6 = new JTextField();
        
        private final JButton btnPic1 = new JButton();
        private final JButton btnPic2 = new JButton();
        private final JButton btnPic3 = new JButton();
        private final JButton btnPic4 = new JButton();
        private final JButton btnPic5 = new JButton();  
        private final JButton btnPic6 = new JButton();  
                
        
        
        
    public homePage(){
         
        tonsay.setSize(900,700);
        tonsay.setTitle("shOOPe");
        tonsay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tonsay.setResizable(false);
        tonsay.setLocationRelativeTo(null);
        tonsay.setLayout(null);
        tonsay.add(panel); 
        tonsay.add(productsMain); 
        
        tonsay.setVisible(true);
        
            menu();
            products();
            products1();
            products2();
            products3();
            products4();
            products5();
            products6();
        }
    
    public void menu(){
    // menu 
       ImageIcon cart = new ImageIcon(new ImageIcon("cartIcon.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
       btncart.setBounds(785,25,40,40);
       btncart.setIcon(cart);
     //  btncart.addActionListener(this);
       btncart.setBackground(null);
       btncart.setBorder(null);
       panel.add(btncart);
       
       btncategory.setBounds(680,30,90,30);
       btncategory.setFont(new Font("Roboto",Font.BOLD, 12));
       panel.add(btncategory);
       
       lblhome.setBounds(130,30,100,35);
       lblhome.setFont(new Font("Times New Roman", Font.BOLD, 15));
       lblhome.setForeground(Color.WHITE);
       panel.add(lblhome);
            
       ImageIcon logo = new ImageIcon(new ImageIcon("shoopelogo.png").getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
       btnLogo.setIcon(logo);
       btnLogo.setBounds(20, 10, 100, 80); 
   //    btnLogo.addActionListener(this);
       btnLogo.setBorder(null); 
       panel.add(btnLogo);

        panel.setBackground(new Color(155, 114, 221));
        panel.setBounds( 0,0,900,100);
        panel.setLayout(null);
        // panel.add(label2);
           
    }

    public void products(){ 
         productsMain.setBackground(new Color(244, 205, 241));
         productsMain.setBounds( 0 ,100,900,600);
         productsMain.setLayout(null);

        productsMain.add(panel1); 
        productsMain.add(panel2); 
        productsMain.add(panel3); 
        productsMain.add(panel4); 
        productsMain.add(panel5); 
        productsMain.add(panel6); 
    }

    public void products1(){
    // product1
        txtprice.setText("Php 300");
        txtprice.setBounds(50, 220, 100, 20);
        txtprice.setEditable(false);
        txtprice.setBorder(null);
        txtprice.setBackground(null);
      
        producttxt1.setText("Black Shirt");
        //producttxt1.setFont(new Font ("Roboto", Font.BOLD, 13));
        producttxt1.setBounds(50,200,150,20);
        producttxt1.setEditable(false);
        producttxt1.setBorder(null);
        producttxt1.setBackground(null);
        
        btnPic1.setBounds(90, 40, 133, 150);
    //    btnPic1.addActionListener(this);
        ImageIcon icon1 = new ImageIcon(new ImageIcon("blackshirt.png").getImage().getScaledInstance(133, 150, Image.SCALE_DEFAULT));
        btnPic1.setIcon(icon1);
        btnPic1.setBorder(null);
       
        btnAddToCart1.setBounds(150, 220, 100, 20);
        //btnAddToCart1.addActionListener(this);

            panel1.setBackground(new Color(244, 205, 241));
            panel1.setBounds( 0 ,0,300,250);
            panel1.add(btnPic1);
            panel1.add(txtprice);
            panel1.add(producttxt1);
            panel1.add(btnAddToCart1);
            panel1.setLayout(null);
                //panel1.add(price1);
                //panel1.add(pricelbl);
                
        //FIRST ADD TO CART
        btnAddToCart1.setBounds(150, 220, 100, 20);
       // btnAddToCart1.addActionListener(new ActionListener(){
         //  @Override
          //  public void actionPerformed(ActionEvent e) {
          //      cartPageTwo cp2 = new cartPageTwo();
           //     cp2.show();
           //     tonsay.dispose();
       //     } 
     //  });


} 

    public void products2(){
    //product2
        txtprice1.setText("Php 300");
        txtprice1.setBounds(50, 220, 100, 20);
        txtprice1.setEditable(false);
        txtprice1.setBorder(null);
        txtprice1.setBackground(null);
       
        producttxt2.setText("Women's Blouse");
        //producttxt2.setFont(new Font ("Roboto", Font.BOLD, 13));
        producttxt2.setBounds(50,200,150,20);
        producttxt2.setEditable(false);
        producttxt2.setBorder(null);
        producttxt2.setBackground(null);
       
        btnPic2.setBounds(95,40,113,150);
    //    btnPic2.addActionListener(this);
        ImageIcon icon2 = new ImageIcon (new ImageIcon("blouse.png").getImage().getScaledInstance(113,150, Image.SCALE_DEFAULT));
        btnPic2.setIcon(icon2);
        btnPic2.setBorder(null);
       
        btnAddToCart2.setBounds(150, 220, 100, 20);
     //   btnAddToCart2.addActionListener(this);

            panel2.setBackground(new Color(244, 205, 241));
            panel2.setBounds( 300 ,0,300,250);
            panel2.add(btnPic2);
            panel2.add(txtprice1);
            panel2.add(producttxt2);
            panel2.add(btnAddToCart2);
            panel2.setLayout(null);
                //panel2.add(price2);
                //panel2.add( pricelbl1);
        
    }

    public void products3(){
    //product3
        txtprice2.setText("Php 300");
        txtprice2.setBounds(50, 220, 100, 20);
        txtprice2.setEditable(false);
        txtprice2.setBorder(null);
        txtprice2.setBackground(null);
       
        producttxt3.setText("Nike Shoes");
        //producttxt3.setFont(new Font ("Roboto", Font.BOLD, 13));
        producttxt3.setBounds(50,200,150,20);
        producttxt3.setEditable(false);
        producttxt3.setBorder(null);
        producttxt3.setBackground(null);
        
        
        btnPic3.setBounds(75,40,135,150);
        ImageIcon icon3 = new ImageIcon (new ImageIcon("shoes2.png").getImage().getScaledInstance(135,150, Image.SCALE_DEFAULT));
        btnPic3.setIcon(icon3);
        //btnPic3.addActionListener(this);
        btnPic3.setBorder(null);
       
        btnAddToCart3.setBounds(150, 220, 100, 20);
      //  btnAddToCart3.addActionListener(this);

            panel3.setBackground (new Color(244, 205, 241));
            panel3.setBounds( 600,0,300,250);
            panel3.add(btnPic3);
            panel3.add(txtprice2);
            panel3.add(producttxt3);
            panel3.add(btnAddToCart3);
            panel3.setLayout(null);
                //panel3.add(price3);
                //panel3.add( pricelbl2); 
}

    public void products4(){
    //product 4
        txtprice3.setText("Php 300");
        txtprice3.setBounds(50, 220, 100, 20);
        txtprice3.setEditable(false);
        txtprice3.setBorder(null);
        txtprice3.setBackground(null);
       
        producttxt4.setText("Nike Shoes");
        //producttxt4.setFont(new Font ("Roboto", Font.BOLD, 13));
        producttxt4.setBounds(50,200,150,20);
        producttxt4.setEditable(false);
        producttxt4.setBorder(null);
        producttxt4.setBackground(null);
       
        
        btnPic4.setBounds(55,90,180,100);
     //   btnPic4.addActionListener(this);
        ImageIcon icon4 = new ImageIcon (new ImageIcon("shoes.png").getImage().getScaledInstance(180,100, Image.SCALE_DEFAULT));
        btnPic4.setIcon(icon4);
        btnPic4.setBorder(null);

        btnAddToCart4.setBounds(150, 220, 100, 20);
   //     btnAddToCart4.addActionListener(this);

            panel4.setBackground(new Color(244, 205, 241));
            panel4.setBounds( 0,250,300,350);
            panel4.add(btnPic4);
            panel4.add(txtprice3);
            panel4.add(producttxt4);
            panel4.add(btnAddToCart4);
            panel4.setLayout(null);
                //panel4.add(price4);
                //panel4.add( pricelbl3);
}

    public void products5(){
    //product5
        txtprice4.setText("Php 300");
        txtprice4.setBounds(50, 220, 100, 20);
        txtprice4.setEditable(false);
        txtprice4.setBorder(null);
        txtprice4.setBackground(null);
       
        producttxt5.setText("Women's Pants");
        //producttxt5.setFont(new Font ("Roboto", Font.BOLD, 13));
        producttxt5.setBounds(50,200,150,20);
        producttxt5.setEditable(false);
        producttxt5.setBorder(null);
        producttxt5.setBackground(null);
       
        btnPic5.setBounds(100,40,100,150);
     //   btnPic5.addActionListener(this);
        ImageIcon icon5 = new ImageIcon (new ImageIcon("pants1.png").getImage().getScaledInstance(100,150, Image.SCALE_DEFAULT));
        btnPic5.setIcon(icon5);
        btnPic5.setBorder(null);
       
        btnAddToCart5.setBounds(150, 220, 100, 20);
     //   btnAddToCart5.addActionListener(this);

            panel5.setBackground(new Color(244, 205, 241));
            panel5.setBounds( 300,250,300,350);
            panel5.add(btnPic5);
            panel5.add(txtprice4);
            panel5.add(producttxt5);
            panel5.add(btnAddToCart5);
            panel5.setLayout(null);
                //panel5.add( pricelbl4);
                //panel5.add(price5); 

}   

    public void products6(){
    //product6       
        txtprice5.setText("Php 300");
        txtprice5.setBounds(50, 220, 100, 20);
        txtprice5.setEditable(false);
        txtprice5.setBorder(null);
        txtprice5.setBackground(null);
       
        producttxt6.setText("Men's Pants");
        //producttxt6.setFont(new Font ("Roboto", Font.BOLD, 13));
        producttxt6.setBounds(50,200,150,20);
        producttxt6.setEditable(false);
        producttxt6.setBorder(null);
        producttxt6.setBackground(null);
        
        btnPic6.setBounds(100,40,100,150);
        ImageIcon icon6 = new ImageIcon (new ImageIcon("pants.png").getImage().getScaledInstance(100,150, Image.SCALE_DEFAULT));
       // btnPic6.addActionListener(this);
        btnPic6.setIcon(icon6);
        btnPic6.setBorder(null);

        btnAddToCart6.setBounds(150, 220, 100, 20);
       // btnAddToCart6.addActionListener(this);
       
            panel6.setBackground(new Color(244, 205, 241));
            panel6.setBounds( 600,250,300,350);
            panel6.add(btnPic6);
            panel6.add(txtprice5);
            panel6.add(producttxt6);
            panel6.add(btnAddToCart6);
            panel6.setLayout(null);
                //panel6.add( pricelbl5);
                //panel6.add(price6);

}

        //ScrollBar 
        //JScrollPane scroll = JScrollPane (JScrollPane.HORIZONTAL_SCROLLBAR);
        // tonsay.add(scroll);
     //panels
   
    
    public static void main(String[] args) {
        new homePage();
       
    }

   // @Override
  //  public void actionPerformed(ActionEvent e) {
       // cartPage cart = new cartPage();
      //  homePage logo = new homePage();
      // dispose();
        
        
    //    if (e.getSource() ==btncart){
   //     cart.setVisible(true);
   //     new cartPage();
    //    }
    
    //not included 
//         else if (e.getSource()==btnAddToCart1){
//               cart.setVisible(true);
//            }
//        new cartPage();
//        }
//        else if (e.getSource()==btnAddToCart2){
//        cart.setVisible(true);
//        new cartPage();
//        }
//        else if (e.getSource()==btnAddToCart3){
//        cart.setVisible(true);
//        new cartPage();
//        }
//        else if (e.getSource()==btnAddToCart4){
//        cart.setVisible(true);
//        new cartPage();
//        }
//        else if (e.getSource()==btnAddToCart5){
//        cart.setVisible(true);
//        new cartPage();
//        }
//        else if (e.getSource()==btnAddToCart6){
//        cart.setVisible(true);
//        new cartPage();
//        }
    
     //changes   
      //  else if (e.getSource()==btnPic1){
      //  product.setVisible(true);
      //  new Productview();
     //   }
    //    else if (e.getSource()==btnPic2){
    //    product.setVisible(true);
    //    new Productview();
    //   }
        
     //   else if (e.getSource()==btnPic3){
     //   product.setVisible(true);
     //   new Productview();
    //    }
        
    //    else if (e.getSource()==btnPic4){
     //   product.setVisible(true);
      //  new Productview();
     //   }
        
     //   else if (e.getSource()==btnPic5){
     //   product.setVisible(true);
     //   new Productview();
     //   }
        
     //   else if (e.getSource()==btnPic6){
     //   product.setVisible(true);
    //    new Productview();
     //   }
        
     //   else if (e.getSource()==btnLogo){
      //  logo.setVisible(true);
      //  new homePage();
      //}
    }

