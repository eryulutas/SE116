package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);





        //Tank Items
        Items swordShield = new Items("Sword-Shield", 20, 1, 0, 0, 4, "attack item", "adsasdasd");
        Items shortSword = new Items("Short Sword", 17, 1, 0, 0, 5, "attack item", "adsasdasd");
        Items longSword = new Items("Long Sword", 25, 1, 0, 0, 7, "attack item", "dfhjdasj");


        // Assassin Items
        Items dagger = new Items("Dagger", 19, 2, 0, 0, 3, "attack item", "adsasdasd");
        Items machetes = new Items("Machetes", 18, 2, 0, 0, 3, "attack item", "adsasdasd");
        Items throwingKnife = new Items("Throwing Knife", 15, 2, 0, 0, 3, "attack item", "adsasdasd");


        //Archer Items
        Items longRangeBow = new Items("Long Range Bow", 17, 3, 0, 0, 7, "attack item", "adsasdasd");
        Items shortRangeBow = new Items("Short Range Bow", 18, 2, 0, 0, 6, "attack item", "adsasdasd");
        Items Crossbow = new Items("Cross Bow", 26, 1, 0, 0, 9, "attack item", "adsasdasd");

        //Armors
        Items lightArmor = new Items("Light Armor", 0, 2, 5, 0, 7, "armor", "adsasdasd");
        Items heavyArmor = new Items("Heavy Armor", 0, 1, 7, 0, 11, "armor", "adsasdasd");
        Items heavyBoots = new Items("Heavy Boots", 0, 1, 3, 0, 5, "armor", "adsasdasd");
        Items basicBoot = new Items("Boots", 1, 2, 5, 0, 3, "armor", "sadasdasd");


        //Common Items
        Items healthPot = new Items("Health Pot", 0, 0, 0, 25, 1, "Health", "asdsa");
        Items helmet = new Items("Helmet", 0, 1, 3, 0, 5, "Health", "asdsa");
        Items empty1=new Items("This slot is empty. You can add an item here",0,0,0,0,0,"empty","empty");
        Items empty2=new Items("This slot is empty. You can add an item here",0,0,0,0,0,"empty","empty");
        // Inventory
        Inventory tankInv = new Inventory(50, shortSword, basicBoot,heavyArmor,empty1,empty2);
        Inventory assassinInv = new Inventory(50, dagger, basicBoot,lightArmor,empty1,empty2);
        Inventory archerInv = new Inventory(50, shortSword, basicBoot,heavyArmor,empty1,empty2);


        //Hero types
        Hero assassin = new Hero(Scenarios.heroName, 100, 100, 30, 1, 5, "Assassin",1,assassinInv);
        Hero archer = new Hero(Scenarios.heroName, 100, 100, 29, 1, 5, "Archer",1,archerInv);
        Hero tank = new Hero(Scenarios.heroName, 100, 100, 35, 1, 7, "Tank",1,tankInv);

        // Monsters
        Monster redSpider = new Monster("Red Spider", 90, 90, 18, 1, "Poison Needle Attack");
        Monster lisa=new Monster("Lisa",0,0,10,1,"Shadow Damage",helmet);

        Monster skeletonWarrior = new Monster("Skeleton Warrior", 150, 150, 45, 3, "Sword Strike Attack");
        Monster evilWizard = new Monster("Evil Wizard", 165, 165, 41, 1, "Magic Burst Attack");

        Monster mysticMorgana = new Monster("Mystic Morgana", 250, 250, 64, 2, "Chain Attack");
        Monster skeletonChampion = new Monster("Skeleton Champion", 249, 249, 68, 2, "Sword Strike Attack");

        Monster direWolf = new Monster("Dire Wolf", 309, 309, 100, 3, "Tooth Attack");
        Monster manyHeadedSibyrus = new Monster("Many-Headed Sibyrus", 300, 300, 95, 3, "Heads Attack");

        Monster scatha = new Monster("Scatha", 340, 340, 109, 4, "Orb Attack");
        Monster scorpion= new Monster("Scorpion", 352, 352, 111, 3, "Thrust Attack");


        Monster keilan= new Monster("Keilan", 425, 425, 121, 11, "Thrust Attack");
        Monster troll = new Monster("Troll", 470, 470, 145, 8, "Slight Attack");



        Monster littleOrc = new Monster("Little Orc", 525, 525, 151, 10, "Spike Attack");
        Monster giantBulcan = new Monster("Giant Bulcan", 529, 529, 161, 9, "Hit-Run Attack");

        Monster queenOfCrystals = new Monster("Queen Of Crystals", 610, 610, 175, 14, "Mass crystal attack");
        Monster rottenEye = new Monster("Rotten Eye", 621, 621, 10, 13, "Flying Eye Attack");



        Monster balrog = new Monster("BALROG", 700, 700, 189, 15, "Fireball Attack");

        Monster spiritOfFire = new Monster("Spirit of Fire", 800, 800, 210, 15, "Basic Fire Attack");
        Monster felankor = new Monster("Felankor", 800, 800, 257, 16, "Scorhing Heat Attack");

        Monster deruvish = new Monster("Deruvish", 840, 840, 217, 17, "Electric Attack");
        Monster apostle = new Monster("Apostle", 849, 849, 226, 9, "Lighting Orb Attack");

        Monster supremeAncalagon = new Monster("Supreme Ancalagon", 1000, 1000, 300, 25, "Fire Attack,Fireball Attack,Fire Blast Attack");





        //Rooms  room8,room2 hikayeli odalar


        Room room1=new Room(1,15,supremeAncalagon);

        Room room2=new Room(2,14,room1);
        Room room3=new Room(11,8,room2);

        Room room4=new Room(2,13,apostle,room3);
        Room room5=new Room(2,13,deruvish,room4);

        Room room6=new Room(3,13,felankor,room5);
        Room room7=new Room(3,13,spiritOfFire,room6);

        Room room8=new Room(5,13,balrog,room7);

        Room room9=new Room(6,12,rottenEye,room8);
        Room room10=new Room(6,11,queenOfCrystals,room9);

        Room room11=new Room(7,10,littleOrc,room10);
        Room room12=new Room(7,9,giantBulcan,room11);

        Room room13=new Room(9,8,troll,room12);
        Room room14=new Room(9,8,keilan,room13);

        Room room15=new Room(10,7,scorpion,room14);
        Room room16=new Room(10,7,scatha,room15);

        Room room17=new Room(12,6,direWolf,room16);
        Room room18=new Room(12,5,manyHeadedSibyrus,room17);

        Room room19=new Room(14,5,skeletonChampion,room18);
        Room room20=new Room(14,4,mysticMorgana,room19);


        Room room21=new Room(15,3,evilWizard,room20);
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



        int roomChoice= Game.readInt("1. Room-1 \n2. Room-2",2);

        if(roomChoice==1){                                              // FIRST ROOM
            currentLocation.changeLocation(selectedHero,currentLocation,room24);
            currentLocation.displayLoc(selectedHero);
            Scenarios.floorSixteenRoomOneIntro();

            String attackChoice= Game.readString("<ATTACK> -Attack To Monster: ",redSpider,"<ROOM 2> -GO TO ROOM2");

            if (attackChoice.matches("(.*)ATTACK(.*)")||attackChoice.matches("(.*)attack(.*)")) {
                Game.battle(selectedHero,redSpider);
                Game.clearConsole();
                System.out.println("You: That was easy, now we will see what is behind room 2");
                Game.anythingToContinue();
                Scenarios.room2Scenario(selectedHero,lisa,currentLocation,room23,helmet);


                //selectedHero.attack(monster16);
                //Game.anythingToContinue();
                //monster16.attack(selectedHero);

            }
            else if (attackChoice.matches("(.*)Room2||room2||ROOM2||ROOM 2||room 2(.*)")) {

                Scenarios.room2Scenario(selectedHero,lisa,currentLocation,room14,helmet);
                }








            }






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















