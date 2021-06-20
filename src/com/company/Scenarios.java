package com.company;

import java.util.Scanner;

public class Scenarios {
    static Scanner scan = new Scanner(System.in);
    static String heroName;
    static Inventory inventory;



    public static void beginningScenario() {
        Game.printHeading("The Dungeon of Supreme Ancalagon");
        Game.anythingToContinue();
        Game.printHeading("Once upon a time, there was a beautiful life in a village. The name of this village was Andirul.\nThe villagers lived a very happy, comfortable and prosperous life. On the other hand, they had some enemies.\nThey called themselves Ribbles. Ribbles was the lord of evil. They called themselves sons of fire. \nThey wanted to take over the world and burn it down completely. \nThe Andirul people and the Ribble people went through a great war 600 years ago. \nThe name of this battle was the battle of Liaundum. The battle of Liandum got its name from a stone. \nThis stone was very important to the people of Andirul. Because this stone was destroying fire. This battle was for the Liandum stone. \nThe people of Andirul won the war. However, the Liandum stone was lost in the war. \n" +
                "                                                                                       \nAt least that's how it was known.\n");
        Game.anythingToContinue();
        Game.clearConsole();
        Game.printHeading("One day, 600 years later, the people of Anduril woke up with evil. When they woke up, everything was on fire. Houses, fields, gardens, people. There was complete chaos. \nNobody could understand anything. 600 years had passed, and no one could have made a fire of such a magnitude. Until he shows up. \nSupreme ANCALAGON, known as the greatest, biggest and most powerful of dragons. He was the most dangerous being of all time. The strongest creature of the Ribbles people. It was an uncontrollable creature. \nHe drew his strength from fire. The Andirul people needed to find the stone. They understood this. Otherwise they would die. ");
        Game.printHeading("What is your hero's name?");
        heroName = scan.nextLine();
        Game.printHeading("\nThey needed a hero. That hero was the person who would become the great-grandson of Oswald the Great, the hero of the war 600 years ago. This hero’s name is " + heroName + ".");
        Game.anythingToContinue();
        Game.clearConsole();
    }




    public static void floorSixteenIntro(Inventory inventory,Location location) {
        Game.printHeading("The hero-" + heroName + "\ntravels long distances, fights mountain ridge wolves. \nHe goes through many difficulties to find the stone.He was walking among the mountains.\nAnd he saw something. \nA door. Yeah yeah! it was a door. \nHe opened the door and his adventure began here. \nThis was the Ribbles place. It was a 16-floor dungeon that looked like hell. \nHe had no idea what was on the floors. \nHowever, all he felt was that the Liandum stone was here. It would start from the 16th floor and work its way up.");
        Game.anythingToContinue();
        Game.clearConsole();
        Game.printHeading("Here is your inventory and your basic items, don't forget your inventory can carry items of a certain weight. ");
        inventory.displayInventory();
        inventory.upgradeStats();
        Game.anythingToContinue();
        Game.printHeading("Here is your upgraded stats with items");
        Game.selectedHero.displayInfo();
        Game.anythingToContinue();
        Game.clearConsole();
        location.displayLocCorridor(Game.selectedHero);

        Game.printHeading("There are 2 rooms on this floor. Which room would you like to open? 1 or 2 ? Choose carefully because you don't know what will come out of it. ");





    }
    public static void floorSixteenRoomOneIntro() {

        Game.printHeading("what a disgusting spider.");

    }





    public static void room23Scenario(Hero hero,Monster monster,Location location,Room room,Items item){ //item will be helmet

        location.changeLocation(hero,location, room);
        location.displayLoc(hero);
        System.out.println(heroName+" sees STAIR and Lisa");
        Game.printHeading("You: Wow Who are you ?\nI have never seen such a beautiful woman before. I can’t believe.");
        Game.printHeading("Lisa: My my my my my my name is Liza.\n" +
                "-If you free me from my chains, I will give you a helmet");

        int lisaChoice = Game.readInt("1- Untie the chains. \n2- Go up to second floor", 2);
        if (lisaChoice == 1) {
            System.out.println("Lisa gave you a helmet");
            item.displayItemInfo();
            int helmetChoice = Game.readInt(" \n1- Take it \n2- Leave it", 2);
            if (helmetChoice == 1) {
                hero.inventory.addAnItem(hero, item);
                System.out.println("You added a helmet your inventory here your inventory.");
                hero.inventory.displayInventory();
                Game.anythingToContinue();
                System.out.println("Lisa: Every good deed has a return.");
                System.out.println("You: Oh my god Liza What did you do to me ");
                monster.attack(hero);
                Game.anythingToContinue();
                System.out.println("You: Whatever I am much more profitable...\n ----------You are going up to second floor---------------");
                Game.anythingToContinue();


            }
            else if (helmetChoice==2){
                System.out.println("You did not take the helmet, who knows it may be a mistake :) ");
                hero.inventory.displayInventory();
                System.out.println("You are going up to second floor");
                Game.anythingToContinue();


            }
        }


        else if (lisaChoice == 2) {
            location.changeLocation(hero,location,room);
            location.displayLoc(hero);


        }
    }


    public static void secondRoomsScenariosWithoutItem(Hero hero,Monster monster,Location location,Room room,Room newRoom){
        location.changeLocation(hero,location, room);
        location.displayLoc(hero);
        System.out.println(heroName+" sees STAIR and "+monster.getName());

        Game.attackOrChangeRoom(hero,monster,location,newRoom);

        System.out.println(" gave you a helmet");
        monster.getItems().displayItemInfo();
        int itemChoice = Game.readInt(" \n1- Take it \n2- Leave it", 2);
        if (itemChoice == 1) {
            hero.inventory.addAnItem(hero, monster.getItems());
            System.out.println("You added a"+monster.getItems().getName()+ "your inventory here your inventory.");
            hero.inventory.displayInventory();
            Game.anythingToContinue();



            System.out.println("\n ----------You are going up to second floor---------------");
            Game.anythingToContinue();


        }
        else if (itemChoice==2){
            System.out.println("You did not take the"+ monster.getItems().getName() +"who knows it may be a mistake :) ");
            hero.inventory.displayInventory();
            System.out.println("\n ----------You are going up to second floor---------------");
            Game.anythingToContinue();


        }
    }


    public static void secondRoomsScenariosWithItem(Location location,Hero hero,Monster monster,Room room,Room newRoom,Items items){
        location.changeLocation(hero,location, room);
        location.displayLoc(hero);
        System.out.println(heroName+" sees STAIR and "+monster.getName());

        Game.attackOrChangeRoom(hero,monster,location,newRoom);

        System.out.println();




        System.out.println("\n ----------You are going up to second floor---------------");
        Game.anythingToContinue();


    }







}


