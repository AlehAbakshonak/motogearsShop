package Upskill.Java.Collections;

import Upskill.Java.Collections.Ammunitions.Ammunition;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
   public List<Ammunition> cartList = new ArrayList<>();

   public int calculateCostOfAmmunitionInCart() {
      int cartCost = 0;
      for (int i = 0; i < this.cartList.size(); i++) {
         cartCost += this.cartList.get(i).getCost();
      }
      return cartCost;
   }

   public void returnAmmunitionFromCartToStore(int indexInCart) {
      //ShopStore.addToStore(this.cartList.get(indexInCart));
      System.out.println("*REMOVED FROM CART* " + this.cartList.get(indexInCart).toString());
      this.cartList.remove(indexInCart);
   }

   public void addAmmunitionToCart(Ammunition currentAmmunition) {
      this.cartList.add(currentAmmunition);
   }

   @Override
   public String toString() {
      return "Cart:\n" +
            this.cartList.toString().replaceAll("}, ","}\n");
   }
}
