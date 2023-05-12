
public class Room {
    
    //Attributes for basic room
    private String code;
    public boolean light;
    
    /** Constructor for Room class
     * @param String code: this is the code to enter the room
     */
    public Room(String code) {
        this.code = code;
        this.light = false;
    }
    
    /** Getter for String code */
    public String getCode() {
     return this.code;   
    }
}