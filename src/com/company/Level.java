package com.company;

import java.security.SecureRandom;
import java.util.LinkedList;

public class Level {
    private int levelNo;
    private static Hero hero;
    private static int numberOfRoomsInACorridor = 4;
    private static int numberOfCorridors = 4;
    private static int totalNumberOfRooms = numberOfRoomsInACorridor * numberOfCorridors;
    private static LinkedList<Rooms> roomsInLevel;
    private static Stairs stairsBetweenLevels;

    public Level(int levelNo, LinkedList<Rooms> rooms) {
        hero = Game.selectedHero;
        this.levelNo = levelNo;
        roomsInLevel = rooms;

    }

    public static Rooms goToNextRoom(Rooms r) {
        int i = roomsInLevel.indexOf(r);
        return roomsInLevel.get(i + 1);
    }

    public static Rooms comeBackTheRoom(Rooms r) {
        int i = roomsInLevel.indexOf(r);
        return roomsInLevel.get(i - 1);
    }

    public static void addStairs() {
        LinkedList<Level> levels = generateLevels();
        SecureRandom random = new SecureRandom();
        int stairDoor = random.nextInt(numberOfRoomsInACorridor);
        for (int i = 0; i < levels.size(); i++) {
            if (i + 1 < levels.size())
                levels.get(i).roomsInLevel.get(stairDoor).setStairs(levels.get(i + 1).roomsInLevel.get(random.nextInt(numberOfRoomsInACorridor)).getStairs());
        }
    }

    public static LinkedList<Level> generateLevels() {
        LinkedList<Level> levels = new LinkedList<>();
        LinkedList<Rooms> rooms = generateRooms();
        LinkedList<Rooms> roomsInLevel = new LinkedList<>();

        for (int i = 0; i < rooms.size(); i++) {
            int j = 1;
            while (j <= numberOfRoomsInACorridor) {
                roomsInLevel.add(rooms.get(i));
                j++;

            }

            levels.add(new Level(i, roomsInLevel));
        }
        addStairs();
        return levels;
    }


    public static LinkedList<Rooms> generateRooms() {
        LinkedList<Rooms> roomsLinkedList = new LinkedList<Rooms>();
        String name;
        Rooms rFirst = new Rooms("R0");
        roomsLinkedList.addFirst(rFirst);


        for (int i = 1; i < totalNumberOfRooms ; i++) {
            name = "R" + i;
            Rooms room = new Rooms(name, roomsLinkedList.get(i - 1).getRoomDoor());
            roomsLinkedList.add(room);
        }
        name = "R" + (totalNumberOfRooms - 1);
        Rooms rLast = new Rooms(name);
        roomsLinkedList.addLast(rLast);

        return roomsLinkedList;
    }


}
