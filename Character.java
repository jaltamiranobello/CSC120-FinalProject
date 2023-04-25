import java.util.*;
public class Character {


    private String name;
    private ArrayList<String> notes;
    private ArrayList<String> collected_items;
    private String position;
    private ArrayList<String> held_items;
    private Room room_location;

    public Character(String name, Room room_location){
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

    // Finish me !!!!!!
    public void open(Furniture f){
        try {
            if (f.open_status == true){
                throw new RuntimeException(this.name + " can't open " + f.getType() + " because it is already open.");
            }
            else if (f.getLetter() == null) {
                System.out.println("Hello");
            }
                //System.out.println(f.getLetter().getText());
                //System.out.println("Hello");
            
            //f.open_status = true;
            //System.out.println("This " + f.getType() + " has");
            //System.out.println();
            //print out the items in there, there will be 1 letter and 2 items per room, all in a piece of furniture 
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void close(Furniture f){
        try {
            if (f.open_status == false){
                throw new RuntimeException(this.name + " can't close " + f.getType() + " because it is already closed.");
            }
            f.open_status = false;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void read(Letter l){
        System.out.println(l.getText());
    }

    //make string note a scanner
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

    public void turnLight(){
        try{
            if (this.room_location.light == true){
                throw new RuntimeException(this.name + " cannot turn on the light because it is already on.");
            } System.out.println(this.name + " has turned on the light.");
            this.room_location.light = true;

        } catch(Exception e){
            System.out.println(e);
        }
  
    }

    public void help(){
        System.out.println("The methods that are available for you to use to escape the room: enter(), exit(), walk(), open(), close(), read(), write(), viewnotes(), grab(), keep(), drop(), and turnLight().");
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

    public void exit(Room room, Purgatory p){
        try{
            if (!this.room_location.equals(room)){
                throw new RuntimeException( this.name + " is not in the room so they cannot exit.");
            }
            System.out.println(this.name + " has left the " + room);
            p.nextRoom(this);
        }catch(Exception e){
        System.out.println(e); 
     }
    }

    // public void enterCode(Room room, String code){
    //     try{
    //         if (!code.equals(room.getCode())){
    //             throw new RuntimeException("Wrong code try again...");
    //         }
    //         exit(room);
    //         System.out.println(this.name + "Has exited " + room);
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    // }

    public static void main(String[] args) {
        Room testr = new Room("Door", "Yourmom", false);
        //Letter let = new Letter("Ypur mom is ugly");
        Furniture fridge = new Furniture("Fridge");
        Character stacy = new Character("stacy", testr);
        stacy.open(fridge);

    }
}
