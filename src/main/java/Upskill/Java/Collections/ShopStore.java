package Upskill.Java.Collections;

import Upskill.Java.Collections.Ammunitions.Ammunition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ShopStore {

   private static List<Ammunition> store = new ArrayList<>();

   public ShopStore(List<Ammunition> store) {
      ShopStore.store = store;
   }

   public static void addToStore(Ammunition item) {
      store.add(item);
   }

   public void sortAllAmmunitionByWeight() {
      store.sort(new Comparator<Ammunition>() {
         public int compare(Ammunition o1, Ammunition o2) {
            return o1.getWeight() - o2.getWeight();
         }
      });
      System.out.println("*SHOP LIST SORTED BY WEIGHT*");
   }

   public void sortAllAmmunitionByClass() {
      store.sort(new Comparator<Ammunition>() {
         public int compare(Ammunition o1, Ammunition o2) {
            return o1.getClass().hashCode() - o2.getClass().hashCode();
         }
      });
      System.out.println("*SHOP LIST SORTED BY CLASS*");
   }

   public void addAmmunitionByIndexToCart(ShoppingCart cart, int indexOfAmmunitionInList) {
      cart.addAmmunitionToCart(store.get(indexOfAmmunitionInList));
   }

   //made it with iterators for training
   public List<Ammunition> getFilteredAmmunitionByPriceDiapason(int minimalPrice, int maximalPrice) {
      List<Ammunition> filteredStore = new ArrayList<>();
      ListIterator<Ammunition> storeIterator = store.listIterator();
      while (storeIterator.hasNext()) {
         Ammunition currentElement = storeIterator.next();
         int currentElementCost = currentElement.getCost();
         if (currentElementCost>minimalPrice && currentElementCost<maximalPrice) {
            filteredStore.add(currentElement);
         }
      }
      return filteredStore;
   }

   @Override
   public String toString() {
      return "ShopStore:\n" +
            store.toString().replaceAll("}, ","}\n");
   }
}
