//import java.util.*;

public class Room {
    
    //attributes for basic room
    private String code;
    public boolean light;
    
    public Room(String code) {
        this.code = code;
        this.light = false;
    }
    
    public String getCode() {
     return this.code;   
    }
}