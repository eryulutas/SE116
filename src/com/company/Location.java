package com.company;

public class Location {
    private Room room;
    Hero hero;
    private int floor;
    private int heroLevel;


    public Location(int floor,Hero hero,int heroLevel){ // hero is on the corridor

        this.hero=hero;
        this.heroLevel=heroLevel;
        this.floor=floor;
    }

    public Location(Room room,int floor,Hero hero,int heroLevel){
        this.room=room;
        this.hero=hero;
        this.heroLevel=heroLevel;
        this.floor=floor;
    }


    public void changeLocation(Hero hero,Location oldLocation,Room newRoom){

        if(newRoom.getFloor()<oldLocation.getFloor()) { //upstairs

            oldLocation.setRoom(newRoom);
            oldLocation.setFloor(newRoom.getFloor());
            oldLocation.setHeroLevel(Game.selectedHero.getLevel() + 1);
            hero.upgradeLevel(hero);
            System.out.println("-------YOUR LEVEL UPGRADED.-----------"+"\nYour current stats\n");
            hero.displayInfo();

        }

        else{
            oldLocation.setRoom(newRoom); //downstairs
            oldLocation.setFloor(newRoom.getFloor());

        }

    }


    public Location(){
        this.room=null;
        this.hero=null;
        this.heroLevel=0;
        this.floor=0;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getHeroLevel() {
        return heroLevel;
    }

    public void setHeroLevel(int heroLevel) {
        this.heroLevel = heroLevel;
    }

    public void displayLoc(Hero hero){

        System.out.println("Your current location info: \nFloor: "+getFloor()+"\nRoom number: "+ getRoom().getRoomNumber());

    }
    public void displayLocCorridor(Hero hero){
        System.out.println("Your location info: \nFloor: "+getFloor());
    }
}
