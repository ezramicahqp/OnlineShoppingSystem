
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
    
    public ArrayList<ProductInfo> GetNameOfProduct(String prodName){
        ArrayList<ProductInfo> products = shoopeData.GetProductInfo();
        return products;
    }
}

