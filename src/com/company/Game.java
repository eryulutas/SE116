package com.company;

import java.util.*;

public class Game {
    static Hero selectedHero;


    static Scanner scanner = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);



    //method to get user input from console
    public static int readInt(String prompt, int userChoices) {
        int input;

        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer!");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }



    public static String readString(String prompt,Monster monster,String prompt2){
       System.out.println(prompt+monster.getName()+"\n"+prompt2);
       String input= scan.nextLine();
       input=input.toUpperCase();

       return input;
    }


    public static void attackOrChangeRoom(Hero hero,Monster monster,Location location,Room newRoom) {

        String attackChoice = Game.readString("<ATTACK> -Attack To Monster: ", monster, "<ROOM> -GO TO OTHER ROOM");
        if (attackChoice.matches("(.*)ATTACK(.*)") || attackChoice.matches("(.*)attack(.*)")) {
            Game.battle(hero, monster);
            if (monster.getItems() != null) {
                System.out.println(monster.getItems().getName()+" dropped from "+monster.getName());
                monster.getItems().displayItemInfo();
                int itemChoice = Game.readInt(" \n1- Take it \n2- Leave it", 2);
                if (itemChoice == 1) {
                    if(monster.getItems().getMainType()=="attack item"||monster.getItems().getMainType()=="boot"||monster.getItems().getMainType()=="armor"){
                        hero.inventory.changeItem(monster.getItems());
                    }
                    else{
                        hero.inventory.addAnItem(hero, monster.getItems());
                    }


                    System.out.println("You added a" + monster.getItems().getName() + "your inventory here your inventory.");
                    hero.inventory.displayInventory();

                } else if (itemChoice == 2) {
                    System.out.println("You did not take the" + monster.getItems().getName() + "who knows it may be a mistake :) ");
                    hero.inventory.displayInventory();
                    System.out.println("\n ----------You are going up to second floor---------------");
                    Game.anythingToContinue();


                }
            }



                Game.clearConsole();
                System.out.println("You: That was easy, now we will see what is behind other room");
                Game.anythingToContinue();
                location.changeLocation(hero, location, newRoom);


            } else if (attackChoice.matches("(.*)Room||room||ROOM||RooM(.*)")) {

                location.changeLocation(hero, location, newRoom);
                Game.anythingToContinue();
            }

        }




    public static void battle(Hero hero,Monster monster) {
        monster.displayInfo();
        hero.displayInfo();
        hero.attack(monster);
        Game.anythingToContinue();
        if(monster.getHealthPoints()>0 && hero.getHealthPoints()>0) {


            boolean finishBattle = true;
            while (finishBattle) {
                int input = readInt("1. Continue to Attack \n2. Finish Battle", 2);
                if (input == 1) {


                    if (monster.getHealthPoints() <= 0) {
                        System.out.println("Your already killed the monster!");
                        monster.setHealthPoints(0);
                        monster.displayInfo();
                        Game.anythingToContinue();

                        finishBattle = false;
                    }
                    else if(monster.getHealthPoints()>0 && hero.getHealthPoints()<=0){
                        hero.setHealthPoints(0);
                        System.out.println("You died.");
                        finishBattle=false;

                    }
                    else {
                        monster.attack(hero);
                        hero.attack(monster);
                        Game.anythingToContinue();

                        finishBattle = true;
                    }
                }

                else if (input == 2) {
                    finishBattle = false;

                }
                else {
                    System.out.println("Please enter the number which are given to you");
                }
            }
        }

        }




    //method to simulate clearing out the console
    public static void clearConsole() {
        for (int i = 0; i < 50; i++)
            System.out.println();
    }

    //method to print a separator with length n
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    //method to print a heading
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    //method to stop the game until user enters anything
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }














    public static Hero selectHero(Hero assassin, Hero tank, Hero archer) {

        boolean flag = true;
        while (flag) {
            Game.printSeparator(15);
            System.out.println("Enter the number to see details \n1.Assassin \n2.Tank \n3.Archer \n4.I am ready to pick! ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            scanner.nextLine();


            switch (input) {
                case 1:
                    Game.assassinBackground();
                    assassin.displayInfo();
                    Game.anythingToContinue();

                    break;
                case 2:
                    Game.tankBackground();
                    tank.displayInfo();
                    Game.anythingToContinue();
                    break;
                case 3:
                    Game.archerBackground();
                    archer.displayInfo();
                    Game.anythingToContinue();
                    break;
                case 4:
                    System.out.println("Which do you want to be? \n1.Assassin \n2.Tank \n3.Archer ");
                    int selected = scanner.nextInt();
                    if (selected == 1) {
                        selectedHero = assassin;
                        System.out.println("You chose to start with the assassin class");

                    } else if (selected == 2) {
                        selectedHero = tank;
                        System.out.println("You chose to start with the tank class");

                    } else {
                        selectedHero = archer;
                        System.out.println("You chose to start with the archer class");

                    }
                    flag = false;
                    break;

            }
        }
        return selectedHero;
    }






    public static void assassinBackground() {
        printHeading("The Assassin class is a very fast class. It moves and accelerates quickly. Their attacks are often deadly. \nThe Assassin class uses dual blades, machetes, and throwing blades. \nHowever, they are not as protected as the Tank class. They use light armor.");
    }

    public static void tankBackground() {
        printHeading("Tank class is very powerful class. They have heavy armor reinforced with steel made of special elephant tusks. \nThey use long swords, short swords and sword-shields. However, it is slow compared to other classes.");
    }

    public static void archerBackground() {
        printHeading("The Archer class is the ranged class. They can take down their opponent from great distances. He is fast in this class. \nThey use medium armor. They use long-range arrows, short-range arrows, crossbows. However, they are not as fast as the assassin class.");
    }

}


