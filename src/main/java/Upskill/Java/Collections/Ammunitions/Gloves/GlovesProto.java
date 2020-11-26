package Upskill.Java.Collections.Ammunitions.Gloves;

import Upskill.Java.Collections.Ammunitions.Ammunition;

import java.util.Objects;

public class GlovesProto extends Ammunition {

   private GlovesTypes glovesType;
   private boolean wristProtection;
   private boolean fingerProtection;

   public GlovesProto(String name, int weight, int cost, int respect, GlovesTypes glovesType, boolean wristProtection, boolean fingerProtection) {
      super(name, weight, cost, respect);
      this.glovesType = glovesType;
      this.wristProtection = wristProtection;
      this.fingerProtection = fingerProtection;
   }

   public GlovesTypes getGlovesType() {
      return glovesType;
   }

   public void setGlovesType(GlovesTypes glovesType) {
      this.glovesType = glovesType;
   }

   public boolean hasWristProtection() {
      return wristProtection;
   }

   public void setWristProtection(boolean wristProtection) {
      this.wristProtection = wristProtection;
   }

   public boolean hasFingerProtection() {
      return fingerProtection;
   }

   public void setFingerProtection(boolean fingerProtection) {
      this.fingerProtection = fingerProtection;
   }

   @Override
   public String toString() {
      return super.toString().replace("}",
            "GlovesProto{" +
                  "glovesType=" + glovesType +
                  "wristProtection=" + wristProtection +
                  ", fingerProtection=" + fingerProtection +
                  "}}");
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      if (!super.equals(o)) return false;
      GlovesProto that = (GlovesProto) o;
      return wristProtection == that.wristProtection &&
            fingerProtection == that.fingerProtection &&
            glovesType == that.glovesType;
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), glovesType, wristProtection, fingerProtection);
   }
}
