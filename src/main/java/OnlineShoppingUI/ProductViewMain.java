/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineShoppingUI;

import java.awt.EventQueue;
public class ProductViewMain {

    
   public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Productview pv = new Productview();
               
            }
        });
    }    
}
