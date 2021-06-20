package com.company;

public class Room {

    Room connectedRoom1;
    Room connectedRoom2;
    Monster monster;
    Monster monster1;
    private int roomNumber;
    Room room;

     private int floor;

    public Room(int floor){
        this.floor=floor;

    }
    public Room(int floor,int roomNumber,Room room){
        this.floor=floor;
        this.roomNumber=roomNumber;
        this.room=room;

    }
    public Room(int floor,int roomNumber,Monster monster,Room room){
        this.floor=floor;
        this.roomNumber=roomNumber;
        this.monster=monster;
        this.room=room;

    }
    public Room(int floor,int roomNumber,Monster monster,Room connectedRoom1,Room connectedRoom2){
        this.floor=floor;
        this.roomNumber=roomNumber;
        this.monster=monster;
        this.connectedRoom1=connectedRoom1;
        this.connectedRoom2=connectedRoom2;


    }
    public Room(int floor,int roomNumber,Monster monster,Monster monster1){
        this.floor=floor;
        this.roomNumber=roomNumber;
        this.monster=monster;
        this.monster1=monster1;


    }

    public Room(int floor,int roomNumber,Monster monster){
        this.floor=floor;
        this.roomNumber=roomNumber;
        this.monster=monster;


    }


    public Room(int floor,int roomNumber,Monster monster,Monster monster1,Room room){
        this.floor=floor;
        this.roomNumber=roomNumber;
        this.monster=monster;
        this.monster1=monster1;
        this.room=room;


    }


    public Room(){
        this.monster=null;
        this.monster1=null;
        this.room=null;
        this.floor=0;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
