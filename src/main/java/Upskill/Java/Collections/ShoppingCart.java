package Upskill.Java.Collections;

import Upskill.Java.Collections.Ammunitions.Ammunition;

import java.util.List;

public class ShoppingCart {
   public static List<Ammunition> cartList;

   public int calculateCostOfAmmunitionInCart() {
      int cartCost = 0;
      for (int i = 0; i < cartList.size(); i++) {
         cartCost += cartList.get(i).getCost();
      }
      return cartCost;
   }

   public void returnAmmunitionFromCartToStore(int indexInCart) {
      ShopStore.store.add(cartList.get(indexInCart));
      cartList.remove(indexInCart);
   }

   @Override
   public String toString() {
      return "Cart:\n" +
            cartList.toString();
   }
}
