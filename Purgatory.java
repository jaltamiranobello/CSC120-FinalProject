import java.util.*;

public class Purgatory {
    ArrayList<Room> rooms;
    // String exit, String code, boolean light, Furniture a, Furniture b, Furniture c, Furniture d
    Bedroom bedroom = new Bedroom("Door", "");
    Toyroom toyroom_easy = new Toyroom();
    Toyroom toyroom_med = new Toyroom();
    Toyroom toyroom_hard = new Toyroom();
    Kitchen kitchen_easy = new Kitchen();
    Kitchen kitchen_med = new Kitchen();
    Kitchen kitchen_hard = new Kitchen();
    Bathroom bathroom_easy = new Bathroom();
    Bathroom bathroom_med = new Bathroom();
    Bathroom bathroom_hard = new Bathroom();
    LivingRoom livingRoom = new LivingRoom();

    public Purgatory(){
        rooms = new ArrayList<>();
    }

    public void addRooms(Room room){
        rooms.add(room);
    }


    public static void nextRoom(Character c){
        if (c.getCollectedItems().size() == 0){
        }


        }

    public static void main(String[] args) {
        //Purgatory purgatory = new Purgatory();
            
    }

    }

