package Upskill.Java.Collections.Ammunitions.Helmets;

import Upskill.Java.Collections.Ammunitions.Ammunition;

import java.util.Objects;

public class Helmet extends Ammunition {

   private HelmetTypes helmetType;
   private boolean airStabilizers;
   private boolean videoRegistrationSlot;

   public Helmet(String name, int weight, int cost, int respect, HelmetTypes helmetType, boolean airStabilizers, boolean videoRegistrationSlot) {
      super(name, weight, cost, respect);
      this.helmetType = helmetType;
      this.airStabilizers = airStabilizers;
      this.videoRegistrationSlot = videoRegistrationSlot;
   }

   public HelmetTypes getHelmetType() {
      return helmetType;
   }

   public void setHelmetType(HelmetTypes helmetType) {
      this.helmetType = helmetType;
   }

   public boolean hasAirStabilizers() {
      return airStabilizers;
   }

   public void setAirStabilizers(boolean airStabilizers) {
      this.airStabilizers = airStabilizers;
   }

   public boolean hasVideoRegistrationSlot() {
      return videoRegistrationSlot;
   }

   public void setVideoRegistrationSlot(boolean videoRegistrationSlot) {
      this.videoRegistrationSlot = videoRegistrationSlot;
   }

   @Override
   public String toString() {
      return super.toString().replace("}",
            "Helmet{" +
                  "helmetType=" + helmetType +
                  ", airStabilizers=" + airStabilizers +
                  ", videoRegistrationSlot=" + videoRegistrationSlot +
                  "}}");
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      if (!super.equals(o)) return false;
      Helmet helmet = (Helmet) o;
      return airStabilizers == helmet.airStabilizers &&
            videoRegistrationSlot == helmet.videoRegistrationSlot &&
            helmetType == helmet.helmetType;
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), helmetType, airStabilizers, videoRegistrationSlot);
   }
}
