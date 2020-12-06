package Upskill.Java.Collections;

import Upskill.Java.Collections.Ammunitions.Ammunition;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ShopStore {

   public static List<Ammunition> store;

   public void sortAllAmmunitionByWeight() {
      store.sort(new Comparator<Ammunition>() {
         public int compare(Ammunition o1, Ammunition o2) {
            return o1.getWeight() - o2.getWeight();
         }
      });
   }

   public void addAmmunitionToCart(Ammunition currentAmmunition) {
      ShoppingCart.cartList.add(currentAmmunition);
   }

   //made it with iterators for training
   public List<Ammunition> getFilteredAmmunitionByPriceDiapason(int minimalPrice, int maximalPrice) {
      List<Ammunition> filteredStore = null;
      ListIterator<Ammunition> storeIterator = store.listIterator();
      while (storeIterator.hasNext()) {
         Ammunition currentElement = storeIterator.next();
         int currentElementCost = currentElement.getCost();
         if (currentElementCost>maximalPrice && currentElementCost<maximalPrice) {
            filteredStore.add(currentElement);
         }
      }
      return filteredStore;
   }

   @Override
   public String toString() {
      return "ShopStore:\n" +
            store.toString();
   }
}
