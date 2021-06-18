package com.company;
public abstract class Character<T> {

    private String name;
    private  int healthPoints,maxHealthPoints,attackDamage,attackSpeed;



    public Character(String name,int healthPoints,int maxHealthPoints,int attackDamage,int attackSpeed){
        this.name=name;
        this.healthPoints=healthPoints;
        this.maxHealthPoints=maxHealthPoints;
        this.attackDamage=attackDamage;
        this.attackSpeed=attackSpeed;


    }
    public Character(){
        this.name=null;
        this.healthPoints=0;
        this.maxHealthPoints=0;
        this.attackDamage=0;
        this.attackSpeed=0;
    }

    public abstract int attack(T object);

    public abstract void displayInfo();






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }




}
