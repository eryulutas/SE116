package com.company;

public class Hero extends Character<Monster>{
     public Monster monster;

    private int  armor;
    private String type;
    Inventory inventory;
    private int level; // UNUTMA




    public Hero(String name,int healthPoints,int maxHealthPoints,int attackDamage,int attackSpeed, int armor, String type,int level,Inventory inventory) {
        super(Scenarios.heroName,healthPoints,maxHealthPoints,attackDamage,attackSpeed);
        this.armor=armor;
        this.type=type;
        this.level=level;
        this.inventory=inventory;
    }


    public Hero() {

        this.armor = 0;
        this.type = null;
        this.level=0;
        this.inventory=null;
    }


    public int attack(Monster monster) {
        int attackDamage=getAttackDamage();
        int attackSpeed=getAttackSpeed();
        int HitPoints=attackDamage*attackSpeed;
        System.out.println("You attacked to monster!");
        int currentMonsterHealth=monster.getHealthPoints()-HitPoints;

        if(currentMonsterHealth==0){
            System.out.println("You defeated the monster"+monster.getName());
            monster.setHealthPoints(0);
        }
        else {
            monster.setHealthPoints(currentMonsterHealth);

        }

        monster.displayInfo();

        return currentMonsterHealth;
    }

    @Override
    public void displayInfo() {
        Game.printHeading("Your champ details:");
        System.out.println("Name: "+Scenarios.heroName+"\nType: "+getType()+"\nHealth Points: "+getHealthPoints()+"\nAttack Damage: "+getAttackDamage()+"\nAttack Speed: "+ getAttackSpeed()+"\nArmor: "+getArmor());
    }

    public void upgrade(Hero hero, Items items) {
        int currentAttackDamage = hero.getAttackDamage() + items.getDamageUpgradeValue();
        int currentAttackSpeed = hero.getAttackSpeed() + items.getSpeedUpgradeValue();
        int currentArmor = hero.getArmor() + items.getArmorUpgradeValue();
        int currentHealthPoint = hero.getHealthPoints() + items.getHealthUpgradeValue();
        hero.setAttackDamage(currentAttackDamage);
        hero.setAttackDamage(currentAttackSpeed);
        hero.setArmor(currentArmor);
        hero.setHealthPoints(currentHealthPoint);

    }



    //public int attackToMonster(Monster monster) {
      //  System.out.println("You attacked to monster!");
        //int attackDamage = getAttackDamage();
        //int attackSpeed = getAttackSpeed();
        //int attack = attackDamage * attackSpeed;
        //int currentMonsterHealth=monster.getHealthPoints()-attack;
        //if(currentMonsterHealth==0){
          //  System.out.println("You defeated the monster"+monster.getName());
            //monster.setHealthPoints(0);
        //}
        //else {
         //   monster.setHealthPoints(currentMonsterHealth);

        //}
        //return currentMonsterHealth;
    //}





    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}



