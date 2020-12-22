package Upskill.Java.Collections.Ammunitions;

import java.util.Objects;

abstract public class Ammunition {
   private String name;
   private int weight;
   private int cost;
   private int respect;

   public Ammunition(String name, int weight, int cost, int respect) {
      this.name = name;
      this.weight = weight;
      this.cost = cost;
      this.respect = respect;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public int getCost() {
      return cost;
   }

   public void setCost(int cost) {
      this.cost = cost;
   }

   public int getRespect() {
      return respect;
   }

   public void setRespect(int respect) {
      this.respect = respect;
   }

   @Override
   public String toString() {
      return "Ammunition{" +
            "name=\"" + name + '\"' +
            ", weight=" + weight +
            ", cost=" + cost +
            ", respect=" + respect +
            ", Type: }";
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Ammunition that = (Ammunition) o;
      return weight == that.weight &&
            cost == that.cost &&
            respect == that.respect &&
            name.equals(that.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, weight, cost, respect);
   }
}
