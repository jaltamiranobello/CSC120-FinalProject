import java.util.ArrayList;

public class Toyroom extends Room {
    
    // attributes for Toyroom class
    private ArrayList<Furniture> objects;

    /** constructor for Toyroom class
     * @param String code: code to get into the room
     * @param Furniture a: a piece of furniture in the room
     * @param Furniture b: a piece of furniture in the room
     * @param Furniture c: a piece of furniture in the room
     * @param Furniture d: a piece of furniture in the room
     */
    public Toyroom(String code, Furniture a, Furniture b, Furniture c, Furniture d){
        super(code);
        this.objects = new ArrayList<Furniture>();
        this.objects.add(a);
        this.objects.add(b);
        this.objects.add(c);
        this.objects.add(d);
    }

    /** getter for arraylist objects */
    public ArrayList<Furniture> getObjects(){
        return this.objects;
    }

    /** Overriden toString */
    public String toString() {
       String x = "This is a toyroom and it has four pieces of furniture: Toy Chest, Barbie House, Craft Table, and Lego Box. The code to leave this room has " +  this.getCode().length() + " alphabetical characters. You can chose to retrieve some objects in them or not (be weary of your decisions). This room also has a specific code to be able to exit. Find the code by exploring the room and the mode of exit. You are currently at the Southern area of the room and there is a Barbie house here. Type help to view possible actions.";
       return x;
    }
}
