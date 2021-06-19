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




    public static void floorSixteenIntro(Inventory inventory) {
        Game.printHeading("The hero-" + heroName + "\ntravels long distances, fights mountain ridge wolves. \nHe goes through many difficulties to find the stone.He was walking among the mountains.\nAnd he saw something. \nA door. Yeah yeah! it was a door. \nHe opened the door and his adventure began here. \nThis was the Ribbles place. It was a 16-floor dungeon that looked like hell. \nHe had no idea what was on the floors. \nHowever, all he felt was that the Liandum stone was here. It would start from the 16th floor and work its way up.");
        Game.anythingToContinue();
        Game.printHeading("Here is your inventory and your items, don't forget your inventory can carry items of a certain weight. ");
        inventory.displayInventory();
        inventory.upgradeStats();
        Game.printHeading("Here is your upgraded stats with items");
        Game.selectedHero.displayInfo();

        Game.printHeading("There are 2 rooms on this floor. Which room would you like to open? 1 or 2 ? Choose carefully because you don't know what will come out of it. \n1. First Room \n2.Second Room");





    }

    public static void floorSixteenRoomTwoIntro() {
        Game.printHeading("Hero sees Red Spider. \n"+heroName+": Oh my god what a disgusting spider this is.");
    }

    public static void floorSixteenRoomOneIntro() {
    }


}
