package OnlineShoppingUI;

import java.awt.Font;
import javax.swing.*;

public class cartPage extends JFrame{

    public cartPage(){
       JPanel panel = new JPanel();
       //JPanel pnlproduct = new JPanel();
        
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("shOOPe");
        frame.setVisible(true);
        frame.add(panel);
        //frame.add(pnlproduct);
        
        JButton btnView = new JButton("View");
        btnView.setBounds(350, 20, 70, 25);
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(500, 20, 70, 25);
        
        JButton btnCheckout = new JButton("Checkout");
        btnCheckout.setBounds(650, 20, 90, 25);
        
        JLabel label = new JLabel("My Cart");
        label.setBounds(50, 20, 80, 25);
        label.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
        
        //JSeparator separator = new JSeparator();
          
        /*GroupLayout groupLayout = new GroupLayout(frame.getContentPane());  
        frame.getContentPane().setLayout(groupLayout);
        groupLayout.setAutoCreateGaps(true);  
        groupLayout.setAutoCreateContainerGaps(true);
        groupLayout.setHorizontalGroup(
            groupLayout.createBaselineGroup(true, true)
            
        */
        
        
        
        panel.add(label);        
        panel.add(btnView);
        panel.add(btnDelete);
        panel.add(btnCheckout);
        //panel.add(separator);
        
        //JLabel lblproduct = new JLabel("Vivian Westwood");
        //lblproduct.setBounds(350, 500, 150, 50);
        //pnlproduct.add(lblproduct);
        
    }
    public static void main(String[] args){
        new cartPage();
        
        
        
        
    }
}
