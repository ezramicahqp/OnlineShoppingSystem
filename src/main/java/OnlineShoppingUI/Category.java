package OnlineShoppingUI;

import java.awt.*;
import javax.swing.*;

public class Category extends JFrame{
    Category(){
        JFrame frame = new JFrame();
        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JLabel lblcat = new JLabel("CATEGORIES");
        frame.add(lblcat);
        lblcat.setBounds(50, 90, 100, 50);
 
        frame.setLayout(null);
        frame.setVisible(true);
        
        JButton btnshirt = new JButton("SHIRT");
        frame.add(btnshirt);
        btnshirt.setBounds(50, 200, 800, 75);
 
        frame.setLayout(null);
        frame.setVisible(true);
        
        JButton btnpants = new JButton("PANTS");
        frame.add(btnpants);
        btnpants.setBounds(50, 300, 800, 75);
 
        frame.setLayout(null);
        frame.setVisible(true);
        
        JButton btnshoes = new JButton("SHOES");
        frame.add(btnshoes);
        btnshoes.setBounds(50, 400, 800, 75);
 
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
