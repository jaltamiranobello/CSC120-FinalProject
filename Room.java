//import java.util.*;

public class Room {
    
    //attributes for basic room
    private String exit;
    private String code;
    public boolean light;
    
    public Room(String exit, String code) {
        this.exit = exit;
        this.code = code;
        this.light = false;
    }

    public String getExit() {
        return this.exit;  
    }

    public String getCode() {
     return this.code;   
    }
}