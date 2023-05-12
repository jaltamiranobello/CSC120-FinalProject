import java.util.ArrayList;

public class Bathroom extends Room {
    
    // Attributes for bedroom class
    private ArrayList<Furniture> objects;

     /** Constructor for Bathroom class
     * @param String code: code to get into the room
     * @param Furniture a: a piece of furniture in the room
     * @param Furniture b: a piece of furniture in the room
     * @param Furniture c: a piece of furniture in the room
     * @param Furniture d: a piece of furniture in the room
     */
    public Bathroom(String code, Furniture a, Furniture b, Furniture c, Furniture d){
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
       String x = "This is a bathroom and it has four pieces of furniture: Toilet, Medicine Cabinet, Trash Can, and Shower. You can chose to retrieve some spectial items in them or not (be weary of your decisions). The code to leave this room has " +  this.getCode().length() + " alphabetical characters. Find the code by exploring the room and the mode of exit. You are currently at the Southern area of the room and there is a medicine cabinet here. Type help to view possible actions.";
       return x;
    }

}