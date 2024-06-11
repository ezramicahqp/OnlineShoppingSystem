

package OnlineShoppingUI;

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Productview extends JFrame{
    private JButton btncart = new JButton("Cart");
    private JButton btncategory = new JButton("Category");
    private JButton btncolor = new JButton("Color");
    private JButton btnsize = new JButton("Size");
    private JButton btnadd = new JButton("Add to Cart");
    private JButton btnquantity = new JButton("Quantity");
    private JLabel lblname = new JLabel("Product name");
    Productview(){
      
      
        setTitle("Product View");
        setSize(900, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btncart.setBounds(750,20,100,40);
        btncategory.setBounds(600,20,100,40);
        btncolor.setBounds(600,170,100,40);
        btnsize.setBounds(750,170,100,40);
        btnadd.setBounds(600,250,100,40);
        btnquantity.setBounds(750,250,100,40);
        lblname.setBounds(690,70,100,100);
        
        add(btncart);
        add(btncategory);
        add(btncolor);
        add(btnsize);
        add(btnadd);
        add(btnquantity);
        add(lblname);
    }

 
}
