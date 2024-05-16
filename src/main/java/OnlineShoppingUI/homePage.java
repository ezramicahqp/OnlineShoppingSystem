package OnlineShoppingUI;
import javax.swing.*;
import java.awt.*;

public class homePage extends JFrame{
   public homePage(){
       JFrame pearl = new JFrame();
       JPanel layout = new JPanel();
       
       pearl.setName("Homepage");
       pearl.setSize(700,500);
       pearl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pearl.setVisible(true);
       pearl.add(layout);
       
       JButton btncart = new JButton("Cart");
       btncart.setBounds(350,20,70,25);
       btncart.getAlignmentY();
       pearl.add(btncart);
       
       JButton btncategory = new JButton("Category");
       btncategory.setBounds(350,20,70,25);
       pearl.add(btncategory);
       
       JLabel label = new JLabel ("shOOPe");
       label.setBounds(350,20,70,35);
       pearl.add(label);
     
      layout.add(label);
      layout.add(btncategory);
      layout.add(btncart);
                     
   }

    public static void main(String[] args) {
       new homePage();
    }
    
}
