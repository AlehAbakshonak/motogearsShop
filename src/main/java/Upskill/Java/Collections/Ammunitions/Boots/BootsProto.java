package Upskill.Java.Collections.Ammunitions.Boots;

import Upskill.Java.Collections.Ammunitions.Ammunition;

import java.util.Objects;

public class BootsProto extends Ammunition {

   private BootsTypes bootsType;
   private boolean kneeProtectionPlate;
   private boolean fingersProtectionSteelCup;

   public BootsProto(String name, int weight, int cost, int respect, BootsTypes bootsType, boolean kneeProtectionPlate, boolean fingersProtectionSteelCup) {
      super(name, weight, cost, respect);
      this.bootsType = bootsType;
      this.kneeProtectionPlate = kneeProtectionPlate;
      this.fingersProtectionSteelCup = fingersProtectionSteelCup;
   }

   public BootsTypes getBootsType() {
      return bootsType;
   }

   public void setBootsType(BootsTypes bootsType) {
      this.bootsType = bootsType;
   }

   public boolean hasKneeProtectionPlate() {
      return kneeProtectionPlate;
   }

   public void setKneeProtectionPlate(boolean kneeProtectionPlate) {
      this.kneeProtectionPlate = kneeProtectionPlate;
   }

   public boolean hasFingersProtectionSteelCup() {
      return fingersProtectionSteelCup;
   }

   public void setFingersProtectionSteelCup(boolean fingersProtectionSteelCup) {
      this.fingersProtectionSteelCup = fingersProtectionSteelCup;
   }

   @Override
   public String toString() {
      return super.toString().replace("}",
            "BootsProto{" +
                  "bootsType=" + bootsType +
                  "kneeProtectionPlate=" + kneeProtectionPlate +
                  ", fingersProtectionSteelCup=" + fingersProtectionSteelCup +
                  "}}");
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      if (!super.equals(o)) return false;
      BootsProto that = (BootsProto) o;
      return kneeProtectionPlate == that.kneeProtectionPlate &&
            fingersProtectionSteelCup == that.fingersProtectionSteelCup &&
            bootsType == that.bootsType;
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), bootsType, kneeProtectionPlate, fingersProtectionSteelCup);
   }
}
