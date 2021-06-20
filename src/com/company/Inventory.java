package com.company;

public class Inventory {

    private int inventoryCapacity;
    private Items attackItem;
    private Items boot;
    private Items armor;
    private Items empty1;
    private Items empty2;
    Hero hero;




    public Inventory(int inventoryCapacity,Items attackItem,Items boot, Items armor,Items empty1,Items empty2){

        //upgradeStats();
        this.inventoryCapacity=inventoryCapacity;
        this.attackItem=attackItem;
        this.boot=boot;
        this.armor=armor;
        this.empty1=empty1;
        this.empty2=empty2;

    }



    public Inventory(){
        this.inventoryCapacity=0;
        this.attackItem=null;
        this.boot=null;
        this.armor= null;
        this.empty1=null;
        this.empty2=null;
    }
    public void addAnItem(Hero hero,Items newItem){
        hero.inventory.setEmpty1(newItem);
    }
    public void addTwoItem(Hero hero,Items newItem,Items newItem2){
        hero.inventory.setEmpty1(newItem);
        hero.inventory.setEmpty1(newItem2);

    }



    public void changeItem(Items item1){



        if (item1.getMainType()=="attack item") {
            int totalWeight=item1.getItemWeight()+boot.getItemWeight()+armor.getItemWeight();
            if(totalWeight<inventoryCapacity) {

                setAttackItem(item1);
                System.out.println("Your items changed.");
                Game.selectedHero.upgrade(Game.selectedHero,item1);
            }
            else{
                System.out.println("This item exceeds your inventory capacity. Find a way to increase it");
            }
        }



        else if(item1.getMainType()=="boot"){
            int totalWeight=item1.getItemWeight()+attackItem.getItemWeight()+armor.getItemWeight();

            if(totalWeight<inventoryCapacity) {


                setBoot(item1);
                System.out.println("Your items changed.");
                Game.selectedHero.upgrade(Game.selectedHero,item1);
            }
            else{
                System.out.println("This item exceeds your inventory capacity. Find a way to increase it");
            }
        }



        else if (item1.getMainType()=="armor"){

            int totalWeight=item1.getItemWeight()+boot.getItemWeight()+attackItem.getItemWeight();

            if(totalWeight<inventoryCapacity) {

                setArmor(item1);
                System.out.println("Your items changed.");
                Game.selectedHero.upgrade(Game.selectedHero,item1);
            }
            else{
                System.out.println("This item exceeds your inventory capacity. Find a way to increase it");
            }
        }



    }


    public void displayInventory(){
        attackItem.displayItemInfo();
        System.out.println("----------------------------");
        boot.displayItemInfo();
        System.out.println("----------------------------");
        armor.displayItemInfo();
        System.out.println("----------------------------");
        empty1.displayItemInfo();
        System.out.println("----------------------------");
        empty2.displayItemInfo();
        System.out.println("----------------------------");
    }

    public void upgradeStats() {
        int totalAttackDamage=attackItem.getDamageUpgradeValue()+boot.getDamageUpgradeValue()+armor.getDamageUpgradeValue();
        int totalAttackSpeed=attackItem.getSpeedUpgradeValue()+boot.getSpeedUpgradeValue()+armor.getSpeedUpgradeValue();
        int totalArmor=attackItem.getArmorUpgradeValue()+boot.getArmorUpgradeValue()+armor.getArmorUpgradeValue();

        Game.selectedHero.setAttackDamage(totalAttackDamage+Game.selectedHero.getAttackDamage());
        Game.selectedHero.setAttackSpeed(totalAttackSpeed+Game.selectedHero.getAttackSpeed());
        Game.selectedHero.setArmor(totalArmor+Game.selectedHero.getArmor());

    }


    public Items getEmpty1() {
        return empty1;
    }

    public void setEmpty1(Items empty1) {
        this.empty1 = empty1;
    }

    public Items getEmpty2() {
        return empty2;
    }

    public void setEmpty2(Items empty2) {
        this.empty2 = empty2;
    }

    public int getInventoryCapacity() {
        return inventoryCapacity;
    }

    public void setInventoryCapacity(int inventoryCapacity) {
        this.inventoryCapacity = inventoryCapacity;
    }

    public Items getAttackItem() {
        return attackItem;
    }

    public void setAttackItem(Items attackItem) {
        this.attackItem = attackItem;
    }

    public Items getBoot() {
        return boot;
    }

    public void setBoot(Items boot) {
        this.boot = boot;
    }

    public Items getArmor() {
        return armor;
    }

    public void setArmor(Items armor) {
        this.armor = armor;
    }
}
