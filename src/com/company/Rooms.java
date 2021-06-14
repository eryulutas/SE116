package com.company;

class Rooms {
    private String roomName;
    private Door RoomDoor;
    private Stairs stairs;
    private boolean hasStairs;

    public Rooms(String name, Door door) {
        roomName = name;
        RoomDoor = door;
    }


    public Rooms(String name) {
        roomName = name;
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

    public void setNRoomDoor(Door RoomDoor) {
        this.RoomDoor = RoomDoor;
    }

    public boolean isHasStairs() {
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

    static Rooms currentRoom;

    public Door(Rooms room) {
        currentRoom = room;
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
