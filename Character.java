import java.util.*;
public class Character {


    private String name;
    private ArrayList<String> notes;

    public ArrayList<String> collected_items;
    public ArrayList<String> collected_items_bd;
    public ArrayList<String> collected_items_tyr;
    public ArrayList<String> collected_items_kch;
    public ArrayList<String> collected_items_bth;
    public ArrayList<String> collected_items_lr;

    private String position;
    private ArrayList<String> held_items;
    public Room room_location;
    public ArrayList<Room> room_history;

    public Character(String name, Room room_location){
        this.name = name;
        this.notes = new ArrayList<>();
        this.position = "South";
        this.held_items = new ArrayList<>();
        this.room_location = room_location;
    }

    public ArrayList<String> getNotes(){
        return this.notes;
    }

    public ArrayList<String> getHeldItems(){
        return this.held_items;
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
                this.position = "North";
                System.out.println(this.name + " moved towards the northern wall.");
            }
    
            else if (direction == "East"){
                this.position = "East";
                System.out.println(this.name + " moved towards the eastern wall.");

            }
    
            else if (direction == "South"){
                this.position = "South";
                System.out.println(this.name + " moved towards the southern wall.");
            }
    
            else if (direction == "West"){
                this.position = "West";
                System.out.println(this.name + " moved towards the western wall.");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void open(Furniture f){
        try {
            if (f.open_status == true){
                throw new RuntimeException(this.name + " can't open " + f.getType() + " because it is already open.");
            }
            else if (f.getLetter() == null & f.getSpecialItem() == null) {
                f.open_status = true;
                System.out.println("This " + f.getType() + " has nothing inside");
            }
            else if (f.getLetter() != null & f.getSpecialItem() == null){
                f.open_status = true;
                System.out.println("This " + f.getType() + " has a letter inside. Maybe you want to read the letter, maybe you don't - your choice 😉...");
            }
            else if (f.getLetter() == null & f.getSpecialItem() != null){
                f.open_status = true;
                System.out.println("This " + f.getType() + " has a/an " + f.getSpecialItem() + " inside. Grab or ignore it 😌.....");
            }
            else {
                System.out.println("This " + f.getType() + " has a letter and a/an " + f.getSpecialItem() + ". Maybe you want to read the letter, maybe you want to grab or ignore the " + f.getSpecialItem() + "- your choice 😉");
            } 
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void close(Furniture f){
        try {
            if (f.open_status == false){
                throw new RuntimeException(this.name + " can't close " + f.getType() + " because it is already closed.");
            }
            f.open_status = false;
            System.out.println(this.name + " closed " + f.getType() + ".");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void read(Letter l){
        System.out.println("The letter states the following: " + l.getText());
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
                System.out.println(this.notes.get(i));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void grab(String special_item){
        try{
            if (this.held_items.size() == 2){
                throw new RuntimeException(this.name + " is holding something in each hand. " + this.name + " needs to drop an item in order to pick up the " + special_item + ".");
            }
            this.held_items.add(special_item);
            System.out.println(this.name + " picked up a/an" + special_item + ". Maybe you want to keep it or not 😈....");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void keep(String special_item){
        try{
            if (this.collected_items.contains(special_item)){
                throw new RuntimeException(this.name + " already has this...");
            }
            else if(this.room_location instanceof Bedroom & this.collected_items_bd.size() == 2){
                throw new RuntimeException(this.name + " can no longer keep special items from bedroom. She has reached the BEDROOM's item capacity.");
            }
            else if(this.room_location instanceof Toyroom & this.collected_items_tyr.size() == 2){
                throw new RuntimeException(this.name + " can no longer keep special items from toyroom. She has reached the TOYROOM's item capacity.");
            }
            else if(this.room_location instanceof Kitchen & this.collected_items_kch.size() == 2){
                throw new RuntimeException(this.name + " can no longer keep special items from kitchen. She has reached the KITCHEN's item capacity.");
            }
            else if(this.room_location instanceof Bathroom & this.collected_items_bth.size() == 2){
                throw new RuntimeException(this.name + " can no longer keep special items from bathroom. She has reached the BATHROOM's capacity.");
            }
            else if(this.room_location instanceof LivingRoom & this.collected_items_lr.size() == 2){
                throw new RuntimeException(this.name + " can no longer keep special items from living room. She has reached the LIVING ROOM's capacity.");
            }
            else if(this.room_location instanceof Bedroom){
                this.collected_items_bd.add(special_item);
                this.collected_items.add(special_item);
                System.out.println(this.name + " kept the " + special_item);
            }
            else if(this.room_location instanceof Toyroom){
                this.collected_items_tyr.add(special_item);
                this.collected_items.add(special_item);
                System.out.println(this.name + " kept the " + special_item);
            }
            else if(this.room_location instanceof Kitchen){
                this.collected_items_kch.add(special_item);
                this.collected_items.add(special_item);
                System.out.println(this.name + " kept the " + special_item);
            }
            else if(this.room_location instanceof Bathroom){
                this.collected_items_bth.add(special_item);
                this.collected_items.add(special_item);
                System.out.println(this.name + " kept the " + special_item);
            }
            else if(this.room_location instanceof LivingRoom){
                this.collected_items_lr.add(special_item);
                this.collected_items.add(special_item);
                System.out.println(this.name + " kept the " + special_item);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void drop(String special_item){
        try{
            if (this.held_items.contains(special_item) == false){
                throw new RuntimeException(this.name + " cannot drop " + special_item + "because they are not holding it...");
            }
            this.held_items.remove(special_item);
            System.out.println(this.name + " has dropped " + special_item + ".");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void turnLight(){
        try{
            if (this.room_location.light == true){
                throw new RuntimeException(this.name + " cannot turn on the light because it is already on.");
            } 
            System.out.println(this.name + " has turned on the light.");
            this.room_location.light = true;

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void help(){
        System.out.println("These are the following actions you can utilize to escape the rooms:\nWalk\nOpen\nClose\nRead\nWrite\nView notes\nGrab\nKeep\nDrop\nTurn on light\nExit");
    }

    public void goback(){
        Room prev_room =  this.room_history.get(this.room_history.size() -1);
        this.room_location = prev_room;
        System.out.println(this.name + " is now in the previous room. " + prev_room.toString());
     }

    public void enterCode(String code){
        try{
            if (!code.equals(this.room_location.getCode())){
                throw new RuntimeException("Wrong code try again...");
            }
            System.out.println("The code is correct." + this.name + " has left the room." );
            Purgatory.nextRoom(this);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Room testr = new Room("Door", "Obsesssion");
        Furniture fridge = new Furniture("Fridge", "Locket");
        Character stacy = new Character("Stacy", testr);
        stacy.open(fridge);
        stacy.help();

    }
}
