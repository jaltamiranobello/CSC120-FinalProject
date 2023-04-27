import java.util.*;

public class Purgatory {
    ArrayList<Room> rooms;
    

    public Purgatory(){
        rooms = new ArrayList<>();
    }

    public void addRooms(Room room){
        rooms.add(room);
    }

    public void enter(Character c, Room room){
        try{
            if (c.room_location.equals(room)){
                throw new RuntimeException(c.getName() + " is already in this room...");
            }
            c.room_location = room;
            c.room_history.add(room);
            System.out.println(c.getName() + " has entered " + room);
        } catch(Exception e){
            System.out.println(e);
        }

    }

    public static void nextRoom(Character c){
        if (c.getCollectedItems().size() == 0){

        }


        }

    public static void main(String[] args) {
        //Purgatory purgatory = new Purgatory();
            
    }

    }

