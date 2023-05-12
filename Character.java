import java.util.ArrayList;
public class Character {

    // attributes for character class
    private String name;
    private ArrayList<String> notes;

    public ArrayList<String> collected_items;
    public ArrayList<String> collected_items_bd;
    public ArrayList<String> collected_items_tyr;
    public ArrayList<String> collected_items_kch;
    public ArrayList<String> collected_items_bth;
    public ArrayList<String> collected_items_lr;
    public Letter current_letter;
    public Furniture current_f;
    public Boolean continue_game;
    

    public String position;
    private ArrayList<Object> held_items;
    public Room room_location;
    public ArrayList<Room> room_history;

    /** constructor for character
     * @param String name: the name of the character
     * @Room room_location: the location of the character
     */
    public Character(String name, Room room_location){
        this.name = name;
        this.notes = new ArrayList<>();
        this.position = "South";
        this.held_items = new ArrayList<>();
        this.room_location = room_location;
        this.current_letter = new Letter("N/A");
        this.current_f = new Furniture ("FAKE", "N/A");
        this.collected_items = new ArrayList<>();
        this.collected_items_bd = new ArrayList<>();
        this.collected_items_tyr = new ArrayList<>();
        this.collected_items_kch = new ArrayList<>();
        this.collected_items_bth = new ArrayList<>();
        this.collected_items_lr = new ArrayList<>();
        this.continue_game = true;
    }

    /** getter for arraylist notes */
    public ArrayList<String> getNotes(){
        return this.notes;
    }

    /** getter for arraylist held_items */
    public ArrayList<Object> getHeldItems(){
        return this.held_items;
    }

    /** getter for string name */
    public String getName(){
        return this.name;
    }

