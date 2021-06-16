package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

class Rooms {
    private String roomName;
    private int level;

    private Door RoomDoor;
    private Stairs stairs;
    private boolean hasStairs;

    public Rooms(String name) {
        roomName = name;

    }

    public static LinkedList<Rooms> generateRooms() {
        LinkedList<Rooms> roomsLinkedList = new LinkedList<Rooms>();

        for (int i = 0; i < 16; i++) {
            String name = "R" + i;
            Rooms room = new Rooms(name);
            Door roomDoor = new Door(room);
            room.setRoomDoor(roomDoor);
            roomsLinkedList.add(room);

        }

        SecureRandom random = new SecureRandom();
        int stairDoor = random.nextInt(4);
        Stairs stairs = new Stairs(roomsLinkedList.get(5), roomsLinkedList.get(stairDoor));
        roomsLinkedList.get(stairDoor).setStairs(stairs);
        roomsLinkedList.get(stairDoor).setHasStairs(true);

        stairDoor = random.nextInt(7 - 4 + 1) + 4;
        stairs = new Stairs(roomsLinkedList.get(10), roomsLinkedList.get(stairDoor));
        roomsLinkedList.get(stairDoor).setStairs(stairs);
        roomsLinkedList.get(stairDoor).setHasStairs(true);


        stairDoor = random.nextInt(11 - 8 + 1) + 8;
        stairs = new Stairs(roomsLinkedList.get(13), roomsLinkedList.get(stairDoor));
        roomsLinkedList.get(stairDoor).setStairs(stairs);
        roomsLinkedList.get(stairDoor).setHasStairs(true);


        return roomsLinkedList;
    }

    public static LinkedHashMap<String, ArrayList<Rooms>> generateLevels() {
        LinkedList<Rooms> rooms = Rooms.generateRooms();
        LinkedHashMap<String, ArrayList<Rooms>> roomsInLevel = new LinkedHashMap<>();

        for (int i = 0; i <= 12; i += 4) {
            int a = 1;
            String name = "Level-" + a;
            ArrayList<Rooms> roomL = new ArrayList<>();
            roomL.add(rooms.get(i));
            roomL.add(rooms.get(i + 1));
            roomL.add(rooms.get(i + 2));
            roomL.add(rooms.get(i + 3));

            roomsInLevel.put(name, roomL);


            a++;

        }

        return roomsInLevel;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Door getRoomDoor() {
        return RoomDoor;
    }

    public void setRoomDoor(Door RoomDoor) {
        this.RoomDoor = RoomDoor;
    }

    public boolean getHasStairs() {
        return hasStairs;
    }

    public void setHasStairs(boolean hasStairs) {
        this.hasStairs = hasStairs;
    }

    public Stairs getStairs() {
        return stairs;
    }

    public void setStairs(Stairs stairs) {
        this.stairs = stairs;
    }

}

class Door {
    Rooms room;

    public Door(Rooms r) {
        room = r;
    }


}

class Stairs {
    Rooms upperRoom;
    Rooms lowerRoom;

    public Stairs(Rooms u, Rooms l) {
        this.upperRoom = u;
        this.lowerRoom = l;
    }

}
