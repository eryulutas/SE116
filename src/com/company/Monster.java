package com.company;

public class Monster extends Character<Hero>{


    private String abilities;
    private Items items;

    public Monster(String name, int healthPoints,int maxHealthPoints, int attackDamage, int attackSpeed, String abilities,Items items) {
        super(name, healthPoints, maxHealthPoints, attackDamage, attackSpeed);
        this.abilities = abilities;
        this.items=items;
    }

    public Monster(String name, int healthPoints,int maxHealthPoints, int attackDamage, int attackSpeed, String abilities) {
        super(name, healthPoints, maxHealthPoints, attackDamage, attackSpeed);
        this.abilities = abilities;

    }


    public Monster() {

        this.abilities = null;
        this.items=null;
    }



    @Override
    public int attack(Hero hero){
        System.out.println(getName()+": attacked you.");
        int currentHeroHealth;
        int reducedDamage;
        int attackDamage = getAttackDamage();
        int attackSpeed = getAttackSpeed();
        int attack = attackDamage * attackSpeed;

        if(attack<hero.getArmor()){
            reducedDamage=hero.getArmor()-attack;

        }
        else{
            reducedDamage=attack-hero.getArmor();

        }
        currentHeroHealth=hero.getHealthPoints()-reducedDamage;
        hero.setHealthPoints(currentHeroHealth);

        hero.displayInfo();

        return currentHeroHealth;

    }

    @Override
    public void displayInfo() {
        Game.printHeading("Monster Info");
        System.out.println("Name: "+getName()+"\nHealth: "+ getHealthPoints()+"\nAttack Damage: "+getAttackDamage()+"\nAttack Speed: "+ getAttackSpeed()+"\nAbilities: "+ getAbilities());
    }







    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public void setItems(Items items) {
        this.items = items;
    }



    public String getAbilities() {
        return abilities;
    }

    public Items getItems() {
        return items;
    }



}
