package Upskill.Java.Collections.Ammunitions.BackPacks;

import Upskill.Java.Collections.Ammunitions.Ammunition;
import Upskill.Java.Collections.Ammunitions.BackPacks.BackpackParametres.AerodynamicCoefficients;
import Upskill.Java.Collections.Ammunitions.BackPacks.BackpackParametres.InnerCapacities;

import java.util.Objects;

public class Backpack extends Ammunition {

   private BackpackTypes backpackType;
   private AerodynamicCoefficients aerodynamicCoefficient;
   private InnerCapacities innerCapacity;

   public Backpack(String name, int weight, int cost, int respect,
                   BackpackTypes backpackType, AerodynamicCoefficients aerodynamicCoefficient, InnerCapacities innerCapacity) {
      super(name, weight, cost, respect);
      this.backpackType = backpackType;
      this.aerodynamicCoefficient = aerodynamicCoefficient;
      this.innerCapacity = innerCapacity;
   }

   public BackpackTypes getBackpackType() {
      return backpackType;
   }

   public void setBackpackType(BackpackTypes backpackType) {
      this.backpackType = backpackType;
   }

   public AerodynamicCoefficients getAerodynamicCoefficient() {
      return aerodynamicCoefficient;
   }

   public void setAerodynamicCoefficient(AerodynamicCoefficients aerodynamicCoefficient) {
      this.aerodynamicCoefficient = aerodynamicCoefficient;
   }

   public InnerCapacities getInnerCapacity() {
      return innerCapacity;
   }

   public void setInnerCapacity(InnerCapacities innerCapacity) {
      this.innerCapacity = innerCapacity;
   }

   @Override
   public String toString() {
      return super.toString().replace("}",
            "Backpack{" +
            "backpackType=" + backpackType +
            ", aerodynamicCoefficient=" + aerodynamicCoefficient +
            ", innerCapacity=" + innerCapacity +
            "}}");
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      if (!super.equals(o)) return false;
      Backpack backpack = (Backpack) o;
      return backpackType == backpack.backpackType &&
            aerodynamicCoefficient == backpack.aerodynamicCoefficient &&
            innerCapacity == backpack.innerCapacity;
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), backpackType, aerodynamicCoefficient, innerCapacity);
   }
}