    /** method that moves the character's position based on the direction they input
     * @param String direction: the direction the character wants to move
     */
    public void walk(String direction){ 
        try{
            if (this.position == direction){
                throw new RuntimeException(this.name + " is already here.");
            }
            if (direction == "North"){
                this.position = "North";
                System.out.println(this.name + " moved towards the northern wall.");
                Purgatory.nearMe(this);
            }
    
            else if (direction == "East"){
                this.position = "East";
                System.out.println(this.name + " moved towards the eastern wall.");
                Purgatory.nearMe(this);
            }
    
            else if (direction == "South"){
                this.position = "South";
                System.out.println(this.name + " moved towards the southern wall.");
                Purgatory.nearMe(this);
            }
    
            else if (direction == "West"){
                this.position = "West";
                System.out.println(this.name + " moved towards the western wall.");
                Purgatory.nearMe(this);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    /** method that opens a piece of furniture and print the objects inside it
     * @param Furniture f: the furniture that will be opened
     */
    public void open(Furniture f){
        try {
            if(!this.position.equals(f.direction)){
                throw new RuntimeException(this.name + " can't open " + f.getType() + " because it is not in her vicinity. Find where it is first.");
            }

            else if (f.open_status == true){
                throw new RuntimeException(this.name + " can't open " + f.getType() + " because it is already open.");
            }

            else if (f.getLetter() == null & f.getSpecialItem() == null) {
                f.open_status = true;
                System.out.println("This " + f.getType() + " has nothing inside");
            }

            else if (f.getLetter() != null & f.getSpecialItem() == null){
                f.open_status = true;
                this.current_f = f;
                System.out.println("This " + f.getType() + " has a letter inside. Maybe you want to pick up the letter, maybe you don't - your choice 😉...");
            }
            
            else if (f.getLetter() == null & f.getSpecialItem() != null){
                f.open_status = true;
                this.current_f = f;
                System.out.println("This " + f.getType() + " has (a/an) " + f.getSpecialItem() + " inside. Grab and keep or drop it 😌.....");
            }
            else {
                f.open_status = true;
                System.out.println("This " + f.getType() + " has a letter and (a/an) " + f.getSpecialItem() + ". Maybe you want to pick up the letter, and maybe you want to grab the " + f.getSpecialItem() + "- your choice 😉");
                this.current_f = f;
            } 
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }

    /** method that closes a piece of furniture that was opened
     * @param Furniture f: the furniture that will be closed
     */
    public void close(Furniture f){
        try {
            if(!this.position.equals(f.direction)){
                throw new RuntimeException(this.name + " can't close" + f.getType() + " because it is not in her vicinity. Find where it is first.");
            }
            else if (f.open_status == false){
                throw new RuntimeException(this.name + " can't close " + f.getType() + " because it is already closed.");
            }
            f.open_status = false;
            System.out.println(this.name + " closed " + f.getType() + ".");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    /** method that prints the text of a letter after it was picked up and drops it*/
    public void read(){
        try{
            if(this.current_letter.getText()== "N/A"){
                throw new RuntimeException(this.name+ " has yet to pick up a letter.");
        }
        System.out.println("The letter states the following: " + this.current_letter.getText());
        System.out.println("Maybe you want to write this in your notebook or not. If you choose to not write anything down you MUST put down the letter.");
        } catch(Exception e){
            System.out.println(e);
        }
    }

    /** method that adds the letter's text into the arraylist notes and prints that it has been written down */
    public void write(){
        this.notes.add(this.current_letter.getText());
        System.out.println(this.name + " has written (" + this.current_letter.getText() + ") in their notebook.");
        System.out.println("Now that " + this.name + " is done with the letter she MUST put down the letter.");
    }

    /** method that views the notes in arraylist notes */
    public void viewnotes(){
        try{
            if (this.notes.isEmpty()){
                throw new RuntimeException(this.name + " has no notes...");
            }
            for (int i = 0; i < this.notes.size(); i ++){
                System.out.println(this.notes.get(i));
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

    /** method that picks up a letter to be able to read it based off the furniture that is opened */
    public void pickup_letter(){
        try{
            if (this.held_items.size() == 2){
                if (this.held_items.get(0) instanceof Letter){
                    throw new RuntimeException(this.name + " has a letter in her hands at the moment, to pick up this letter you MUST put down the previous letter.");
                }
                else if (this.held_items.get(1) instanceof Letter){
                    throw new RuntimeException(this.name + " has a letter in her hands at the moment, to pick up this letter you MUST put down the previous letter.");
                }
                System.out.println("This is what " + this.name + " is currently holding: " + this.held_items.toString());
                throw new RuntimeException(this.name + " is holding something in each hand. " + this.name + " needs to drop an object in order to pick up the letter.");
            }
            else if (this.held_items.size() == 1){
                if(this.held_items.get(0) instanceof Letter){
                    throw new RuntimeException(this.name + " has a letter in her hands at the moment, to pick up this letter you MUST put down the previous letter.");
                }
            }
            this.current_letter = this.current_f.getLetter();
            this.held_items.add(this.current_letter);
            System.out.println(this.name + " is now holding the letter. " + this.name + " can read it or not. If you choose not to read it you MUST put down the letter.");
        } catch(Exception e){
            System.out.println(e);
        }
    }

    /** method that grabs a special_item but wont let the character grab more than 2 items
     * @param String special_item: the item that the character can grab
     */
    public void grab(String special_item){
        try{
            if (this.held_items.size() == 2){
                System.out.println("This is what " + this.name + " is currently holding: " + this.held_items.toString());
                throw new RuntimeException(this.name + " is holding something in each hand. " + this.name + " needs to drop/keep an object in order to pick up the " + special_item + ".");
            }
            this.held_items.add(special_item);
            System.out.println(this.name + " picked up a/an " + special_item + ". Maybe you want to keep it or not 😈....");
            System.out.println("This is what " + this.name + " is currently holding: " + this.held_items.toString());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    /** method that allows the user to see what they are currently holding*/
    public void viewHeldItems(){
        System.out.println(this.name + " current has this in their hands: " + this.held_items.toString());
    }

    /** method that allows the user to see a history log of the items they have kept*/
    public void viewKeptItems(){
        System.out.println(this.name + " has kept these items: " + this.collected_items.toString());
    }

    /** method that keeps the special_item after the character grabbed it
     * @param String special_item: the item that the character can keep
     */
    public void keep(String special_item){
        try{
            if(!this.held_items.contains(special_item)){
                throw new RuntimeException(this.name + " must grab the " + special_item + " to keep it.");
            }

            else if (this.collected_items.contains(special_item)){
                throw new RuntimeException(this.name + " already kept this...");
            }

            else if(this.room_location instanceof Bedroom){
                if(this.collected_items_bd.size() == 2){
                    throw new RuntimeException(this.name + " can no longer keep special items from bedroom. She has reached the BEDROOM's item capacity.");
                }
                this.collected_items_bd.add(special_item);
                this.collected_items.add(special_item);
                this.held_items.remove(special_item);
                System.out.println(this.name + " kept the " + special_item);
            }

            else if(this.room_location instanceof Toyroom){
                if (this.collected_items_tyr.size() == 2){
                    throw new RuntimeException(this.name + " can no longer keep special items from toyroom. She has reached the TOYROOM's item capacity.");
                }
                this.collected_items_tyr.add(special_item);
                this.collected_items.add(special_item);
                this.held_items.remove(special_item);
                System.out.println(this.name + " kept the " + special_item);
            }

            else if(this.room_location instanceof Kitchen){
                if(this.collected_items_kch.size() == 2){
                    throw new RuntimeException(this.name + " can no longer keep special items from kitchen. She has reached the KITCHEN's item capacity.");
                }
                this.collected_items_kch.add(special_item);
                this.collected_items.add(special_item);
                this.held_items.remove(special_item);
                System.out.println(this.name + " kept the " + special_item);
            }

            else if(this.room_location instanceof Bathroom){
                if(this.collected_items_bth.size() == 2){
                    throw new RuntimeException(this.name + " can no longer keep special items from bathroom. She has reached the BATHROOM's capacity.");
                }
                this.collected_items_bth.add(special_item);
                this.collected_items.add(special_item);
                this.held_items.remove(special_item);
                System.out.println(this.name + " kept the " + special_item);
            }

            else if(this.room_location instanceof LivingRoom){
                if(this.collected_items_lr.size() == 2){
                    throw new RuntimeException(this.name + " can no longer keep special items from living room. She has reached the LIVING ROOM's capacity.");
                }
                this.collected_items_lr.add(special_item);
                this.collected_items.add(special_item);
                this.held_items.remove(special_item);
                System.out.println(this.name + " kept the " + special_item);
            }
        } 
        catch(Exception e){
            System.out.println(e);
        }
    }

    /** method that puts down the letter that was picked up */
    public void putDown_letter(){
        try{
            if(this.current_letter.getText() == "N/A"){
                throw new RuntimeException(this.name + " cannot put down the letter because she does not currently have one");
            }
            this.held_items.remove(this.current_letter);
            this.current_letter = new Letter("N/A");
            System.out.println(this.name + " has dropped the letter.");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    /** method that drops a special_item that was grabbed since the character chose to not keep it
     * @param String special_item
     */
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

    /** method that turns on the light in each room */
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

    /** method that prints info that can help the character */
    public void help(){
        System.out.println("These are the following actions you can utilize to escape the rooms:");
        System.out.println("Walk to a direction(North, South, East, West)");
        System.out.println("Open/Close a Furniture(Desk, Nighstand, Dresser, Closet, Toychest, Barbie House, Craft Table, Lego Box, Dishwasher, Microwave, Oven, Pantry, Toilet, Medicine Cabinet, Trash Can, Shower, Coffee Table, Safe, China Cabinet, Bookshelf)");
        System.out.println("Pick Up a Letter\nPut Down a Letter\nRead a letter\nWrite down notes containing the information of a letter\nView notes");
        System.out.println("Grab/Keep/Drop Special Items(Binoculars, Phone, Lily's Schedule, Teddy Bear, Lipstick, Toy Camera, Flowers, Locket, Medicine Pamphlet, Bowl with traces of unknown substance, Cake, Pharmacy Card, Tea Cup, Purse, Hair Pin, Medicine Bottle, Pills, Necklace, Straightener, Hairbrush, Picture of Lily, Glass Vase Shard)");
        System.out.println("Turn on Light\nEnter code to exit a room");
        System.out.println("Go back to previous room.");
        System.out.println("Stop to end game.");
    }

    /** method that transports the character to the previous room */
    public void goback(){
        try{
            if (this.room_location instanceof Bedroom){
                throw new RuntimeException("This is where " + this.name + " started; cannot go back to a previous room.");
            }
            Room prev_room =  this.room_history.get(this.room_history.size() -1);
            this.room_location = prev_room;
            System.out.println(this.name + " is now in the previous room. " + prev_room.toString());
        } catch(Exception e){
            System.out.println(e);
        }
     }

    /** method that transports character to next room after entering the correct code
     * @param String code
     */
    public void enterCode(String code){
        try{
            if (!code.equals(this.room_location.getCode())){
                throw new RuntimeException("Wrong code try again...");
            }
            else if(this.held_items.size() == 1 | this.held_items.size() == 2){
                throw new RuntimeException("The code you entered is correct but " + this.name + " may not leave the room until she has dropped all the items in her hand. Drop items and then re-enter the code to the leave the room.");
            }
            System.out.println("The code is correct. " + this.name + " has left the room." );
            this.position = "South";
            Purgatory.nextRoom(this);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Room testr = new Room("OBSESSION");
        Furniture fridge = new Furniture("Fridge", "Locket");
        Character stacy = new Character("Stacy", testr);
        stacy.open(fridge);
        stacy.help();

    }
}
