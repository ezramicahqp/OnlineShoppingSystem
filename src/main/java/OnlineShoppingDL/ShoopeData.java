
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
    
    public ArrayList<ProductInfo> GetNameOfProduct(ProductInfo prodName)
    {
       return shoopeDatabase.GetNameOfProduct(prodName.ProductName);
    }
    
    public UserCredentials GetGuestCredentials(){
        return shoopeDatabase.GetGuestUser();
    }
}

