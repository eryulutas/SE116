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
        Items Crossbow = new Items("Cross Bow", 7, 1, 3, 0, 4, "attack item", "adsasdasd");

        //Armors
        Items lightArmor = new Items("Light Armor", 7, 1, 3, 0, 4, "armor", "adsasdasd");
        Items heavyArmor = new Items("Heavy Armor", 7, 1, 3, 0, 4, "armor", "adsasdasd");
        Items heavyBoots = new Items("Heavy Boots", 7, 1, 3, 0, 4, "armor", "adsasdasd");
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
        Hero assassin = new Hero(Scenarios.heroName, 100, 100, 0, 1, 5, "Assassin",1,assassinInv);
        Hero archer = new Hero(Scenarios.heroName, 100, 100, 29, 1, 5, "Archer",1,archerInv);
        Hero tank = new Hero(Scenarios.heroName, 100, 100, 35, 1, 7, "Tank",1,tankInv);

        // Monsters
        Monster redSpider = new Monster("Red Spider", 90, 90, 18, 1, "Poison Needle Attack");
        Monster lisa=new Monster("Lisa",0,0,10,1,"sddas",helmet);
        Monster skeletonWarrior = new Monster("Skeleton Warrior", 150, 150, 45, 3, "Sword Strike Attack");

        Monster mysticMorgana = new Monster("Mystic Morgana", 250, 250, 64, 2, "Chain Attack");
        Monster manyHeadedSibyrus = new Monster("Many-Headed Sibyrus", 300, 300, 95, 6, "Heads Attack");
        Monster scatha = new Monster("Scatha", 340, 340, 109, 8, "Orb Attack");
        Monster keilan= new Monster("Keilan", 425, 425, 121, 11, "Thrust Attack");
        Monster troll = new Monster("Troll", 470, 470, 145, 8, "Slight Attack");
        Monster littleOrc = new Monster("Little Orc", 525, 525, 151, 10, "Spike Attack");
        Monster queenOfCrystals = new Monster("Queen Of Crystals", 100, 100, 10, 1, "Mass crystal attack");
        Monster balrog = new Monster("BALROG", 700, 700, 189, 15, "Fireball Attack");
        Monster spiritOfFire = new Monster("Spirit of Fire", 800, 800, 210, 15, "Basic Fire Attack");
        Monster deruvish = new Monster("Deruvish", 840, 840, 217, 17, "Electric Attack");
        Monster apostle = new Monster("Apostle", 849, 849, 226, 9, "Lighting Orb Attack");
        Monster supremeAncalagon = new Monster("Supreme Ancalagon", 1000, 1000, 300, 25, "Fire Attack,Fireball Attack,Fire Blast Attack");





        //Rooms  room8,room2 hikayeli odalar


        Room room1=new Room(1,15,supremeAncalagon);

        Room room2=new Room(6,14,room1);

        Room room3=new Room(6,13,deruvish,apostle,room2);
        Room room4=new Room(7,12,spiritOfFire,room3);
        Room room5=new Room(8,11,balrog,room4);
        Room room6=new Room(9,10,queenOfCrystals,room5);
        Room room7=new Room(10,9,littleOrc,room6);

        Room room8=new Room(11,8,room7);

        Room room9=new Room(12,7,troll,room8);
        Room room10=new Room(13,6,keilan,room9);
        Room room11=new Room(13,5,scatha,room10);
        Room room12=new Room(14,4,manyHeadedSibyrus,room11);
        Room room13=new Room(15,3,mysticMorgana,room12);
        Room room14=new Room(16,2,lisa,room13);
        Room room15=new Room(16,1,redSpider,room14);




        Scenarios.beginningScenario();
        Hero selectedHero=Game.selectHero(assassin,tank,archer);
        selectedHero.displayInfo();
        Game.anythingToContinue();
        Game.clearConsole();
        Location currentLocation=new Location(1,selectedHero,selectedHero.getLevel());

        Scenarios.floorSixteenIntro(selectedHero.inventory,currentLocation);



        int roomChoice= Game.readInt("1. Room-1 \n2. Room-2",2);

        if(roomChoice==1){ // FIRST ROOM
            currentLocation.changeLocation(currentLocation,room15);
            currentLocation.displayLoc(selectedHero);
            Scenarios.floorSixteenRoomOneIntro();

            String attackChoice= Game.readString("<ATTACK> -Attack To Monster: ",redSpider,"<ROOM 2> -GO TO ROOM2");

            if (attackChoice.matches("(.*)ATTACK(.*)")||attackChoice.matches("(.*)attack(.*)")) {
                Game.battle(selectedHero,redSpider);

                //selectedHero.attack(monster16);
                //Game.anythingToContinue();
                //monster16.attack(selectedHero);

            }
            else if (attackChoice.matches("(.*)Room2||room2||ROOM2||ROOM 2||room 2(.*)")) {

                currentLocation.changeLocation(currentLocation, room14);
                currentLocation.displayLoc(selectedHero);
                Scenarios.floorSixteenRoomTwoIntro();
                int lisaChoice = Game.readInt("1- Untie the chains. \n2- Go up to second floor", 2);
                if (lisaChoice == 1) {
                    System.out.println("Lisa gave you a helmet");
                    helmet.displayItemInfo();
                    int helmetChoice = Game.readInt(" \n1- Take it \n2- Leave it", 2);
                    if (helmetChoice == 1) {
                        selectedHero.inventory.addAnItem(selectedHero, helmet);
                        System.out.println("You added a helmet your inventory here your inventory.");
                        selectedHero.inventory.displayInventory();
                        System.out.println("Lisa: Every good deed has a return.");
                        System.out.println("You: Oh my god Liza What did you do to me ");
                        lisa.attack(selectedHero);


                    }
                    else if (helmetChoice==2){
                        System.out.println("You did not take the helmet, who knows it may be a mistake :) ");
                        selectedHero.inventory.displayInventory();
                        System.out.println("Go up to second floor");


                    }
                }







              else if (lisaChoice == 2) {
                    currentLocation.changeLocation(currentLocation, room13);
                    currentLocation.displayLoc(selectedHero);


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


        }















