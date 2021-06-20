package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);





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
        Items crossbow = new Items("Cross Bow", 7, 1, 3, 0, 4, "attack item", "adsasdasd");

        //Armors
        Items lightArmor = new Items("Light Armor", 7, 1, 3, 0, 4, "armor", "adsasdasd");
        Items heavyArmor = new Items("Heavy Armor", 7, 1, 3, 0, 4, "armor", "adsasdasd");
        Items heavyBoots = new Items("Heavy Boots", 7, 1, 3, 0, 4, "boot", "adsasdasd");
        Items basicBoot = new Items("Boots", 1, 2, 5, 0, 3, "boot", "sadasdasd");


        //Common Items
        Items healthPot = new Items("Health Pot", 0, 0, 0, 25, 1, "Health", "asdsa");
        Items helmet = new Items("Helmet", 0, 1, 3, 0, 5, "Health", "asdsa");
        Items empty1=new Items("This slot is empty. You can add an item here",0,0,0,0,0,"empty","empty");
        Items empty2=new Items("This slot is empty. You can add an item here",0,0,0,0,0,"empty","empty");
        // Inventory
        Inventory tankInv = new Inventory(50, shortSword, basicBoot,lightArmor,empty1,empty2);
        Inventory assassinInv = new Inventory(50, dagger, basicBoot,lightArmor,empty1,empty2);
        Inventory archerInv = new Inventory(50, shortRangeBow, basicBoot,lightArmor,empty1,empty2);


        //Hero types
        Hero assassin = new Hero(Scenarios.heroName, 100, 100, 30, 1, 5, "Assassin",1,assassinInv);
        Hero archer = new Hero(Scenarios.heroName, 100, 100, 29, 1, 5, "Archer",1,archerInv);
        Hero tank = new Hero(Scenarios.heroName, 100, 100, 35, 1, 7, "Tank",1,tankInv);

        // Monsters
        Monster redSpider = new Monster("Red Spider", 90, 90, 18, 1, "Poison Needle Attack");
        Monster lisa=new Monster("Lisa",0,0,10,1,"Shadow Damage",helmet);

        Monster skeletonWarrior = new Monster("Skeleton Warrior", 150, 150, 45, 3, "Sword Strike Attack");
        Monster evilWizard = new Monster("Evil Wizard", 165, 165, 41, 1, "Magic Burst Attack");

        Monster mysticMorgana_Assassin = new Monster("Mystic Morgana", 240, 240, 65, 2, "Chain Attack",machetes);
        Monster mysticMorgana_Archer = new Monster("Mystic Morgana", 240, 240, 65, 2, "Chain Attack",longRangeBow);
        Monster mysticMorgana_Tank = new Monster("Mystic Morgana", 240, 240, 65, 2, "Chain Attack",swordShield);
        Monster skeletonChampion = new Monster("Skeleton Champion", 249, 249, 68, 2, "Sword Strike Attack");

        Monster direWolf = new Monster("Dire Wolf", 309, 309, 100, 3, "Tooth Attack");
        Monster manyHeadedSibyrus = new Monster("Many-Headed Sibyrus", 300, 300, 95, 3, "Heads Attack");

        Monster scatha = new Monster("Scatha", 340, 340, 109, 4, "Orb Attack");
        Monster scorpion= new Monster("Scorpion", 352, 352, 111, 3, "Thrust Attack",heavyBoots);


        Monster keilan= new Monster("Keilan", 425, 425, 121, 11, "Thrust Attack");
        Monster troll = new Monster("Troll", 470, 470, 145, 8, "Slight Attack");



        Monster littleOrc = new Monster("Little Orc", 525, 525, 151, 10, "Spike Attack");
        Monster giantBulcan_Assassin = new Monster("Giant Bulcan", 529, 529, 161, 9, "Hit-Run Attack",throwingKnife);
        Monster giantBulcan_Archer = new Monster("Giant Bulcan", 529, 529, 161, 9, "Hit-Run Attack",crossbow);
        Monster giantBulcan_Tank = new Monster("Giant Bulcan", 529, 529, 161, 9, "Hit-Run Attack",longSword);

        Monster queenOfCrystals = new Monster("Queen Of Crystals", 610, 610, 175, 14, "Mass crystal attack");
        Monster rottenEye = new Monster("Rotten Eye", 621, 621, 10, 13, "Flying Eye Attack");



        Monster balrog = new Monster("BALROG", 700, 700, 189, 15, "Fireball Attack",healthPot);

        Monster spiritOfFire = new Monster("Spirit of Fire", 800, 800, 210, 15, "Basic Fire Attack");
        Monster felankor = new Monster("Felankor", 800, 800, 257, 16, "Scorhing Heat Attack",heavyArmor);

        Monster deruvish = new Monster("Deruvish", 840, 840, 217, 17, "Electric Attack");
        Monster apostle = new Monster("Apostle", 849, 849, 226, 9, "Lighting Orb Attack");

        Monster supremeAncalagon = new Monster("Supreme Ancalagon", 1000, 1000, 300, 25, "Fire Attack,Fireball Attack,Fire Blast Attack");





        //Rooms  room8,room2 hikayeli odalar


        Room room1=new Room(1,24,supremeAncalagon);

        Room room2=new Room(2,23,room1);
        Room room3=new Room(11,22,room2);

        Room room4=new Room(2,21,apostle,room3);
        Room room5=new Room(2,20,deruvish,room4);

        Room room6=new Room(3,19,felankor,room5);
        Room room7=new Room(3,18,spiritOfFire,room6);

        Room room8=new Room(5,17,balrog,room7);

        Room room9=new Room(6,16,rottenEye,room8);
        Room room10=new Room(6,15,queenOfCrystals,room9);

        Room room11=new Room(7,14,littleOrc);
        Room room12_Assassin=new Room(7,13,giantBulcan_Assassin,room11);
        Room room12_Archer=new Room(7,13,giantBulcan_Archer,room11);
        Room room12_Tank=new Room(7,13,giantBulcan_Tank,room11);

        Room room13=new Room(9,12,troll);
        Room room14=new Room(9,11,keilan,room13);

        Room room15=new Room(10,10,scorpion,room14);
        Room room16=new Room(10,9,scatha,room15);
             //KAt 11 bilmece
        Room room17=new Room(12,8,direWolf,room16);
        Room room18=new Room(12,7,manyHeadedSibyrus,room17);
        //Kat 13 bilmece
        Room room19=new Room(14,6,skeletonChampion);
        Room room20_Assassin=new Room(14,5,mysticMorgana_Assassin,room18);
        Room room20_Archer=new Room(14,5,mysticMorgana_Archer,room18);
        Room room20_Tank=new Room(14,5,mysticMorgana_Tank,room18);



        Room room21=new Room(15,4,evilWizard);
        Room room22=new Room(15,3,skeletonWarrior,room21);

        Room room23=new Room(16,2,lisa,room22);
        Room room24=new Room(16,1,redSpider,room23);




        Scenarios.beginningScenario();
        Hero selectedHero=Game.selectHero(assassin,tank,archer);
        selectedHero.displayInfo();
        Game.anythingToContinue();
        Game.clearConsole();
        Location currentLocation=new Location(16,selectedHero,selectedHero.getLevel());

        Scenarios.floorSixteenIntro(selectedHero.inventory,currentLocation);



             int roomChoice = Game.readInt("1. Room-1 \n2. Room-2", 2);

             if (roomChoice == 1) {                                              // FIRST ROOM
                 currentLocation.changeLocation(selectedHero, currentLocation, room24);
                 currentLocation.displayLoc(selectedHero);
                 Scenarios.floorSixteenRoomOneIntro();

                 String attackChoice = Game.readString("<ATTACK> -Attack To Monster: ", redSpider, "<ROOM 2> -GO TO ROOM2");

                 if (attackChoice.matches("(.*)ATTACK(.*)") || attackChoice.matches("(.*)attack(.*)")) {
                     Game.battle(selectedHero, redSpider);
                     Game.clearConsole();
                     System.out.println("You: That was easy, now we will see what is behind room 2");
                     Game.anythingToContinue();
                     Scenarios.room23Scenario(selectedHero, lisa, currentLocation, room23, helmet);


                 } else if (attackChoice.matches("(.*)Room2||room2||ROOM2||ROOM 2||room 2(.*)")) {

                     Scenarios.room23Scenario(selectedHero, lisa, currentLocation, room23, helmet);
                 } else if (roomChoice == 2) {

                     Scenarios.room23Scenario(selectedHero, lisa, currentLocation, room23, helmet);

                 }

             }
             currentLocation.changeLocation(selectedHero, currentLocation, room22);
             selectedHero.upgradeLevel();
             Game.attackOrChangeRoom(selectedHero, skeletonWarrior, currentLocation, room21);
             currentLocation.displayLoc(selectedHero);
             Game.attackOrChangeRoom(selectedHero, evilWizard, currentLocation, room19);

             if (selectedHero == assassin) {
                 Game.attackOrChangeRoom(selectedHero, skeletonChampion, currentLocation, room20_Assassin);
                 Game.attackOrChangeRoom(selectedHero, mysticMorgana_Assassin, currentLocation, room18);

             } else if (selectedHero == archer) {
                 Game.attackOrChangeRoom(selectedHero, skeletonChampion, currentLocation, room20_Archer);
                 Game.attackOrChangeRoom(selectedHero, mysticMorgana_Archer, currentLocation, room18);

             } else if (selectedHero == tank) {
                 Game.attackOrChangeRoom(selectedHero, skeletonChampion, currentLocation, room20_Tank);
                 Game.attackOrChangeRoom(selectedHero, mysticMorgana_Tank, currentLocation, room18);

             }

             Game.attackOrChangeRoom(selectedHero, manyHeadedSibyrus, currentLocation, room17);
             Game.attackOrChangeRoom(selectedHero, direWolf, currentLocation, room16);
             Game.attackOrChangeRoom(selectedHero, scatha, currentLocation, room15);

             if (selectedHero == assassin) {
                 Game.attackOrChangeRoom(selectedHero, littleOrc, currentLocation, room12_Assassin);
                 Game.attackOrChangeRoom(selectedHero, giantBulcan_Assassin, currentLocation, room10);

             } else if (selectedHero == archer) {
                 Game.attackOrChangeRoom(selectedHero, littleOrc, currentLocation, room12_Archer);
                 Game.attackOrChangeRoom(selectedHero, giantBulcan_Archer, currentLocation, room10);

             } else if (selectedHero == tank) {
                 Game.attackOrChangeRoom(selectedHero, littleOrc, currentLocation, room12_Tank);
                 Game.attackOrChangeRoom(selectedHero, giantBulcan_Tank, currentLocation, room10);

             }
             Game.attackOrChangeRoom(selectedHero, queenOfCrystals, currentLocation, room9);
             Game.attackOrChangeRoom(selectedHero, rottenEye, currentLocation, room8);
             Game.attackOrChangeRoom(selectedHero, balrog, currentLocation, room7);
             Game.attackOrChangeRoom(selectedHero, spiritOfFire, currentLocation, room6);
             Game.attackOrChangeRoom(selectedHero, felankor, currentLocation, room5);
             Game.attackOrChangeRoom(selectedHero, deruvish, currentLocation, room4);
             Game.attackOrChangeRoom(selectedHero, apostle, currentLocation, room1);

             Game.attackOrChangeRoom(selectedHero, supremeAncalagon, currentLocation, room1);























            }

        }
















       // Room room2=new Room(2);
        //Room room1= new Room(1,monster16,);











       /* while (selectedHero.getHealthPoints() != 0) {
            Game.actions();
            Game.choices(); */







           /* System.out.println("here is a new sword:");
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
            Game.choices(); */















