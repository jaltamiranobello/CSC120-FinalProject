import java.util.ArrayList;

public class LivingRoom extends Room {

    //Attributes for Livingroom class
    private ArrayList<Furniture> objects;

    /** Constructor for Livingroom class
     * @param String code: code to get into the room
     * @param Furniture a: a piece of furniture in the room
     * @param Furniture b: a piece of furniture in the room
     * @param Furniture c: a piece of furniture in the room
     * @param Furniture d: a piece of furniture in the room
     */
    public LivingRoom(String code, Furniture a, Furniture b, Furniture c, Furniture d){
        super(code);
        this.objects = new ArrayList<Furniture>();
        this.objects.add(a);
        this.objects.add(b);
        this.objects.add(c);
        this.objects.add(d);
    }

    /** Getter for Arraylist objects */
    public ArrayList<Furniture> getObjects(){
        return this.objects;
    }

    /** Overriden toString 
     * @return String: contains description of the room
    */
    public String toString() {
       String x = "This is a living room and it has four pieces of furniture: Coffe Table, Safe, China Cabinet, and Bookshelf. You can chose to retrieve some objects in them or not (be weary of your decisions). This room also has a specific code to be able to exit. The code to leave this room has " +  this.getCode().length() + " alphabetical characters. You are currently at the Southern area of the room and there is a safe here. Type help to view possible actions.";
       return x;
    }
}

