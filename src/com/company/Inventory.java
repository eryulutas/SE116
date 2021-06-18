package com.company;

public class Inventory {

    private int inventoryCapacity;
    private Items attackItem;
    private Items boot;
    private Items shield;
    public Items item1,item2;




    public Inventory(int inventoryCapacity,Items attackItem,Items boot, Items shield){ // for tank
        this.inventoryCapacity=inventoryCapacity;
        this.attackItem=attackItem;
        this.boot=boot;
        this.shield=shield;

    }

    public Inventory(){
        this.inventoryCapacity=0;
        this.attackItem=null;
        this.boot=null;
        this.shield= null;
    }



    public void changeItem(Items item1){



        if (item1.getMainType()=="attack item") {
            int totalWeight=item1.getItemWeight()+boot.getItemWeight()+shield.getItemWeight();
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
            int totalWeight=item1.getItemWeight()+attackItem.getItemWeight()+shield.getItemWeight();

            if(totalWeight<inventoryCapacity) {


                setBoot(item1);
                System.out.println("Your items changed.");
                Game.selectedHero.upgrade(Game.selectedHero,item1);
            }
            else{
                System.out.println("This item exceeds your inventory capacity. Find a way to increase it");
            }
        }



        else if (item1.getMainType()=="shield"){

            int totalWeight=item1.getItemWeight()+boot.getItemWeight()+attackItem.getItemWeight();

            if(totalWeight<inventoryCapacity) {

                setShield(item1);
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
        shield.displayItemInfo();
        System.out.println("----------------------------");
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

    public Items getShield() {
        return shield;
    }

    public void setShield(Items shield) {
        this.shield = shield;
    }
}
