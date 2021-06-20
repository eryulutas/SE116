package com.company;

public class Hero extends Character<Monster> {


    private int armor;
    private String type;
    Inventory inventory;
    private int level; // UNUTMA


    public Hero(String name, int healthPoints, int maxHealthPoints, int attackDamage, int attackSpeed, int armor, String type, int level, Inventory inventory) {
        super(Scenarios.heroName, healthPoints, maxHealthPoints, attackDamage, attackSpeed);
        this.armor = armor;
        this.type = type;
        this.level = level;
        this.inventory = inventory;
    }


    public Hero() {

        this.armor = 0;
        this.type = null;
        this.level = 0;
        this.inventory = null;
    }

    @Override
    public int attack(Monster monster) {
        System.out.println("---------------You attacked to "+monster.getName()+"--------------------------");

        int attackDamage = getAttackDamage();
        int attackSpeed = getAttackSpeed();
        int attack = attackDamage * attackSpeed;
        int currentMonsterHealth = monster.getHealthPoints() - attack;

        if (currentMonsterHealth > 0) {
            monster.setHealthPoints(currentMonsterHealth);
            monster.displayInfo();



        } else if (currentMonsterHealth <= 0) {
            monster.setHealthPoints(0);
            System.out.println("You defeated the monster!");


        }


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



    public void upgradeLevel(Hero hero) {
        int currentAttackDamage = hero.getAttackDamage() + hero.getAttackDamage()/10;
        int currentAttackSpeed = hero.getAttackSpeed() + hero.getAttackSpeed()/10;
        int currentArmor = hero.getAttackSpeed() + hero.getArmor()/10;
        int currentHealthPoint = hero.getAttackSpeed() + hero.getAttackSpeed()/10;
        hero.setAttackDamage(currentAttackDamage);
        hero.setAttackDamage(currentAttackSpeed);
        hero.setArmor(currentArmor);
        hero.setHealthPoints(currentHealthPoint);

    }





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



