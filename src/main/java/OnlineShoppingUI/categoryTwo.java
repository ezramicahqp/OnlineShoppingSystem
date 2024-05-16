package OnlineShoppingUI;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class categoryTwo 
{

    public static void main(String[] args) 
    {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("PANTS");
        JLabel pantsOneName = new JLabel("P489 | Men Drawstring Waist Straight Leg Pants");
        JLabel pantsTwoName = new JLabel("P591 | Men Flap Pocket Side Cargo Pants");
        
        ImageIcon logo = new ImageIcon(categoryTwo.class.getResource("smallshoope.png"));
        JLabel logolabel = new JLabel(logo);
        
        ImageIcon pantsOne = new ImageIcon(categoryTwo.class.getResource("Men Drawstring Waist Straight Leg Pants.png"));
        JLabel pantsOneLabel = new JLabel(pantsOne);
        
        ImageIcon pantsTwo = new ImageIcon(categoryTwo.class.getResource("Men Flap Pocket Side Cargo Pants.png"));
        JLabel pantsTwoLabel = new JLabel(pantsTwo);

        
        //panel settings
        panel.setBounds(320, 25, 100, 50);
        panel.setBackground(Color.gray);
        
        //label settings
        logolabel.setBounds(20, 20, 100, 100);
        frame.add(logolabel);
        
        pantsOneLabel.setBounds (20, 150, 100, 123);
        frame.add(pantsOneLabel);
        
        pantsTwoLabel.setBounds(20, 350, 100, 123);
        frame.add(pantsTwoLabel);

        label.setBounds(350, 0, 200, 100);
        
        pantsOneName.setBounds(270, 30, 300, 300);
        frame.add(pantsOneName);
        
        pantsTwoName.setBounds(270, 230, 300, 300);
        frame.add(pantsTwoName);
        
        
        //button settings
        JButton button = new JButton("CART");
        button.setBounds(450, 25, 100, 50);
        button.setBackground(Color.gray);
        frame.add(button);
        
        JButton AddToCartPantsOne = new JButton("ADD TO CART");
        AddToCartPantsOne.setBounds(350,200,120,25);
        frame.add(AddToCartPantsOne);
        
        JButton AddToCartPantsTwo = new JButton("ADD TO CART");
        AddToCartPantsTwo.setBounds(350,400,120,25);
        frame.add(AddToCartPantsTwo);

        
        //frame settings
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Shoope");
        
        //label settings
        frame.add(label);
        frame.add(panel);
        frame.setLayout(null);
        
        frame.setVisible(true);
        
    }
    
}
