package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);



        Assassin assassin=new Assassin(1000,5,100,20,"Assassin");
        Tank tank = new Tank(2000,1,250,40,"Tank");
        Archer archer=new Archer(800,3,300,15,"Archer");

        Scenarios.beginningScenario();
        Game.selectHero(assassin,tank,archer);

        









	}
}
