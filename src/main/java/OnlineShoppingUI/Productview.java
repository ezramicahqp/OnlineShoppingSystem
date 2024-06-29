

package OnlineShoppingUI;





import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Productview extends JFrame implements ActionListener{
   private static final String[]Color={"YELLOW","BLUE","RED"};
   private static final String[]Sizes={"SMALL","MEDIUM","LARGE"};
   private JButton btncart = new JButton();
   private JButton btncategory = new JButton("Category");
   private JComboBox <String>cmbcolor;
   private JComboBox <String>cmbsize;
   private JButton btnadd = new JButton("Add to Cart");
   private JButton btnquantity = new JButton("Quantity");
   private JTextField name = new JTextField();
   private  JButton btnLogo = new JButton();
   private JButton btnPic3 = new JButton();
   private JTextField txtDescription = new JTextField();
   
   
    Productview(){
        JFrame f = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

    
        f.setTitle("Product View");
        f.setSize(900, 700);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.add(panel);
        f.add(panel2);

         
        f.setVisible(true);
        
        
        btncart.setBounds(780,30,90,30);
        ImageIcon cart = new ImageIcon(new ImageIcon("cartIcon.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        btncart.setIcon(cart);
        btncart.setBackground(null);
        btncart.setBorder(null);
       
        btncategory.setBounds(680,30,90,30);
        btncategory.setFont(new Font("Roboto",Font.BOLD, 12));
        
        
        cmbcolor = new JComboBox<>(Color);
        cmbcolor.setBounds(500,180,100,40);
        panel2.add(cmbcolor);
       
        
        cmbsize = new JComboBox<>(Sizes);
        cmbsize.setBounds(700,180,100,40);
        panel2.add(cmbsize);

     
        btnadd.setBounds(500,250,100,40);
        panel2.add(btnadd);
     
        
        btnquantity.setBounds(700,250,100,40);
        panel2.add(btnquantity);
    
        
        name.setText("Street Weaving Spider T-shirt");
        name.setFont(new Font("Roboto", Font.BOLD, 16));
        name.setEditable(false);
        name.setBorder(null);
        name.setBackground(null);
        name.setBounds(500,90,300,50);
        panel2.add(name);
    
       
        ImageIcon logo = new ImageIcon(new ImageIcon("shoopelogo.png").getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
        btnLogo.setIcon(logo);
        btnLogo.setBounds(20, 10, 100, 80); 
        btnLogo.setBorder(null);
        
        
       btnPic3.setBounds(100,70,320,360);
       ImageIcon icon3 = new ImageIcon (new ImageIcon("spider_tshirt.jpg").getImage().getScaledInstance(320,360, Image.SCALE_DEFAULT));
       btnPic3.setIcon(icon3);
       btnPic3.setBorder(null);
       
        
        txtDescription.setText("Description");
        txtDescription.setEditable(false);
        txtDescription.setBorder(null);
        txtDescription.setBackground(null);
        txtDescription.setBounds(500,300,400,250);
        panel2.add(txtDescription);
     
        
        panel.setBackground(new Color(155, 114, 221));
        panel.setBounds( 0,0,900,100);
        panel.add(btncart);
        panel.add(btncategory);
        panel.add(btnLogo);
        panel.setLayout(null);
       
        
        panel2.setBackground(new Color(244, 205, 241));
        panel2.setBounds( 0 ,100,900,600);
        panel2.add(btnPic3);
        panel2.setLayout(null);
        
     btnadd.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if (e.getSource() ==btnadd){
        cartPage cp = new cartPage();
       
        }
    }

 
}