package com.company;

import java.util.ArrayList;

public class Items {
    Hero hero;
    private String name;

    private int damageUpgradeValue;
    private int speedUpgradeValue;
    private int armorUpgradeValue;
    private int healthUpgradeValue;
    private int itemWeight;
    private String mainType;
    private String specialities;



    public Items(String name, int damageUpgradeValue, int speedUpgradeValue, int armorUpgradeValue, int healthUpgradeValue,int itemWeight,String mainType, String specialities) {
        this.name = name;

        this.damageUpgradeValue = damageUpgradeValue;
        this.speedUpgradeValue = speedUpgradeValue;
        this.armorUpgradeValue = armorUpgradeValue;
        this.healthUpgradeValue = healthUpgradeValue;
        this.itemWeight=itemWeight;
        this.mainType=mainType;
        this.specialities = specialities;

    }

    public Items() {
        this.name = null;
        this.damageUpgradeValue = 0;
        this.speedUpgradeValue = 0;
        this.armorUpgradeValue = 0;
        this.healthUpgradeValue = 0;
        this.itemWeight=0;
        this.specialities = null;
        this.mainType=null;

    }

    public void displayItemInfo(){
        System.out.println("Name: "+ getName()+ "\nDamage:"+getDamageUpgradeValue()+"\nAttack Speed: "+getSpeedUpgradeValue()+"\nArmor: "+armorUpgradeValue+"\nHealth upgrade: "+getHealthUpgradeValue()+"\nItem weight: "+ getItemWeight());

    }








    public void setName(String name) {
        this.name = name;
    }



    public void setDamageUpgradeValue(int damageUpgradeValue) {
        this.damageUpgradeValue = damageUpgradeValue;
    }

    public void setSpeedUpgradeValue(int speedUpgradeValue) {
        this.speedUpgradeValue = speedUpgradeValue;
    }

    public void setArmorUpgradeValue(int armorUpgradeValue) {
        this.armorUpgradeValue = armorUpgradeValue;
    }

    public void setHealthUpgradeValue(int healthUpgradeValue) {
        this.healthUpgradeValue = healthUpgradeValue;
    }

    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }

    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    public String getName() {
        return name;
    }



    public int getDamageUpgradeValue() {
        return damageUpgradeValue;
    }

    public int getSpeedUpgradeValue() {
        return speedUpgradeValue;
    }

    public int getArmorUpgradeValue() {
        return armorUpgradeValue;
    }

    public int getHealthUpgradeValue() {
        return healthUpgradeValue;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public String getSpecialities() {
        return specialities;
    }

    public String getMainType() {
        return mainType;
    }
}
