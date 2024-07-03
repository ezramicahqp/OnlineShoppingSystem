
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
        = "select image, product_id, product_name, product_price, product_description from product_info";
       
       ArrayList<ProductInfo> productInfo = new ArrayList<ProductInfo>();
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement selectCommand = connection.prepareStatement(selectStatement);
           ResultSet resultSet = selectCommand.executeQuery();

            while(resultSet.next()) {
                
                //Blob image = resultSet.getBlob("image");
                byte[] image = resultSet.getBytes("image");
                int productID = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                int productPrice = resultSet.getInt("product_price");
                String description = resultSet.getString("product_description");
                


                ProductInfo readProductInfo = new ProductInfo();
                readProductInfo.image = image;
                readProductInfo.ProductID =  productID;
                readProductInfo.ProductName = productName;
                readProductInfo.ProductPrice = productPrice;
              
               
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
    
    ArrayList<ProductInfo> GetNameOfProduct(String ProductName) {
        String findCommand = "SELECT product_name, product_price, image from product_info where product_name = ?";
        ArrayList<ProductInfo> product  = new ArrayList<ProductInfo>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement selectCommand = connection.prepareStatement(findCommand);) {

            selectCommand.setString(1, ProductName);
            

            try (ResultSet resultSet = selectCommand.executeQuery();) {
                if (resultSet.next()) {
                    
                byte[] image = resultSet.getBytes("image");
                String productName = resultSet.getString("product_name");
                int productPrice = resultSet.getInt("product_price");
                
                ProductInfo readProductInfo = new ProductInfo();
                readProductInfo.ProductName = productName;
                readProductInfo.ProductPrice = productPrice;
                readProductInfo.image = image;   
                
                product.add(readProductInfo);
                }
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return product;
    }

   

    
    
    
    

 
}
