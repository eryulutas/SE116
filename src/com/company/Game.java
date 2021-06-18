package com.company;

import java.util.*;

public class Game {
    static Hero selectedHero;
    static LinkedHashMap<String, ArrayList<Rooms>> levelsOfGame;


    public static void setCurrentLevel(Rooms currentLevel) {
        Game.currentLevel = currentLevel;
    }

    public static Rooms getCurrentLevel() {
        return currentLevel;
    }

    static Rooms currentLevel;
    static Scanner scanner = new Scanner(System.in);


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

    public static void startGame() {
        levelsOfGame = Rooms.generateLevels();
        setCurrentLevel(levelsOfGame.get("Level-1").get(0));
    }

    public static void choices() {
        String selectedAction = scanner.next();
        System.out.println("\nAction: " + selectedAction);
        switch (selectedAction) {
            case "D1":
                currentLevel = goToNextRoomDoor();
                break;

            case "D2":
                currentLevel = comeBackTheRoomDoor();
                break;
            case "UP":
                useStairs();
                break;
            case "M1":
                break;
            case "M2":
                break;
            case "R":
                break;
            default:
                System.out.println("\nInvalid Entry, try again...");
                actions();
                break;
        }

    }

    public static void actions() {

        System.out.println("The hero sees the following.");
        System.out.println("Go To Next Room Door (D1)");
        System.out.println("Back To Before Room Door (D2)");
        System.out.println("Stairs (UP)");
        System.out.println("Attack To Monster (M1)");
        System.out.println("Attack To Monster (M2)");
        System.out.println("Rescue Townspeople (R)");
        System.out.println("Please select one");
    }

    public static Rooms goToNextRoomDoor() {

currentLevel= levelsOfGame.get("Level-1").get(1);
        return getCurrentLevel();
    }

    public static Rooms comeBackTheRoomDoor() {

       currentLevel=levelsOfGame.get("Level-1").get(0);
        return getCurrentLevel();

    }

    public static void useStairs() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (getCurrentLevel().getHasStairs()) {
                    currentLevel = getCurrentLevel().getStairs().upperRoom;
                    break;
                }
            }
        }

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


