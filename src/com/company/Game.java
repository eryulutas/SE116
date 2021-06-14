package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Hero hero;
    static Hero selectedHero = null;
    static LinkedList<Level> levelsOfGame;
    static Assassin assassin;
    static Tank tank;
    static Archer archer;
    static Level currentLevel;
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
        selectedHero = selectHero(assassin, tank, archer);
        levelsOfGame = Level.generateLevels();
        currentLevel=levelsOfGame.getFirst();
    }

    public static Hero selectHero(Hero assassin, Hero tank, Hero archer) {

        boolean flag = true;
        while (flag) {
            Game.printSeparator(30);
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
                    System.out.println("You chose to start with the " + selected + " class");
                    if (selected == 1) {
                        selectedHero = assassin;
                    } else if (selected == 2) {
                        selectedHero = tank;
                    } else {
                        selectedHero = archer;
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


