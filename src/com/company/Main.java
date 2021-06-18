package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //Hero types
        Hero assassin = new Hero(Scenarios.heroName, 100, 100, 32, 2, 0, "Assassin");
        Hero archer = new Hero(Scenarios.heroName, 100, 100, 30, 3, 0, "Archer");
        Hero tank = new Hero(Scenarios.heroName, 100, 100, 35, 1, 5, "Tank");

        //Tank Items
        Items swordShield = new Items("Sword-Shield", 7, 1, 3, 0, 4, "attack item", "adsasdasd");
        Items shortSword = new Items("Short Sword", 7, 1, 3, 0, 4, "attack item", "adsasdasd");
        Items longSword = new Items("Long Sword", 15, 3, 2, 0, 5, "attack item", "dfhjdasj");


        // Assassin Items
        Items dagger = new Items("Dagger", 7, 1, 3, 0, 4, "attack item", "adsasdasd");
        Items machetes = new Items("Machetes", 7, 1, 3, 0, 4, "attack item", "adsasdasd");
        Items throwingKnife = new Items("Throwing Knife", 7, 1, 3, 0, 4, "attack item", "adsasdasd");


        //Archer Items
        Items longRangeBow = new Items("Long Range Bow", 7, 1, 3, 0, 4, "attack item", "adsasdasd");
        Items shortRangeBow = new Items("Short Range Bow", 7, 1, 3, 0, 4, "attack item", "adsasdasd");
        Items Crossbow = new Items("Cross Bow", 7, 1, 3, 0, 4, "attack item", "adsasdasd");

        //Armors
        Items lightArmor = new Items("Long Range Bow", 7, 1, 3, 0, 4, "attack item", "adsasdasd");
        Items heavyArmor = new Items("Long Range Bow", 7, 1, 3, 0, 4, "attack item", "adsasdasd");
        Items helmet = new Items("Long Range Bow", 7, 1, 3, 0, 4, "attack item", "adsasdasd");
        Items basicBoot = new Items("Boots", 1, 2, 5, 0, 3, "boot", "sadasdasd");


        //Common Items
        Items healthPot = new Items("Health Pot", 0, 0, 0, 25, 1, "Health", "asdsa");


        // Monsters
        Monster monster16 = new Monster("Red Spider", 100, 100, 15, 1, "Poison Needle Attack");
        Monster monster15_Assassin = new Monster("Skeleton Warrior", 100, 100, 10, 1, "Sword Strike Attack", machetes);//for assassin
        Monster monster15_Tank = new Monster("Skeleton Warrior", 100, 100, 10, 1, "Sword Strike Attack", longSword);//for tank
        Monster monster15_Archer = new Monster("Skeleton Warrior", 100, 100, 10, 1, "Sword Strike Attack", longRangeBow);//for archer
        Monster monster14 = new Monster("Mystic Morgana", 100, 100, 10, 1, "Chain Attack");
        Monster monster12 = new Monster("Many-Headed Sibyrus", 100, 100, 10, 1, "Heads Attack");
        Monster monster10 = new Monster("Scatha", 100, 100, 10, 1, "Orb Attack");
        Monster monster9_Room1 = new Monster("Keilan", 100, 100, 10, 1, "Thrust Attack");
        Monster monster9_Room2 = new Monster("Troll", 100, 100, 10, 1, "Slight Attack");
        Monster monster7 = new Monster("Little Orc", 100, 100, 10, 1, "Spike Attack");
        Monster monster6 = new Monster("Queen Of Crystals", 100, 100, 10, 1, "Mass crystal attack");
        Monster monster5 = new Monster("BALROG", 100, 100, 10, 1, "Fireball Attack");
        Monster monster3_Room1 = new Monster("Spirit of Fire", 100, 100, 10, 1, "Basic Fire Attack");
        Monster monster3Room2_1 = new Monster("Deruvish", 100, 100, 10, 1, "Electric Attack");
        Monster monster3_Room2_2 = new Monster("Apostle", 100, 100, 10, 1, "Lighting Orb Attack");
        Monster monster1 = new Monster("Supreme Ancalagon", 100, 100, 10, 1, "Fire Attack,Fireball Attack,Fire Blast Attack");


        Inventory tankInv = new Inventory(50, shortSword, basicBoot,heavyArmor);
        Inventory assassinInv = new Inventory(50, dagger, basicBoot,lightArmor);
        Inventory archerInv = new Inventory(50, shortSword, basicBoot,heavyArmor);


        Scenarios.beginningScenario();
        Hero selectedHero=Game.selectHero(assassin,tank,archer);


       /* while (selectedHero.getHealthPoints() != 0) {
            Game.actions();
            Game.choices(); */


            System.out.println("It is your basic bag and your items:");
            tankInv.displayInventory();


            System.out.println("here is a new sword:");
            longSword.displayItemInfo();
            System.out.println("Will you change it?  \n1. Yes! \n2. No.");
            int choice = scan.nextInt();
            if (choice == 1) {
                tankInv.changeItem(longSword);
            } else {

            }
            System.out.println("------------------");
            System.out.println("its your new inventory");

            tankInv.displayInventory();

        Game.startGame();

        while(selectedHero.getHealthPoints()!=0){
            Game.actions();
            Game.choices();

        }

    }
    }












