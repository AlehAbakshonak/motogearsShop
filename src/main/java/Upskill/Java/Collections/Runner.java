package Upskill.Java.Collections;

import Upskill.Java.Collections.Ammunitions.Ammunition;
import Upskill.Java.Collections.Ammunitions.Armors.Armor;
import Upskill.Java.Collections.Ammunitions.Armors.ArmorParametres.TorsoPlatesStrengthClasses;
import Upskill.Java.Collections.Ammunitions.Armors.ArmorTypes;
import Upskill.Java.Collections.Ammunitions.BackPacks.Backpack;
import Upskill.Java.Collections.Ammunitions.BackPacks.BackpackParametres.AerodynamicCoefficients;
import Upskill.Java.Collections.Ammunitions.BackPacks.BackpackParametres.InnerCapacities;
import Upskill.Java.Collections.Ammunitions.BackPacks.BackpackTypes;
import Upskill.Java.Collections.Ammunitions.Boots.BootsProto;
import Upskill.Java.Collections.Ammunitions.Boots.BootsTypes;
import Upskill.Java.Collections.Ammunitions.Gloves.GlovesProto;
import Upskill.Java.Collections.Ammunitions.Gloves.GlovesTypes;
import Upskill.Java.Collections.Ammunitions.Helmets.Helmet;
import Upskill.Java.Collections.Ammunitions.Helmets.HelmetTypes;

import java.util.Arrays;
import java.util.List;

public class Runner
{

    static List<Ammunition> store = Arrays.asList(
          new Armor("City armor", 15, 1000,5,
                ArmorTypes.CITY,false, TorsoPlatesStrengthClasses.CASUAL),
          new Armor("Sport armor", 10, 3000,10,
                ArmorTypes.SPORT,true, TorsoPlatesStrengthClasses.MEDIUM),
          new Armor("Stunt armor", 20, 3000,15,
                ArmorTypes.STUNT,true, TorsoPlatesStrengthClasses.WELL_DONE),

          new Backpack("City backpack",7, 750, 10, BackpackTypes.CITY_TRAVEL,
                AerodynamicCoefficients.IMPROVED, InnerCapacities.SMALL),
          new Backpack("Country travel backpack",10, 2500, 15, BackpackTypes.COUNTRY_TRAVEL,
                AerodynamicCoefficients.BEST_FORMULA, InnerCapacities.EXTENDED),
          new Backpack("Family travel backpack",12, 2000, 5, BackpackTypes.FAMILY_TRAVEL,
                AerodynamicCoefficients.DEFAULT, InnerCapacities.HUGE),

          new BootsProto("City boots", 7, 1000,5,
                BootsTypes.CITY,false, true),
          new BootsProto("Sport boots", 5, 3000,15,
                BootsTypes.SPORT,true, true),
          new BootsProto("Stunt boots", 10, 3000,10,
                BootsTypes.STUNT,true, true),

          new GlovesProto("City gloves", 3, 500,5,
                GlovesTypes.CITY,false, false),
          new GlovesProto("Sport gloves", 2, 1500,15,
                GlovesTypes.SPORT,true, true),
          new GlovesProto("Stunt gloves", 4, 1500,10,
                GlovesTypes.STUNT,true, true),

          new Helmet("City helmet", 7, 1000,5,
                HelmetTypes.CITY,false, true),
          new Helmet("Sport helmet", 5, 3000,10,
                HelmetTypes.SPORT,true, true),
          new Helmet("Stunt helmet", 10, 3000,15,
                HelmetTypes.STUNT,true, true)

    );

    public static void main( String[] args )
    {
        ShopStore shop = new ShopStore();
    }
}
