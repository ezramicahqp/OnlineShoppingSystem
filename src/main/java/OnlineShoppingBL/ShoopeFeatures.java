
package OnlineShoppingBL;
import java.util.ArrayList;
import OnlineShoppingDL.*;
import OnlineShoppingModels.*;

public class ShoopeFeatures {
    
    ShoopeData shoopeData = new ShoopeData();

    public ArrayList<ProductInfo> ProductInfoDisplay() 
    {
         ArrayList<ProductInfo> products = shoopeData.GetProductInfo();
         return products;
    }
      
    public UserCredentials GetGuestCredentials(){
        return shoopeData.GetGuestCredentials();
    }
    
    public ArrayList<ProductInfo> GetProductColors() 
    {
         ArrayList<ProductInfo> productColors = shoopeData.GetColors();
         return productColors;
    }
    
    public ArrayList<ProductInfo> GetProductSizes() 
    {
         ArrayList<ProductInfo> productSizes = shoopeData.GetSizes();
         return productSizes;
    }
    
    public void AddToCart(ProductInfo prodInfo, int quantity){
        int resultQuantity = shoopeData.CheckIfProductExistsInCart(prodInfo.ProductID, prodInfo.ProductColor, prodInfo.ProductSize);
        int newQuantity = quantity + resultQuantity;
        if (resultQuantity > 0) {
            shoopeData.UpdateItemInCart(prodInfo.ProductID, newQuantity , newQuantity * prodInfo.ProductPrice, prodInfo.ProductColor, prodInfo.ProductSize);
        }
        else{
           shoopeData.AddItemToCart(prodInfo, quantity);
        }
    }
    
    public ArrayList<ProductInfo> CartItemsDisplay() 
    {
         ArrayList<ProductInfo> products = shoopeData.GetCartItems();
         return products;
    }
    
//    public void DeleteItem(ProductInfo productInfo){
//          shoopeData.DeleteItemInCart(productInfo);
//    }
    
    public ArrayList<UserInfo> UserInfoDisplay() 
    {
         ArrayList<UserInfo> user = shoopeData.GetUserInfo();
         return user;
    }
}

