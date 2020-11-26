package Upskill.Java.Collections;

import Upskill.Java.Collections.Ammunitions.Ammunition;

import java.util.Comparator;
import java.util.List;

public class ShopStore {

   private List<? extends Ammunition> store;

   public ShopStore(List<? extends Ammunition> store) {
      this.store = store;
   }

   public ShopStore sortAllAmmunitionByWeight() {
      store.sort(new Comparator<Ammunition>() {
         public int compare(Ammunition o1, Ammunition o2) {
            return o1.getWeight() - o2.getWeight();
         }
      });
      return this;
   }
}
