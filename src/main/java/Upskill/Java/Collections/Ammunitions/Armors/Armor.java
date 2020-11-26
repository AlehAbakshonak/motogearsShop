package Upskill.Java.Collections.Ammunitions.Armors;

import Upskill.Java.Collections.Ammunitions.Ammunition;
import Upskill.Java.Collections.Ammunitions.Armors.ArmorParametres.TorsoPlatesStrengthClasses;

import java.util.Objects;

public class Armor extends Ammunition {

   private ArmorTypes armorType;
   private boolean neckProtection;
   private TorsoPlatesStrengthClasses torsoPlatesStrengthClass;

   public Armor(String name, int weight, int cost, int respect, ArmorTypes armorTypes,
                boolean neckProtection, TorsoPlatesStrengthClasses torsoPlatesStrengthClass) {
      super(name, weight, cost, respect);
      this.armorType = armorTypes;
      this.neckProtection = neckProtection;
      this.torsoPlatesStrengthClass = torsoPlatesStrengthClass;
   }

   public ArmorTypes getArmorTypes() {
      return armorType;
   }

   public void setArmorTypes(ArmorTypes armorTypes) {
      this.armorType = armorTypes;
   }

   public boolean hasNeckProtection() {
      return neckProtection;
   }

   public void setNeckProtection(boolean neckProtection) {
      this.neckProtection = neckProtection;
   }

   public TorsoPlatesStrengthClasses getTorsoPlatesStrengthClass() {
      return torsoPlatesStrengthClass;
   }

   public void setTorsoPlatesStrengthClass(TorsoPlatesStrengthClasses torsoPlatesStrengthClass) {
      this.torsoPlatesStrengthClass = torsoPlatesStrengthClass;
   }

   @Override
   public String toString() {
      return super.toString().replace("}",
            "Armor{" +
                  "armorType=" + armorType +
                  "neckProtection=" + neckProtection +
                  ", torsoPlatesStrengthClass=" + torsoPlatesStrengthClass +
                  "}}");
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      if (!super.equals(o)) return false;
      Armor armor = (Armor) o;
      return neckProtection == armor.neckProtection &&
            torsoPlatesStrengthClass == armor.torsoPlatesStrengthClass &&
            armorType == armor.armorType;
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), armorType, neckProtection, torsoPlatesStrengthClass);
   }
}
