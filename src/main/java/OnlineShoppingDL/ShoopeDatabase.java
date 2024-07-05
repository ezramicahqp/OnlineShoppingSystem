
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
    
    
    public ArrayList<ProductInfo> GetProductInfo(){
        
       String selectStatement 
        = "select product_id, product_name, product_price, picture from product_info";
       
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

    public ArrayList<ProductInfo> GetColors(){
        
       String selectStatement 
        = "select color_name from tbl_color";
       
       ArrayList<ProductInfo> productInfo = new ArrayList<ProductInfo>();
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement selectCommand = connection.prepareStatement(selectStatement);
           ResultSet resultSet = selectCommand.executeQuery();

            while(resultSet.next()) {
                
                String color = resultSet.getString("color_name");
                
                ProductInfo readProductInfo = new ProductInfo();
                readProductInfo.ProductColor =  color;
                
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
    
    public ArrayList<ProductInfo> GetSizes(){
        
       String selectStatement 
        = "select size_name from tbl_size";
       
       ArrayList<ProductInfo> productInfo = new ArrayList<ProductInfo>();
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement selectCommand = connection.prepareStatement(selectStatement);
           ResultSet resultSet = selectCommand.executeQuery();

            while(resultSet.next()) {
                
                String size = resultSet.getString("size_name");
                
                ProductInfo readProductInfo = new ProductInfo();
                readProductInfo.ProductSize =  size;
                
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
    
    public int CheckIfProductIDExistsInCart(int productID, String color, String size){
        int quantity = 0;
        
        String selectStatement 
        = "SELECT quantity from tbl_cartitems where product_id = ? AND product_color = ? AND product_size = ?";
       
       ArrayList<ProductInfo> productInfo = new ArrayList<ProductInfo>();
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement selectCommand = connection.prepareStatement(selectStatement);
           selectCommand.setInt(1, productID);
           selectCommand.setString(2, color);
           selectCommand.setString(3, size);
           
           ResultSet resultSet = selectCommand.executeQuery();

                       
            while(resultSet.next()) {
                quantity = resultSet.getInt("quantity");
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return quantity;
    }
    
    public void AddItemToCart(int productID, String prodName, String prodPicture, String prodSize,String prodColor, int totalPrice, int quantity){
        
       String insertStatement 
        = "insert into tbl_cartitems (product_id, product_name, product_picture,product_size, product_color, item_total, quantity) values (?, ?, ?, ?, ?, ?, ?) ";
       
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement insertCommand = connection.prepareStatement(insertStatement);
           //ResultSet resultSet = insertCommand.executeQuery();

            {
            insertCommand.setInt(1, productID);   
            insertCommand.setString(2, prodName);
            insertCommand.setString(3, prodPicture);
            insertCommand.setString(4, prodSize);
            insertCommand.setString(5, prodColor);
            insertCommand.setInt(6, totalPrice);
            insertCommand.setInt(7, quantity);
            
            
            insertCommand.executeUpdate();
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
    
    public void UpdateItemInCart(int productID, int quantity, int totalamount, String color, String size){
        
       String updateStatement
        = "UPDATE tbl_cartitems SET quantity = ?, item_total = ? WHERE product_id = ? AND product_color = ? AND product_size = ?";
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement insertCommand = connection.prepareStatement(updateStatement);
           
           {
            insertCommand.setInt(1, quantity);   
            insertCommand.setInt(2, totalamount);
            insertCommand.setInt(3, productID);
            insertCommand.setString(4, color);
            insertCommand.setString(5, size);
            
            insertCommand.executeUpdate();
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
    
    public ArrayList<ProductInfo> GetCartItems(){
        
       String selectStatement 
        = "select product_name, product_picture, product_size, product_color,item_total,quantity  from tbl_cartitems";
       
       ArrayList<ProductInfo> productInfo = new ArrayList<ProductInfo>();
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement selectCommand = connection.prepareStatement(selectStatement);
           ResultSet resultSet = selectCommand.executeQuery();

            while(resultSet.next()) {
               
                String productName = resultSet.getString("product_name");
                String picture = resultSet.getString("product_picture");
                String productSize = resultSet.getString("product_size");
                String productColor = resultSet.getString("product_color");
                int total = resultSet.getInt("item_total");
                int quantity = resultSet.getInt("quantity");
                
                ProductInfo readProductInfo = new ProductInfo();
                readProductInfo.ProductName = productName;
                readProductInfo.Picture = picture;
                readProductInfo.ProductSize = productSize;
                readProductInfo.ProductColor = productColor;
                readProductInfo.ItemTotal = total;
                readProductInfo.Quantity = quantity;
                
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
    
//    public void DeleteItemInCart(String productName, String color, String size){
//        
//       String deleteStatement
//        = "DELETE FROM tbl_cartitems WHERE product_name =? and product_color = ? and product_size = ? ";
//       
//       try {
//           Class.forName("com.mysql.cj.jdbc.Driver");
//           Connection connection = DriverManager.getConnection(url, user, password);
//           PreparedStatement deleteCommand = connection.prepareStatement(deleteStatement);
//           
//           {
//            deleteCommand.setString(1, productName);   
//            deleteCommand.setString(2, color);
//            deleteCommand.setString(3, size);
//            
//            deleteCommand.executeUpdate();
//            }
//        }
//        catch (ClassNotFoundException e) {
//            System.out.println("MySQL JDBC Driver not found");
//            e.printStackTrace();
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
//    
//    }

    public ArrayList<UserInfo> GetUserInfo(){
        
       String selectStatement 
        = "select customer_name, customer_address, customer_number from user_info";
       
       ArrayList<UserInfo> userInfo = new ArrayList<UserInfo>();
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement selectCommand = connection.prepareStatement(selectStatement);
           ResultSet resultSet = selectCommand.executeQuery();

            while(resultSet.next()) {
                
                String name = resultSet.getString("customer_name");
                String address = resultSet.getString("customer_address");
                String number = resultSet.getString("customer_number");
                                
                
                UserInfo readUserInfo = new UserInfo();
                readUserInfo.CustomerName =  name;
                readUserInfo.CustomerAddress = address;
                readUserInfo.CustomerNumber = number;
              
                             
                userInfo.add(readUserInfo);
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    
        return userInfo;
    }

    

}
