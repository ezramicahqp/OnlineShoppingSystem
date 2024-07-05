
package OnlineShoppingDL;

import java.util.ArrayList;
import OnlineShoppingModels.*;


public class ShoopeData {
    
        ArrayList<ProductInfo> productInfo;
        ShoopeDatabase shoopeDatabase;
        
    public ShoopeData()
    {
        productInfo = new ArrayList<ProductInfo>();
        shoopeDatabase = new ShoopeDatabase();

    }


    public ArrayList<ProductInfo> GetProductInfo() 
    {
        return productInfo = shoopeDatabase.GetProductInfo();
    }
    

    public UserCredentials GetGuestCredentials(){
        return shoopeDatabase.GetGuestUser();
    }
    
    public ArrayList<ProductInfo> GetColors() 
    {
        return productInfo = shoopeDatabase.GetColors();
    }
    
    public ArrayList<ProductInfo> GetSizes() 
    {
        return productInfo = shoopeDatabase.GetSizes();
    }
    
    public void AddItemToCart(ProductInfo prodInfo, int quantity) 
    {
        shoopeDatabase.AddItemToCart(prodInfo.ProductID, prodInfo.ProductName,prodInfo.Picture,prodInfo.ProductSize,prodInfo.ProductColor,prodInfo.ItemTotal, quantity );
    }
    
    public int CheckIfProductExistsInCart(int productID, String color, String size){
        return shoopeDatabase.CheckIfProductIDExistsInCart(productID, color, size);
    }
    
    public void UpdateItemInCart(int productID, int quantity, int totalamount, String color, String size) {
       shoopeDatabase.UpdateItemInCart(productID, quantity, totalamount, color, size);
    }
    
    public ArrayList<ProductInfo> GetCartItems() 
    {
        return productInfo = shoopeDatabase.GetCartItems();
    }
    
    public void DeleteItemInCart(ProductInfo prodInfo){
        shoopeDatabase.DeleteItemInCart(prodInfo.ProductName, prodInfo.ProductColor, prodInfo.ProductSize);
    }
            
}

