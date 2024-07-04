
package OnlineShoppingDL;
import OnlineShoppingModels.*;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShoopeDatabase {
    //ProductInfo productInfo = new ProductInfo();
    
    String url = "jdbc:mysql://localhost:3306/shoopedatabase?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String user = "root";
    String password = "MarkLee@Pogi99!";
    
    public ShoopeDatabase(){
    
//        try {
//            Connection connection = DriverManager.getConnection(url, user, password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        
     
    }
    
    public ArrayList<ProductInfo> GetProductInfo(){
        
       String selectStatement 
        = "select image, product_id, product_name, product_price, product_description, picture from product_info";
       
       ArrayList<ProductInfo> productInfo = new ArrayList<ProductInfo>();
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement selectCommand = connection.prepareStatement(selectStatement);
           ResultSet resultSet = selectCommand.executeQuery();

            while(resultSet.next()) {
                
                
                int productID = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                int productPrice = resultSet.getInt("product_price");
                String picture = resultSet.getString("picture");
                        
                


                ProductInfo readProductInfo = new ProductInfo();
                readProductInfo.ProductID =  productID;
                readProductInfo.ProductName = productName;
                readProductInfo.ProductPrice = productPrice;
                readProductInfo.Picture = picture;
              
               
                productInfo.add(readProductInfo);
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    
        return productInfo;
    }
    //ang gagawin ko sana dito is gagamitin ko yung pinasa na prodName galing kay homepage papunta kay product view 
    //tas yun yung gagamitin ko sa where statement para makapagbato sya ng Price, at imagepapunta kay productview
    ArrayList<ProductInfo> GetNameOfProduct(String ProductName) {
        String findCommand = "SELECT product_name, product_price, image from product_info where product_name = ?";
        ArrayList<ProductInfo> product  = new ArrayList<ProductInfo>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement selectCommand = connection.prepareStatement(findCommand);) {

            selectCommand.setString(1, ProductName);
            

            try (ResultSet resultSet = selectCommand.executeQuery();) {
                if (resultSet.next()) {
                    
                String picture = resultSet.getString("picture");
                String productName = resultSet.getString("product_name");
                int productPrice = resultSet.getInt("product_price");
                
                ProductInfo readProductInfo = new ProductInfo();
                readProductInfo.ProductName = productName;
                readProductInfo.ProductPrice = productPrice; 
                readProductInfo.Picture = picture;
                
                product.add(readProductInfo);
                }
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return product;
    }

    public UserCredentials GetGuestUser()
    {
        String selectStatement 
        = "select username, password from tbl_users";
       
        UserCredentials guestCredentials = new UserCredentials();
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement selectCommand = connection.prepareStatement(selectStatement);
           ResultSet resultSet = selectCommand.executeQuery();

            while(resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                
                guestCredentials.Username = username;
                guestCredentials.Password = password;
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    
        return guestCredentials;
    }

    
    
    
    

 
}
