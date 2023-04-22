import java.util.*;
public class Character {


    private String name;
    private ArrayList<String> notes;
    private ArrayList<String> collected_items;
    private String position;
    private ArrayList<String> held_items;
    private Room room_location;

    public Character(String name, String position, Room room_location){
        this.name = name;
        this.notes = new ArrayList<>();
        this.collected_items = new ArrayList<>();
        this.position = "South";
        this.held_items = new ArrayList<>();
        this.room_location = room_location;
    }

    public ArrayList<String> getNotes(){
        return this.notes;
    }

    public ArrayList<String> getCollectedItems(){
        return this.collected_items;
    }

    public ArrayList<String> getHeldItems(){
        return this.held_items;
    }

    public Room getRoomLocation(){
        return this.room_location;
    }


    public String getName(){
        return this.name;
    }

    public void walk(String direction){ 
        try{
            if (this.position == direction){
                throw new RuntimeException(this.name + " is already here.");
            }
            if (direction == "North"){
                System.out.println(this.name + " moved towards the northern wall.");
            }
    
            else if (direction == "East"){
                System.out.println(this.name + " moved towards the eastern wall.");
            }
    
            else if (direction == "South"){
                System.out.println(this.name + " moved towards the southern wall.");
            }
    
            else if (direction == "West"){
                System.out.println(this.name + " moved towards the western wall.");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void open(Furniture f){
        try {
            if (f.status == true){
                throw new RuntimeException(this.name + " can't open " + f.type + " because it is already open.");
            }
            f.status = true;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void close(Furniture f){
        try {
            if (f.status == false){
                throw new RuntimeException(this.name + " can't close " + f.type + " because it is already closed.");
            }
            f.status = false;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void read(Letter l){

    }

    public void write(String note){
        this.notes.add(note);
        System.out.println(this.name + " has written " + note + "in their notebook.");
    }

    public void viewnotes(){
        try{
            if (this.notes.isEmpty()){
            throw new RuntimeException(this.name + " has no notes...");
            }
            for (int i = 0; i < this.notes.size(); i ++){
                System.out.println(this.notes.get(i) + "\n");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    public void examine(){
        
    }

    public void grab(String object){
        try{
            if (this.held_items.size() == 2){
                throw new RuntimeException(this.name + " is holding something in each hand, drop an object in order to grab another...");
            }
            this.held_items.add(object);
            System.out.println(this.name + " picked up a/an" + object);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void keep(String object){
        try{
            if (this.collected_items.contains(object)){
                throw new RuntimeException(this.name + " already has this...");
            }
            this.collected_items.add(object);
            System.out.println(this.name + " kept the " + object);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void drop(String object){
        try{
            if (this.held_items.contains(object) == false){
                throw new RuntimeException(this.name + " cannot drop " + object + "because they are not holding it...");
            }
            this.held_items.remove(object);
            System.out.println(this.name + " has dropped " + object + ".");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public void enterCode(Room room, String code){
        if (code == room.getCode()){


        }

    }

    public void enter(Room room){
        try{
            if (this.room_location.equals(room)){
                throw new RuntimeException(this.name + " is already in this room...");
            }
            this.room_location = room;
            System.out.println(this.name + " has entered " + room);
        } catch(Exception e){
            System.out.println(e);
        }

    }

    public void exit(Room room){
        if (room.getExit())
    }

}
