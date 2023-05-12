import java.util.ArrayList;

public class Bedroom extends Room {

    // attribute for bedroom class
    private ArrayList<Furniture> objects;

    /** constructor for Bedroom class
     * @param String code: code to get into the room
     * @param Furniture a: a piece of furniture in the room
     * @param Furniture b: a piece of furniture in the room
     * @param Furniture c: a piece of furniture in the room
     * @param Furniture d: a piece of furniture in the room
     */
    public Bedroom(String code, Furniture a, Furniture b, Furniture c, Furniture d){
        super(code);
        this.objects = new ArrayList<Furniture>();
        this.objects.add(a);
        this.objects.add(b);
        this.objects.add(c);
        this.objects.add(d);
    }

    /** getter for Arraylist objects */
    public ArrayList<Furniture> getObjects(){
        return this.objects;
    }

    /** Overriden toString */
    public String toString() {
       String x = "\nThis is a bedroom and it has four pieces of furniture: Desk, Nightstand, Dresser, and Closet. You can chose to retrieve some objects in them or not (be weary of your decisions). This room also has a specific code to be able to exit. The code to leave this room has " +  this.getCode().length() + " alphabetical characters. You are currently at the Southern area of the room and there is a nightstand here. Type help to view possible actions.";
       return x;
    }
}
