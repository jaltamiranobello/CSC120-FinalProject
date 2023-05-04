
public class Room {
    
    //attributes for basic room
    private String code;
    public boolean light;
    
    /** constructor for Room class
     * @param String code: this is the code to enter the room
     */
    public Room(String code) {
        this.code = code;
        this.light = false;
    }
    
    /** getter for String code */
    public String getCode() {
     return this.code;   
    }
}